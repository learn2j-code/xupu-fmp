package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.fmp.mapper.HouseholdMemberMapper;
import com.dlm.fmp.pojo.HouseholdMember;
import com.dlm.fmp.pojo.HouseholdMemberExample;
@Service
public class HouseholdMemberServiceImpl implements HouseholdMemberService {

	@Autowired
	HouseholdMemberMapper mapper;
	
	@Override
	public List<HouseholdMember> list() {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdMember record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HouseholdMember record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HouseholdMember get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByHouseholdId(Integer id) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(id);
		return mapper.selectByExample(example);
	}

	@Override
	public Integer findMainIdByHouseholdId(Integer householdId) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(householdId).andRelationCodeEqualTo("myself");
		List<HouseholdMember> householdMemberList = mapper.selectByExample(example);
		if(householdMemberList.size()>0) {
			return householdMemberList.get(0).getId();
		}
		return null;
	}

}
