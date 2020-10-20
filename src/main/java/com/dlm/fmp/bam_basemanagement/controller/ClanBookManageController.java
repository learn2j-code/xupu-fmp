package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.ClanBookService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.ClanPicture;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("clanbook")
public class ClanBookManageController {
	@Autowired
	ClanBookService clanBookService;	
	
	/**
	 * 	查询所有族谱书
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ClanBook> clanBookList = clanBookService.list();
		data.put("clanBookList", clanBookList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	分页查询谱书信息
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
		
		List<ClanBook> clanBookList = clanBookService.findClanBookListInCondition(requestEntity.getClanBook());
		
		int total = (int)new PageInfo<>(clanBookList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("clanBookList", clanBookList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个谱书信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody ClanBook record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		ClanBook clanBook = clanBookService.get(record.getId());
		data.put("clanBook", clanBook);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家族id和谱书状态查询家族下某状态的谱书列表
	 * @return
	 */
	@RequestMapping("findClanBookListByFamilyIdAndStatus")
	public @ResponseBody ResponseEntity findClanBookListByFamilyIdAndStatus(@RequestBody ClanBook record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ClanBook> clanBookList = clanBookService.findClanBookListByFamilyIdAndStatus(record.getFamilyId(), record.getStatus());
		data.put("clanBookList", clanBookList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 * 	根据谱书id查询未检测的图片列表
	 * @return
	 */
	@RequestMapping("findUncheckedClanPictureListByBookId")
	public @ResponseBody ResponseEntity findUncheckedClanPictureListByBookId(@RequestBody ClanBook record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ClanPicture> clanPictureList = clanBookService.findClanPictureListByBookId(record.getId(), 0);
		data.put("clanPictureList", clanPictureList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody ClanBook record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanBookService.addClanBook(record);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("clanBook", record);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑--修改书的状态
	 * @param update
	 * @return
	 */
	@RequestMapping("updateStatus")
	public @ResponseBody ResponseEntity updateStatus(@RequestBody ClanBook record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanBookService.updateStatus(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody ClanBook record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanBookService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody ClanBook record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			clanBookService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
