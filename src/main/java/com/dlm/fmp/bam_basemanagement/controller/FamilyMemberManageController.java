package com.dlm.fmp.bam_basemanagement.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.CmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.FmCmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FmHmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FmRelationService;
import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.fmp.bam_basemanagement.vo.NumAndFamilyMembers;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForFamilyMember;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.CmRelation;
import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.FmCmRelation;
import com.dlm.fmp.pojo.FmRelation;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("familymember")
public class FamilyMemberManageController {
	@Autowired
	FamilyMemberService familyMemberService;	
	@Autowired
	FmRelationService fmRelationService;
	@Autowired
	FmCmRelationService fmCmRelationService;
	@Autowired
	FmHmRelationService fmHmRelationService;
	@Autowired
	CmContentFinalService cmContentFinalService;
	
	@Autowired
	CmRelationService cmRelationService;
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<FamilyMember> familyMemberList = familyMemberService.list();
		data.put("familyMemberList", familyMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询分页查询
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntityForFamilyMember requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
//		FamilyMember familyMember = new FamilyMember();
//		familyMember.setFamilyId(requestEntity.getFamilyId());
//		familyMember.setSecPersonalName(requestEntity.getSecPersonalName());
//		familyMember.setMemberName(requestEntity.getMemberName());
//		familyMember.setMark(requestEntity.getMark());
//		familyMember.setGenerationNum(requestEntity.getGenerationNum());
//		familyMember.setGenerationWord(requestEntity.getGenerationWord());
		List<FamilyMember> familyMemberList = familyMemberService.findFamilyMemberListByPageAndCondition(requestEntity);
		List<FamilyMemberExtends> familyMemberExtendsList = familyMemberService.packageFamilyMemberExtendsBy(familyMemberList);
		int total = (int)new PageInfo<>(familyMemberList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("familyMemberList", familyMemberExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		FamilyMemberExtends familyMember = familyMemberService.findById(record.getId());
		data.put("familyInfo", familyMember);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据名称模糊查询主成员列表
	 * @return
	 */
	@RequestMapping("findMainMemberListByFuzzyName")
	public @ResponseBody ResponseEntity findMainMemberListByFuzzyName(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<FamilyMember> familyMemberList = familyMemberService.findMainMemberListByFuzzyName(record);
		data.put("familyMemberList", familyMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	将某本老谱的所有的成员拷贝一份到家族成员,同时建立老谱与家族成员的映射关系
	 * @param addCmContentFinalToFamily
	 * @return
	 */
	@RequestMapping("addCmContentFinalToFamily")
	public @ResponseBody ResponseEntity addCmContentFinalToFamily(@RequestBody RequestEntityForFamilyMember requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyMemberService.addCmContentFinalToFamily(requestEntity.getBookId(),requestEntity.getVolumeId(), requestEntity.getFamilyId());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", null);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	在同步某本老谱的所有的成员关系映射到家族成员前，先查关系总数，分页分批进行处理
	 * @param addCmContentFinalToFamily
	 * @return
	 */
	@RequestMapping("findCmContentFinalRelationTotalCount")
	public @ResponseBody ResponseEntity findCmContentFinalRelationTotalCount(@RequestBody RequestEntityForFamilyMember requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			Map<String, Object> data = new HashMap<String, Object>();
			Long cmRelationListNum = cmRelationService.findCmRelationListNumByBookId(requestEntity.getBookId());
//			//先不管三七二十一删除之前的关系
			fmRelationService.deleteFmRelationListFromFamilyId(requestEntity.getFamilyId());
			data.put("cmRelationListNum", cmRelationListNum);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	将某本老谱的所有的成员关系映射到家族成员
	 * @param addCmContentFinalToFamily
	 * @return
	 */
	@RequestMapping("addCmContentFinalRelationToFamily")
	public @ResponseBody ResponseEntity addCmContentFinalRelationToFamily(@RequestBody RequestEntityForFamilyMember requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			Page page = requestEntity.getPage();
			int pageNum = (page.getStart()-1);
			if(pageNum<0){
				return null;
			}
			PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
			
			Map<String, Object> data = new HashMap<String, Object>();
			//根据老谱中成员之间的关系，生成家族成员之间的关系
			List<CmRelation> cmRelationList = cmRelationService.findCmRelationListByBookId(requestEntity.getBookId());
			familyMemberService.addCmContentFinalRelationToFamily(cmRelationList, requestEntity.getFamilyId());
			
			int total = (int)new PageInfo<>(cmRelationList).getTotal();
			page.setTotal(total);
			page.caculateLast(total);
			
			data.put("page", page);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	按人数查询家族成员列表
	 * @return
	 */
	@RequestMapping("findFamilyMemberListByNum")
	public @ResponseBody ResponseEntity findFamilyMemberListByNum(@RequestBody RequestEntityForFamilyMember requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		FamilyMemberExtends record = new FamilyMemberExtends();
		record.setFamilyId(requestEntity.getRequestParameter().getFamilyId());
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		Map<String, Object> data = new HashMap<String, Object>();
		List<FamilyMemberExtends> familyMemberExtendsList = familyMemberService.findFamilyMemberExtendsListByNum(record);
		
		int total = (int)new PageInfo<>(familyMemberExtendsList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("familyMemberList", familyMemberExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	按头节点查询其下几代的成员列表
	 * @return
	 */
	@RequestMapping("findFamilyMemberListByHeadAndSeveralNum")
	public @ResponseBody ResponseEntity findFamilyMemberListByHeadAndSeveralNum(@RequestBody FamilyMemberExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<FamilyMemberExtends> familyMemberExtendsList = familyMemberService.findFamilyMemberListByHeadAndSeveralNum(record);
		
		data.put("familyMemberList", familyMemberExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	按世代查询的未找到关系的成员列表和数字
	 * @return
	 */
	@RequestMapping("findNumAndMemberListByGenerationStartEnd")
	public @ResponseBody ResponseEntity findNumAndMemberListByGenerationStartEnd(@RequestBody RequestEntityForFamilyMember requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		FamilyMemberExtends record = new FamilyMemberExtends();
		Map<String, Object> data = new HashMap<String, Object>();
		record.setStartGeneration(requestEntity.getRequestParameter().getStartGeneration());
		record.setEndGeneration(requestEntity.getRequestParameter().getEndGeneration());
		record.setFamilyId(requestEntity.getRequestParameter().getFamilyId());
		List<NumAndFamilyMembers> numAndMembersList = familyMemberService.findNumAndMemberListByGenerationStartEnd(record);
		
		data.put("numAndMembersList", numAndMembersList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	快速按世代对接父级或配偶节点
	 * @return
	 */
	@RequestMapping("addTwoNodesConnectionQuicklyByGenerationStartEnd")
	public @ResponseBody ResponseEntity addTwoNodesConnectionQuicklyByGenerationStartEnd(@RequestBody RequestEntityForFamilyMember requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		FamilyMemberExtends record = new FamilyMemberExtends();
		Map<String, Object> data = new HashMap<String, Object>();
		record.setStartGeneration(requestEntity.getRequestParameter().getStartGeneration());
		record.setEndGeneration(requestEntity.getRequestParameter().getEndGeneration());
		record.setFamilyId(requestEntity.getRequestParameter().getFamilyId());
		
		familyMemberService.addTwoNodesConnectionQuicklyByGenerationStartEnd(record);
		
//		data.put("numAndMembersList", numAndMembersList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家族成员id查询老谱版本列表
	 * @return
	 */
	@RequestMapping("findCmContentFinalListByFmId")
	public @ResponseBody ResponseEntity findCmContentFinalListByFmId(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<FmCmRelation> fmCmRelationList = fmCmRelationService.findCmListByFmId(record.getId());
		List<Integer> cmIdList = new ArrayList<Integer>();
		for(FmCmRelation fmCmRelation:fmCmRelationList){
			cmIdList.add(fmCmRelation.getCmContentFinalId());
		}
		List<CmContentFinal> cmContentFinalList = new ArrayList<>();
		if(cmIdList!=null&&cmIdList.size()>0) {
			cmContentFinalList = cmContentFinalService.findCmContentFinalListByCmIdList(cmIdList);
			
		}
		//TODO:还必须显示老谱版本的信息 bookName,还有手机端的版本
//		List<FmHmRelation> fmHmRelationList = fmHmRelationService.findHmListByFmId(record.getId());
//		List<Integer> hmIdList = new ArrayList<Integer>();
//		for(FmHmRelation fmHmRelation:fmHmRelationList){
//			hmIdList.add(fmHmRelation.getHouseholdMemberId());
//		}
//		List<HouseholdMember> householdMemberList = householdMemberService.findCmContentFinalListByFmIdList(cmIdList);
		
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加节点和关系
	 * @param addNodeAndRelation
	 * @return
	 */
	@RequestMapping("addNodeAndRelation")
	public @ResponseBody ResponseEntity addNodeAndRelation(@RequestBody FamilyMemberExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			familyMemberService.addNodeAndRelation(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
		data.put("record", record);
		responseEntity.setData(data);
        return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyMemberService.add(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", record);
			responseEntity.setData(data);
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
	public @ResponseBody ResponseEntity update(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyMemberService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyMemberService.delete(record.getId());
			
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	根据familyId查询家族始迁祖
	 * @param findAncestorByFamilyId
	 * @return
	 */
	@RequestMapping("findAncestorByFamilyId")
	public @ResponseBody ResponseEntity findAncestorByFamilyId(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		Integer AncestorId = familyMemberService.findAncestorByFamilyId(record);
		data.put("AncestorId", AncestorId);
		responseEntity.setData(data);
        return responseEntity;
	}
	
	/**
	 * 	家族成员合并--主要是手机端的数据多了，PC端需要将一些多余的数据进行合并
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("mergeFamilyMemberOriginalToDest")
	public @ResponseBody ResponseEntity mergeFamilyMemberOriginalToDest(@RequestBody RequestEntityForFamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyMemberService.mergeFamilyMemberOriginalToDest(record.getOriginalId(), record.getDestId(), record.getFamilyMember());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	查询某人上几代人的信息
	 * @return
	 */
	@RequestMapping("findAncestorListBy")
	public @ResponseBody ResponseEntity findAncestorListBy(@RequestBody FamilyMemberExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<FamilyMember> familyMemberList = familyMemberService.findAncestorListBy(record.getId(),record.getNum());
		data.put("familyMemberList", familyMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	临时设置儿子数量             、兄弟数量和妻子列表
	 * @param setMainMemberForSonNumReal
	 * @return
	 */
	@RequestMapping("setMainMemberForSonNumReal")
	public @ResponseBody ResponseEntity setMainMemberForSonNumReal(@RequestBody FamilyMemberExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyMemberService.setMainMemberForSonNumReal(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
