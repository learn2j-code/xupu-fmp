package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.SubFamilyInfo;

public interface SubFamilyInfoService {
	List<SubFamilyInfo> list();
	void add(SubFamilyInfo record);
	void update(SubFamilyInfo record);
	void delete(int id);
	SubFamilyInfo get(int id);
	//创建分支信息，先根据信息创建新家族，保存该分支信息，然后将新家族的id更新到该分支下的每个人身上
	void addSubFamilyInfo(SubFamilyInfo record);
	
	//根据家族id查询分支信息列表
	List<SubFamilyInfo> findSubFamilyInfoListByFamilyId(Integer familyId);
	
	//根据家族id查询分支信息的编码
	String findSubFamilyCodeBySubManagerId(Integer subManagerId);
	
	//根据手机号查询分支信息的编码
	String findSubFamilyCodeByPhone(String phone);
	
	//根据电话号码查询分支信息列表数量
	Long findSubFamilyInfoListNumByPhone(String phone);
}
