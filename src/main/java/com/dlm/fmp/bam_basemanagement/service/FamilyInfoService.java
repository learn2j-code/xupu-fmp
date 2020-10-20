package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.FamilyInfo;
import com.dlm.fmp.pojo.FamilyInfoWithBLOBs;

public interface FamilyInfoService {
	List<FamilyInfo> list();
	void add(FamilyInfoWithBLOBs record);
	void update(FamilyInfoWithBLOBs record);
	void delete(int id);
	FamilyInfoWithBLOBs get(int id);
	
}
