package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.CmModificationRecordService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.CmModificationRecord;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("cmmodificationrecord")
public class CmModificationRecordManageController {
	@Autowired
	CmModificationRecordService cmModificationRecordService;	

	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CmModificationRecord> cmModificationRecordList = cmModificationRecordService.list();
		data.put("cmModificationRecordList", cmModificationRecordList);
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
		
		List<CmModificationRecord> cmModificationRecordList = cmModificationRecordService.list();
		
		int total = (int)new PageInfo<>(cmModificationRecordList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("cmModificationRecordList", cmModificationRecordList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody CmModificationRecord record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		CmModificationRecord cmModificationRecord = cmModificationRecordService.get(record.getId());
		data.put("cmModificationRecord", cmModificationRecord);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据谱书id查询其修正记录列表
	 * @return
	 */
	@RequestMapping("findCmModificationRecordListByBookId")
	public @ResponseBody ResponseEntity findCmModificationRecordListByBookId(@RequestBody CmModificationRecord record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CmModificationRecord> cmModificationRecordList = cmModificationRecordService.findCmModificationRecordListByBookId(record.getBookId());
		data.put("cmModificationRecordList", cmModificationRecordList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody CmModificationRecord record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmModificationRecordService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody CmModificationRecord record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmModificationRecordService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody CmModificationRecord record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmModificationRecordService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
