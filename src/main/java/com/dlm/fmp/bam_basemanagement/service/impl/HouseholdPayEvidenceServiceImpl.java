package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.HouseholdPayEvidenceService;
import com.dlm.fmp.mapper.HouseholdPayEvidenceMapper;
import com.dlm.fmp.pojo.HouseholdPayEvidence;
import com.dlm.fmp.pojo.HouseholdPayEvidenceExample;
@Service
public class HouseholdPayEvidenceServiceImpl implements HouseholdPayEvidenceService {

	@Autowired
	HouseholdPayEvidenceMapper mapper;
	
	@Override
	public List<HouseholdPayEvidence> list() {
		HouseholdPayEvidenceExample example = new HouseholdPayEvidenceExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdPayEvidence record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HouseholdPayEvidence record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HouseholdPayEvidence get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdPayEvidence> findHouseholdPayEvidenceList(HouseholdPayEvidence record) {
		HouseholdPayEvidenceExample example = new HouseholdPayEvidenceExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(record.getHouseholdId()).andFamilyIdEqualTo(record.getFamilyId()).andOrderNoEqualTo(record.getOrderNo());
		return mapper.selectByExample(example);
	}

}
