package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.HouseholdPayEvidenceService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.HouseholdPayEvidence;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("householdpayevidence")
public class HouseholdPayEvidenceManageController {
	@Autowired
	HouseholdPayEvidenceService householdPayEvidenceService;	
	
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdPayEvidence> householdPayEvidenceList = householdPayEvidenceService.list();
		data.put("householdPayEvidenceList", householdPayEvidenceList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询家庭
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
		
		List<HouseholdPayEvidence> householdPayEvidenceList = householdPayEvidenceService.list();
		
		int total = (int)new PageInfo<>(householdPayEvidenceList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("householdPayEvidenceList", householdPayEvidenceList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家庭id和家族id查询付款的信息
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
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody HouseholdPayEvidence record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdPayEvidence householdPayEvidence = householdPayEvidenceService.get(record.getId());
		data.put("householdPayEvidence", householdPayEvidence);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody HouseholdPayEvidence record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdPayEvidenceService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody HouseholdPayEvidence record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdPayEvidenceService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody HouseholdPayEvidence record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdPayEvidenceService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
