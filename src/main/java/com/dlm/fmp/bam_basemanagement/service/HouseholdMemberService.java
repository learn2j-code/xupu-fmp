package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.HouseholdMember;



public interface HouseholdMemberService {
	List<HouseholdMember> list();
	void add(HouseholdMember record);
	void update(HouseholdMember record);
	void delete(int id);
	HouseholdMember get(int id);
	
	List<HouseholdMember> findHouseholdMemberListByHouseholdId(Integer id);
	//根据家庭id查户主id  
	Integer findMainIdByHouseholdId(Integer householdId);
}
