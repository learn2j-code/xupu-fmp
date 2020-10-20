package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;
import java.util.Map;

import com.dlm.fmp.bam_basemanagement.vo.HmInAuditionVo;
import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HouseholdInAudition;


public interface HmInAuditionService {
	List<HmInAudition> list();
	void add(HmInAudition record);
	void update(HmInAudition record);
	void delete(int id);
	HmInAudition get(int id);
	
	// 添加成员列表到审核表
	String addHouseholdMembersInAudition(HouseholdInAudition HouseholdInAudition, List<HmInAudition> recordList);
	
	// 根据家族id和家庭id删除成员列表
	void deleteHouseholdMembersInAudition(HouseholdInAudition record);
	
	// 根据家族id和家庭id查询成员列表
	List<HmInAuditionVo> findHouseholdMembersInAudition(HouseholdInAudition householdInAudition);
	
	// 根据家族id和家庭id查询成员列表
	Map<Integer, HmInAuditionVo> findHouseholdMembersInAuditionMap(HouseholdInAudition householdInAudition);
	
	// 根据家族id和家庭id、接入点标识查询接入点成员 id
	HmInAudition findHouseholdInMemberBy(HouseholdInAudition record);
	
	//根据身份证信息查询是否有已付费用户
	Integer findHadPaidMember(String identityNo);
	
	//根据家族id和家庭id更新其待审核成员的已支付状态
	void updateHmInAuditionHadPaid(HouseholdInAudition householdInAudition);
}
