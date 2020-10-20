package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.FamilySettingService;
import com.dlm.fmp.mapper.FamilySettingMapper;
import com.dlm.fmp.pojo.FamilySetting;
import com.dlm.fmp.pojo.FamilySettingExample;

@Service
public class FamilySettingServiceImpl implements FamilySettingService {
	@Autowired
	FamilySettingMapper mapper;

	@Override
	public List<FamilySetting> list() {
		FamilySettingExample example = new FamilySettingExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FamilySetting record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FamilySetting record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FamilySetting get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public FamilySetting findFamilySettingByFamilyId(Integer familyId) {
		FamilySettingExample example = new FamilySettingExample();
		example.createCriteria().andFamilyIdEqualTo(familyId).andXupuFlagEqualTo(0);
		List<FamilySetting> familySettingList = mapper.selectByExample(example);
		if(familySettingList!=null&&familySettingList.size()>0){
			return familySettingList.get(0);
		}
		return null;
	}

}
