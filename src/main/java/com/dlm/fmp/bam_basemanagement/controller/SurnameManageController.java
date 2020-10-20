package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.SurnameInfoService;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.SurnameInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("surnamemanage")
public class SurnameManageController {

	@Autowired
	SurnameInfoService surnameInfoService;
	
	/**
	 * 	查询所有姓氏
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<SurnameInfo> surnameList = surnameInfoService.list();
		data.put("surnameList", surnameList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 添加姓氏
	 * @param surnameInfo
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody SurnameInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			surnameInfoService.add(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}	
	
	/**
	 **编辑姓氏
	 * @param surnameInfo
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody SurnameInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			surnameInfoService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 删除姓氏
	 * @param surnameInfo
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody SurnameInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			surnameInfoService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
