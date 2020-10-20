package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import org.junit.Test;

import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.fmp.bam_basemanagement.vo.NumAndClanMembers;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForCmContentFinal;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelFile;
import com.dlm.fmp.pojo.CmContent;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.FmCmRelation;

public interface CmContentFinalService {
	List<CmContentFinal> list();
	void add(CmContentFinal record);
	void update(CmContentFinal record);
	void delete(int id);
	CmContentFinal get(int id);
	void deleteFromBook(int bookId);
	
	//测试用
	void copyData();
	
	List<CmContentFinal> findCmListByPageAndCondition(RequestEntityForCmContentFinal requestEntity);
	
	//拷贝族谱原文表中的数据到老谱修订表中
	void addCmContentFinalList(String surname, List<CmContent> cmContentList,String generationWord);
	//拷贝族谱原文表中的数据到老谱修订表中-续
	void addCmContentFinalListForContinue(String surname, List<CmContent> cmContentList);
	
	//通过条件查询老谱成员列表
	List<CmContentFinal> findCmContentFinalListByCondition(CmContentFinal record);
	//通过条件查询老谱配偶成员列表
	List<CmContentFinal> findSpouseCmContentFinalListByCondition(CmContentFinal record);
	//通过条件查询老谱主成员列表
	List<CmContentFinal> findMainCmContentFinalListByCondition(CmContentFinalExtends record);
	//通过条件查询老谱成员数量
	Long findCmContentFinalListTotalCountByCondition(CmContentFinal record);
	//查询老谱成员中配偶的数量
	Long findSpouseRelationListNumInBook(CmContentFinal record);
	//查询老谱成员中主成员的数量
	Long findMainRelationListNumInBook(CmContentFinalExtends record);
	
	//通过某配偶节点的id向上查离其最近的主节点
	List<CmContentFinal> findMainNodeForSpouse(CmContentFinal record);
	
	
	//根据世代始末查询扩展过用于前端的老谱成员列表
	List<CmContentFinalExtends> findCmContentFinalExtendsListByGenerationStartEnd(CmContentFinalExtends record);

	//根据人数查询扩展过用于前端的老谱成员列表
	List<CmContentFinalExtends> findCmContentFinalExtendsListByNum(CmContentFinalExtends record);
	//根据关系列表查询老谱成员列表
	List<CmContentFinalExtends> findCmContentFinalExtendsListByRelationList(String subFamilyCode,List<FmCmRelation> fmCmRelationList);
	
	//根据名称模糊查询老谱成员列表
	List<CmContentFinalExtends> findMainMemberListByFuzzyName(CmContentFinal record);
	//根据名称模糊查询老谱成员列表--高级搜索
	List<CmContentFinalExtends> findMainMemberListByFuzzyNameAdvanced(CmContentFinal record);
	//按世代查询的未找到关系的成员列表和数字
	List<NumAndClanMembers> findNumAndMemberListByGenerationStartEnd(CmContentFinalExtends record);
	//按世代查询的未找到关系的成员数字
	List<NumAndClanMembers> findMemberListNumByGenerationStartEnd(CmContentFinalExtends record);
	
	//根据成员id列表查询所有老谱成员信息列表
	List<CmContentFinal> findCmContentFinalListByCmIdList(List<Integer> cmIdList);
	
	//根据某成员的id 更新其关系状态
	void updateMemberRelationStatusAndGenerationNum(Integer memberAId,Integer memberBId, Integer relationStatus);
	
	
	//根据bookId查询老谱始迁祖
	Integer findAncestorByBookId(CmContentFinal record);
	
	//更新excel上的数据到老谱和老谱备份
	void updateExcelContentToCmFinal(ExcelFile excelFile, CmContent cmContent);
	
	//将某一本书的所有卷的数据都从老谱成员删除
	void deleteCmContentFinalFromBook(CmContentFinal record);
	
	//将某一本书的所有卷的数据都复制到老谱成员中
	void copyCmContentToFinal(CmContentFinal record);

	//将某一本书的所有卷的数据都复制到老谱成员中--处理续卷
	void copyCmContentToFinalContinue(CmContentFinal record);
	
	//将某一本书的所有卷的数据生成关系
	void addRelationListForBook(CmContentFinal record);
	
	//添加节点和关系
	void addNodeAndRelation(CmContentFinalExtends record);
	
	//更新某头节点下的关联节点的世代
	void updateRelationNodeGenerationNumByHeadNode(Integer headNodeId);
	
	//根据id列表查询人员列表
	List<CmContentFinal> findCmContentFinalListByIdList(List<Integer> idList);
	
	//根据头结点查询该头结点以下几代的成员数据	
	List<CmContentFinalExtends> findCmContentFinalListByHeadAndSeveralNum(CmContentFinalExtends record);
	
	//根据头结点查询该头结点以下指定几代的成员数据	
	List<CmContentFinalExtends> findCmContentFinalListByHeadAndAssignGenerationNum(CmContentFinalExtends record);
	//根据头结点查询该头结点以下指定第几代的上一代有子孙的成员数据	
	List<CmContentFinalExtends> findAssignGenerationMemberListByHeadAndAssignGenerationNum(CmContentFinalExtends record);
	//根据头结点查询所有有关联的人员id
	List<Integer> findMemberIdlistByHeadId(Integer headId,Integer num);
	
	//根据头结点查询所有有关联的人员id--是否有配偶的标志
	List<Integer> findMemberIdlistByHeadIdAndSpouseFlag(Integer headId,Integer num, Integer hasSpouseFlag);
	
	//根据头结点查询指定代有关联的人员id
	List<Integer> findMemberIdlistByHeadIdAndAssignGeneration(Integer headId,Integer generation);

	
	//根据头结点查询其关联第几代成员是否存在
	Boolean findMemberByHeadId(Integer headId,Integer num);
	
	//快速按世代对接父级或配偶节点
	void addTwoNodesConnectionQuicklyByGenerationStartEnd(CmContentFinalExtends record);

	//将某一本书的未形成关系的配偶成员按世代，进一步挂载
	void addRelationListMoreInGeneration(CmContentFinalExtends record);
	//包装类CmContentFinal
	List<CmContentFinalExtends> packageCmContentFinal(RequestEntityForCmContentFinal requestEntity,List<CmContentFinal> cmContentFinalList);
	
	//查询上九代人的数据列表
	List<CmContentFinal> findAncestorListBy(Integer id, Integer num);
	
	//测试用
	//查询未挂关系的人员统计
	Long findUnrelatedNum(CmContentFinalExtends record);
	//设置将里面的字段或内容进行替换
	void updateCmContentFinalList(CmContentFinalExtends record);	
	//设置将里面的标志替换
	void updateCmContentFinalFlag(CmContentFinalExtends record);
	//更新里面的father_name,spouse_name,member_name,member_rel这四个为简体
	void updateCmContentFinalToSimple(CmContentFinalExtends record);
	
	//设置每个主成员的子个数
	void setMainMemberForSonNum(CmContentFinalExtends record);
	
	//设置每个主成员的世系图已挂载的子个数
	void setMainMemberForSonNumReal(CmContentFinalExtends record);
	
	//测试脚本用，更新某卷的order_no
	void updateNumForCmContentFinal(CmContentFinalExtends record);
	
	//查询该配偶节点5个人内最近的非配偶节点，取第一个直接挂载
	List<CmContentFinal> findFiveNodeForSpouse(CmContentFinal record);
	
	//设置每个人的排行
	void setRankingForCmContentToFinal(CmContentFinal record);
	
	//设置每个人的兄弟数量和妻子名字
	void setBrotherNumAndWifeListForCmContentToFinal(CmContentFinal record);
	
	//1、按兄弟进行挂载，先查未挂载的有兄弟的节点，然后查出该节点的所有兄弟，
	//2、查看所有兄弟是否都有挂载父亲节点，如果挂载的是同一个父亲，则将其余的节点都挂载至该父亲上
	void setRelationForBrotherNode(CmContentFinalExtends record);
	//按书卷和序号区间顺序查人--找大哥
	List<CmContentFinal> findBigBrotherListByBookVolumeAndOrderNo(CmContentFinal record,Integer sameSubClanFlag,Integer subNodeNumFlag);
	//按书卷和序号区间顺序查人--找小弟
	List<CmContentFinal> findSmallBrotherListByBookVolumeAndOrderNo(CmContentFinal record,Integer sameSubClanFlag,Integer subNodeNumFlag);

	//为挑子继子挂载父节点
	void setRelationForLocateNode(CmContentFinalExtends record);
	
	//按条件查父亲列表
	List<CmContentFinal> findFatherListByCondition(CmContentFinal record);
	//按条件查出继人员--与未找到关系的继子对应
	List<CmContentFinal> findToLocateByCondition(CmContentFinal record);
	//按条件查出继人员的父亲--比较两个继子大小，找出与之大小对应的唯一父亲
	List<CmContentFinal> findToLocateFatherByCondition(CmContentFinal record);
	
	//区间对接父子节点
	void setRelationInArea(CmContentFinalExtends record);
	//向上查找最近已挂载的节点id
	List<CmContentFinal> findRelatedNodeByLookUp(CmContentFinal record);
	//向下查找最近已挂载的节点id
	List<CmContentFinal> findRelatedNodeByLookDown(CmContentFinal record);
	//向上查找最近已挂载的节点id
	List<CmContentFinal> findRelatedNodeByArea(CmContentFinalExtends record);
	
	//扫描式强制挂载 
	void setRelationByForceScan(CmContentFinalExtends record);
	//查询未完全挂载的主节点
	List<CmContentFinal> findMainNodeInNotAllHangUp(CmContentFinal record);
	
	//以某个人为起始点一直追踪到第一个人
	List<CmContentFinalExtends> findCmContentFinalLinkBySomeOne(CmContentFinal record);
	//找某老谱中最后一代的最后一个人
	CmContentFinal findLastGenerationByLastOne(CmContentFinal record);
	//按世代倒序排列查成员列表
	List<CmContentFinal> findCmContentFinalListInGenerationDescOrder(CmContentFinal record);
	
	//查找出某一代的主成员列表
	List<CmContentFinal> findMainNodeListByGenerationNum(CmContentFinal record);
	//查找出某一代的配偶成员列表
	List<CmContentFinal> findSpouseNodeListByGenerationNum(CmContentFinal record);
	//找某老谱中最后一代的世代数
	Integer findLastGenerationNumByLastOne(CmContentFinal record);
	
	//设置老谱中的系房裔支
	//先根据3个参数获取3个世代的人，再根据第4个间隔获取后面的世代列表
	void setSubClanInfoForClan(CmContentFinalExtends record);
	//更新分支中的parentId--在分支表中添加世代数，利用代差来查parentId 并更新进去
	void updateParentIdForSubClanInfo(CmContentFinalExtends record);
	
	//利用分支信息表，及配置表，按世代进行每个人的分支标识设置--先看两代之间的代差，没后代的不设置subclanId 那这个人的subClanId是多少呢？
	void setSubClanIdForAllClanMember(CmContentFinalExtends record);
	
	//更新老谱成员列表中所有人的subclanId为
	void updateCmContentFinalListAtSubClanId(List<CmContentFinal> cmlist,Integer subClanId);
	//查询某世代前的所有成员列表
	List<CmContentFinal> findCmContentFinalListBeforeSomeGeneration(CmContentFinal record);
	
	//将词条内容中包含“已録”字眼的人员设置标志位
	void setExistFlagForCM(CmContentFinalExtends record);
	
	//设置始祖的分支，并将老谱中世代区间的人为始祖的subclanId
	void setAncestorForSubClanId(CmContentFinalExtends record);
	//设置系的分支，并将老谱中世代区间的人为始祖的subclanId
	void setXiForSubClanId(CmContentFinalExtends record);
	//设置房的分支，并将老谱中世代区间的人为始祖的subclanId
	void setFangForSubClanId(CmContentFinalExtends record);
	//设置裔的分支，并将老谱中世代区间的人为始祖的subclanId
	void setYiForSubClanId(CmContentFinalExtends record);
	
	//在老谱上设置分支id
	void setSubClanIdForOldClan(CmContentFinal record);
	//先设置头部
	void setSubClanIdForOldClanHeadFirst(CmContentFinal record);
	
	//根据名称半模糊查询老谱成员列表
	List<CmContentFinalExtends> findMemberListByHalfFuzzyName(CmContentFinalExtends record);
	
	//设置谱成员的三段式为原始数据
	void setThreeContentBy(List<CmContentFinal> cmContentFinalList);
	
}
