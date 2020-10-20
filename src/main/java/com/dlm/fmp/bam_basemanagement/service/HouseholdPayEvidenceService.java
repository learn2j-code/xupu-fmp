package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.HouseholdPayEvidence;



public interface HouseholdPayEvidenceService {
	List<HouseholdPayEvidence> list();
	void add(HouseholdPayEvidence record);
	void update(HouseholdPayEvidence record);
	void delete(int id);
	HouseholdPayEvidence get(int id);
	
	List<HouseholdPayEvidence> findHouseholdPayEvidenceList(HouseholdPayEvidence record);
}
