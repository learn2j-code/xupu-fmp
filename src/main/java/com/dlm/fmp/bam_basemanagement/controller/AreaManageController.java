package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.AreaInfoService;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.AreaInfo;


//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("areamanage")
public class AreaManageController {
	@Autowired
	AreaInfoService areaInfoService;	
	
	/**
	 * 	查询所有姓氏
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<AreaInfo> areaList = areaInfoService.list();
		data.put("areaList", areaList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			areaInfoService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			areaInfoService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			areaInfoService.add(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 根据上级id查区域信息
	 * @param record
	 * @return
	 */
	@RequestMapping("findAreaInfoListByParentId")
	public @ResponseBody ResponseEntity findAreaInfoListByParentId(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<AreaInfo> areaList = areaInfoService.findAreaInfoListByParentId(record.getParentId());
		data.put("areaList", areaList);
		responseEntity.setData(data);
		return responseEntity;
	}	
}
