package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.HmRelation;


public interface HmRelationService {
	List<HmRelation> list();
	void add(HmRelation record);
	void update(HmRelation record);
	void delete(int id);
	HmRelation get(int id);
	
	//根据关系类型、子id(或配偶id)查父id(或主id)
	Integer findMbIdByMaIdAndRelType(Integer householdId, Integer relType, Integer maId);
	
	//根据关系类型、父id(或主id)查子id列表(或配偶id列表)
	List<Integer> findMaIdListByMbIdAndRelType(Integer householdId, Integer relType, Integer mbId);
	
	List<HmRelation> findMaIdlistByHouseholdIdRelTypeAndMbId(Integer householdId, Integer relType, Integer mbId);
	//根据家庭id生成家庭成员之间的关系
	void createHmRelationByHouseholdId(Integer householdId);
	
	List<HmRelation> findHmRelationListByHouseholdId(Integer householdId);
	
	void deleteHmRelationListByHouseholdId(Integer householdId);
}
