package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.FmRelationService;
import com.dlm.fmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.fmp.constant.ClanConstant;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.mapper.FmRelationMapper;
import com.dlm.fmp.pojo.FmRelation;
import com.dlm.fmp.pojo.FmRelationExample;
import com.dlm.fmp.pojo.FmRelationExample.Criteria;
import com.dlm.fmp.pojo.CmRelationExample;
import com.dlm.fmp.pojo.FamilyMember;

@Service
public class FmRelationServiceImpl implements FmRelationService {
	@Autowired
	FmRelationMapper mapper;
	@Autowired
	FamilyMemberService familyMemberService;
	
	@Override
	public List<FmRelation> list() {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FmRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FmRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FmRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<PersonInfo> findSubNodeListByParentId(Integer parentId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER).andMbIdEqualTo(parentId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		List<PersonInfo> subNodeList = new ArrayList<PersonInfo>();
		for(FmRelation fmRelation:fmRelationList) {
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelation.getMaId());
			FamilyMember familyMember = familyMemberService.get(fmRelation.getMaId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			subNodeList.add(personInfo);
		}
		return subNodeList;
	}

	@Override
	public List<PersonInfo> findSpouseNodeListByMainId(Integer mainId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_SPOUSESUB).andMbIdEqualTo(mainId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		List<PersonInfo> spouseNodeList = new ArrayList<PersonInfo>();
		for(FmRelation fmRelation:fmRelationList) {
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelation.getMaId());
			FamilyMember familyMember = familyMemberService.get(fmRelation.getMaId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			spouseNodeList.add(personInfo);
		}
		return spouseNodeList;
	}

	@Override
	public PersonInfo findParentNodeByMainId(Integer mainId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(CommonConstant.RELATIONSHIP_CHILDFATHER).andMaIdEqualTo(mainId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		if(fmRelationList!=null&&fmRelationList.size()>=1){
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelationList.get(0).getMbId());
			FamilyMember familyMember = familyMemberService.get(fmRelationList.get(0).getMbId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			return personInfo;
		}
		return null;
	}
	
	@Override
	public PersonInfo findMainNodeBySpouseId(Integer spouseId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(CommonConstant.RELATIONSHIP_SPOUSEMAIN).andMaIdEqualTo(spouseId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		if(fmRelationList!=null&&fmRelationList.size()>=1){
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelationList.get(0).getMbId());
			FamilyMember familyMember = familyMemberService.get(fmRelationList.get(0).getMbId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			return personInfo;
		}
		return null;
	}
	
	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void releaseTwoNodesConnection(FmRelation record) {
		//解除某节点与连接节点的关系,type 1：子与父，2：配与主
		FmRelationExample example = new FmRelationExample();
		Criteria criteria = example.createCriteria();
		criteria.andMbIdEqualTo(record.getMbId());
		criteria.andMaIdEqualTo(record.getMaId());
		List<FmRelation> cmRelationList = mapper.selectByExample(example);
		for(FmRelation cmRelation:cmRelationList) {
			delete(cmRelation.getId());
		}
		
		//修改该节点的标志为未挂上关系			
		familyMemberService.updateMemberRelationStatusAndGenerationNum(record.getMaId(),record.getMbId(),CommonConstant.RELATIONSHIP_UNFIND);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addTwoNodesConnection(FmRelation record) {
		List<FmRelation> fmRelationList = findFmRelationByMaIdAndMbId(record.getMaId(),record.getMbId());
		if(fmRelationList == null||fmRelationList.size()<=0) {
			add(record);
		}
		//修改该节点的标志为挂上关系,并把分支始祖的编码加入
		familyMemberService.updateMemberRelationStatusAndGenerationNum(record.getMaId(),record.getMbId(),record.getRelType());
		//修改对接节点之下的所有节点的世代,并把分支始祖的编码加入
		familyMemberService.updateRelationNodeGenerationNumByHeadNode(record.getMaId());
	}

	@Override
	public void changeTwoNodesConnection(FmRelation originalRecord, FmRelation destRecord) {
		releaseTwoNodesConnection(originalRecord);
		addTwoNodesConnection(destRecord);
	}

	@Override
	public void deleteAllRelationOfNode(Integer memberId) {
		//移除的是该节点的 子与父 或者配与主的关系
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andMaIdEqualTo(memberId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		for(FmRelation fmRelation:fmRelationList) {
			delete(fmRelation.getId());
			
		}
		//移除的是该节点的 父与子 或者主与配的关系
		FmRelationExample example1 = new FmRelationExample();
		example1.createCriteria().andMbIdEqualTo(memberId);
		List<FmRelation> fmRelationList1 = mapper.selectByExample(example1);
		for(FmRelation fmRelation:fmRelationList1) {
			delete(fmRelation.getId());
			//同时需要把其他关联成员的关系字段清除
			familyMemberService.updateMemberRelationStatusAndGenerationNum(fmRelation.getMaId(),fmRelation.getMbId(), CommonConstant.RELATIONSHIP_UNFIND);
		}
	}

	@Override
	public Integer findMbIdByMaIdAndRelType(Integer relType, Integer maId) {
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andRelTypeEqualTo(relType).andMaIdEqualTo(maId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		if(fmRelationList!=null&&fmRelationList.size()==1) {
			return fmRelationList.get(0).getMbId();
		}
		return null;
	}

	@Override
	public List<Integer> findMaIdListByMbIdAndRelType(Integer relType, Integer mbId) {
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andRelTypeEqualTo(relType).andMbIdEqualTo(mbId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		List<Integer> maIdList = new ArrayList<Integer>();
		for(FmRelation fmRelation:fmRelationList) {
			maIdList.add(fmRelation.getMaId());
		}
		return maIdList;
	}

	@Override
	public List<FmRelation> findMbIdListByMaId(Integer maId) {
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andMaIdEqualTo(maId);
		return mapper.selectByExample(example);
	}

	@Override
	public List<FmRelation> findMaIdListByMbId(Integer mbId) {
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andMbIdEqualTo(mbId);
		return mapper.selectByExample(example);
	}

	@Override
	public List<FmRelation> findFmRelationByMaIdAndMbId(Integer maId, Integer mbId) {
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andMaIdEqualTo(maId).andMbIdEqualTo(mbId);
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteFmRelationListFromFamilyId(Integer familyId) {
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andFamilyIdEqualTo(familyId);
		mapper.deleteByExample(example);
	}
	
	@Override
	public Long countMaIdListNumByMbIdAndRelType(Integer relType, Integer mbId) {
		FmRelationExample example = new FmRelationExample();
		example.createCriteria().andRelTypeEqualTo(relType).andMbIdEqualTo(mbId);
		return mapper.countByExample(example);
	}
}

