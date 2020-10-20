package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.CmRelation;

public interface CmRelationService {
	List<CmRelation> list();
	void add(CmRelation record);
	void update(CmRelation record);
	void delete(int id);
	CmRelation get(int id);
	
	//为老谱数据添加关系
	void addCmRelationList(List<CmContentFinal> cmContentFinalList);
	//为老谱所有配偶数据添加关系--利用相近原则挂载
	void addCmRelationListForSpouse(List<CmContentFinal> cmContentFinalList);
	//为老谱主成员数据添加关系--父亲名唯一挂载
	void addCmRelationListForMainInFatherName(Integer sameSubClanFlag,Integer subNodeNumFlag,List<CmContentFinal> cmContentFinalList);
	//为老谱主成员数据添加关系--父或母齿录中名字一致 唯一挂载
	void addCmRelationListForMainInMemberDetail(Integer sameSubClanFlag,Integer subNodeNumFlag,List<CmContentFinal> cmContentFinalList);
	//为老谱主成员数据添加关系--兄弟节点统一挂载
	void addCmRelationListForMainInBrotherNode(Integer sameSubClanFlag,Integer subNodeNumFlag,List<CmContentFinal> cmContentFinalList);
	
	//根据谱书id删除所有关系列表
	void deleteCmRelationListFromBook(Integer bookId);
	
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
	
	//根据关系类型、父id(或主id)查子id列表(或配偶id列表)数量
	Long countMaIdListNumByMbIdAndRelType(Integer relType, Integer mbId);
	
	//解除某节点与连接节点的关系,type 1：子与父，2：配与主
	void releaseTwoNodesConnection(CmRelation record);
	//添加某节点与连接节点的关系,type 1：子与父，2：配与主
	void addTwoNodesConnection(CmRelation record);
	//修改某节点与连接节点的关系,type 1：子与父，2：配与主
	void changeTwoNodesConnection(CmRelation originalRecord, CmRelation destRecord);
	
	//根据谱书id查询关系列表
	List<CmRelation> findCmRelationListByBookId(Integer bookId);
	
	//根据谱书id查询关系列表数量
	Long findCmRelationListNumByBookId(Integer bookId);
	
	//根据某节点id删除跟其相关的所有关系
	void deleteAllRelationOfNode(Integer memberId);
	
	//根据maid和mbid查重关系
	List<CmRelation>  findCmRelationByMaIdAndMbId(Integer maId, Integer mbId);
	
	//根据maid查5代父子关系的 父id列表
	List<Integer>  findfiveGenerationContentIdListByMaId(Integer maId);
}
