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
import com.dlm.fmp.bam_basemanagement.service.ClanVolumeService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.ClanVolume;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("clanvolume")
public class ClanVolumeManageController {
	@Autowired
	ClanVolumeService clanVolumeService;	
	@Autowired
	ClanPictureService clanPictureService;
	/**
	 * 	查询谱书的所有卷
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ClanVolume> clanVolumeList = clanVolumeService.list();
		data.put("clanVolumeList", clanVolumeList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	分页查询卷信息
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
		
		List<ClanVolume> clanVolumeList = clanVolumeService.list();
		
		int total = (int)new PageInfo<>(clanVolumeList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("clanVolumeList", clanVolumeList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个谱书信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody ClanVolume record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		ClanVolume clanVolume = clanVolumeService.get(record.getId());
		data.put("clanVolume", clanVolume);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据谱书id查询卷列表
	 * @return
	 */
	@RequestMapping("findVolumeListByBookId")
	public @ResponseBody ResponseEntity findVolumeListByBookId(@RequestBody ClanVolume record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ClanVolume> clanVolumeList = clanVolumeService.findClanVolumeListByBookId(record.getBookId(),record.getStatus());
		data.put("clanVolumeList", clanVolumeList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody ClanVolume record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanVolumeService.add(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("clanVolume", record);
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
	public @ResponseBody ResponseEntity update(@RequestBody ClanVolume record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanVolumeService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	编辑-卷的状态
	 * @param update
	 * @return
	 */
	@RequestMapping("updateStatus")
	public @ResponseBody ResponseEntity updateStatus(@RequestBody ClanVolume record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanVolumeService.updateStatus(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody ClanVolume record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanPictureService.deleteByVolumeId(record.getId());
			clanVolumeService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
