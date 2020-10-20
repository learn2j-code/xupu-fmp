package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.FmHmRelation;

public interface FmHmRelationService {
	List<FmHmRelation> list();
	void add(FmHmRelation record);
	void update(FmHmRelation record);
	void delete(int id);
	FmHmRelation get(int id);
	List<FmHmRelation> findHmListByFmId(Integer fmId);
}
