package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.FamilyCouncilService;
import com.dlm.fmp.mapper.FamilyCouncilMapper;
import com.dlm.fmp.pojo.FamilyCouncil;
import com.dlm.fmp.pojo.FamilyCouncilExample;

@Service
public class FamilyCouncilServiceImpl implements FamilyCouncilService {
	@Autowired
	FamilyCouncilMapper mapper;

	@Override
	public List<FamilyCouncil> list() {
		FamilyCouncilExample example = new FamilyCouncilExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FamilyCouncil record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FamilyCouncil record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FamilyCouncil get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FamilyCouncil> findFamilyCouncilListByFamilyId(Integer familyId) {
		FamilyCouncilExample example = new FamilyCouncilExample();
		example.createCriteria().andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}

	@Override
	public FamilyCouncil findFamilyCouncilByIdentityNo(String indentityNo) {
		FamilyCouncilExample example = new FamilyCouncilExample();
		example.setOrderByClause("create_time desc");
		if(StringUtils.isBlank(indentityNo)) {
			return null;
		}
		example.createCriteria().andIdentityCardEqualTo(indentityNo);
		List<FamilyCouncil> familyCouncilList = mapper.selectByExample(example);
		if(familyCouncilList!=null&&familyCouncilList.size()>0) {
			return familyCouncilList.get(0);
		}
		return null;
	}

}
