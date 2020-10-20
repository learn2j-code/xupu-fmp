package com.dlm.fmp.bam_basemanagement.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.FmRelationService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForFmRelation;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.FmRelation;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("fmrelation")
public class FmRelationManageController {
	@Autowired
	FmRelationService fmRelationService;	
	@Autowired
	FamilyMemberService familyMemberService;
	/**
	 * 	查询单个
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody FmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		FmRelation fmRelation = fmRelationService.get(record.getId());
		data.put("fmRelation", fmRelation);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 *	更换某节点的节点
	 * @param changeTwoNodesConnection
	 * @return
	 */
	@RequestMapping("changeTwoNodesConnection")
	public @ResponseBody ResponseEntity changeTwoNodesConnection(@RequestBody RequestEntityForFmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			fmRelationService.changeTwoNodesConnection(record.getOriginalRecord(), record.getDestRecord());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	删除某节点的连接节点
	 * @param releaseTwoNodesConnection
	 * @return
	 */
	@RequestMapping("releaseTwoNodesConnection")
	public @ResponseBody ResponseEntity releaseTwoNodesConnection(@RequestBody FmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			fmRelationService.releaseTwoNodesConnection(record);
			
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	添加新的节点关系
	 * @param addTwoNodesConnection
	 * @return
	 */
	@RequestMapping("addTwoNodesConnection")
	public @ResponseBody ResponseEntity addTwoNodesConnection(@RequestBody FmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			//添加新的节点关系
			fmRelationService.addTwoNodesConnection(record);
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
	public @ResponseBody ResponseEntity add(@RequestBody FmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			fmRelationService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody FmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			fmRelationService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody FmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			fmRelationService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	删除
	 * @param deleteFmRelationListFromFamilyId
	 * @return
	 */
	@RequestMapping("deleteFmRelationListFromFamilyId")
	public @ResponseBody ResponseEntity deleteFmRelationListFromFamilyId(@RequestBody FmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			fmRelationService.deleteFmRelationListFromFamilyId(record.getFamilyId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
