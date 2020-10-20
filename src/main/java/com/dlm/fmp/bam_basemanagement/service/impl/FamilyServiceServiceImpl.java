package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.FamilyServiceService;
import com.dlm.fmp.bam_basemanagement.service.ServiceCenterService;
import com.dlm.fmp.mapper.FamilyServiceMapper;
import com.dlm.fmp.pojo.FamilyService;
import com.dlm.fmp.pojo.FamilyServiceExample;

@Service
public class FamilyServiceServiceImpl implements FamilyServiceService {
	@Autowired
	FamilyServiceMapper mapper;
	
	@Autowired
	ServiceCenterService serviceCenterService;
	@Override
	public List<FamilyService> list() {
		FamilyServiceExample example = new FamilyServiceExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FamilyService record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FamilyService record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FamilyService get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FamilyService> findServiceListByFamilyId(int familyId) {
		FamilyServiceExample example = new FamilyServiceExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}

	@Override
	public void addFamilyService(FamilyService record) {
		//添加家族的已购服务，计算价格和到期时间等
//		Integer serviceId = record.getServiceId();
//		ServiceCenter serviceCenter = serviceCenterService.get(serviceId);
////		Double totalFee = Double.valueOf(serviceCenter.getPrice())*Double.valueOf(record.getBoughtNum());
////		String serviceFee = String.format("%.3f", totalFee);
////		record.setServiceFee(serviceFee);
//		
//		Date boughtTime = new Date();
//		record.setBoughtTime(boughtTime);
//		switch(record.getEndType()) {
//		case 1:
//			Date endTime = DateUtils.addMonths(boughtTime, record.getBoughtNum());
//			record.setEndTime(endTime);
//		}
		
		add(record);
	}

	@Override
	public FamilyService findServiceByFamilyIdAndServiceCode(int familyId, String serviceCode) {
		FamilyServiceExample example = new FamilyServiceExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(familyId).andServiceCodeEqualTo(serviceCode);
		List<FamilyService> familyServiceList = mapper.selectByExample(example);
		if(familyServiceList!=null&&familyServiceList.size()>=1) {
			return familyServiceList.get(0);
		}
		return null;
	}

}
