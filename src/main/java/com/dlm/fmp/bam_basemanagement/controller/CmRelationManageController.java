package com.dlm.fmp.bam_basemanagement.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.CmRelationService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForCmRelation;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.CmRelation;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("cmrelation")
public class CmRelationManageController {
	@Autowired
	CmRelationService cmRelationService;	
	@Autowired
	CmContentFinalService cmContentFinalService;
	/**
	 * 	查询单个
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody CmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		CmRelation cmRelation = cmRelationService.get(record.getId());
		data.put("cmRelation", cmRelation);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 *	更换某节点的节点
	 * @param changeTwoNodesConnection
	 * @return
	 */
	@RequestMapping("changeTwoNodesConnection")
	public @ResponseBody ResponseEntity changeTwoNodesConnection(@RequestBody RequestEntityForCmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmRelationService.changeTwoNodesConnection(record.getOriginalRecord(), record.getDestRecord());
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
	public @ResponseBody ResponseEntity releaseTwoNodesConnection(@RequestBody CmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmRelationService.releaseTwoNodesConnection(record);
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
	public @ResponseBody ResponseEntity addTwoNodesConnection(@RequestBody CmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			//添加新的节点关系
			cmRelationService.addTwoNodesConnection(record);
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
	public @ResponseBody ResponseEntity add(@RequestBody CmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmRelationService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody CmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmRelationService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody CmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmRelationService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	
	
}
