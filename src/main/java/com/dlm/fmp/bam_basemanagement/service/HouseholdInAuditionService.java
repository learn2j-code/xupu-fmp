package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.bam_basemanagement.vo.HouseholdInAuditionExtends;
import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HouseholdInAudition;


public interface HouseholdInAuditionService {
	List<HouseholdInAudition> list();
	void add(HouseholdInAudition record);
	void update(HouseholdInAudition record);
	void delete(int id);
	HouseholdInAudition get(int id);
	
	//添加家庭和家庭成员到审核
	void addHouseholdAndMembersInAudition(HouseholdInAudition HouseholdInAudition,List<HmInAudition> hmInAuditionList);
	
	//判断该家庭是否已经加入某家族
	boolean judgeHouseholdAlreadyInFamily(HouseholdInAudition record);
	
	//删除某家庭加入某家族的审核，同时删除家庭成员审核表中相关内容，TODO: 后续需要删除家族表中的已审核通过的成员数据
	void deleteHouseholdInAuditionByCondition(HouseholdInAudition record);
	
	//根据家庭id查询已加入家族的列表
	List<HouseholdInAudition> findAlreadyInFamilyListByHousehold(Integer householdId);
	
	//根据家族成员id查询待审核的家庭列表及家庭成员列表，
	List<HouseholdInAuditionExtends> findHouseholdInAuditionListByFamilyMemberId(Integer familyMemberId);
	
	//根据家族id和审核状态查询已进入审核的家庭列表
	List<HouseholdInAudition> findHouseholdInAuditionListBy(String subFamilyCode,Integer familyId, Integer auditFlag);

	//根据家庭id和家族id更新待审核家庭的状态
	void updateHouseholdInAuditionByCondition(HouseholdInAudition record);
	
	//根据待审核的家庭信息，将家庭成员进入家族成员
	void householdMemberEnterFamilyMember(HouseholdInAudition record);
}
