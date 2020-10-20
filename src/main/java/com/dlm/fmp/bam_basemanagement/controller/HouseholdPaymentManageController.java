package com.dlm.fmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.fmp.bam_basemanagement.service.HouseholdPayEvidenceService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdPaymentService;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.HouseholdPayment;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("householdpayment")
public class HouseholdPaymentManageController {
	@Autowired
	HouseholdPaymentService householdPaymentService;	
	
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdPayment> householdPaymentList = householdPaymentService.list();
		data.put("householdPaymentList", householdPaymentList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询家庭
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
		
		List<HouseholdPayment> householdPaymentList = householdPaymentService.list();
		
		int total = (int)new PageInfo<>(householdPaymentList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("householdPaymentList", householdPaymentList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家庭id和家族id查询付款的信息
	 * @return
	 */
	@RequestMapping("findHouseholdPaymentList")
	public @ResponseBody ResponseEntity findHouseholdPaymentList(@RequestBody HouseholdPayment record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdPayment> householdPaymentList = householdPaymentService.findHouseholdPaymentList(record);
		data.put("householdPaymentList", householdPaymentList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody HouseholdPayment record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdPayment householdPayment = householdPaymentService.get(record.getId());
		data.put("householdPayment", householdPayment);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody HouseholdPayment record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			householdPaymentService.add(record);
			data.put("householdPayment", record);
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
	public @ResponseBody ResponseEntity update(@RequestBody HouseholdPayment record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdPaymentService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param updateHouseholdPaymentByoutTradeNo
	 * @return
	 */
	@RequestMapping("updateHouseholdPaymentByOutTradeNo")
	public @ResponseBody ResponseEntity updateHouseholdPaymentByOutTradeNo(HttpServletRequest request){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			String outTradeNo = request.getParameter("outTradeNo");
			householdPaymentService.updateHouseholdPaymentByOutTradeNo(outTradeNo,1);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param updateHouseholdPaymentByoutTradeNoForJFMA
	 * @return
	 */
	@RequestMapping("updateHouseholdPaymentByoutTradeNoForJFMA")
	public @ResponseBody ResponseEntity updateHouseholdPaymentByoutTradeNoForJFMA(HttpServletRequest request){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			String outTradeNo = request.getParameter("outTradeNo");
			householdPaymentService.updateHouseholdPaymentByOutTradeNo(outTradeNo,2);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param updateHouseholdPayment
	 * @return
	 */
	@RequestMapping("updateHouseholdPayment")
	public @ResponseBody ResponseEntity updateHouseholdPayment(@RequestBody HouseholdPayment record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdPaymentService.updateHouseholdPaymentByOutTradeNo(record.getOutTradeNo(),1);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	编辑
	 * @param updateHouseholdPaymentForJFMA
	 * @return
	 */
	@RequestMapping("updateHouseholdPaymentForJFMA")
	public @ResponseBody ResponseEntity updateHouseholdPaymentForJFMA(@RequestBody HouseholdPayment record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdPaymentService.updateHouseholdPaymentByOutTradeNo(record.getOutTradeNo(),2);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody HouseholdPayment record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdPaymentService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
