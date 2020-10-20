package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.AreaInfoService;
import com.dlm.fmp.mapper.AreaInfoMapper;
import com.dlm.fmp.pojo.AreaInfo;
import com.dlm.fmp.pojo.AreaInfoExample;

@Service
public class AreaInfoServiceImpl implements AreaInfoService {
	@Autowired
	AreaInfoMapper mapper;

	@Override
	public List<AreaInfo> list() {
		AreaInfoExample example = new AreaInfoExample();
		example.setOrderByClause("area_id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AreaInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(AreaInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public AreaInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AreaInfo> findAreaInfoListByParentId(Integer parentId) {
		AreaInfoExample example = new AreaInfoExample();
		example.createCriteria().andParentIdEqualTo(parentId);
		return mapper.selectByExample(example);
	}

	@Override
	public List<AreaInfo> findAreaInfoListByAreaName(String areaName) {
		AreaInfoExample example = new AreaInfoExample();
		example.createCriteria().andAreaNameLike("%"+areaName+"%");
		return mapper.selectByExample(example);
	}
}
