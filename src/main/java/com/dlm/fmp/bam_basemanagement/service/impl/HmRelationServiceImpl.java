package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.HmRelationService;
import com.dlm.fmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.mapper.HmRelationMapper;
import com.dlm.fmp.pojo.HmRelation;
import com.dlm.fmp.pojo.HmRelationExample;
import com.dlm.fmp.pojo.HouseholdMember;
@Service
public class HmRelationServiceImpl implements HmRelationService {

	@Autowired
	HmRelationMapper mapper;
	@Autowired
	HouseholdMemberService householdMemberService;
	
	@Override
	public List<HmRelation> list() {
		HmRelationExample example = new HmRelationExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HmRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HmRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HmRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HmRelation> findMaIdlistByHouseholdIdRelTypeAndMbId(Integer householdId, Integer relType, Integer mbId) {
		HmRelationExample example = new HmRelationExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andHouseholdIdEqualTo(householdId).andMbIdEqualTo(mbId);
		return mapper.selectByExample(example);
	}

	@Override
	public void createHmRelationByHouseholdId(Integer householdId) {
		// 根据家庭id查询所有成员列表
		List<HouseholdMember> householdMemberList = householdMemberService.findHouseholdMemberListByHouseholdId(householdId);
		Map<String,List<HouseholdMember>> householdMembeMap = new HashMap<String,List<HouseholdMember>>();
		for(HouseholdMember householdMember:householdMemberList) {
			if(!householdMembeMap.containsKey(householdMember.getRelationCode())) {
				List<HouseholdMember> newHouseholdMemberList = new ArrayList<HouseholdMember>();
				newHouseholdMemberList.add(householdMember);
				householdMembeMap.put(householdMember.getRelationCode(), newHouseholdMemberList);
			}else {
				List<HouseholdMember> newHouseholdMemberList = householdMembeMap.get(householdMember.getRelationCode());
				newHouseholdMemberList.add(householdMember);
				householdMembeMap.put(householdMember.getRelationCode(), newHouseholdMemberList);
			}
		}
		if(householdMembeMap.size()>0) {
			//先删除之前的家庭成员关系
			deleteHmRelationListByHouseholdId(householdId);
			//将家庭成员的关系建立
			//1、高祖母与高祖父 ：配与主
			createSpouseAndMainRelation(householdId,"greatgreatgrandmother",
					"greatgreatgrandfather",householdMembeMap);
			//2、曾祖母与高祖父 ：配与主
			createSpouseAndMainRelation(householdId,"greatgrandmother",
					"greatgrandfather",householdMembeMap);
			//3、祖母与祖父 ：配与主
			createSpouseAndMainRelation(householdId,"grandmother",
					"grandfather",householdMembeMap);
			//4、母与父 ：配与主
			createSpouseAndMainRelation(householdId,"mother",
					"father",householdMembeMap);
			//5、配与己 ：配与主
			createSpouseAndMainRelation(householdId,"spouse",
					"myself",householdMembeMap);
			
			//1：曾祖父与高祖父
			createSonAndFatherRelation(householdId,"greatgrandfather",
					"greatgreatgrandfather",householdMembeMap);
			//2：曾叔祖与高祖父
			createSonAndFatherRelation(householdId,"greatgranduncle",
					"greatgreatgrandfather",householdMembeMap);
			//3：曾姑祖与高祖父
			createSonAndFatherRelation(householdId,"greatgrandant",
					"greatgreatgrandfather",householdMembeMap);
			//4：祖父与曾祖父
			createSonAndFatherRelation(householdId,"grandfather",
					"greatgrandfather",householdMembeMap);
			//5：叔祖父与曾祖父
			createSonAndFatherRelation(householdId,"granduncle",
					"greatgrandfather",householdMembeMap);
			//6：姑祖母与曾祖父
			createSonAndFatherRelation(householdId,"grandant",
					"greatgrandfather",householdMembeMap);
			//7：父亲与祖父
			createSonAndFatherRelation(householdId,"father",
					"grandfather",householdMembeMap);
			//8：叔伯与祖父
			createSonAndFatherRelation(householdId,"uncle",
					"grandfather",householdMembeMap);
			//9：姑姑与祖父
			createSonAndFatherRelation(householdId,"ant",
					"grandfather",householdMembeMap);
			//10：我与父亲
			createSonAndFatherRelation(householdId,"myself",
					"father",householdMembeMap);
			//11：兄弟与父亲
			createSonAndFatherRelation(householdId,"brother",
					"father",householdMembeMap);
			//12：姐妹与父亲
			createSonAndFatherRelation(householdId,"syster",
					"father",householdMembeMap);	
			//13：子与我
			createSonAndFatherRelation(householdId,"son",
					"myself",householdMembeMap);
			//14：女与我
			createSonAndFatherRelation(householdId,"daughter",
					"myself",householdMembeMap);
		}
	}

	private void createSpouseAndMainRelation(Integer householdId, String spouse, String main, Map<String,List<HouseholdMember>> householdMembeMap) {
		List<HouseholdMember> spouseList = householdMembeMap.get(spouse);
		List<HouseholdMember> mainList = householdMembeMap.get(main);
		if(spouseList.size()>0&&mainList.size()>0) {
			for(HouseholdMember spouseMember:spouseList) {
				HmRelation record = new HmRelation();
				record.setHouseholdId(householdId);
				record.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
				record.setMaId(spouseMember.getId());
				record.setMbId(mainList.get(0).getId());
				add(record);
			}
		}
	}
	
	private void createSonAndFatherRelation(Integer householdId, String son, String father, Map<String,List<HouseholdMember>> householdMembeMap) {
		List<HouseholdMember> sonList = householdMembeMap.get(son);
		List<HouseholdMember> fatherList = householdMembeMap.get(father);
		if(sonList.size()>0&&fatherList.size()>0) {
			for(HouseholdMember sonMember:sonList) {
				HmRelation record = new HmRelation();
				record.setHouseholdId(householdId);
				record.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
				record.setMaId(sonMember.getId());
				record.setMbId(fatherList.get(0).getId());
				add(record);
			}
		}
	}

	@Override
	public List<HmRelation> findHmRelationListByHouseholdId(Integer householdId) {
		HmRelationExample example = new HmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(householdId);
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteHmRelationListByHouseholdId(Integer householdId) {
		List<HmRelation> hmRelationList = findHmRelationListByHouseholdId(householdId);
		for(HmRelation hmRelation:hmRelationList) {
			delete(hmRelation.getId());
		}
	}

	@Override
	public Integer findMbIdByMaIdAndRelType(Integer householdId, Integer relType, Integer maId) {
		HmRelationExample example = new HmRelationExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andHouseholdIdEqualTo(householdId).andRelTypeEqualTo(relType).andMaIdEqualTo(maId);
		List<HmRelation> hmRelationList = mapper.selectByExample(example);
		if(hmRelationList!=null&&hmRelationList.size()==1) {
			return hmRelationList.get(0).getMbId();
		}
		return null;
	}

	@Override
	public List<Integer> findMaIdListByMbIdAndRelType(Integer householdId, Integer relType, Integer mbId) {
		HmRelationExample example = new HmRelationExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andHouseholdIdEqualTo(householdId).andRelTypeEqualTo(relType).andMbIdEqualTo(mbId);
		List<HmRelation> hmRelationList = mapper.selectByExample(example);
		List<Integer> MaIdList = new ArrayList<Integer>();
		for(HmRelation hmRelation:hmRelationList) {
			MaIdList.add(hmRelation.getMaId());
		}
		return MaIdList;
	}
}
