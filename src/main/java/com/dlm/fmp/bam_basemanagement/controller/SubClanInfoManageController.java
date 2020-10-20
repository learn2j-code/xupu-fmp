package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.SubClanInfoService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.bam_basemanagement.vo.SubClanInfoExtends;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.SubClanInfo;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("subclaninfo")
public class SubClanInfoManageController {
	@Autowired
	SubClanInfoService subClanInfoService;	
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<SubClanInfo> subClanInfoList = subClanInfoService.list();
		data.put("subClanInfoList", subClanInfoList);
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
		
		List<SubClanInfo> subClanInfoList = subClanInfoService.findSubClanInfoInCondition(requestEntity.getSubClanInfo());
		List<SubClanInfoExtends> subClanInfoExtendsList = subClanInfoService.packageSubClanInfoExtendsBy(subClanInfoList);
		int total = (int)new PageInfo<>(subClanInfoList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("subClanInfoList", subClanInfoExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询头结点下所有子节点
	 * @return
	 */
	@RequestMapping("findSubClanInfoListByParentId")
	public @ResponseBody ResponseEntity findSubClanInfoListByParentId(@RequestBody SubClanInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<SubClanInfo> subClanInfoList = subClanInfoService.findSubClanInfoListByParentId(record.getParentId(), record.getBookId(),record.getSubClanType());
		data.put("subClanInfoList", subClanInfoList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询某个服务信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody SubClanInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		SubClanInfo subClanInfo = subClanInfoService.get(record.getId());
		data.put("subClanInfo", subClanInfo);
		responseEntity.setData(data);
		return responseEntity;
	}
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody SubClanInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			subClanInfoService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody SubClanInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			subClanInfoService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody SubClanInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			subClanInfoService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	查询某谱书的新分支列表
	 * @return
	 */
	@RequestMapping("findSubClanInfoListByBookId")
	public @ResponseBody ResponseEntity findSubClanInfoListByBookId(@RequestBody SubClanInfoExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		//SubClanType  新分支为1，老分支为0
		List<SubClanInfo> subClanInfoList = subClanInfoService.findSubClanInfoListByBookId(record);
		data.put("subClanInfoList", subClanInfoList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	/**
	 * 	模糊查询某人的新分支列表
	 * @return
	 */
	@RequestMapping("findSubClanInfoListByFuzzyName")
	public @ResponseBody ResponseEntity findSubClanInfoListByFuzzyName(@RequestBody SubClanInfoExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		//SubClanType  新分支为1，老分支为0
		List<SubClanInfo> subClanInfoList = subClanInfoService.findSubClanInfoListByFuzzyName(record);
		data.put("subClanInfoList", subClanInfoList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	
}
