package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.FamilySetting;

public interface FamilySettingService {
	List<FamilySetting> list();
	void add(FamilySetting record);
	void update(FamilySetting record);
	void delete(int id);
	FamilySetting get(int id);
	FamilySetting findFamilySettingByFamilyId(Integer familyId);
}
