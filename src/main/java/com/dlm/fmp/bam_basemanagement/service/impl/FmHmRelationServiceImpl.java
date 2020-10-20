package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.FmHmRelationService;
import com.dlm.fmp.mapper.FmHmRelationMapper;
import com.dlm.fmp.pojo.FmHmRelation;
import com.dlm.fmp.pojo.FmHmRelationExample;

@Service
public class FmHmRelationServiceImpl implements FmHmRelationService {
	@Autowired
	FmHmRelationMapper mapper;

	@Override
	public List<FmHmRelation> list() {
		FmHmRelationExample example = new FmHmRelationExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FmHmRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FmHmRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FmHmRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FmHmRelation> findHmListByFmId(Integer fmId) {
		FmHmRelationExample example = new FmHmRelationExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyMemberIdEqualTo(fmId);
		return mapper.selectByExample(example);
	}

}
