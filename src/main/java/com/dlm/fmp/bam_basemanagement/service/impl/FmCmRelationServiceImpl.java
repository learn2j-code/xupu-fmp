package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.FmCmRelationService;
import com.dlm.fmp.mapper.FmCmRelationMapper;
import com.dlm.fmp.pojo.FmCmRelation;
import com.dlm.fmp.pojo.FmCmRelationExample;

@Service
public class FmCmRelationServiceImpl implements FmCmRelationService {
	@Autowired
	FmCmRelationMapper mapper;

	@Override
	public List<FmCmRelation> list() {
		FmCmRelationExample example = new FmCmRelationExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FmCmRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FmCmRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FmCmRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FmCmRelation> findCmListByFmId(Integer fmId) {
		FmCmRelationExample example = new FmCmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andFamilyMemberIdEqualTo(fmId);
		return mapper.selectByExample(example);
	}

	@Override
	public FmCmRelation findFmListByCmIdAndFamilyId(Integer cmId, Integer familyId) {
		FmCmRelationExample example = new FmCmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andCmContentFinalIdEqualTo(cmId).andFamilyIdEqualTo(familyId);
		List<FmCmRelation> fmCmRelationList = mapper.selectByExample(example);
		return fmCmRelationList.size()>0?fmCmRelationList.get(0):null;
	}

	@Override
	public void deleteFmCmRelationListFromBookIdAndFamilyId(Integer bookId, Integer volumeId, Integer familyId) {
		FmCmRelationExample example = new FmCmRelationExample();
		example.createCriteria().andBookIdEqualTo(bookId).andFamilyIdEqualTo(familyId).andVolumeIdEqualTo(volumeId);
		mapper.deleteByExample(example);
	}

}
