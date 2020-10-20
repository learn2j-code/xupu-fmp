package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.HouseholdInAudition;
import com.dlm.fmp.pojo.HouseholdPayment;



public interface HouseholdPaymentService {
	List<HouseholdPayment> list();
	void add(HouseholdPayment record);
	void update(HouseholdPayment record);
	void delete(int id);
	HouseholdPayment get(int id);
	
	//通过家族申请入谱信息创建支付订单
	void create(HouseholdInAudition record);
	//根据家族申请入谱信息更新某家族的某家庭的未支付订单为无效
	void updateHouseholdPaymentToInvalid(HouseholdInAudition record);
	
	List<HouseholdPayment> findHouseholdPaymentList(HouseholdPayment record);
	
	//根据订单号更新订单状态为已支付
	void updateHouseholdPaymentByOutTradeNo(String outTradeNo,Integer way);
}
