package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.HmInAuditionService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdInAuditionService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdPaymentService;
import com.dlm.fmp.bam_basemanagement.service.JoinfmApplicationService;
import com.dlm.fmp.mapper.HouseholdPaymentMapper;
import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HouseholdInAudition;
import com.dlm.fmp.pojo.HouseholdPayment;
import com.dlm.fmp.pojo.HouseholdPaymentExample;
import com.dlm.fmp.pojo.HouseholdPaymentExample.Criteria;
import com.dlm.fmp.pojo.JoinfmApplication;
@Service
public class HouseholdPaymentServiceImpl implements HouseholdPaymentService {

	@Autowired
	HouseholdPaymentMapper mapper;
	@Autowired
	HouseholdInAuditionService householdInAuditionService;
	@Autowired
	HmInAuditionService hmInAuditionService;
	@Autowired
	JoinfmApplicationService joinfmApplicationService;		
	@Override
	public List<HouseholdPayment> list() {
		HouseholdPaymentExample example = new HouseholdPaymentExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdPayment record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HouseholdPayment record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HouseholdPayment get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdPayment> findHouseholdPaymentList(HouseholdPayment record) {
		HouseholdPaymentExample example = new HouseholdPaymentExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record.getInvalidFlag()!=-1) {
			criteria.andInvalidFlagEqualTo(record.getInvalidFlag());
		}
		if(record.getHouseholdId()!=-1) {
			criteria.andHouseholdIdEqualTo(record.getHouseholdId());
		}
		if(record.getFamilyId()!=-1) {
			criteria.andFamilyIdEqualTo(record.getFamilyId());
		}
		if(StringUtils.isNotBlank(record.getOutTradeNo())) {
			criteria.andOutTradeNoEqualTo(record.getOutTradeNo());
		}
		if(record.getPayDone()!=-1) {
			criteria.andPayDoneEqualTo(record.getPayDone());
		}
		if(record.getPaymentWay()!=-1) {
			criteria.andPaymentWayEqualTo(record.getPaymentWay());
		}
		return mapper.selectByExample(example);
	}

	@Override
	public void create(HouseholdInAudition record) {
		HouseholdPayment householdPayment = new HouseholdPayment();
		householdPayment.setFamilyId(record.getFamilyId());
		householdPayment.setHouseholdId(record.getHouseholdId());
		householdPayment.setMoney(record.getTotalMoney());
		householdPayment.setAuditionId(record.getId());
		//查家族的设置中是那种支付方式 TODO:
		householdPayment.setPaymentWay(1);
		householdPayment.setOutTradeNo(System.currentTimeMillis()+"");
		add(householdPayment);
	}

	@Override
	public void updateHouseholdPaymentToInvalid(HouseholdInAudition record) {
		HouseholdPaymentExample example = new HouseholdPaymentExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		criteria.andHouseholdIdEqualTo(record.getHouseholdId());
		criteria.andPayDoneEqualTo(0);
	
		List<HouseholdPayment> householdPaymentList = mapper.selectByExample(example);
		for(HouseholdPayment householdPayment:householdPaymentList) {
			householdPayment.setInvalidFlag(0);
			update(householdPayment);
		}
	}

	@Override
	public void updateHouseholdPaymentByOutTradeNo(String outTradeNo,Integer way) {
		HouseholdPaymentExample example = new HouseholdPaymentExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andOutTradeNoEqualTo(outTradeNo);
		List<HouseholdPayment> householdPaymentList = mapper.selectByExample(example);
		for(HouseholdPayment householdPayment:householdPaymentList) {
			householdPayment.setPayDone(1);
			update(householdPayment);
			if(way==1) {
				//根据待审核id更新支付状态
				HouseholdInAudition hia = new HouseholdInAudition();
				hia.setId(householdPayment.getAuditionId());
				//设为已支付
				hia.setPayFlag(1);
				householdInAuditionService.update(hia);
				hia.setFamilyId(householdPayment.getFamilyId());
				hia.setHouseholdId(householdPayment.getHouseholdId());
				hmInAuditionService.updateHmInAuditionHadPaid(hia);
			}
			if(way==2) {
				JoinfmApplication jfma = new JoinfmApplication();
				jfma.setId(householdPayment.getApplicationId());
				jfma.setPaidFlag(1);
				joinfmApplicationService.update(jfma);
			}
		}
		
	}

}
