package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.ClanPictureService;
import com.dlm.fmp.bam_basemanagement.service.JoinfmApplicationService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.JoinfmApplication;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("joinfmapplication")
public class JoinfmApplicationManageController {
	@Autowired
	JoinfmApplicationService joinfmApplicationService;	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<JoinfmApplication> JoinfmApplicationList = joinfmApplicationService.list();
		data.put("JoinfmApplicationList", JoinfmApplicationList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	分页查询信息
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
		
		List<JoinfmApplication> JoinfmApplicationList = joinfmApplicationService.list();
		
		int total = (int)new PageInfo<>(JoinfmApplicationList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("JoinfmApplicationList", JoinfmApplicationList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody JoinfmApplication record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		JoinfmApplication JoinfmApplication = joinfmApplicationService.get(record.getId());
		data.put("JoinfmApplication", JoinfmApplication);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody JoinfmApplication record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			joinfmApplicationService.add(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("JoinfmApplication", record);
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
	public @ResponseBody ResponseEntity update(@RequestBody JoinfmApplication record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			joinfmApplicationService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody JoinfmApplication record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			joinfmApplicationService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
