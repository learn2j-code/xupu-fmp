package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.HmInAuditionService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdInAuditionService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdPayEvidenceService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdPaymentService;
import com.dlm.fmp.bam_basemanagement.service.SubFamilyInfoService;
import com.dlm.fmp.bam_basemanagement.vo.HmInAuditionVo;
import com.dlm.fmp.bam_basemanagement.vo.HouseholdInAuditionExtends;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForHouseholdInAudition;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HouseholdInAudition;
import com.dlm.fmp.pojo.HouseholdPayEvidence;
import com.dlm.fmp.pojo.HouseholdPayment;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("householdinaudition")
public class HouseholdInAuditionManageController {
	@Autowired
	HouseholdInAuditionService householdInAuditionService;	
	@Autowired
	FamilyMemberService familyMemberService;
	@Autowired
	HmInAuditionService hmInAuditionService;
	@Autowired
	HouseholdPayEvidenceService householdPayEvidenceService;
	@Autowired
	SubFamilyInfoService subFamilyInfoService;
	
	@Autowired
	HouseholdPaymentService householdPaymentService;
	/**
	 * 	查询分页查询
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntity requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdInAudition> householdInAuditionList = householdInAuditionService.list();
		
		int total = (int)new PageInfo<>(householdInAuditionList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("householdInAuditionList", householdInAuditionList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询单个
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdInAudition householdInAudition = householdInAuditionService.get(record.getId());
		data.put("householdInAudition", householdInAudition);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查看该家庭已加入的家族列表
	 * @return
	 */
	@RequestMapping("findAlreadyInFamilyListByHousehold")
	public @ResponseBody ResponseEntity findAlreadyInFamilyListByHousehold(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdInAudition> householdInAuditionList = householdInAuditionService.findAlreadyInFamilyListByHousehold(record.getHouseholdId());
		data.put("householdInAuditionList", householdInAuditionList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加家庭及成员到审核
	 * @param addList
	 * @return
	 */
	@RequestMapping("addHouseholdAndMembersInAudition")
	public @ResponseBody ResponseEntity addHouseholdAndMembersInAudition(@RequestBody RequestEntityForHouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			if(householdInAuditionService.judgeHouseholdAlreadyInFamily(record.getHouseholdInAudition())){
				responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
				responseEntity.setErrorMsg("已经加入该家族，不能重复加入");
				return responseEntity;
			}
			Map<String, Object> data = new HashMap<String, Object>();
			HouseholdInAudition householdInAudition = record.getHouseholdInAudition();
			householdInAuditionService.addHouseholdAndMembersInAudition(householdInAudition, record.getHmInAuditionList());
			
			//创建家庭支付订单
			householdPaymentService.create(householdInAudition);
			data.put("householdInAudition", householdInAudition);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	重新批量添加家庭成员到审核
	 * @param addList
	 * @return
	 */
	@RequestMapping("addHouseholdAndMembersInAuditionAgain")
	public @ResponseBody ResponseEntity addHouseholdAndMembersInAuditionAgain(@RequestBody RequestEntityForHouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInAuditionService.deleteHouseholdInAuditionByCondition(record.getHouseholdInAudition());
			householdInAuditionService.addHouseholdAndMembersInAudition(record.getHouseholdInAudition(),record.getHmInAuditionList());
			
			//创建家庭支付订单前，先将未支付的订单设置为无效
			householdPaymentService.updateHouseholdPaymentToInvalid(record.getHouseholdInAudition());
			householdPaymentService.create(record.getHouseholdInAudition());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInAuditionService.add(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param update
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInAuditionService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	编辑
	 * @param updateHmInAudition
	 * @return
	 */
	@RequestMapping("updateHmInAudition")
	public @ResponseBody ResponseEntity updateHmInAudition(@RequestBody HmInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			hmInAuditionService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	根据家庭id和家族id更新待审核家庭的状态
	 * @param updateHouseholdInAuditionByCondition
	 * @return
	 */
	@RequestMapping("updateHouseholdInAuditionByCondition")
	public @ResponseBody ResponseEntity updateHouseholdInAuditionByCondition(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInAuditionService.updateHouseholdInAuditionByCondition(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	删除
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInAuditionService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	将原家庭在待审核的所有信息删除（如果已入家族并通过审核的也删除）
	 * @param deleteFmHmRelationInfo
	 * @return
	 */
	@RequestMapping("deleteHouseholdInAudition")
	public @ResponseBody ResponseEntity deleteHouseholdInAudition(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInAuditionService.deleteHouseholdInAuditionByCondition(record);
			
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	根据家族成员id查询待审核的家庭成员列表-按家庭划分，可能有多个家庭
	 * @return
	 */
	@RequestMapping("findHouseholdInAuditionListByFamilyMemberId")
	public @ResponseBody ResponseEntity findHouseholdInAuditionListByFamilyMemberId(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdInAuditionExtends> householdInAuditionExtendsList = householdInAuditionService.findHouseholdInAuditionListByFamilyMemberId(record.getFamilyMemberId());
		data.put("householdInAuditionList", householdInAuditionExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家族id和家庭id查询成员列表
	 * @return
	 */
	@RequestMapping("findHouseholdMembersInAudition")
	public @ResponseBody ResponseEntity findHouseholdMembersInAudition(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HmInAuditionVo> hmInAuditionVoList = hmInAuditionService.findHouseholdMembersInAudition(record);
		data.put("hmInAuditionVoList", hmInAuditionVoList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家族id和家庭id查询提交的缴费记录列表
	 * @return
	 */
	@RequestMapping("findHouseholdPayEvidenceList")
	public @ResponseBody ResponseEntity findHouseholdPayEvidenceList(@RequestBody HouseholdPayEvidence record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdPayEvidence> householdPayEvidenceList = householdPayEvidenceService.findHouseholdPayEvidenceList(record);
		data.put("householdPayEvidenceList", householdPayEvidenceList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家族id和审核状态查询已进入审核的家庭列表
	 * @return
	 */
	@RequestMapping("findHouseholdInAuditionListBy")
	public @ResponseBody ResponseEntity findHouseholdInAuditionListBy(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		//先要查出该成员的分支编码，
		String subFamilyCode = null;
		if(record.getId()!=null) {
			String code = subFamilyInfoService.findSubFamilyCodeBySubManagerId(record.getId());
			subFamilyCode = (code==null?record.getFamilyId().toString():code);
		} else if(record.getPhone()!=null) {
			subFamilyCode = subFamilyInfoService.findSubFamilyCodeByPhone(record.getPhone());
		}
		List<HouseholdInAudition> householdInAuditionList = householdInAuditionService.findHouseholdInAuditionListBy(subFamilyCode,record.getFamilyId(), record.getAuditFlag());
		data.put("householdInAuditionList", householdInAuditionList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据待审核的家庭信息，将家庭成员进入家族成员
	 * @param householdMemberEnterFamilyMember
	 * @return
	 */
	@RequestMapping("householdMemberEnterFamilyMember")
	public @ResponseBody ResponseEntity householdMemberEnterFamilyMember(@RequestBody HouseholdInAudition record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInAuditionService.householdMemberEnterFamilyMember(record);
			//将接入点及以下的节点集合儿子数量重新更新
			familyMemberService.refreshSonNumRealForMainNode(record.getFamilyMemberId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	//查收缴费通过后，将通过的家庭成员保存到家族中，建立家庭成员与家族成员关系，并修改审核表中的成员状态，同时修改家族成员接入点的状态 TODO:
}
