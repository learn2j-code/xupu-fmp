package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.FamilyCouncil;

public interface FamilyCouncilService {
	List<FamilyCouncil> list();
	void add(FamilyCouncil record);
	void update(FamilyCouncil record);
	void delete(int id);
	FamilyCouncil get(int id);
	List<FamilyCouncil> findFamilyCouncilListByFamilyId(Integer familyId);
	
	FamilyCouncil findFamilyCouncilByIdentityNo(String indentityNo);
}
