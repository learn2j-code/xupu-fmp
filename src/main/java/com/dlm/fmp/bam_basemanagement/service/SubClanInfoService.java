package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.bam_basemanagement.vo.SubClanInfoExtends;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.SubClanInfo;

public interface SubClanInfoService {
	List<SubClanInfo> list();
	void add(SubClanInfo record);
	void update(SubClanInfo record);
	void delete(int id);
	SubClanInfo get(int id);
	
	List<SubClanInfo> findSubClanInfoListByBookId(int bookId, Integer subClanType);
	List<SubClanInfo> findSubClanInfoListByBookId(SubClanInfoExtends condition);
	List<SubClanInfo> findSubClanInfoListByFuzzyName(SubClanInfoExtends condition);
	
	SubClanInfo findSubClanInfoBySubClanName(String subClanName, Integer bookId, Integer subClanType);
	
	//根据头结点查询其他子节点列表
	List<SubClanInfo> findSubClanInfoListByParentId(int parentId, int bookId, Integer subClanType);
	
	//根据头结点查询其下一层的子节点列表
	List<Integer> findSubClanInfoIdListByParentId(int parentId, int bookId, Integer subClanType);
	
	//根据头结点查询其下所有的子节点列表
	List<Integer> findAllSubClanInfoIdListByParentId(int parentId, int bookId, Integer subClanType);
	
	//查询该家族的所有系
	List<SubClanInfoExtends> findSubClanInfoListByBookIdAndParentId(int bookId,int parentId, Integer subClanType);

	//根据主键id查询该分支的全名
	String findFullNameById(Integer id);
	
	//根据cmId查分支信息
	SubClanInfo findSubClanInfoByCmId(int cmId, int bookId, Integer subClanType);
	
	//查询某世代的所有分支列表
	List<SubClanInfo> findSubClanInfoListByGeneration(Integer bookId,Integer generationNum, Integer subClanType);
	
	//删除数据
	void deleteByBookId(int bookId, Integer subClanTyp);
	
	//根据条件查询
	List<SubClanInfo> findSubClanInfoInCondition(SubClanInfo condition);
	
	List<SubClanInfoExtends>  packageSubClanInfoExtendsBy(List<SubClanInfo> list);
	
	//根据书和等级类型得到世代
	Integer getGenerationNumFrom(Integer bookId,Integer levelType);
}
