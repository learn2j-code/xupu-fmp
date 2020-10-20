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
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.ClanPicture;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("clanpicture")
public class ClanPictureManageController {
	@Autowired
	ClanPictureService clanPictureService;	
	
	/**
	 * 	查询所有图片
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ClanPicture> clanPictureList = clanPictureService.list();
		data.put("clanPictureList", clanPictureList);
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
		
		List<ClanPicture> clanPictureList = clanPictureService.list();
		
		int total = (int)new PageInfo<>(clanPictureList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("clanPictureList", clanPictureList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个图片信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody ClanPicture record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		ClanPicture clanPicture = clanPictureService.get(record.getId());
		data.put("clanPicture", clanPicture);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据卷id查询图片列表
	 * @return
	 */
	@RequestMapping("findClanPictureListByVolumeId")
	public @ResponseBody ResponseEntity findClanPictureListByVolumeId(@RequestBody ClanPicture record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ClanPicture> clanPictureList = clanPictureService.findClanPictureListByVolumeId(record.getVolumeId(), record.getStatus());
		data.put("clanPictureList", clanPictureList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	在选中图片后插入一张图片
	 * @param addOnePictureAfterSelected
	 * @return
	 */
	@RequestMapping("addOnePictureAfterSelected")
	public @ResponseBody ResponseEntity addOnePictureAfterSelected(@RequestBody ClanPicture record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanPictureService.addOnePictureAfterSelected(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
//			data.put("clanPicture", record);
			responseEntity.setData(data);
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
	public @ResponseBody ResponseEntity add(@RequestBody ClanPicture record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanPictureService.add(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("clanPicture", record);
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
	public @ResponseBody ResponseEntity update(@RequestBody ClanPicture record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanPictureService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑-更新图片状态
	 * @param update
	 * @return
	 */
	@RequestMapping("updateStatus")
	public @ResponseBody ResponseEntity updateStatus(@RequestBody ClanPicture record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanPictureService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody ClanPicture record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanPictureService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
