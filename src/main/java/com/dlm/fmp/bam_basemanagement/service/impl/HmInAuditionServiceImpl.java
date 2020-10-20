package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.DiscountsStaffService;
import com.dlm.fmp.bam_basemanagement.service.FamilyCouncilService;
import com.dlm.fmp.bam_basemanagement.service.FamilyInfoService;
import com.dlm.fmp.bam_basemanagement.service.FamilyServiceService;
import com.dlm.fmp.bam_basemanagement.service.FamilySettingService;
import com.dlm.fmp.bam_basemanagement.service.HmInAuditionService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.fmp.bam_basemanagement.vo.HmInAuditionVo;
import com.dlm.fmp.bam_basemanagement.vo.MultipleRule;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.mapper.HmInAuditionMapper;
import com.dlm.fmp.pojo.DiscountsStaff;
import com.dlm.fmp.pojo.FamilyCouncil;
import com.dlm.fmp.pojo.FamilyService;
import com.dlm.fmp.pojo.FamilySetting;
import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HmInAuditionExample;
import com.dlm.fmp.pojo.HmInAuditionExample.Criteria;
import com.dlm.fmp.pojo.HouseholdInAudition;
import com.dlm.fmp.pojo.HouseholdMember;

@Service
public class HmInAuditionServiceImpl implements HmInAuditionService {
	@Autowired
	HmInAuditionMapper mapper;

	@Autowired
	FamilyInfoService familyInfoService;
	
	@Autowired
	HouseholdMemberService householdMemberService;
	
	@Autowired
	FamilyServiceService familyServiceService;
	
	@Autowired
	DiscountsStaffService discountsStaffService;
	
	@Autowired
	FamilyCouncilService familyCouncilService;
	
	@Autowired
	FamilySettingService familySettingService;
	@Override
	public List<HmInAudition> list() {
		HmInAuditionExample example = new HmInAuditionExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HmInAudition record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(HmInAudition record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public HmInAudition get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public String addHouseholdMembersInAudition(HouseholdInAudition householdInAudition, List<HmInAudition> recordList) {
		Double totalMoney=0.0;
		//默认人头费为0
		String collectionFee = "0";
		//如果没配置规则就不收费
		String rules = "0:500:0";
		//优惠的金额
		String discounts = "0.0";
		//如果购买了人头费服务，则需要将相应的人头费进行赋值，只对健在的人进行收费，另外，根据每个人的身份证号查询审核列表中该人是否已有付费记录，如果有也不用再付费
//		FamilyService collectionChargeService = familyServiceService.findServiceByFamilyIdAndServiceCode(householdInAudition.getFamilyId(), CommonConstant.INTERNAL_SERVICE_COLLECTIONCHARGE);
//		if(collectionChargeService!=null&&StringUtils.isNotBlank(collectionChargeService.getConfContent())) {
//			collectionFee = collectionChargeService.getConfContent();
//		}
		
		FamilySetting familySetting = familySettingService.findFamilySettingByFamilyId(householdInAudition.getFamilyId());
		if(familySetting!=null&&StringUtils.isNotBlank(familySetting.getEachCost())) {
			collectionFee = familySetting.getEachCost();
		}
		//如果购买了小传字数服务，则需要先获取收费规则，然后计算每个人的小传字数，计算其费用，
		FamilyService multipleChargeService = familyServiceService.findServiceByFamilyIdAndServiceCode(householdInAudition.getFamilyId(), CommonConstant.INTERNAL_SERVICE_MULTIPLECHARGE);
		if(multipleChargeService!=null&&StringUtils.isNotBlank(multipleChargeService.getConfContent())) {
			rules = multipleChargeService.getConfContent();
		}
		for(HmInAudition hmInAudition:recordList){
			hmInAudition.setFamilyId(householdInAudition.getFamilyId());
			hmInAudition.setHouseholdId(householdInAudition.getHouseholdId());
			HouseholdMember householdMember = householdMemberService.get(hmInAudition.getHouseholdMemberId());
			//如果没有已付费的用户
			if(StringUtils.isBlank(hmInAudition.getIdentityNo())||findHadPaidMember(hmInAudition.getIdentityNo())<=0) {
				if(householdMember.getAliveStatus()==1) {
					hmInAudition.setInMoney(collectionFee);
				}else {
					hmInAudition.setInMoney("0");
				}
				String memberStory = householdMember.getMemberStory();
				String storyMoney = caculateStoryMoney(memberStory,rules);
				hmInAudition.setStoryMoney(storyMoney);
				//根据身份证id判断该成员是否在理事会或者优惠列表中有优惠配置,先判断理事会，没有再判断优惠列表
				FamilyCouncil familyCouncil = familyCouncilService.findFamilyCouncilByIdentityNo(hmInAudition.getIdentityNo());
				if(familyCouncil!=null&&StringUtils.isNotBlank(familyCouncil.getDiscounts())) {
					discounts = familyCouncil.getDiscounts();
				} else {
					DiscountsStaff discountsStaff = discountsStaffService.findDiscountsStaffByIdentityNo(hmInAudition.getIdentityNo());
					if(discountsStaff!=null&&StringUtils.isNotBlank(discountsStaff.getDiscounts())) {
						discounts = discountsStaff.getDiscounts();
					}
				}
				//通过身份证号码查询该成员是否在审核列表中，是已付费的用户，就不再收费
				
				hmInAudition.setDiscounts(discounts);
				if(Double.valueOf(hmInAudition.getInMoney()) - Double.valueOf(discounts)<0) {
					totalMoney +=Double.valueOf(storyMoney);
				}else {
					totalMoney += (Double.valueOf(hmInAudition.getInMoney()) - Double.valueOf(discounts) + Double.valueOf(storyMoney));
				}
			}else {
				hmInAudition.setInMoney("0");
				hmInAudition.setStoryMoney("0");
				hmInAudition.setDiscounts("0");
			}
			add(hmInAudition);
			HouseholdMember temp = new HouseholdMember();
			//申请的时候生成该家庭成员的齿录
			temp.setId(householdMember.getId());
			temp.setMemberDetail(packageHouseholdMemberForPhone(householdMember));
			householdMemberService.update(temp);
		}
		
		return totalMoney.toString();
	}

	private String packageHouseholdMemberForPhone(HouseholdMember householdMember) {
		String memberDetail="";
		if(StringUtils.isNotBlank(householdMember.getFatherName())) {
			memberDetail += householdMember.getFatherName()+"之";
			if(householdMember.getMemberGender()!=null) {
				if(householdMember.getMemberGender()==1) {
					memberDetail += "子 ";
				}else {
					memberDetail += "女 ";
				}
			}
		}
		if(StringUtils.isNotBlank(householdMember.getMemberName())) {
			memberDetail += householdMember.getMemberName()+" ";
		}
		if(StringUtils.isNotBlank(householdMember.getOtherName())) {
			memberDetail += "又名"+householdMember.getOtherName();
		}
		if(StringUtils.isNotBlank(householdMember.getNickName())) {
			memberDetail += "别名"+householdMember.getNickName();
		}
		if(StringUtils.isNotBlank(householdMember.getSecPersonalName())) {
			memberDetail += "字"+householdMember.getSecPersonalName();
		}
		if(StringUtils.isNotBlank(householdMember.getOtherPersonalName())) {
			memberDetail += "又字"+householdMember.getOtherPersonalName();
		}
		if(StringUtils.isNotBlank(householdMember.getNickPersonalName())) {
			memberDetail += "别字"+householdMember.getNickPersonalName();
		}
		if(StringUtils.isNotBlank(householdMember.getMark())) {
			memberDetail += "号"+householdMember.getMark();
		}
		if(StringUtils.isNotBlank(householdMember.getOtherMark())) {
			memberDetail += "又号"+householdMember.getOtherMark();
		}
		if(StringUtils.isNotBlank(householdMember.getNickMark())) {
			memberDetail += "别号"+householdMember.getNickMark();
		}
		if(householdMember.getRanking()!=null&&householdMember.getRanking()>0) {
			memberDetail += "行"+householdMember.getRanking();
		}
		//生辰类型 1：公历，2：农历
		householdMember.getBirthdateType();
		
		if(householdMember.getAliveStatus()==1) {
			//健在
			if(householdMember.getBirthdateType()==1) {
				//公历
				if(StringUtils.isNotBlank(householdMember.getBirthdayTimeTra())) {
					memberDetail += householdMember.getBirthdayTimeTra()+"生";
				}
			}else if(householdMember.getBirthdateType()==2){
				//农历
				if(StringUtils.isNotBlank(householdMember.getLunarBirthdayTime())) {
					memberDetail += householdMember.getLunarBirthdayTime()+"生";
				}
			}
		}else {
			//已故
			if(householdMember.getBirthdateType()==1) {
				//公历
				if(StringUtils.isNotBlank(householdMember.getBirthdayTimeTra())) {
					memberDetail += "生于"+householdMember.getBirthdayTimeTra();
				}
			}else if(householdMember.getBirthdateType()==2){
				//农历
				if(StringUtils.isNotBlank(householdMember.getLunarBirthdayTime())) {
					memberDetail += "生于"+householdMember.getLunarBirthdayTime();
				}
			}
		}
		if(StringUtils.isNotBlank(householdMember.getEducateExperience())) {
			memberDetail += ("曾就读于"+householdMember.getEducateExperience());
		}
		if(StringUtils.isNotBlank(householdMember.getCareer())) {
			memberDetail += ("曾就职于"+householdMember.getCareer());
		}
		if(householdMember.getBirthdateType()==1) {
			//公历
			if(StringUtils.isNotBlank(householdMember.getDeathdayTimeTra())) {
				memberDetail += "殁于"+householdMember.getDeathdayTimeTra();
			}
		}else if(householdMember.getBirthdateType()==2){
			//农历
			if(StringUtils.isNotBlank(householdMember.getLunarDeathdayTime())) {
				memberDetail += "殁于"+householdMember.getLunarDeathdayTime();
			}
		}
		
		if(StringUtils.isNotBlank(householdMember.getBuriedLocation())) {
			memberDetail += ("葬"+householdMember.getBuriedLocation());
		}
		if(StringUtils.isNotBlank(householdMember.getMemberStory())) {
			memberDetail += (householdMember.getMemberStory());
		}
		
//		if(StringUtils.isNotBlank(householdMember.getNativePlace())) {
//			memberDetail += ("住"+householdMember.getNativePlace());
//			if(StringUtils.isNotBlank(householdMember.getAddressDetail())) {
//				memberDetail += (householdMember.getAddressDetail());
//			}
//		}else {
//			if(StringUtils.isNotBlank(householdMember.getAddressDetail())) {
//				memberDetail += ("住"+householdMember.getAddressDetail());
//			}
//		}
		return memberDetail;
	}
	
	
	private String caculateStoryMoney(String memberStory,String rules) {
		if(StringUtils.isNotEmpty(memberStory)&&StringUtils.isNotEmpty(rules)) {
			List<MultipleRule> multipleRuleList = new ArrayList<MultipleRule>();
			String rulesStr[] = rules.split(";");
			for(String rule:rulesStr) {
				MultipleRule multipleRule = new MultipleRule();
				String areaAndMoneyStr[] = rule.split(":");
				if(areaAndMoneyStr.length>=2) {
					String start = areaAndMoneyStr[0];
					String end = areaAndMoneyStr[1];
					String money = areaAndMoneyStr[2];
					multipleRule.setStart(Integer.valueOf(start));
					multipleRule.setEnd(Integer.valueOf(end));
					multipleRule.setMoney(money);
					multipleRuleList.add(multipleRule);
				}
			}
			for(MultipleRule multipleRule:multipleRuleList) {
				if(memberStory.length()<multipleRule.getEnd()&&memberStory.length()>multipleRule.getStart()) {
					return multipleRule.getMoney();
				}
			}
		}
		return "0";
	}
	
	@Override
	public void deleteHouseholdMembersInAudition(HouseholdInAudition record) {
		HmInAuditionExample example = new HmInAuditionExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(record.getHouseholdId()!=null){
			criteria.andHouseholdIdEqualTo(record.getHouseholdId());
		}
		if(record.getFamilyId()!=null){
			criteria.andFamilyIdEqualTo(record.getFamilyId());
		}
		List<HmInAudition> hmInAuditionList = mapper.selectByExample(example);
		for(HmInAudition hmInAudition:hmInAuditionList){
			delete(hmInAudition.getId());
		}
	}

	@Override
	public List<HmInAuditionVo> findHouseholdMembersInAudition(HouseholdInAudition record) {
		HmInAuditionExample example = new HmInAuditionExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(record.getFamilyId()).andHouseholdIdEqualTo(record.getHouseholdId());
		List<HmInAudition> hmInAuditionList = mapper.selectByExample(example);
		List<HmInAuditionVo> hmInAuditionVoList = new ArrayList<HmInAuditionVo>();
//		Double totalMoney = 0.0;
		for(HmInAudition hmInAudition:hmInAuditionList){
			HmInAuditionVo HmInAuditionVo = new HmInAuditionVo();
			HouseholdMember householdMember = householdMemberService.get(hmInAudition.getHouseholdMemberId());
			HmInAuditionVo.setId(hmInAudition.getId());
			HmInAuditionVo.setHouseholdMember(householdMember);
			HmInAuditionVo.setPayFlag(hmInAudition.getPayFlag());
			HmInAuditionVo.setInMoney(hmInAudition.getInMoney());
			HmInAuditionVo.setStoryMoney(hmInAudition.getStoryMoney());
			hmInAuditionVoList.add(HmInAuditionVo);
//			totalMoney += Double.valueOf(hmInAudition.getInMoney()==null?"0":hmInAudition.getInMoney())
//					+Double.valueOf(hmInAudition.getStoryMoney()==null?"0":hmInAudition.getStoryMoney());
		}
//		record.setTotalMoney(totalMoney.toString());
		return hmInAuditionVoList;
	}

	@Override
	public Map<Integer, HmInAuditionVo> findHouseholdMembersInAuditionMap(HouseholdInAudition householdInAudition) {
		HmInAuditionExample example = new HmInAuditionExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(householdInAudition.getFamilyId()).andHouseholdIdEqualTo(householdInAudition.getHouseholdId());
		List<HmInAudition> hmInAuditionList = mapper.selectByExample(example);
		Map<Integer, HmInAuditionVo> hmInAuditionVoMap = new HashMap<Integer, HmInAuditionVo>();
		for(HmInAudition hmInAudition:hmInAuditionList){
			HmInAuditionVo HmInAuditionVo = new HmInAuditionVo();
			HouseholdMember householdMember = householdMemberService.get(hmInAudition.getHouseholdMemberId());
			HmInAuditionVo.setHouseholdMember(householdMember);
			HmInAuditionVo.setPayFlag(hmInAudition.getPayFlag());
			HmInAuditionVo.setInMoney(hmInAudition.getInMoney());
			HmInAuditionVo.setStoryMoney(hmInAudition.getStoryMoney());
			hmInAuditionVoMap.put(householdMember.getId(), HmInAuditionVo);
		}
		return hmInAuditionVoMap;
	}

	@Override
	public HmInAudition findHouseholdInMemberBy(HouseholdInAudition record) {
		HmInAuditionExample example = new HmInAuditionExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(record.getFamilyId()).andHouseholdIdEqualTo(record.getHouseholdId());
		criteria.andHouseholdInFlagEqualTo(1);
		List<HmInAudition> hmInAuditionList = mapper.selectByExample(example);
		if(hmInAuditionList.size()>0) {
			return hmInAuditionList.get(0);
		}
		return null;
	}

	@Override
	public Integer findHadPaidMember(String identityNo) {
		HmInAuditionExample example = new HmInAuditionExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andIdentityNoEqualTo(identityNo).andPayFlagEqualTo(1);
		List<HmInAudition> hmInAuditionList = mapper.selectByExample(example);
		if(hmInAuditionList!=null&&hmInAuditionList.size()>0) {
			return 1;
		}
		return 0;
	}

	@Override
	public void updateHmInAuditionHadPaid(HouseholdInAudition householdInAudition) {
		HmInAuditionExample example = new HmInAuditionExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(householdInAudition.getFamilyId()).andHouseholdIdEqualTo(householdInAudition.getHouseholdId());
		List<HmInAudition> hmInAuditionList = mapper.selectByExample(example);
		for(HmInAudition hmInAudition:hmInAuditionList) {
			HmInAudition newHmInAudition = new HmInAudition();
			newHmInAudition.setId(hmInAudition.getId());
			newHmInAudition.setPayFlag(1);
			update(newHmInAudition);
		}
		
	}
	
//	public static void main(String[] args) {
//		String rules = "0:7:0;7:10:5;10:20:10";
//		String memberStory = "若珍公妹 清";
//		System.out.println(caculateStoryMoney(memberStory,rules));
//	}
}
