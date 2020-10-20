package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.CmModificationRecordService;
import com.dlm.fmp.mapper.CmModificationRecordMapper;
import com.dlm.fmp.pojo.CmModificationRecord;
import com.dlm.fmp.pojo.CmModificationRecordExample;

@Service
public class CmModificationRecordServiceImpl implements CmModificationRecordService {
	@Autowired
	CmModificationRecordMapper mapper;

	@Override
	public List<CmModificationRecord> list() {
		CmModificationRecordExample example = new CmModificationRecordExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(CmModificationRecord record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(CmModificationRecord record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public CmModificationRecord get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CmModificationRecord> findCmModificationRecordListByBookId(Integer bookId) {
		CmModificationRecordExample example = new CmModificationRecordExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andBookIdEqualTo(bookId);
		return mapper.selectByExample(example);
	}

}
