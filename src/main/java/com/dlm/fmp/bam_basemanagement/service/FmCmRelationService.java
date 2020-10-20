package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.FmCmRelation;

public interface FmCmRelationService {
	List<FmCmRelation> list();
	void add(FmCmRelation record);
	void update(FmCmRelation record);
	void delete(int id);
	FmCmRelation get(int id);
	//根据老谱id和家族id删除关系列表
	void deleteFmCmRelationListFromBookIdAndFamilyId(Integer bookId, Integer volumeId, Integer familyId);
	//根据家族成员id查询老谱版本列表
	List<FmCmRelation> findCmListByFmId(Integer fmId);
	//根据老谱成员id和家族id查询家族成员信息
	FmCmRelation findFmListByCmIdAndFamilyId(Integer cmId, Integer familyId);
}
