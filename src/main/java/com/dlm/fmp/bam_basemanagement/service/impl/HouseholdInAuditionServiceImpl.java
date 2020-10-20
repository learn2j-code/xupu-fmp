package com.dlm.fmp.bam_basemanagement.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dlm.fmp.bam_basemanagement.service.FamilyInfoService;
import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.FmHmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FmRelationService;
import com.dlm.fmp.bam_basemanagement.service.HmInAuditionService;
import com.dlm.fmp.bam_basemanagement.service.HmRelationService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdInAuditionService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.fmp.bam_basemanagement.vo.HmFmIdLink;
import com.dlm.fmp.bam_basemanagement.vo.HmInAuditionVo;
import com.dlm.fmp.bam_basemanagement.vo.HouseholdInAuditionExtends;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.constant.FamilyConstant;
import com.dlm.fmp.mapper.HouseholdInAuditionMapper;
import com.dlm.fmp.pojo.FamilyInfo;
import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.FmHmRelation;
import com.dlm.fmp.pojo.FmRelation;
import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HouseholdInAudition;
import com.dlm.fmp.pojo.HouseholdInAuditionExample;
import com.dlm.fmp.pojo.HouseholdInAuditionExample.Criteria;
import com.dlm.fmp.util.jpinyin.PinyinException;
import com.dlm.fmp.util.jpinyin.PinyinFormat;
import com.dlm.fmp.util.jpinyin.PinyinHelper;
import com.dlm.fmp.pojo.HouseholdMember;

@Service
public class HouseholdInAuditionServiceImpl implements HouseholdInAuditionService {
	@Autowired
	HouseholdInAuditionMapper mapper;
	@Autowired
	FmRelationService fmRelationService;
	@Autowired
	FmHmRelationService fmHmRelationService;
	@Autowired
	FamilyInfoService familyInfoService;
	@Autowired
	FamilyMemberService familyMemberService;
	@Autowired
	HmInAuditionService hmInAuditionService;
	@Autowired
	HouseholdMemberService householdMemberService;
	@Autowired
	HmRelationService hmRelationService;
	
	@Override
	public List<HouseholdInAudition> list() {
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdInAudition record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(HouseholdInAudition record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public HouseholdInAudition get(int id) {
		return mapper.selectByPrimaryKey(id);
	}


	@Override
	public boolean judgeHouseholdAlreadyInFamily(HouseholdInAudition record) {
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andHouseholdIdEqualTo(record.getHouseholdId()).andFamilyIdEqualTo(record.getFamilyId());
		List<HouseholdInAudition> auditionList = mapper.selectByExample(example);
		if(auditionList.size()>0){
			return true;
		}
		return false;
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void deleteHouseholdInAuditionByCondition(HouseholdInAudition record) {
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(record.getHouseholdId()!=null){
			criteria.andHouseholdIdEqualTo(record.getHouseholdId());
		}
		if(record.getFamilyId()!=null){
			criteria.andFamilyIdEqualTo(record.getFamilyId());
		}
		List<HouseholdInAudition> auditionList = mapper.selectByExample(example);
		for(HouseholdInAudition householdInAudition:auditionList){
			delete(householdInAudition.getId());
			hmInAuditionService.deleteHouseholdMembersInAudition(householdInAudition);
		}
		//还需要删除证据
		
		//更新接入节点的相关标识
		FamilyMember familyMember = familyMemberService.get(record.getFamilyMemberId());
		familyMember.setAuditFlag(0);
		familyMember.setHouseholdInFlag(0);
		familyMember.setHouseholdInTime(null);
		familyMember.setPayFlag(0);
		familyMemberService.update(familyMember);
	}

	@Override
	public List<HouseholdInAudition> findAlreadyInFamilyListByHousehold(Integer householdId) {
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andHouseholdIdEqualTo(householdId);
		return mapper.selectByExample(example);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addHouseholdAndMembersInAudition(HouseholdInAudition HouseholdInAudition, List<HmInAudition> hmInAuditionList) {
		// 根据家族id查询相关信息
		String totalMoney = hmInAuditionService.addHouseholdMembersInAudition(HouseholdInAudition, hmInAuditionList);
		FamilyInfo familyInfo = familyInfoService.get(HouseholdInAudition.getFamilyId());
		HouseholdInAudition.setFamilyName(familyInfo.getFamilyName());
		HouseholdInAudition.setTotemAddress(familyInfo.getTotemAddress());
		HouseholdInAudition.setTotalMoney(totalMoney);
		//查出数据库中为自己的家庭成员名字
		Integer mySelfId = householdMemberService.findMainIdByHouseholdId(HouseholdInAudition.getHouseholdId());
		if(mySelfId!=null) {
			HouseholdMember proposer = householdMemberService.get(mySelfId);
			HouseholdInAudition.setProposer(proposer==null?null:proposer.getMemberName());
		}
		add(HouseholdInAudition);
	
		//更新接入节点的相关标识
		FamilyMember familyMember = familyMemberService.get(HouseholdInAudition.getFamilyMemberId());
		familyMember.setAuditFlag(1);
		familyMember.setHouseholdInFlag(1);
		familyMember.setHouseholdInTime(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		familyMember.setPayFlag(1);
		familyMemberService.update(familyMember);
	}

	@Override
	public List<HouseholdInAuditionExtends> findHouseholdInAuditionListByFamilyMemberId(Integer familyMemberId) {
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyMemberIdEqualTo(familyMemberId);
		List<HouseholdInAudition> HouseholdInAuditionList = mapper.selectByExample(example);
		List<HouseholdInAuditionExtends> householdInAuditionExtendsList = new ArrayList<HouseholdInAuditionExtends>();
		for(HouseholdInAudition householdInAudition:HouseholdInAuditionList){
			HouseholdInAuditionExtends householdInAuditionExtends = new HouseholdInAuditionExtends();
			BeanUtils.copyProperties(householdInAudition, householdInAuditionExtends);
			List<HmInAuditionVo> hmInAuditionVoList = hmInAuditionService.findHouseholdMembersInAudition(householdInAudition);
//			householdInAuditionExtends.setTotalMoney(householdInAudition.getTotalMoney());
			householdInAuditionExtends.setHmInAuditionVoList(hmInAuditionVoList);
			householdInAuditionExtendsList.add(householdInAuditionExtends);
		}
		return householdInAuditionExtendsList;
	}

	@Override
	public List<HouseholdInAudition> findHouseholdInAuditionListBy(String subFamilyCode, Integer familyId, Integer auditFlag) {
		if(subFamilyCode==null) {
			return null;
		}
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.createCriteria().andFamilyIdEqualTo(familyId).andAuditFlagEqualTo(auditFlag).andSubFamilyCodeLike(subFamilyCode+"%");
		return mapper.selectByExample(example);
	}

	@Override
	public void updateHouseholdInAuditionByCondition(HouseholdInAudition record) {
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andHouseholdIdEqualTo(record.getHouseholdId());
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		List<HouseholdInAudition> householdInAuditionList = mapper.selectByExample(example);
		if(householdInAuditionList.size()>0) {
			HouseholdInAudition householdInAudition = householdInAuditionList.get(0);
			HouseholdInAudition newHouseholdInAudition = new HouseholdInAudition();
			newHouseholdInAudition.setId(householdInAudition.getId());
			newHouseholdInAudition.setAuditFlag(record.getAuditFlag());
			update(newHouseholdInAudition);
		}
	}

	private FamilyMember packageHouseholdMemberToNewFM(Integer familyId,Integer mainFlag, HouseholdMember householdMember, Integer generationDiff) {
		FamilyMember familyMember = new FamilyMember();
		//TODO:是否需要给每个家族成员定标，书id和卷id
//		familyMember.setVolumeId(0);//
//		familyMember.setBookId(0);
		familyMember.setFamilyId(familyId);
		familyMember.setBirthdayTime(householdMember.getBirthdayTime());
		familyMember.setBuriedLocation(householdMember.getBuriedLocation());
		familyMember.setDeathdayTime(householdMember.getDeathdayTime());
		familyMember.setGenerationNum(householdMember.getGenerationLevelCode()+generationDiff);
		//根据前面内容生成字条
		familyMember.setMemberDetail(householdMember.getMemberDetail());
		familyMember.setMemberGender(householdMember.getMemberGender());
		familyMember.setMemberStory(householdMember.getMemberStory());
		familyMember.setNativePlace(householdMember.getNativePlace());
//		familyMember.setPayFlag(payFlag);
		familyMember.setRelFlag(householdMember.getRelFlag());
		familyMember.setFatherName(householdMember.getFatherName());
		if(StringUtils.isNotBlank(familyMember.getFatherName())) {
			try {
			    //无声调
			    String fatherNamePy = PinyinHelper.convertToPinyinString(familyMember.getFatherName(), ",", PinyinFormat.WITHOUT_TONE); // ni,hao,shi,jie
			    familyMember.setFatherNamePinyin(fatherNamePy);
			} catch (PinyinException e) {
			    e.printStackTrace();
			}
		}
		familyMember.setSpouseName(householdMember.getSpouseName());
		if(StringUtils.isNotBlank(familyMember.getSpouseName())) {
			try {
			    //无声调
			    String spouseNamePy = PinyinHelper.convertToPinyinString(familyMember.getSpouseName(), ",", PinyinFormat.WITHOUT_TONE); // ni,hao,shi,jie
			    familyMember.setSpouseNamePinyin(spouseNamePy);
			} catch (PinyinException e) {
			    e.printStackTrace();
			}
		}
		familyMember.setRanking(householdMember.getRanking());
		familyMember.setBirthdateType(householdMember.getBirthdateType());
		familyMember.setAddressDetail(householdMember.getAddressDetail());
		familyMember.setAdoptout(householdMember.getAdoptout());
		familyMember.setAdoptoutDetail(householdMember.getAddressDetail());
		familyMember.setUxorilocal(householdMember.getUxorilocal());
		familyMember.setUxorilocalDetail(householdMember.getUxorilocalDetail());
		familyMember.setSoninlaw(householdMember.getSoninlaw());
		familyMember.setSoninlawDetail(householdMember.getSoninlawDetail());
		//主干成员设置
		if(mainFlag==1) {
			familyMember.setMemberName(householdMember.getMemberName());
			if(StringUtils.isNotBlank(familyMember.getMemberName())) {
				try {
				    //无声调
				    String memberNamePinyin = PinyinHelper.convertToPinyinString(familyMember.getMemberName(), ",", PinyinFormat.WITHOUT_TONE); // ni,hao,shi,jie
				    familyMember.setMemberNamePinyin(memberNamePinyin);
				} catch (PinyinException e) {
				    e.printStackTrace();
				}
			}
			familyMember.setMemberSurname(householdMember.getMemberSurname());
			if(familyMember.getMemberGender()==1) {
				familyMember.setRelKeyword("之子");
			}else {
				familyMember.setRelKeyword("之女");
			}
		}else {//非主干成员设置
			familyMember.setMemberName(householdMember.getMemberSurname()+householdMember.getMemberName());
			if(familyMember.getMemberGender()==1) {
				familyMember.setRelKeyword("赘夫");
			}else {
				familyMember.setRelKeyword("配");
			}
		}
		//来源
		familyMember.setSource(2);
		familyMember.setSubFamilyFlag(FamilyConstant.SUBFAMILYFLAG_COMMON);
		return familyMember;
		
	}
	
	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void householdMemberEnterFamilyMember(HouseholdInAudition record) {
		//思路：
		//step1：将入家族前待审核家庭成员表中数据查出来放入map中
		//step2：以接入点为中心，判断户主到接入点这条主链上的成员在家族成员表中是否存在，
		//		不存在就创建，然后只建立家族成员之间关系
		//step3：创建户主到家庭成员中备份最高的主链，循环该主链从户主开始，
		//step4：先建立主链上家庭成员与家族成员的关系
		//step5：接着查看主链节点下的配偶节点和非主干子节点是否存在家庭成员与家族成员的映射关系，
		//		如果存在则建立家庭成员与家族成员的映射关系即可，
		//		不存在就创建成员，然后创建家族成员间的关系，再建立家庭成员与家族成员的映射关系
		HouseholdInAuditionExample example = new HouseholdInAuditionExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andHouseholdIdEqualTo(record.getHouseholdId());
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		List<HouseholdInAudition> householdInAuditionList = mapper.selectByExample(example);
		//接入点的家族成员id和世代
		int fmInId = 0;
		int fmInGm = 0;
		Integer familyId = 0;
		if(householdInAuditionList.size()>0) {
			HouseholdInAudition householdInAudition = householdInAuditionList.get(0);
			familyId = householdInAudition.getFamilyId();
			//接入点的家族成员数据
			fmInId = householdInAudition.getFamilyMemberId();
			fmInGm = householdInAudition.getFamilyMemberGm();
			//TODO:将该接入点的接入状态改为2
			FamilyMember fm = new FamilyMember();
			fm.setId(fmInId);
			fm.setHouseholdInFlag(2);
			familyMemberService.update(fm);
		}
		if(fmInId==0 || fmInGm==0) {
			return;
		}
		//家庭成员列表
		Map<Integer, HmInAuditionVo> hmInAuditionVoMap = hmInAuditionService.findHouseholdMembersInAuditionMap(record);
		//家庭成员中的接入点
		HmInAudition hmInAudition = hmInAuditionService.findHouseholdInMemberBy(record);
		//利用接入点计算代差
		HouseholdMember hmInAuditionMember = householdMemberService.get(hmInAudition.getHouseholdMemberId());
		Integer generationDiff = fmInGm - hmInAuditionMember.getGenerationLevelCode();
		
		//1、开始创建从户主到接入点的链--该链的目的是完善家族与家庭对应的主链，此处只负责看主链是否在家族中都存在，没有存在就创建保证其存在；
		int myselfId = householdMemberService.findMainIdByHouseholdId(record.getHouseholdId());
		
		Integer myselfIdCopy = myselfId;
		Integer hmInAuditionId = hmInAudition.getHouseholdMemberId();
//		if(hmInAuditionId==myselfIdCopy) {
//			return;
//		}
		List<Integer> afterHmInIds = new ArrayList<Integer>();
		afterHmInIds.add(myselfIdCopy);
		while(true) {
			Integer afterHmParentId = hmRelationService.findMbIdByMaIdAndRelType(record.getHouseholdId(),CommonConstant.RELATIONSHIP_CHILDFATHER,myselfIdCopy);
			myselfIdCopy = afterHmParentId;
			if(afterHmParentId != null && hmInAuditionId!=myselfIdCopy) {
				afterHmInIds.add(afterHmParentId);
			}else {
				break;
			}
		}
		//记录当前处理点 fmInAuditionId
		Integer fmInAuditionId = fmInId;
		int myselfIdInFm = 0;
		for(int i=afterHmInIds.size()-1;i>=0;i--) {
			if(hmInAuditionVoMap.containsKey(afterHmInIds.get(i))) {
				HmInAuditionVo hmInAuditionVo = hmInAuditionVoMap.get(afterHmInIds.get(i));
				String memberName = hmInAuditionVo.getHouseholdMember().getMemberName();
				//根据名字和ids查，查到了就继续，没查到就创建，并添加完父子关系，不建立家庭与家族之间的映射关系；
				List<Integer> fmSonIdList = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,fmInAuditionId);
				FamilyMember familyMember = null;
				//如果id存在，则可以根据自己的名字和id来找；
				if(fmSonIdList!=null&&fmSonIdList.size()>0) {
					familyMember = familyMemberService.findFamilyMemberByIdsAndName(memberName,fmSonIdList,familyId);
				}
				//如果能找到这个成员则继续,没找到则创建，并建立父子关系
				if(familyMember==null) {
					familyMember = packageHouseholdMemberToNewFM(record.getFamilyId(),1,hmInAuditionVo.getHouseholdMember(),generationDiff);
					familyMemberService.add(familyMember);
					
					//建立子与父的关系
					FmRelation fmRelation = new FmRelation();
					fmRelation.setMaId(familyMember.getId());
					fmRelation.setMbId(fmInAuditionId);
					fmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
					fmRelationService.add(fmRelation);
					//子节点往下传递
					fmInAuditionId = familyMember.getId();
				}
				if(i==0) {
					myselfIdInFm = familyMember.getId();
				}
			}
		}
		createRelation(record,myselfId,myselfIdInFm,hmInAuditionVoMap,generationDiff);
		//更新审核状态为成功
		record.setAuditFlag(2);
		updateHouseholdInAuditionByCondition(record);
	}
	
	public void createRelation(HouseholdInAudition record,Integer myselfId,Integer myselfIdInFm,Map<Integer, HmInAuditionVo> hmInAuditionVoMap,Integer generationDiff) {
		//主链都完善了节点后，接着就是处理整个主链的成员
		List<HmFmIdLink> mainLinkList = new ArrayList<HmFmIdLink>();
		HmFmIdLink hmFmIdLink = new HmFmIdLink();
		hmFmIdLink.setHmInId(myselfId);
		hmFmIdLink.setFmInId(myselfIdInFm);

		mainLinkList.add(hmFmIdLink);
		//1）根据家庭关系表 找到接入点的父节点，如果map里有，存入list，则继续找父节点，直到没有结束
		while(true){
			Integer hmParentId = hmRelationService.findMbIdByMaIdAndRelType(record.getHouseholdId(),CommonConstant.RELATIONSHIP_CHILDFATHER,myselfId);
			Integer fmParentId = fmRelationService.findMbIdByMaIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,myselfIdInFm);
			if(hmParentId!=null&&fmParentId!=null) {
				if(hmInAuditionVoMap.containsKey(hmParentId)) {
					HmFmIdLink tempLink = new HmFmIdLink();
					tempLink.setHmInId(hmParentId);
					tempLink.setFmInId(fmParentId);
					mainLinkList.add(tempLink);
				}else {
					break;
				}
			}else {
				break;
			}
			myselfId = hmParentId;
			myselfIdInFm = fmParentId;
		}
		//根据list和家族成员那边合并，建立映射关系;
		for(HmFmIdLink hmFmId:mainLinkList) {
			FmHmRelation fmHmRelation = new FmHmRelation();
			fmHmRelation.setFamilyId(record.getFamilyId());
			fmHmRelation.setHouseholdId(record.getHouseholdId());
			fmHmRelation.setHouseholdMemberId(hmFmId.getHmInId());
			fmHmRelation.setFamilyMemberId(hmFmId.getFmInId());
			fmHmRelationService.add(fmHmRelation);
			//更新家庭成员信息到家族成员TODO:
			HouseholdMember hm = householdMemberService.get(hmFmId.getHmInId());
			FamilyMember fm = familyMemberService.get(hmFmId.getFmInId());
			Integer familyId = fm.getFamilyId();
			updateFamilyMemberInfoByHouseholdMember(fm,hm);
			
			hmInAuditionVoMap.remove(hmFmId.getHmInId());
			//处理完所有主链，再处理主链外的节点-找出1）配偶节点，2）非主干的子节点，查找子节点是否能合并 移除map
			//接着是找家庭配偶节点
			List<Integer> hmSpouseIds = hmRelationService.findMaIdListByMbIdAndRelType(record.getHouseholdId(),CommonConstant.RELATIONSHIP_SPOUSEMAIN,hmFmId.getHmInId());
			List<Integer> fmSpouseIds = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,hmFmId.getFmInId());
			for(Integer hmSpouseId:hmSpouseIds) {
				if(hmInAuditionVoMap.containsKey(hmSpouseId)) {
					HmInAuditionVo hmInAuditionVo = hmInAuditionVoMap.get(hmSpouseId);
					String spouseName = hmInAuditionVo.getHouseholdMember().getMemberSurname()+hmInAuditionVo.getHouseholdMember().getMemberName();
					//根据配偶名字和从属ids查，查到了就合并建立关系，没查到就在家族端新建并建立关系；
					FamilyMember familyMember = null;
					if(fmSpouseIds!=null&&fmSpouseIds.size()>0) {
						familyMember = familyMemberService.findFamilyMemberByIdsAndName(spouseName,fmSpouseIds,familyId);
					}
					//如果能找到这个成员则继续,没找到则创建，并建立父子关系
					if(familyMember==null) {
						familyMember = packageHouseholdMemberToNewFM(record.getFamilyId(),0,hmInAuditionVo.getHouseholdMember(),generationDiff);
						familyMember.setSubFamilyCode(fm.getSubFamilyCode());
						familyMemberService.add(familyMember);
						
						//建立配与主的关系
						FmRelation fmRelation = new FmRelation();
						fmRelation.setMaId(familyMember.getId());
						fmRelation.setMbId(hmFmId.getFmInId());
						fmRelation.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
						fmRelationService.add(fmRelation);
						
					}else {
						//更新家庭成员信息到家族成员TODO:
						updateFamilyMemberInfoByHouseholdMember(familyMember,hmInAuditionVo.getHouseholdMember());
					}
					//建立家庭成员与家族成员的映射
					FmHmRelation fmHmRelationTemp = new FmHmRelation();
					fmHmRelationTemp.setFamilyId(record.getFamilyId());
					fmHmRelationTemp.setHouseholdId(record.getHouseholdId());
					fmHmRelationTemp.setHouseholdMemberId(hmSpouseId);
					fmHmRelationTemp.setFamilyMemberId(familyMember.getId());
					fmHmRelationService.add(fmHmRelationTemp);
					
					hmInAuditionVoMap.remove(hmSpouseId);
				}
			}
			
			//最后是非主干的子节点
			List<Integer> hmSonIds = hmRelationService.findMaIdListByMbIdAndRelType(record.getHouseholdId(),CommonConstant.RELATIONSHIP_CHILDFATHER,hmFmId.getHmInId());
			List<Integer> fmSonIds = fmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,hmFmId.getFmInId());
			for(Integer hmSonId:hmSonIds) {
				if(hmInAuditionVoMap.containsKey(hmSonId)) {
					HmInAuditionVo hmInAuditionVo = hmInAuditionVoMap.get(hmSonId);
					String sonName = hmInAuditionVo.getHouseholdMember().getMemberName();
					//根据子的名字和ids查，查到了就合并建立关系，没查到就在家族端新建并建立关系；
					FamilyMember familyMember = null;
					if(fmSonIds!=null&&fmSonIds.size()>0) {
						familyMember = familyMemberService.findFamilyMemberByIdsAndName(sonName,fmSonIds,familyId);
					}
					//如果能找到这个成员则继续,没找到则创建，并建立父子关系
					if(familyMember==null) {
						familyMember = packageHouseholdMemberToNewFM(record.getFamilyId(),1,hmInAuditionVo.getHouseholdMember(),generationDiff);
						familyMemberService.add(familyMember);
						
						//建立子与父的关系
						FmRelation fmRelation = new FmRelation();
						fmRelation.setMaId(familyMember.getId());
						fmRelation.setMbId(hmFmId.getFmInId());
						fmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
						fmRelationService.add(fmRelation);
						
					}else {
						//更新家庭成员信息到家族成员TODO:
						updateFamilyMemberInfoByHouseholdMember(familyMember,hmInAuditionVo.getHouseholdMember());
					}
					//建立家庭成员与家族成员的映射
					FmHmRelation fmHmRelationTemp = new FmHmRelation();
					fmHmRelationTemp.setFamilyId(record.getFamilyId());
					fmHmRelationTemp.setHouseholdId(record.getHouseholdId());
					fmHmRelationTemp.setHouseholdMemberId(hmSonId);
					fmHmRelationTemp.setFamilyMemberId(familyMember.getId());
					fmHmRelationService.add(fmHmRelationTemp);
					
					hmInAuditionVoMap.remove(hmSonId);
				}
			}
		}
	}
	
	private void updateFamilyMemberInfoByHouseholdMember(FamilyMember fm, HouseholdMember hm){
		FamilyMember familyMember = new FamilyMember();
		familyMember.setId(fm.getId());
		familyMember.setRelFlag(fm.getRelFlag());
		familyMember.setMemberDetail(hm.getMemberDetail());
		familyMember.setBuriedLocation(hm.getBuriedLocation());
		familyMember.setBirthdayTime(hm.getBirthdayTime());
		familyMember.setDeathdayTime(hm.getDeathdayTime());
		familyMember.setMemberStory(hm.getMemberStory());
		familyMemberService.update(familyMember);
	}

}
