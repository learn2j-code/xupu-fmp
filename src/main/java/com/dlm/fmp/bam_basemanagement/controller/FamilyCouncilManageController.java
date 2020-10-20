package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.DiscountsStaffService;
import com.dlm.fmp.bam_basemanagement.service.FamilyCouncilService;
import com.dlm.fmp.bam_basemanagement.service.FamilyInfoService;
import com.dlm.fmp.bam_basemanagement.service.FamilyServiceService;
import com.dlm.fmp.bam_basemanagement.service.FamilySettingService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.DiscountsStaff;
import com.dlm.fmp.pojo.FamilyCouncil;
import com.dlm.fmp.pojo.FamilyInfo;
import com.dlm.fmp.pojo.FamilyInfoWithBLOBs;
import com.dlm.fmp.pojo.FamilyService;
import com.dlm.fmp.pojo.FamilySetting;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("familycouncil")
public class FamilyCouncilManageController {
	@Autowired
	FamilyCouncilService familyCouncilService;	
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<FamilyCouncil> familyCouncilList = familyCouncilService.list();
		data.put("familyCouncilList", familyCouncilList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
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
		
		List<FamilyCouncil> familyCouncilList = familyCouncilService.list();
		
		int total = (int)new PageInfo<>(familyCouncilList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("familyCouncilList", familyCouncilList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家族id查询理事会列表
	 * @return
	 */
	@RequestMapping("findFamilyCouncilListByFamilyId")
	public @ResponseBody ResponseEntity findFamilyCouncilListByFamilyId(@RequestBody FamilySetting record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<FamilyCouncil> familyCouncilList = familyCouncilService.findFamilyCouncilListByFamilyId(record.getFamilyId());
		data.put("familyCouncilList", familyCouncilList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody FamilyCouncil record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		FamilyCouncil familyCouncil = familyCouncilService.get(record.getId());
		data.put("familyCouncil", familyCouncil);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody FamilyCouncil record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyCouncilService.add(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("discountsStaff", record);
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
	public @ResponseBody ResponseEntity update(@RequestBody FamilyCouncil record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyCouncilService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody FamilyCouncil record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			familyCouncilService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
