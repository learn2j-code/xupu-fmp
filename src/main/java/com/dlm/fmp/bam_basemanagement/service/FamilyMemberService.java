package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.fmp.bam_basemanagement.vo.NumAndFamilyMembers;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForFamilyMember;
import com.dlm.fmp.pojo.CmRelation;
import com.dlm.fmp.pojo.FamilyMember;

public interface FamilyMemberService {
	List<FamilyMember> list();
	void add(FamilyMember record);
	void update(FamilyMember record);
	void delete(int id);
	FamilyMember get(int id);
	FamilyMemberExtends findById(int id);
	List<FamilyMember> findFamilyMemberListByBaseInfo(FamilyMember record);
	//将某本老谱的所有的成员拷贝一份到家族成员,同时建立老谱与家族成员的映射关系
	void addCmContentFinalToFamily(Integer bookId,Integer volumeId, Integer familyId);
	//将某本老谱的所有的成员关系映射到家族成员
	void addCmContentFinalRelationToFamily(List<CmRelation> cmRelationList, Integer familyId);
	//将某本老谱的所有的成员对应的家族成员全部删除,同时删除老谱与家族成员的映射关系
	void deleteFamilyMemberListFromFamily(Integer bookId,Integer volumeId, Integer familyId);
	
	//根据名称模糊查询主成员列表
	List<FamilyMember> findMainMemberListByFuzzyName(FamilyMember record);
	
	//按世代查询的未找到关系的成员列表和数字
	List<NumAndFamilyMembers> findNumAndMemberListByGenerationStartEnd(FamilyMemberExtends record);
	
	//根据家族id查询家族成员列表
	List<FamilyMember> findFamilyMemberListByFamilyId(Integer familyId);
	//根据家族id和名称模糊查询家族成员列表
	List<FamilyMember> findFamilyMemberListByFamilyIdAndName(Integer familyId,String memberName);
	//根据条件分页查询家族成员列表
	List<FamilyMember> findFamilyMemberListByPageAndCondition(RequestEntityForFamilyMember requestEntity);
	//根据人数查询扩展过用于前端的家族成员列表
	List<FamilyMemberExtends> findFamilyMemberExtendsListByNum(FamilyMemberExtends record);
	//根据头结点查询该头结点以下几代的成员数据	
	List<FamilyMemberExtends> findFamilyMemberListByHeadAndSeveralNum(FamilyMemberExtends record);
	//根据头结点查询所有有关联的人员id
	List<Integer> findMemberIdlistByHeadId(Integer headId,Integer num);
	
	//将家庭成员信息进行扩展
	List<FamilyMemberExtends> packageFamilyMemberExtendsBy(List<FamilyMember> familyMemberList);
	
	//查询某成员上几代人的信息
	List<FamilyMember> findAncestorListBy(Integer id,Integer num);
	
	//根据某成员的id 更新其关系状态
	void updateMemberRelationStatusAndGenerationNum(Integer memberAId,Integer memberBId, Integer relationStatus);

	//根据familyId查询家族始迁祖
	Integer findAncestorByFamilyId(FamilyMember record);
	
	//根据ids和名称查某家庭成员
	FamilyMember findFamilyMemberByIdsAndName(String name, List<Integer> idList,Integer familyId);
	
	//家族成员合并--主要是手机端的数据多了，PC端需要将一些多余的数据进行合并
	//合并的前提，有共同的父节点或者主节点，
	//A1合并到A2上，A1的familyMemberId将要消失，那么A1之前 家族成员之间的关系、家庭成员与家族成员之间的映射需要更换，然后可以删除A1
	//如果A1是老谱，还需要更换下老谱成员与家族成员的映射关系
	void mergeFamilyMemberOriginalToDest(Integer originalId, Integer destId, FamilyMember fmInfo);

	//添加节点和关系
	void addNodeAndRelation(FamilyMemberExtends record);
	
	//更新某头节点下的关联节点的世代
	void updateRelationNodeGenerationNumByHeadNode(Integer headNodeId);
	//更新某头节点下的关联节点的分支标识
	void updateRelationNodeSubFamilyCodeByHeadNode(Integer headNodeId,String subFamilyCode);

	//快速按世代对接父级或配偶节点
	void addTwoNodesConnectionQuicklyByGenerationStartEnd(FamilyMemberExtends record);
	
	//设置每个主成员的世系图已挂载的子个数
	void setMainMemberForSonNumReal(FamilyMemberExtends record);
	
	//根据头节点设置刷新其下所有人的已挂载子节点个数
	void refreshSonNumRealForMainNode(Integer mainMemberId);
	
}
