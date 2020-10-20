package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.CmRelation;
import com.dlm.fmp.pojo.FmRelation;

public interface FmRelationService {
	List<FmRelation> list();
	void add(FmRelation record);
	void update(FmRelation record);
	void delete(int id);
	FmRelation get(int id);
	//根据家族id删除家族成员间的关系
	void deleteFmRelationListFromFamilyId(Integer familyId);
	
	//根据父id查询其下子id列表
	List<PersonInfo> findSubNodeListByParentId(Integer parentId);
	//根据主id查询其下配偶id列表
	List<PersonInfo> findSpouseNodeListByMainId(Integer mainId);
	//根据主id查询其父id
	PersonInfo findParentNodeByMainId(Integer mainId);
	//根据配偶id查询其主id
	PersonInfo findMainNodeBySpouseId(Integer spouseId);
	
	//根据关系类型、子id(或配偶id)查父id(或主id)
	Integer findMbIdByMaIdAndRelType(Integer relType, Integer maId);
	//根据关系类型、父id(或主id)查子id列表(或配偶id列表)
	List<Integer> findMaIdListByMbIdAndRelType(Integer relType, Integer mbId);
			
	//解除某节点与连接节点的关系,type 1：子与父，2：配与主
	void releaseTwoNodesConnection(FmRelation record);
	//添加某节点与连接节点的关系,type 1：子与父，2：配与主
	void addTwoNodesConnection(FmRelation record);
	//修改某节点与连接节点的关系,type 1：子与父，2：配与主
	void changeTwoNodesConnection(FmRelation originalRecord, FmRelation destRecord);
	
	//根据某节点id删除跟其相关的所有关系
	void deleteAllRelationOfNode(Integer memberId);
	
	//根据maId查询mbId列表
	List<FmRelation> findMbIdListByMaId(Integer maId);
	//根据mbId查询maId列表
	List<FmRelation> findMaIdListByMbId(Integer mbId);
	
	//根据maid和mbid查重关系
	List<FmRelation>  findFmRelationByMaIdAndMbId(Integer maId, Integer mbId);
	
	//根据关系类型、父id(或主id)查子id列表(或配偶id列表)数量
	Long countMaIdListNumByMbIdAndRelType(Integer relType, Integer mbId);
}
