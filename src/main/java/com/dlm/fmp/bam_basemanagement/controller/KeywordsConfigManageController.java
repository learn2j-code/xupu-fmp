package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.FamilyInfoService;
import com.dlm.fmp.bam_basemanagement.service.FamilyServiceService;
import com.dlm.fmp.bam_basemanagement.service.FamilySettingService;
import com.dlm.fmp.bam_basemanagement.service.KeywordsConfigService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.FamilyInfo;
import com.dlm.fmp.pojo.FamilyInfoWithBLOBs;
import com.dlm.fmp.pojo.FamilyService;
import com.dlm.fmp.pojo.FamilySetting;
import com.dlm.fmp.pojo.KeywordsConfig;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("keywordsconfig")
public class KeywordsConfigManageController {
	@Autowired
	KeywordsConfigService keywordsConfigService;	
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<KeywordsConfig> keywordsConfigList = keywordsConfigService.list();
		data.put("list", keywordsConfigList);
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
		
		List<KeywordsConfig> keywordsConfigList = keywordsConfigService.list();
		
		int total = (int)new PageInfo<>(keywordsConfigList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("list", keywordsConfigList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据bookid=0查询
	 * @return
	 */
	@RequestMapping("findBaseKeywordsConfigListByBookId")
	public @ResponseBody ResponseEntity findBaseKeywordsConfigListByBookId(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<KeywordsConfig> keywordsConfigList = keywordsConfigService.findKeywordsConfigListByBookId(0);
		data.put("list", keywordsConfigList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据bookid查询
	 * @return
	 */
	@RequestMapping("findKeywordsConfigListByBookId")
	public @ResponseBody ResponseEntity findKeywordsConfigListByBookId(@RequestBody KeywordsConfig record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<KeywordsConfig> keywordsConfigList = keywordsConfigService.findKeywordsConfigListByBookId(record.getBookId());
		data.put("list", keywordsConfigList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody KeywordsConfig record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		KeywordsConfig keywordsConfig = keywordsConfigService.get(record.getId());
		data.put("record", keywordsConfig);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody KeywordsConfig record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			keywordsConfigService.add(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("familySetting", record);
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
	public @ResponseBody ResponseEntity update(@RequestBody KeywordsConfig record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			keywordsConfigService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody KeywordsConfig record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			keywordsConfigService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
