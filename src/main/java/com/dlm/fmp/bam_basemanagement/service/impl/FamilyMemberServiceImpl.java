package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.CmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.FmCmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FmHmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FmRelationService;
import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.fmp.bam_basemanagement.vo.NumAndFamilyMembers;
import com.dlm.fmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForFamilyMember;
import com.dlm.fmp.constant.ClanConstant;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.constant.FamilyConstant;
import com.dlm.fmp.mapper.FamilyMemberMapper;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.CmContentFinalExample;
import com.dlm.fmp.pojo.CmRelation;
import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.FamilyMemberExample;
import com.dlm.fmp.pojo.FamilyMemberExample.Criteria;
import com.dlm.fmp.util.jpinyin.PinyinException;
import com.dlm.fmp.util.jpinyin.PinyinFormat;
import com.dlm.fmp.util.jpinyin.PinyinHelper;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.dlm.fmp.pojo.FmCmRelation;
import com.dlm.fmp.pojo.FmHmRelation;
import com.dlm.fmp.pojo.FmRelation;

@Service
public class FamilyMemberServiceImpl implements FamilyMemberService {
	@Autowired
	FamilyMemberMapper mapper;
	
	@Autowired
	CmRelationService cmRelationService;
	
	@Autowired
	FmCmRelationService fmCmRelationService;
	
	@Autowired
	FmRelationService fmRelationService;
	
	@Autowired
	FmHmRelationService fmHmRelationService;
	
	@Autowired
	CmContentFinalService cmContentFinalService;

	@Override
	public List<FamilyMember> list() {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("generation_num asc,id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FamilyMember record) {
		mapper.insertSelective(record);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void delete(int id) {
		//同时删除节点的所有关系
		fmRelationService.deleteAllRelationOfNode(id);
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FamilyMember record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FamilyMember get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	//TODO:
	@Override
	public List<FamilyMember> findFamilyMemberListByBaseInfo(FamilyMember record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record.getFamilyId()!=null){
			criteria.andFamilyIdEqualTo(record.getFamilyId());
		}
		if(StringUtils.isNotBlank(record.getSecPersonalName())){
			String secPersonalName = ZhConverterUtil.convertToTraditional(record.getSecPersonalName());
			criteria.andSecPersonalNameEqualTo(secPersonalName);
		}
		if(StringUtils.isNotBlank(record.getMemberSurname())){
			criteria.andMemberSurnameEqualTo(record.getMemberSurname());
		}
		if(StringUtils.isNotBlank(record.getMemberName())){
			if(record.getRelativeFlag()==0) {
				criteria.andMemberNameLike("%"+record.getMemberName()+"%");
			}
			if(record.getRelativeFlag()==1) {
				//TODO:
				try {
					String memberNamePY = PinyinHelper.convertToPinyinString(record.getMemberName(), "", PinyinFormat.WITHOUT_TONE);
					criteria.andMemberNamePinyinLike("%"+memberNamePY+"%");
				} catch (PinyinException e) {
					e.printStackTrace();
				}
			}
		}
		if(record.getMemberGender()!=-1) {
			criteria.andMemberGenderEqualTo(record.getMemberGender());
		}
		if(StringUtils.isNotBlank(record.getSecPersonalName())) {
			criteria.andSecPersonalNameEqualTo(record.getSecPersonalName());
		}
		if(StringUtils.isNotBlank(record.getGenerationWord())){
			//根据派语读取世代
			String generationWord = ZhConverterUtil.convertToTraditional(record.getGenerationWord());
			Integer generationNum = ClanConstant.GENERATIONWORD_HU.indexOf(generationWord);
			criteria.andGenerationNumEqualTo(generationNum);
		}
		
		if(StringUtils.isNotBlank(record.getMark())){
			String mark = ZhConverterUtil.convertToTraditional(record.getMark());
			criteria.andMarkEqualTo(mark);
		}
		return mapper.selectByExample(example);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addCmContentFinalToFamily(Integer bookId,Integer volumeId,Integer familyId) {
		//添加前先删除以前的家族成员数据
		deleteFamilyMemberListFromFamily(bookId,volumeId,familyId);
		
		CmContentFinalExtends record = new CmContentFinalExtends();
		record.setBookId(bookId);
		record.setVolumeId(volumeId);
		record.setContentType(CommonConstant.CONTENTTYPE_MEMBER);
		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(record);
		//将所有的老谱成员拷贝一份到家族成员
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			FamilyMember familyMember = packageCmContentFinal(cmContentFinal,familyId);
			add(familyMember);
			//同时建立老谱与家族成员的映射关系
			addCmContentFinalAndFamilyMemberConnection(cmContentFinal,familyMember);
		}
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addCmContentFinalRelationToFamily(List<CmRelation> cmRelationList,Integer familyId) {
//		//根据老谱中成员之间的关系，生成家族成员之间的关系
//		List<CmRelation> cmRelationList = cmRelationService.findCmRelationListByBookId(bookId);
		for(CmRelation cmRelation:cmRelationList){
			FmCmRelation fma = fmCmRelationService.findFmListByCmIdAndFamilyId(cmRelation.getMaId(), familyId);
			FmCmRelation fmb = fmCmRelationService.findFmListByCmIdAndFamilyId(cmRelation.getMbId(), familyId);
			if(fma!=null&&fmb!=null){
				FmRelation fmRelation = new FmRelation();
				fmRelation.setFamilyId(familyId);
				fmRelation.setRelType(cmRelation.getRelType());
				fmRelation.setMaId(fma.getFamilyMemberId());
				fmRelation.setMbId(fmb.getFamilyMemberId());
				fmRelationService.add(fmRelation);
			}
		}
	}
	private FamilyMember packageCmContentFinal(CmContentFinal cmContentFinal,Integer familyId) {
		FamilyMember familyMember = new FamilyMember();
		familyMember.setFamilyId(familyId);
		familyMember.setBookId(cmContentFinal.getBookId());
		familyMember.setVolumeId(cmContentFinal.getVolumeId());
		familyMember.setBirthdayTime(cmContentFinal.getBirthdayTime());
		familyMember.setBuriedLocation(cmContentFinal.getBuriedLocation());
		familyMember.setDaughter(cmContentFinal.getDaughter());
		familyMember.setDeathdayTime(cmContentFinal.getDeathdayTime());
//		familyMember.setFamilyMemberCode(cmContentFinal.getFamilyMemberCode());
		familyMember.setFatherName(cmContentFinal.getFatherName());
		familyMember.setFatherNamePinyin(cmContentFinal.getFatherNamePinyin());
		familyMember.setGenerationNum(cmContentFinal.getGenerationNum());
//		familyMember.setGenerationWord(cmContentFinal.getg);
		familyMember.setMemberDetail(cmContentFinal.getMemberDetail());
		familyMember.setMemberGender(cmContentFinal.getMemberGender());
		familyMember.setMemberName(cmContentFinal.getMemberName());
		familyMember.setMemberNamePinyin(cmContentFinal.getMemberNamePinyin());
//		familyMember.setMemberStory(cmContentFinal.getm);
		familyMember.setMemberSurname(cmContentFinal.getMemberSurname());
//		familyMember.setNativePlace(cmContentFinal.get);
		familyMember.setOrderNo(cmContentFinal.getOrderNo());
//		familyMember.setPayFlag(payFlag);
		familyMember.setRelFlag(cmContentFinal.getRelFlag());
		familyMember.setRelKeyword(cmContentFinal.getRelKeyword());
		familyMember.setSon(cmContentFinal.getSon());
		//来源
//		familyMember.setSource(source);
		familyMember.setSpouseName(cmContentFinal.getSpouseName());
		familyMember.setSpouseNamePinyin(cmContentFinal.getSpouseNamePinyin());
		familyMember.setSubFamilyFlag(FamilyConstant.SUBFAMILYFLAG_COMMON);
		familyMember.setSubFamilyCode(familyId.toString());
		familyMember.setSubClanId(cmContentFinal.getSubClanId());
		familyMember.setRanking(cmContentFinal.getRanking());
		
		familyMember.setToLocate(cmContentFinal.getToLocate());
		familyMember.setSonNum(cmContentFinal.getSonNum());
		familyMember.setSonNumReal(cmContentFinal.getSonNumReal());
		familyMember.setSonNumDiff(cmContentFinal.getSonNumDiff());
		familyMember.setAlreadyExist(cmContentFinal.getAlreadyExist());
		familyMember.setRelErrorFlag(cmContentFinal.getRelErrorFlag());
		return familyMember;
		
	}

	private void addCmContentFinalAndFamilyMemberConnection(CmContentFinal cmContentFinal,FamilyMember familyMember) {
		FmCmRelation fmCmRelation = new FmCmRelation();
		fmCmRelation.setCmContentFinalId(cmContentFinal.getId());
		fmCmRelation.setVolumeId(cmContentFinal.getVolumeId());
		fmCmRelation.setBookId(cmContentFinal.getBookId());
		fmCmRelation.setFamilyId(familyMember.getFamilyId());
		fmCmRelation.setFamilyMemberCode(familyMember.getFamilyMemberCode());
		fmCmRelation.setFamilyMemberId(familyMember.getId());
		fmCmRelationService.add(fmCmRelation);
	}

	@Override
	public List<FamilyMember> findMainMemberListByFuzzyName(FamilyMember record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		//查询当前家族id下还有哪些分支家族id
//		List<Integer> familyIdList = 
//		criteria.andFamilyIdIn(familyIdList);
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		criteria.andMemberNameLike("%"+record.getMemberName()+"%");
		criteria.andSpouseNameIsNull();
		if(record.getGenerationNum()!=null) {
			criteria.andGenerationNumEqualTo(record.getGenerationNum()-1);
		}
		return mapper.selectByExample(example);
	}

	@Override
	public List<FamilyMember> findFamilyMemberListByFamilyId(Integer familyId) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}
	@Override
	public List<FamilyMember> findFamilyMemberListByFamilyIdAndName(Integer familyId,String memberName) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(memberName!=null){
			criteria.andMemberNameLike("%"+memberName+"%");
		}
		criteria.andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}
	@Override
	public List<FamilyMemberExtends> findFamilyMemberExtendsListByNum(FamilyMemberExtends record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("generation_num asc,id asc");
		Criteria criteria = example.createCriteria();
		//TODO: 需要查询该家族下的所有子家族节点id列表
//		criteria.andFamilyIdIn(values);
		criteria.andFamilyIdEqualTo(record.getFamilyId()).andGenerationNumIsNotNull();
		List<FamilyMember> familyMemberList = mapper.selectByExample(example);
		List<FamilyMemberExtends> familyMemberExtendsList = new ArrayList<FamilyMemberExtends>();
		for(FamilyMember familyMember:familyMemberList){
			FamilyMemberExtends familyMemberExtends = new FamilyMemberExtends();
			BeanUtils.copyProperties(familyMember, familyMemberExtends);
			List<PersonInfo> subNodeList = fmRelationService.findSubNodeListByParentId(familyMember.getId());
			List<PersonInfo> spouseNodeList = fmRelationService.findSpouseNodeListByMainId(familyMember.getId());
			PersonInfo parentNode = fmRelationService.findParentNodeByMainId(familyMember.getId());
			PersonInfo mainNode = fmRelationService.findMainNodeBySpouseId(familyMember.getId());
			familyMemberExtends.setMainNode(mainNode);
			familyMemberExtends.setParentNode(parentNode);
			familyMemberExtends.setSubNodeList(subNodeList);
			familyMemberExtends.setSpouseNodeList(spouseNodeList);
			familyMemberExtendsList.add(familyMemberExtends);
		}
		return familyMemberExtendsList;
	}

	@Override
	public List<NumAndFamilyMembers> findNumAndMemberListByGenerationStartEnd(FamilyMemberExtends record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("generation_num asc,id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		criteria.andRelFlagEqualTo(CommonConstant.RELATIONSHIP_UNFIND);
		criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration()).andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		List<FamilyMember> familyMemberList = mapper.selectByExample(example);
		Map<Integer, List<FamilyMemberExtends>> numAndListMap = new HashMap<Integer, List<FamilyMemberExtends>>();
		//将数据进行处理，按世代装入相应成员列表到map中
		for(FamilyMember familyMember:familyMemberList){
			//将家族成员的数据先进行装配
			FamilyMemberExtends familyMemberExtends = new FamilyMemberExtends();
			BeanUtils.copyProperties(familyMember, familyMemberExtends);
			
			List<PersonInfo> subNodeList = fmRelationService.findSubNodeListByParentId(familyMember.getId());
			List<PersonInfo> spouseNodeList = fmRelationService.findSpouseNodeListByMainId(familyMember.getId());
			PersonInfo parentNode = fmRelationService.findParentNodeByMainId(familyMember.getId());
			PersonInfo mainNode = fmRelationService.findMainNodeBySpouseId(familyMember.getId());
			familyMemberExtends.setMainNode(mainNode);
			familyMemberExtends.setParentNode(parentNode);
			familyMemberExtends.setSubNodeList(subNodeList);
			familyMemberExtends.setSpouseNodeList(spouseNodeList);
			
			if(numAndListMap.containsKey(familyMemberExtends.getGenerationNum())){
				List<FamilyMemberExtends> familyMemberMapList = numAndListMap.get(familyMemberExtends.getGenerationNum());
				familyMemberMapList.add(familyMemberExtends);
			}else{
				List<FamilyMemberExtends> familyMemberMapList = new ArrayList<FamilyMemberExtends>();
				familyMemberMapList.add(familyMemberExtends);
				numAndListMap.put(familyMemberExtends.getGenerationNum(), familyMemberMapList);
			}
		}
		List<NumAndFamilyMembers> numAndMembersList = new ArrayList<NumAndFamilyMembers>();
		for(int i = record.getStartGeneration();i<=record.getEndGeneration();i++){
			if(i==1){
				continue;
			}
			if(!numAndListMap.isEmpty()){
				List<FamilyMemberExtends> familyMemberMapList = numAndListMap.get(i);
				NumAndFamilyMembers numAndMembers = new NumAndFamilyMembers();
				numAndMembers.setGenerationNum(i);
				numAndMembers.setFamilyMemberList(familyMemberMapList);
				numAndMembers.setNum(familyMemberMapList==null?0:familyMemberMapList.size());
				numAndMembersList.add(numAndMembers);
			}
		}
		
		return numAndMembersList;
	}

	@Override
	public void updateMemberRelationStatusAndGenerationNum(Integer memberAId,Integer memberBId, Integer relationStatus) {
		FamilyMember familyMember = new FamilyMember();
		familyMember.setId(memberAId);
		FamilyMember memberB =  get(memberBId);
		if(relationStatus==CommonConstant.RELATIONSHIP_CHILDFATHER) {
			familyMember.setGenerationNum(memberB.getGenerationNum()+1);
		}else if(relationStatus==CommonConstant.RELATIONSHIP_SPOUSEMAIN) {
			familyMember.setGenerationNum(memberB.getGenerationNum());
		}else {
		}
		familyMember.setRelFlag(relationStatus);
		familyMember.setSubFamilyCode(memberB.getSubFamilyCode());
		update(familyMember);
	}

	@Override
	public Integer findAncestorByFamilyId(FamilyMember record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		criteria.andGenerationNumEqualTo(1);
		List<FamilyMember> familyMemberList = mapper.selectByExample(example);
		if(familyMemberList.size()>0) {
			return familyMemberList.get(0).getId();
		}
		return null;
	}

	@Override
	public FamilyMember findFamilyMemberByIdsAndName(String name, List<Integer> idList,Integer familyId) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(familyId).andMemberNameEqualTo(name);
		if(idList!=null&&idList.size()>0) {
			criteria.andIdIn(idList);
		}
		List<FamilyMember> familyMemberList = mapper.selectByExample(example);
		if(familyMemberList!=null&&familyMemberList.size()==1) {
			return familyMemberList.get(0);
		}
		return null;
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void mergeFamilyMemberOriginalToDest(Integer originalId, Integer destId, FamilyMember fmInfo) {
		//合并的前提，有共同的父节点或者主节点，
		//A1合并到A2上，A1的familyMemberId将要消失，那么A1之前 家族成员之间的关系、家庭成员与家族成员之间的映射需要更换，然后可以删除A1
		//如果A1是老谱，还需要更换下老谱成员与家族成员的映射关系
		List<FmRelation> mbRelationList = fmRelationService.findMbIdListByMaId(originalId);
		for(FmRelation mbRelation:mbRelationList) {
			//这种情况下该关系可删除，因为另外那个合并节点已经具备相关的关系
			fmRelationService.delete(mbRelation.getId());
//			mbRelation.setMaId(destId);
//			fmRelationService.update(mbRelation);
		}
		List<FmRelation> maRelationList = fmRelationService.findMaIdListByMbId(originalId);
		for(FmRelation maRelation:maRelationList) {
			maRelation.setMbId(destId);
			fmRelationService.update(maRelation);
		}
		List<FmHmRelation> fmHmRelationList = fmHmRelationService.findHmListByFmId(originalId);
		for(FmHmRelation fmHmRelation:fmHmRelationList) {
			fmHmRelation.setFamilyMemberId(destId);
			fmHmRelationService.update(fmHmRelation);
		}
		List<FmCmRelation> fmCmRelationList = fmCmRelationService.findCmListByFmId(originalId);
		for(FmCmRelation fmCmRelation:fmCmRelationList) {
			fmCmRelation.setFamilyMemberId(destId);
			fmCmRelationService.update(fmCmRelation);
		}
		//更新家族成员信息
		fmInfo.setId(destId);
		update(fmInfo);
		delete(originalId);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addNodeAndRelation(FamilyMemberExtends record) {
		Integer relId = record.getRelId();
		add(record);
		FmRelation fmRelation = new FmRelation();
		fmRelation.setFamilyId(record.getFamilyId());
		fmRelation.setMaId(record.getId());
		fmRelation.setMbId(relId);
		fmRelation.setRelType(record.getRelFlag());
		fmRelationService.add(fmRelation);
	}

	@Override
	public void updateRelationNodeGenerationNumByHeadNode(Integer headNodeId) {
		List<Integer> headNodeIdList = new ArrayList<Integer>();
		
		FamilyMember selfNode = get(headNodeId);
		List<Integer> spouseNodeList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,headNodeId);
		for(Integer spouseId:spouseNodeList) {
			FamilyMember spouseNode = new FamilyMember();
			spouseNode.setId(spouseId);
			spouseNode.setGenerationNum(selfNode.getGenerationNum());
			spouseNode.setSubFamilyCode(selfNode.getSubFamilyCode());
			update(spouseNode);
		}
		headNodeIdList.add(headNodeId);
		while(headNodeIdList.size()>0) {
			List<Integer> headIdList = new ArrayList<Integer>();
			for(Integer headId:headNodeIdList) {
				FamilyMember headNode = get(headId);
				List<Integer> sonIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,headId);
				for(Integer sonId:sonIdList) {
					FamilyMember sonNode = new FamilyMember();
					sonNode.setId(sonId);
					sonNode.setSubFamilyCode(headNode.getSubFamilyCode());
					sonNode.setGenerationNum(headNode.getGenerationNum()+1);
					update(sonNode);
					List<Integer> spouseIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,sonId);
					for(Integer spouseId:spouseIdList) {
						FamilyMember spouseNode = new FamilyMember();
						spouseNode.setId(spouseId);
						spouseNode.setSubFamilyCode(headNode.getSubFamilyCode());
						spouseNode.setGenerationNum(headNode.getGenerationNum()+1);
						update(spouseNode);
					}
				}
				if(sonIdList!=null&&sonIdList.size()>0) {
					headIdList.addAll(sonIdList);
				}
			}
			headNodeIdList.clear();
			headNodeIdList.addAll(headIdList);
		}
	}

	@Override
	public void updateRelationNodeSubFamilyCodeByHeadNode(Integer headNodeId, String subFamilyCode) {
		List<Integer> headNodeIdList = new ArrayList<Integer>();
		List<Integer> spouseNodeList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,headNodeId);
		for(Integer spouseId:spouseNodeList) {
			FamilyMember spouseNode = new FamilyMember();
			spouseNode.setId(spouseId);
			spouseNode.setSubFamilyCode(subFamilyCode);
			update(spouseNode);
		}
		headNodeIdList.add(headNodeId);
		while(headNodeIdList.size()>0) {
			List<Integer> headIdList = new ArrayList<Integer>();
			for(Integer headId:headNodeIdList) {
				List<Integer> sonIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,headId);
				for(Integer sonId:sonIdList) {
					FamilyMember sonNode = new FamilyMember();
					sonNode.setId(sonId);
					sonNode.setSubFamilyCode(subFamilyCode);
					update(sonNode);
					List<Integer> spouseIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,sonId);
					for(Integer spouseId:spouseIdList) {
						FamilyMember spouseNode = new FamilyMember();
						spouseNode.setId(spouseId);
						spouseNode.setSubFamilyCode(subFamilyCode);
						update(spouseNode);
					}
				}
				if(sonIdList!=null&&sonIdList.size()>0) {
					headIdList.addAll(sonIdList);
				}
			}
			headNodeIdList.clear();
			headNodeIdList.addAll(headIdList);
		}
	}

	@Override
	public void deleteFamilyMemberListFromFamily(Integer bookId,Integer volumeId, Integer familyId) {
		fmCmRelationService.deleteFmCmRelationListFromBookIdAndFamilyId(bookId,volumeId, familyId);
		FamilyMemberExample example = new FamilyMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(familyId).andBookIdEqualTo(bookId).andVolumeIdEqualTo(volumeId);
		mapper.deleteByExample(example);
	}

	@Override
	public void addTwoNodesConnectionQuicklyByGenerationStartEnd(FamilyMemberExtends record) {
		//先查未对接的列表，先模糊查父亲名或配偶名是否存在唯一的一个人，存在则将两者关系挂上，同时更新相关数据
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("generation_num asc,id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		criteria.andRelFlagEqualTo(CommonConstant.RELATIONSHIP_UNFIND);
		criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration()).andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		List<FamilyMember> unRelatedMemberList = mapper.selectByExample(example);
		
		for(FamilyMember unrelatedMember:unRelatedMemberList) {
			if(unrelatedMember.getFatherName()!=null) {
				String fatherName = unrelatedMember.getFatherName();
				FamilyMember familyMember = new FamilyMember();
				familyMember.setMemberName(fatherName);
				familyMember.setFamilyId(unrelatedMember.getFamilyId());
				familyMember.setGenerationNum(unrelatedMember.getGenerationNum());
				List<FamilyMember> fatherList = findMainMemberListByFuzzyName(familyMember);
				if(fatherList!=null&&fatherList.size()==1) {
					//添加新的节点关系
					FmRelation fmRelation = new FmRelation();
					fmRelation.setFamilyId(unrelatedMember.getFamilyId());
					fmRelation.setMaId(unrelatedMember.getId());
					fmRelation.setMbId(fatherList.get(0).getId());
					fmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
					fmRelationService.addTwoNodesConnection(fmRelation);
				}
				
			} else if(unrelatedMember.getSpouseName()!=null) {
				String spouseName = unrelatedMember.getSpouseName();
				FamilyMember familyMember = new FamilyMember();
				familyMember.setMemberName(spouseName);
				familyMember.setFamilyId(unrelatedMember.getFamilyId());
				familyMember.setGenerationNum(unrelatedMember.getGenerationNum()+1);
				List<FamilyMember> spouseList = findMainMemberListByFuzzyName(familyMember);
				if(spouseList!=null&&spouseList.size()==1) {
					//添加新的节点关系
					FmRelation fmRelation = new FmRelation();
					fmRelation.setFamilyId(unrelatedMember.getFamilyId());
					fmRelation.setMaId(unrelatedMember.getId());
					fmRelation.setMbId(spouseList.get(0).getId());
					fmRelation.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
					fmRelationService.addTwoNodesConnection(fmRelation);
				}
			}
		}
	}

	@Override
	public List<FamilyMember> findFamilyMemberListByPageAndCondition(RequestEntityForFamilyMember requestEntity) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(requestEntity.getFamilyId());
		//精确查询
		if(requestEntity.getPreciseFlag()==1) {
			if(StringUtils.isNotBlank(requestEntity.getFatherName())){
				criteria.andFatherNameEqualTo(requestEntity.getFatherName());
			}
			if(StringUtils.isNotBlank(requestEntity.getSpouseName())){
				criteria.andSpouseNameEqualTo(requestEntity.getSpouseName());
			}
			if(StringUtils.isNotBlank(requestEntity.getMemberName())){
				criteria.andMemberNameEqualTo(requestEntity.getMemberName());
//				try {
//					String memberNamePY = PinyinHelper.convertToPinyinString(requestEntity.getMemberName(), "", PinyinFormat.WITHOUT_TONE);
//					criteria.andMemberNamePinyinLike("%"+memberNamePY+"%");
//				} catch (PinyinException e) {
//					e.printStackTrace();
//				}
			}
		}else {
		//模糊查询
			if(StringUtils.isNotBlank(requestEntity.getFatherName())){
				try {
					String fatherNamePY = PinyinHelper.convertToPinyinString(requestEntity.getFatherName(), "", PinyinFormat.WITHOUT_TONE);
					criteria.andFatherNamePinyinLike("%"+fatherNamePY+"%");
				} catch (PinyinException e) {
					e.printStackTrace();
				}
//				criteria.andFatherNameEqualTo(requestEntity.getFatherName());
			}
			if(StringUtils.isNotBlank(requestEntity.getSpouseName())){
				try {
					String spouseNamePY = PinyinHelper.convertToPinyinString(requestEntity.getSpouseName(), "", PinyinFormat.WITHOUT_TONE);
					criteria.andSpouseNamePinyinLike("%"+spouseNamePY+"%");
				} catch (PinyinException e) {
					e.printStackTrace();
				}
//				criteria.andSpouseNameEqualTo(requestEntity.getSpouseName());
			}
			if(StringUtils.isNotBlank(requestEntity.getMemberName())){
				try {
					String memberNamePY = PinyinHelper.convertToPinyinString(requestEntity.getMemberName(), "", PinyinFormat.WITHOUT_TONE);
					criteria.andMemberNamePinyinLike("%"+memberNamePY+"%");
				} catch (PinyinException e) {
					e.printStackTrace();
				}
			}
		}
		if(StringUtils.isNotBlank(requestEntity.getMemberDetail())){
			String memberDetail = ZhConverterUtil.convertToTraditional(requestEntity.getMemberDetail());
			criteria.andMemberDetailLike("%"+memberDetail+"%");
		}
		if(StringUtils.isNotBlank(requestEntity.getSecPersonalName())){
			String secPersonalName = ZhConverterUtil.convertToTraditional(requestEntity.getSecPersonalName());
			criteria.andSecPersonalNameEqualTo(secPersonalName);
		}
		if(requestEntity.getGenerationNum()!=null&&requestEntity.getGenerationNum()!=-1){
			//根据派语读取世代
			criteria.andGenerationNumEqualTo(requestEntity.getGenerationNum());
		}else {
			if(StringUtils.isNotBlank(requestEntity.getGenerationWord())){
				//根据派语读取世代
				String generationWord = ZhConverterUtil.convertToTraditional(requestEntity.getGenerationWord());
				Integer generationNum = ClanConstant.GENERATIONWORD_HU.indexOf(generationWord);
				criteria.andGenerationNumEqualTo(generationNum);
			}
			
		}
		if(StringUtils.isNotBlank(requestEntity.getMark())){
			String mark = ZhConverterUtil.convertToTraditional(requestEntity.getMark());
			criteria.andMarkEqualTo(mark);
		}
		return mapper.selectByExample(example);
	}

	@Override
	public FamilyMemberExtends findById(int id) {
		FamilyMember familyMember = get(id);
		FamilyMemberExtends familyMemberExtends = new FamilyMemberExtends();
		BeanUtils.copyProperties(familyMember, familyMemberExtends);
		//根据家族成员中的齿录id查其归属
//		familyMemberExtends.setComeFrom(comeFrom);
		
		return familyMemberExtends;
	}

	@Override
	public List<FamilyMemberExtends> findFamilyMemberListByHeadAndSeveralNum(FamilyMemberExtends record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("generation_num asc,id asc");
		Criteria criteria = example.createCriteria();
		List<Integer> memberIdList = findMemberIdlistByHeadId(record.getHeadId(),record.getNum());
		criteria.andFamilyIdEqualTo(record.getFamilyId()).andGenerationNumIsNotNull().andIdIn(memberIdList);
		List<FamilyMember> familyMemberList = mapper.selectByExample(example);
		List<FamilyMemberExtends> familyMemberExtendsList = new ArrayList<FamilyMemberExtends>();
		for(FamilyMember familyMember:familyMemberList){
			FamilyMemberExtends familyMemberExtends = new FamilyMemberExtends();
			BeanUtils.copyProperties(familyMember, familyMemberExtends);
			List<PersonInfo> subNodeList = fmRelationService.findSubNodeListByParentId(familyMember.getId());
			List<PersonInfo> spouseNodeList = fmRelationService.findSpouseNodeListByMainId(familyMember.getId());
			PersonInfo parentNode = fmRelationService.findParentNodeByMainId(familyMember.getId());
			PersonInfo mainNode = fmRelationService.findMainNodeBySpouseId(familyMember.getId());
			familyMemberExtends.setMainNode(mainNode);
			familyMemberExtends.setParentNode(parentNode);
			familyMemberExtends.setSubNodeList(subNodeList);
			familyMemberExtends.setSpouseNodeList(spouseNodeList);
			familyMemberExtendsList.add(familyMemberExtends);
		}
		return familyMemberExtendsList;
	}

	@Override
	public List<Integer> findMemberIdlistByHeadId(Integer headId, Integer num) {
		List<Integer> fatherIdList = new ArrayList<>();
		List<Integer> sonIdTempList = new ArrayList<>();
		List<Integer> memberIdList = new ArrayList<>();
		fatherIdList.add(headId);
		memberIdList.add(headId);
		//找所有头id的配偶id
		List<Integer> headSpouseIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,headId);
		memberIdList.addAll(headSpouseIdList);
		for(int i=0;i<num;i++){
			List<Integer> sonIdList = new ArrayList<>();
			for(Integer fatherId:fatherIdList){
				//先找出所有子代
				sonIdTempList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,fatherId);
				sonIdList.addAll(sonIdTempList);
			}
			memberIdList.addAll(sonIdList);
			for(Integer sonId:sonIdList){
				//找所有子id的配偶id
				List<Integer> spouseIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,sonId);
				memberIdList.addAll(spouseIdList);
			}
			fatherIdList.clear();
			fatherIdList.addAll(sonIdList);	
			sonIdList.clear();
		}
		return memberIdList;
	}

	@Override
	public List<FamilyMemberExtends> packageFamilyMemberExtendsBy(List<FamilyMember> familyMemberList) {
		List<FamilyMemberExtends> fmExtendsList = new ArrayList<>();
		for(FamilyMember familyMember:familyMemberList) {
			FamilyMemberExtends familyMemberExtends = new FamilyMemberExtends();
			BeanUtils.copyProperties(familyMember, familyMemberExtends);
			Integer fatherId = fmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, familyMember.getId());
			familyMemberExtends.setFatherId(fatherId);
			fmExtendsList.add(familyMemberExtends);
		}
		return fmExtendsList;
	}

	@Override
	public List<FamilyMember> findAncestorListBy(Integer id, Integer num) {
		Integer fatherId = id;
		List<FamilyMember> fmList = new ArrayList<>();
		for(int i=0;i<num;i++) {
			Integer ancestorId = fmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, fatherId);
			if(ancestorId!=null&&ancestorId>0) {
				FamilyMember familyMember = get(ancestorId);
				fmList.add(familyMember);
				fatherId = ancestorId;
			}else {
				break;
			}
		}
		return fmList;
	}

	@Override
	public void setMainMemberForSonNumReal(FamilyMemberExtends record) {
		FamilyMemberExample example = new FamilyMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		criteria.andFatherNameIsNotNull();
		List<FamilyMember> unSetMemberList = mapper.selectByExample(example);
		System.out.println(unSetMemberList.size());
		for(FamilyMember unSetMember:unSetMemberList) {
			FamilyMember familyMember = new FamilyMember();
			familyMember.setId(unSetMember.getId());
			//查询某人下有几个儿子
			Long num = fmRelationService.countMaIdListNumByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,unSetMember.getId());
			familyMember.setSonNumReal(num==null?0:num.intValue());
			familyMember.setSonNum(num==null?0:num.intValue());
			familyMember.setSonNumDiff(0);
			update(familyMember);
		}
	}

	@Override
	public void refreshSonNumRealForMainNode(Integer mainMemberId) {
		List<Integer> headNodeIdList = new ArrayList<Integer>();
		FamilyMember mainNode = get(mainMemberId);
		mainNode.setId(mainMemberId);
		//查询某人下有几个儿子
		Long mainNum = fmRelationService.countMaIdListNumByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,mainMemberId);
		mainNode.setSonNumReal(mainNum==null?0:mainNum.intValue());
		mainNode.setSonNum(mainNum==null?0:mainNum.intValue());
		mainNode.setSonNumDiff(0);
		update(mainNode);
		headNodeIdList.add(mainMemberId);
		while(headNodeIdList.size()>0) {
			List<Integer> headIdList = new ArrayList<Integer>();
			for(Integer headId:headNodeIdList) {
				List<Integer> sonIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,headId);
				for(Integer sonId:sonIdList) {
					FamilyMember sonNode = new FamilyMember();
					sonNode.setId(sonId);
					//查询某人下有几个儿子
					Long num = fmRelationService.countMaIdListNumByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,sonNode.getId());
					sonNode.setSonNumReal(num==null?0:num.intValue());
					sonNode.setSonNum(num==null?0:num.intValue());
					sonNode.setSonNumDiff(0);
					update(sonNode);
				}
				if(sonIdList!=null&&sonIdList.size()>0) {
					headIdList.addAll(sonIdList);
				}
			}
			headNodeIdList.clear();
			headNodeIdList.addAll(headIdList);
		}
	}
	
}
