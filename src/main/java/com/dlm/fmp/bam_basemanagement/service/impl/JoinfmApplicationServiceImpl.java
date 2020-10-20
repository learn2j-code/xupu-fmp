package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.ClanPictureService;
import com.dlm.fmp.bam_basemanagement.service.JoinfmApplicationService;
import com.dlm.fmp.mapper.JoinfmApplicationMapper;
import com.dlm.fmp.pojo.ClanPicture;
import com.dlm.fmp.pojo.JoinfmApplication;
import com.dlm.fmp.pojo.JoinfmApplicationExample;
import com.dlm.fmp.pojo.JoinfmApplicationExample.Criteria;

@Service
public class JoinfmApplicationServiceImpl implements JoinfmApplicationService {
	@Autowired
	JoinfmApplicationMapper mapper;
	
	
	@Override
	public List<JoinfmApplication> list() {
		JoinfmApplicationExample example = new JoinfmApplicationExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(JoinfmApplication record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(JoinfmApplication record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public JoinfmApplication get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void addJoinfmApplication(JoinfmApplication record) {
		
		add(record);
	}


}
