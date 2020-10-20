package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.CmModificationRecord;

public interface CmModificationRecordService {
	List<CmModificationRecord> list();
	void add(CmModificationRecord record);
	void update(CmModificationRecord record);
	void delete(int id);
	CmModificationRecord get(int id);
	List<CmModificationRecord> findCmModificationRecordListByBookId(Integer bookId);
}
