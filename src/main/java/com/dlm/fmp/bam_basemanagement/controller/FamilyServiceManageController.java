package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.FamilyServiceService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.FamilyService;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("familyservice")
public class FamilyServiceManageController {
	@Autowired
	FamilyServiceService familyServiceService;	

	/**
	 * 	查询所有已购家族服务
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<FamilyService> familyServiceList = familyServiceService.list();
		data.put("familyServiceList", familyServiceList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询已购家族服务
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
		
		List<FamilyService> familyServiceList = familyServiceService.list();
		
		int total = (int)new PageInfo<>(familyServiceList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("familyServiceList", familyServiceList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个家族服务信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody FamilyService record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		FamilyService familyService = familyServiceService.get(record.getId());
		data.put("familyService", familyService);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家族id查询其家族已购的服务信息
	 * @return
	 */
	@RequestMapping("findServiceListByFamilyId")
	public @ResponseBody ResponseEntity findServiceListByFamilyId(@RequestBody FamilyService record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<FamilyService> familyServiceList = familyServiceService.findServiceListByFamilyId(record.getFamilyId());
		data.put("familyServiceList", familyServiceList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody FamilyService record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyServiceService.addFamilyService(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody FamilyService record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyServiceService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody FamilyService record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyServiceService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
