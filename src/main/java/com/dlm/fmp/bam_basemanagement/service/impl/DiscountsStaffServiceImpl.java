package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.DiscountsStaffService;
import com.dlm.fmp.mapper.DiscountsStaffMapper;
import com.dlm.fmp.pojo.DiscountsStaff;
import com.dlm.fmp.pojo.DiscountsStaffExample;

@Service
public class DiscountsStaffServiceImpl implements DiscountsStaffService {
	@Autowired
	DiscountsStaffMapper mapper;

	@Override
	public List<DiscountsStaff> list() {
		DiscountsStaffExample example = new DiscountsStaffExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(DiscountsStaff record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(DiscountsStaff record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public DiscountsStaff get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DiscountsStaff> findDiscountsStaffListBySettingId(Integer settingId) {
		DiscountsStaffExample example = new DiscountsStaffExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andSettingIdEqualTo(settingId);
		return mapper.selectByExample(example);
	}

	@Override
	public DiscountsStaff findDiscountsStaffByIdentityNo(String indentityNo) {
		DiscountsStaffExample example = new DiscountsStaffExample();
		example.setOrderByClause("create_time desc");
		if(StringUtils.isBlank(indentityNo)) {
			return null;
		}
		example.createCriteria().andIdentityCardEqualTo(indentityNo);
		List<DiscountsStaff> discountsStaffList = mapper.selectByExample(example);
		if(discountsStaffList!=null&&discountsStaffList.size()>0) {
			return discountsStaffList.get(0);
		}
		return null;
	}

}
