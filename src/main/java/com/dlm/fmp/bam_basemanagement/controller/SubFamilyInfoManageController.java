package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dlm.fmp.bam_basemanagement.service.SubFamilyInfoService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForSubFamilyInfo;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.SubFamilyInfo;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("subfamilyinfo")
public class SubFamilyInfoManageController {
	@Autowired
	SubFamilyInfoService subFamilyInfoService;	
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<SubFamilyInfo> subFamilyInfoList = subFamilyInfoService.list();
		data.put("subFamilyInfoList", subFamilyInfoList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntityForSubFamilyInfo requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<SubFamilyInfo> subFamilyInfoList = subFamilyInfoService.findSubFamilyInfoListByFamilyId(requestEntity.getRequestParameter().getFamilyId());
		
		int total = (int)new PageInfo<>(subFamilyInfoList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("subFamilyInfoList", subFamilyInfoList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个服务信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody SubFamilyInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		SubFamilyInfo subFamilyInfo = subFamilyInfoService.get(record.getId());
		data.put("subFamilyInfo", subFamilyInfo);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("addSubFamilyInfo")
	public @ResponseBody ResponseEntity addSubFamilyInfo(@RequestBody SubFamilyInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			if(subFamilyInfoService.findSubFamilyInfoListNumByPhone(record.getPhone())>0) {
				responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
				responseEntity.setErrorMsg("已存在该号码的分支负责人，不允许重复添加");
				return responseEntity;
			}
			subFamilyInfoService.addSubFamilyInfo(record);
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
	public @ResponseBody ResponseEntity add(@RequestBody SubFamilyInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			subFamilyInfoService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody SubFamilyInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			subFamilyInfoService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody SubFamilyInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			subFamilyInfoService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
