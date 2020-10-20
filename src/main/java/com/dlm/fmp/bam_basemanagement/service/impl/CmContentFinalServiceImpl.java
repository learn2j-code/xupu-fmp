package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dlm.fmp.bam_basemanagement.service.ClanBookService;
import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.CmContentService;
import com.dlm.fmp.bam_basemanagement.service.CmRelationService;
import com.dlm.fmp.bam_basemanagement.service.SubClanInfoService;
import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.fmp.bam_basemanagement.vo.NumAndClanMembers;
import com.dlm.fmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForCmContentFinal;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelFile;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelSheetRow;
import com.dlm.fmp.constant.ClanConstant;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.mapper.CmContentFinalMapper;
import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.CmContent;
import com.dlm.fmp.pojo.CmContentExample;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.CmContentFinalExample;
import com.dlm.fmp.pojo.CmRelation;
import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.FamilyMemberExample;
import com.dlm.fmp.pojo.CmContentFinalExample.Criteria;
import com.dlm.fmp.pojo.FmCmRelation;
import com.dlm.fmp.pojo.FmRelation;
import com.dlm.fmp.pojo.SubClanInfo;
import com.dlm.fmp.util.ChineseNumberFormatUtil;
import com.dlm.fmp.util.ClanMemberContentParsing;
import com.dlm.fmp.util.Page;
import com.dlm.fmp.util.jpinyin.PinyinException;
import com.dlm.fmp.util.jpinyin.PinyinFormat;
import com.dlm.fmp.util.jpinyin.PinyinHelper;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CmContentFinalServiceImpl implements CmContentFinalService {
	@Autowired
	CmContentFinalMapper mapper;
	@Autowired
	CmContentService cmContentService;
	@Autowired
	CmRelationService cmRelationService;
	@Autowired
	ClanBookService clanBookService;
	
	@Autowired
	SubClanInfoService subClanInfoService;
	@Override
	public List<CmContentFinal> list() {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(CmContentFinal record) {
		mapper.insertSelective(record);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
		//同时删除节点的所有关系
		cmRelationService.deleteAllRelationOfNode(id);
	}

	@Override
	public void update(CmContentFinal record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public CmContentFinal get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CmContentFinal> findCmContentFinalListByCondition(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("order_no asc");
		Criteria criteria = example.createCriteria();
		if(record!=null) {
			//根据书id查
			if(record.getBookId()!=null) {
				criteria.andBookIdEqualTo(record.getBookId());
			}
			//根据卷id查
			if(record.getVolumeId()!=null) {
				criteria.andVolumeIdEqualTo(record.getVolumeId());
			}
			//根据世代查
			if(record.getGenerationNum()!=null) {
				criteria.andGenerationNumEqualTo(record.getGenerationNum());
			}
			//根据成员名查
			if(record.getMemberName()!=null) {
				criteria.andMemberNameEqualTo(record.getMemberName());
			}
			//根据词条类型查
			if(record.getContentType()!=null) {
				criteria.andContentTypeEqualTo(record.getContentType());
			}
			//根据解析通过标记查
			if(record.getParseFlag()!=null) {
				criteria.andParseFlagEqualTo(record.getParseFlag());
			}
			//根据subclanIdOrigin查
			if(record.getSubClanIdOrigin()!=null) {
				criteria.andSubClanIdOriginEqualTo(record.getSubClanIdOrigin());
			}
			//根据son_num_diff查
			if(record.getSonNumDiff()!=null) {
				criteria.andSonNumDiffGreaterThan(0);
			}
			
//			//根据成员名拼音查
//			if(record.getMemberNamePinyin()!=null) {
//				criteria.andMemberNamePinyinEqualTo(record.getMemberNamePinyin());
//			}
//			//根据父亲名查
//			if(record.getFatherName()!=null) {
//				criteria.andFatherNameEqualTo(record.getFatherName());
//			}
//			//根据父亲名拼音查
//			if(record.getFatherNamePinyin()!=null) {
//				criteria.andFatherNamePinyinEqualTo(record.getFatherNamePinyin());
//			}
		}

		return mapper.selectByExample(example);
	}

	@Override
	public void addCmContentFinalList(String surname, List<CmContent> cmContentList,String generationWord) {
		//计算世代
		//成员的从属编码
		Integer subClanId = 0;
		Integer generationNum = 0;
		for(CmContent cmContent:cmContentList) {
			CmContentFinal cmContentFinal = new CmContentFinal();
			cmContentFinal.setCmContentId(cmContent.getId());
			String memberRel = cmContent.getMemberRel();
			String memberName = cmContent.getMemberName();
			String memberDetail = cmContent.getMemberDetail();
			cmContentFinal.setBookId(cmContent.getBookId());
			cmContentFinal.setVolumeId(cmContent.getVolumeId());
			cmContentFinal.setOrderNo(cmContent.getOrderNo());
			cmContentFinal.setRelFlag(0);
			cmContentFinal.setExtendFlag(0);
			cmContentFinal.setStatus(0);
//			cmContentFinal.setGenerationNum(cmContent.getGenerationNum());
			//解析世代
			if(StringUtils.isEmpty(memberRel) && StringUtils.isEmpty(memberName)){
            	if(StringUtils.isNotEmpty(memberDetail)){
            		cmContentFinal.setMemberDetail(memberDetail);
            		try{
            			if(memberDetail.startsWith("第")&&memberDetail.endsWith(generationWord)) {
                			String chineseNumber = ClanMemberContentParsing.getChineseNumberFromContent(memberDetail,generationWord);
                			generationNum = ChineseNumberFormatUtil.chineseNumberToInt(chineseNumber);
                			cmContentFinal.setContentType(2);
                			
                		}else if(memberDetail.indexOf("系下")>0) {//TODO：解析系房
                			//先取到某系
                			String department = memberDetail.substring(0, memberDetail.indexOf("系下"));
                			//查该系是否已存在,如果不存在则进行添加
                			SubClanInfo departmentInfo = subClanInfoService.findSubClanInfoBySubClanName(department,cmContentFinal.getBookId(),0); 
                			if(departmentInfo==null) {
                				departmentInfo = new SubClanInfo();
                				departmentInfo.setBookId(cmContent.getBookId());
                				departmentInfo.setVolumeId(cmContent.getVolumeId());
                				departmentInfo.setSubClanName(department);
                				departmentInfo.setParentId(0);
                				departmentInfo.setLevelType(1);
                				departmentInfo.setLevelName("系下");
                				subClanInfoService.add(departmentInfo);
                			}
                			subClanId = departmentInfo.getId();
                			if(memberDetail.indexOf("房")>0) {
                				//先取到某房
                    			String loculus = memberDetail.substring(memberDetail.indexOf("系下")+2, memberDetail.indexOf("房"));
                    			//查该房是否已存在,如果不存在则进行添加
                    			SubClanInfo loculusInfo = subClanInfoService.findSubClanInfoBySubClanName(loculus,cmContentFinal.getBookId(),0); 
                    			if(loculusInfo==null) {
                    				loculusInfo = new SubClanInfo();
                    				loculusInfo.setBookId(cmContent.getBookId());
                    				loculusInfo.setVolumeId(cmContent.getVolumeId());
                    				loculusInfo.setSubClanName(loculus);
                    				loculusInfo.setLevelType(2);
                    				loculusInfo.setParentId(departmentInfo.getId());
                    				loculusInfo.setLevelName("房");
                    				subClanInfoService.add(loculusInfo);
                    			}
                    			subClanId = loculusInfo.getId();
                			}
                			cmContentFinal.setContentType(3);
                		}else {
                			cmContentFinal.setContentType(4);
                		}
            		} catch (Exception e) {
    					e.printStackTrace();
    				}
            		add(cmContentFinal);
            		continue;
            	}
            }
			cmContentFinal.setSubClanId(subClanId);
			cmContentFinal.setContentType(1);
			cmContentFinal.setGenerationNum(generationNum);
			cmContentFinal.setMemberSurname(surname);
			if(StringUtils.isNotBlank(memberName)){
            	cmContentFinal.setMemberName(memberName);
            	try {
					String memberNamePY = PinyinHelper.convertToPinyinString(memberName, "", PinyinFormat.WITHOUT_TONE);
					cmContentFinal.setMemberNamePinyin(memberNamePY);
            	} catch (PinyinException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }else{
            	cmContentFinal.setMemberName("失考");
            }
			//解析关系
            if(StringUtils.isNotBlank(memberRel)){
            	cmContentFinal.setMemberRel(memberRel);
            	if(cmContent.getHusband()!=null){
            		cmContentFinal.setMemberRel(cmContent.getHusband()+memberRel);
            	}
            	try {
					parsingRel(cmContentFinal);
					//解析完关系再还原
					cmContentFinal.setMemberRel(memberRel);
				} catch (PinyinException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            }else{
            	cmContentFinal.setMemberRel("失考");
            }
            //解析词条内容
            if(memberDetail!=null){
            	cmContentFinal.setMemberDetail(memberDetail);
            	try {
//            		parsingDel(cmContentFinal);
            		//只解析字和号
//            		parsingDelSpecial(cmContentFinal);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }else{
            	cmContentFinal.setMemberDetail("失考");
            }
			add(cmContentFinal);
		}
		
	}
	
	private boolean parsingRel(CmContentFinal cmContentFinal) throws PinyinException{
		//解析关系
    	Map<String, String> contentMap = ClanMemberContentParsing.parsingMemberRelationship(cmContentFinal.getMemberRel(), ClanConstant.SPOUSEKEYWORD, ClanConstant.CHILDKEYWORD, ClanConstant.OTHERKEYWORD);
    	
    	if(contentMap.containsKey("fatherName")){
			String fatherName = contentMap.get("fatherName");
			String relationshipKeyword  = contentMap.get(fatherName);
			cmContentFinal.setFatherName(fatherName);
			String fatherNamePY = PinyinHelper.convertToPinyinString(fatherName, "", PinyinFormat.WITHOUT_TONE);
			cmContentFinal.setFatherNamePinyin(fatherNamePY);
			cmContentFinal.setRelKeyword(relationshipKeyword);
			
			//解析关键字的  长子,長子,次子,一子,二子,三子,四子,五子,六子,七子,八子,九子,十子,十一子,十二子 长女,長女,次女,一女,二女,三女,四女,五女,六女,七女,八女,九女
		
//			cmContentFinal.setRanking(0);
    	}
		if(contentMap.containsKey("spouseName")){
			String spouseName = contentMap.get("spouseName");
			String relationshipKeyword  = contentMap.get(spouseName);
			cmContentFinal.setSpouseName(spouseName);
			String spouseNamePY = PinyinHelper.convertToPinyinString(spouseName, "", PinyinFormat.WITHOUT_TONE);
			cmContentFinal.setSpouseNamePinyin(spouseNamePY);
			cmContentFinal.setRelKeyword(relationshipKeyword);
			//如果是非主干成员 那么姓氏就设置为空
			cmContentFinal.setMemberSurname(null);
		}
		
		//根据关系的关键字 添加性别
		String identity = cmContentFinal.getRelKeyword();
		List<String> sonKeyWordList = Arrays.asList( (ClanConstant.SON_KEYWORD).split(ClanConstant.COMMA));
		List<String> daughterKeyWordList = Arrays.asList((ClanConstant.DAUGHTER_KEYWORD).split(ClanConstant.COMMA));
		List<String> husbandKeyWordList = Arrays.asList((ClanConstant.HUSBAND_KEYWORD).split(ClanConstant.COMMA));
		List<String> wifeKeyWordList = Arrays.asList((ClanConstant.WIFE_KEYWORD).split(ClanConstant.COMMA));
		if(sonKeyWordList.contains(identity)||husbandKeyWordList.contains(identity)){
			cmContentFinal.setMemberGender(ClanConstant.CLANMEMBERCONTENT_MALE);
		}
		if(daughterKeyWordList.contains(identity)||wifeKeyWordList.contains(identity)){
			cmContentFinal.setMemberGender(ClanConstant.CLANMEMBERCONTENT_FEMALE);
		}
		return true;
	}
	
	private boolean parsingDel(CmContentFinal cmContentFinal){
		//解析词条所有内容
    	Map<String, String> contentMap = ClanMemberContentParsing.parsingMemberDetail(cmContentFinal.getMemberDetail(), ClanConstant.FOREKEYWORD, ClanConstant.BACKKEYWORD);
    	if(contentMap==null){
    		return false;
    	}
    	cmContentFinal.setSecPersonalName(contentMap.get("secPersonalName"));
    	cmContentFinal.setBirthdayTime(contentMap.get("birthdayTime"));
    	cmContentFinal.setDeathdayTime(contentMap.get("deathdayTime"));
    	cmContentFinal.setBuriedLocation(contentMap.get("buriedLocation"));
    	if(contentMap.get("son")!=null&&contentMap.get("son").length()<50) {
    		cmContentFinal.setSon(contentMap.get("son"));
    	}
    	if(contentMap.get("daughter")!=null&&contentMap.get("daughter").length()<50) {
    		cmContentFinal.setDaughter(contentMap.get("daughter"));
    	}
    	
    	return true;
	}
	
	private boolean parsingDelSpecial(CmContentFinal cmContentFinal){
		//解析词条的字号
    	Map<String, String> contentMap = ClanMemberContentParsing.parsingMemberDetail(cmContentFinal.getMemberDetail(), ClanConstant.SPECIALWORD, ClanConstant.BACKKEYWORD);
    	if(contentMap==null){
    		return false;
    	}
    	cmContentFinal.setSecPersonalName(contentMap.get("secPersonalName"));
    	cmContentFinal.setBirthdayTime(contentMap.get("birthdayTime"));
    	cmContentFinal.setDeathdayTime(contentMap.get("deathdayTime"));
    	cmContentFinal.setBuriedLocation(contentMap.get("buriedLocation"));
    	if(contentMap.get("son")!=null&&contentMap.get("son").length()<50) {
    		cmContentFinal.setSon(contentMap.get("son"));
    	}
    	if(contentMap.get("daughter")!=null&&contentMap.get("daughter").length()<50) {
    		cmContentFinal.setDaughter(contentMap.get("daughter"));
    	}
    	
    	return true;
	}

	@Override
	public List<CmContentFinalExtends> findCmContentFinalExtendsListByGenerationStartEnd(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId()).andContentTypeEqualTo(1);
		criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration()).andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		
		if(record.getSubClanId()!=null&&record.getSubClanId()!=-1){
			//先查该分支id是否存在子id列表
			List<Integer> idList = subClanInfoService.findAllSubClanInfoIdListByParentId(record.getSubClanId(),record.getBookId(),1);
			criteria.andSubClanIdIn(idList);
		}
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
		for(CmContentFinal cmContentFinal:cmContentFinalList){
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			List<PersonInfo> subNodeList = cmRelationService.findSubNodeListByParentId(cmContentFinal.getId());
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			PersonInfo parentNode = cmRelationService.findParentNodeByMainId(cmContentFinal.getId());
			cmContentFinalExtends.setParentNode(parentNode);
			cmContentFinalExtends.setSubNodeList(subNodeList);
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}

	@Override
	public List<CmContentFinalExtends> findCmContentFinalExtendsListByRelationList(String subFamilyCode,
			List<FmCmRelation> fmCmRelationList) {
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
		for(FmCmRelation fmCmRelation:fmCmRelationList) {
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			CmContentFinal CmContentFinal = get(fmCmRelation.getCmContentFinalId());
			if(CmContentFinal!=null) {
				BeanUtils.copyProperties(CmContentFinal, cmContentFinalExtends);
				//查询书名
				ClanBook clanBook = clanBookService.get(fmCmRelation.getBookId());
				cmContentFinalExtends.setBookName(clanBook==null?null:clanBook.getBookName());
				cmContentFinalExtends.setFamilyMemberId(fmCmRelation.getFamilyMemberId());
				cmContentFinalExtends.setFamilyMemberCode(fmCmRelation.getFamilyMemberCode());
				cmContentFinalExtends.setFamilyId(fmCmRelation.getFamilyId());
				cmContentFinalExtends.setSubFamilyCode(subFamilyCode);
				//查询上五代列表，先通过关系查出5代直系的id，然后根据id查出所有人员
				List<Integer> idList = cmRelationService.findfiveGenerationContentIdListByMaId(CmContentFinal.getId());
				List<CmContentFinal> fiveGenerationContent = findCmContentFinalListByIdList(idList);
				cmContentFinalExtends.setFiveGenerationContent(fiveGenerationContent);
				
				cmContentFinalExtendsList.add(cmContentFinalExtends);
			}
		}
		return cmContentFinalExtendsList;
	}

	@Override
	public List<CmContentFinalExtends> findCmContentFinalExtendsListByNum(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId()).andContentTypeEqualTo(1).andGenerationNumIsNotNull();
		if(record.getSubClanId()!=null&&record.getSubClanId()!=-1){
			//先查该分支id是否存在子id列表
			List<Integer> idList = subClanInfoService.findAllSubClanInfoIdListByParentId(record.getSubClanId(),record.getBookId(),1);
			criteria.andSubClanIdIn(idList);
		}
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
		for(CmContentFinal cmContentFinal:cmContentFinalList){
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			List<PersonInfo> subNodeList = cmRelationService.findSubNodeListByParentId(cmContentFinal.getId());
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			PersonInfo parentNode = cmRelationService.findParentNodeByMainId(cmContentFinal.getId());
			PersonInfo mainNode = cmRelationService.findMainNodeBySpouseId(cmContentFinal.getId());
			cmContentFinalExtends.setParentNode(parentNode);
			cmContentFinalExtends.setMainNode(mainNode);
			cmContentFinalExtends.setSubNodeList(subNodeList);
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}

	@Override
	public List<CmContentFinalExtends> findMainMemberListByFuzzyName(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		
		criteria.andMemberNameLike("%"+record.getMemberName()+"%");
		criteria.andSpouseNameIsNull();
		if(record.getSubClanId()!=null&&record.getSubClanId()!=0) {
			criteria.andSubClanIdEqualTo(record.getSubClanId());
		}
		if(record.getVolumeId()!=null&&(record.getVolumeId()!=0||record.getVolumeId()!=-1)) {
			criteria.andVolumeIdEqualTo(record.getVolumeId());
		}
		
		if(record.getGenerationNum()!=null) {
			criteria.andGenerationNumEqualTo(record.getGenerationNum()-1);
		}
		//根据son_num_diff查
		if(record.getSonNumDiff()!=null) {
			criteria.andSonNumDiffGreaterThan(0);
		}
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		
		
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<>();
		
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			String subClanName = "暂无";
			if(record.getSubClanId()!=null&&record.getSubClanId()!=0) {
				subClanName = subClanInfoService.findFullNameById(record.getSubClanId());
			}
			cmContentFinalExtends.setSubClanName(subClanName);
			//封装配偶信息
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}

	
	@Override
	public List<CmContentFinalExtends> findMainMemberListByFuzzyNameAdvanced(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		String memberName = ZhConverterUtil.convertToTraditional(record.getMemberName());
		criteria.andMemberDetailLike("%"+memberName+"%");
		criteria.andFatherNameIsNull();
		if(record.getSubClanId()!=null&&record.getSubClanId()!=0) {
			criteria.andSubClanIdEqualTo(record.getSubClanId());
		}
		if(record.getVolumeId()!=null&&(record.getVolumeId()!=0||record.getVolumeId()!=-1)) {
			criteria.andVolumeIdEqualTo(record.getVolumeId());
		}
		
		if(record.getGenerationNum()!=null) {
			criteria.andGenerationNumEqualTo(record.getGenerationNum()-1);
		}
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<>();
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			//先通过配偶查主干
			Integer spouseId = cmContentFinal.getId();
			Integer husbandId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_SPOUSESUB,spouseId);
			CmContentFinal husbandCmFinal = get(husbandId);
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(husbandCmFinal, cmContentFinalExtends);
			String subClanName = "暂无";
			if(record.getSubClanId()!=null&&record.getSubClanId()!=0) {
				subClanName = subClanInfoService.findFullNameById(record.getSubClanId());
			}
			cmContentFinalExtends.setSubClanName(subClanName);
			//封装配偶信息
//			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			List<PersonInfo> spouseNodeList = new ArrayList<>();
			PersonInfo spouseNode = new PersonInfo();
			spouseNode.setDetail(cmContentFinal.getMemberDetail());
			spouseNode.setGender(cmContentFinal.getMemberGender());
			spouseNode.setId(cmContentFinal.getId());
			spouseNode.setName(cmContentFinal.getMemberName());
			spouseNodeList.add(spouseNode);
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}
	@Override
	public List<NumAndClanMembers> findNumAndMemberListByGenerationStartEnd(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId()).andContentTypeEqualTo(CommonConstant.CONTENTTYPE_MEMBER);
		criteria.andRelFlagEqualTo(CommonConstant.RELATIONSHIP_UNFIND);
		criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration()).andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		
		String subClanName = "暂无";
		if(record.getSubClanId()!=null&&record.getSubClanId()!=-1) {
			criteria.andSubClanIdEqualTo(record.getSubClanId());
			//
			subClanName = subClanInfoService.findFullNameById(record.getSubClanId());
		}
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		Map<Integer, List<CmContentFinalExtends>> numAndListMap = new HashMap<Integer, List<CmContentFinalExtends>>();
		//将数据进行处理，按世代装入相应成员列表到map中
		for(CmContentFinal cmContentFinal:cmContentFinalList){
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			List<PersonInfo> subNodeList = cmRelationService.findSubNodeListByParentId(cmContentFinal.getId());
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			PersonInfo parentNode = cmRelationService.findParentNodeByMainId(cmContentFinal.getId());
			PersonInfo mainNode = cmRelationService.findMainNodeBySpouseId(cmContentFinal.getId());
			cmContentFinalExtends.setParentNode(parentNode);
			cmContentFinalExtends.setMainNode(mainNode);
			cmContentFinalExtends.setSubNodeList(subNodeList);
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmContentFinalExtends.setSubClanName(subClanName);
				
			if(numAndListMap.containsKey(cmContentFinalExtends.getGenerationNum())){
				List<CmContentFinalExtends> cmContentFinalMapList = numAndListMap.get(cmContentFinal.getGenerationNum());
				cmContentFinalMapList.add(cmContentFinalExtends);
			}else{
				List<CmContentFinalExtends> cmContentFinalMapList = new ArrayList<CmContentFinalExtends>();
				cmContentFinalMapList.add(cmContentFinalExtends);
				numAndListMap.put(cmContentFinal.getGenerationNum(), cmContentFinalMapList);
			}
		}
		List<NumAndClanMembers> numAndMembersList = new ArrayList<NumAndClanMembers>();
		for(int i = record.getStartGeneration();i<=record.getEndGeneration();i++){
//			if(i==1){
//				continue;
//			}
			if(!numAndListMap.isEmpty()){
				List<CmContentFinalExtends> cmContentFinalMapList = numAndListMap.get(i);
				NumAndClanMembers numAndMembers = new NumAndClanMembers();
				numAndMembers.setGenerationNum(i);
				numAndMembers.setCmContentFinalList(cmContentFinalMapList);
				numAndMembers.setNum(cmContentFinalMapList==null?0:cmContentFinalMapList.size());
				numAndMembersList.add(numAndMembers);
			}
		}
		
		return numAndMembersList;
	}

	@Override
	public List<CmContentFinal> findCmContentFinalListByCmIdList(List<Integer> cmIdList) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(cmIdList);
		return mapper.selectByExample(example);
	}

	@Override
	public void updateMemberRelationStatusAndGenerationNum(Integer memberAId,Integer memberBId, Integer relationStatus) {
		CmContentFinal cmContentFinal = new CmContentFinal();
		cmContentFinal.setId(memberAId);
		CmContentFinal father = new CmContentFinal();
		CmContentFinal memberB =  get(memberBId);
		if(relationStatus==CommonConstant.RELATIONSHIP_CHILDFATHER) {
			father.setId(memberBId);
			cmContentFinal.setGenerationNum(memberB.getGenerationNum()+1);
			//更新父亲下实际挂载的儿子数量
			father.setSonNumReal(memberB.getSonNumReal()+1);
			father.setSonNumDiff(memberB.getSonNumDiff()-1);
			update(father);
		}else if(relationStatus==CommonConstant.RELATIONSHIP_SPOUSEMAIN) {
			cmContentFinal.setGenerationNum(memberB.getGenerationNum());
		}else {
			
		}
		cmContentFinal.setRelFlag(relationStatus);
		update(cmContentFinal);
	}

	@Override
	public Integer findAncestorByBookId(CmContentFinal record) {
//		CmContentFinalExample example = new CmContentFinalExample();
//		example.setOrderByClause("id asc");
//		Criteria criteria = example.createCriteria();
//		criteria.andBookIdEqualTo(record.getBookId()).andContentTypeEqualTo(CommonConstant.CONTENTTYPE_MEMBER);
//		criteria.andGenerationNumEqualTo(1);
//		List<CmContentFinal> cmContentFinalMapList = mapper.selectByExample(example);
//		if(cmContentFinalMapList.size()>0) {
//			return cmContentFinalMapList.get(0).getId();
//		}
		ClanBook clanBook = clanBookService.get(record.getBookId());
		if(clanBook!=null) {
			return clanBook.getBookAncestorId();
		}
		return null;
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void updateExcelContentToCmFinal(ExcelFile excelFile,CmContent record) {
		if(excelFile.getSheetList().size()>0){
			List<ExcelSheetRow> rows = excelFile.getSheetList().get(0).getSheetRowList();
			List<CmContent> originalContentList = cmContentService.findCmContentListByCondition(record);
			CmContentFinal cmContentFinal = new CmContentFinal();
			cmContentFinal.setBookId(record.getBookId());
			cmContentFinal.setVolumeId(record.getVolumeId());
			List<CmContentFinal> cmContentFinalList = findCmContentFinalListByCondition(cmContentFinal);
			for(int i = 0;i<rows.size();i++) {
				rows.get(i);
				CmContent cmContentTemp = originalContentList.get(i);
				CmContent cmContentNew = new CmContent();
				cmContentNew.setId(cmContentTemp.getId());
				cmContentNew.setMemberDetail(rows.get(i).getCell4());
				cmContentService.update(cmContentNew);
				CmContentFinal cmContentFinalTemp = cmContentFinalList.get(i);
				CmContentFinal cmContentFinalNew = new CmContentFinal();
				cmContentFinalNew.setId(cmContentFinalTemp.getId());
				cmContentFinalNew.setMemberDetail(rows.get(i).getCell4());
				update(cmContentFinalNew);
			}
		}
	
	
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void copyCmContentToFinal(CmContentFinal record) {
		//将原文表中的数据复制一份到老谱终表，
        //查询出原文表该卷的记录
        CmContent cmContent = new CmContent();
        cmContent.setBookId(record.getBookId());
        cmContent.setVolumeId(record.getVolumeId());
        List<CmContent> originalContentList = cmContentService.findCmContentListByCondition(cmContent);
        //复制原文表数据，解析原文中的内容字段和关系字段，
        //根据书id查出姓氏
        ClanBook clanBook = clanBookService.get(record.getBookId());
        addCmContentFinalList(clanBook.getSurname(),originalContentList,clanBook.getGenerationWord());
        clanBook.setDealFlag(1);
        clanBookService.update(clanBook);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addRelationListForBook(CmContentFinal record) {
//		Long cmRelationListNum = cmRelationService.findCmRelationListNumByBookId(record.getBookId());
//        if(cmRelationListNum>0) {
//        	return;
//        }
//		List<CmContentFinal> cmContentFinalList = findCmContentFinalListByCondition(record);
//        cmRelationService.addCmRelationList(cmContentFinalList);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addNodeAndRelation(CmContentFinalExtends record) {
		Integer relId = record.getRelId();
		record.setContentType(1);
		record.setOrderNo(5000);
		CmContentFinal mainNode = get(relId);
		if(mainNode!=null) {
			record.setVolumeId(mainNode.getVolumeId());
			record.setSubClanId(mainNode.getSubClanId());
			try {
				String memberNamePY = PinyinHelper.convertToPinyinString(record.getMemberName(), "", PinyinFormat.WITHOUT_TONE);
				record.setMemberNamePinyin(memberNamePY);
				if(record.getRelFlag()==1) {
					record.setFatherName(mainNode.getMemberName());
					record.setMemberSurname(mainNode.getMemberSurname());
					String fatherNamePY = PinyinHelper.convertToPinyinString(mainNode.getMemberName(), "", PinyinFormat.WITHOUT_TONE);
					record.setFatherNamePinyin(fatherNamePY);
//					CmContentFinal fatherNode = new CmContentFinal();
//					fatherNode.setId(relId);
//					fatherNode.setSonNum(mainNode.getSonNum()+1);
				}else {
					record.setSpouseName(mainNode.getMemberName());
					String SpouseNamePY = PinyinHelper.convertToPinyinString(mainNode.getMemberName(), "", PinyinFormat.WITHOUT_TONE);
					record.setSpouseNamePinyin(SpouseNamePY);
				}
			} catch (PinyinException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		add(record);
		CmRelation cmRelation = new CmRelation();
		cmRelation.setBookId(record.getBookId());
		cmRelation.setMaId(record.getId());
		cmRelation.setMbId(relId);
		cmRelation.setRelType(record.getRelFlag());
		cmRelationService.add(cmRelation);
	}

	@Override
	public void updateRelationNodeGenerationNumByHeadNode(Integer headNodeId) {
		List<Integer> headNodeIdList = new ArrayList<Integer>();
		headNodeIdList.add(headNodeId);
		while(headNodeIdList.size()>0) {
			List<Integer> headIdList = new ArrayList<Integer>();
			for(Integer headId:headNodeIdList) {
				CmContentFinal headNode = get(headId);
				List<Integer> sonIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,headId);
				for(Integer sonId:sonIdList) {
					CmContentFinal sonNode = new CmContentFinal();
					sonNode.setId(sonId);
					sonNode.setGenerationNum(headNode.getGenerationNum()+1);
					update(sonNode);
					List<Integer> spouseIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,sonId);
					for(Integer spouseId:spouseIdList) {
						CmContentFinal spouseNode = new CmContentFinal();
						spouseNode.setId(spouseId);
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
	public void deleteCmContentFinalFromBook(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.createCriteria().andBookIdEqualTo(record.getBookId());
		mapper.deleteByExample(example);
	}

	@Override
	public List<CmContentFinal> findCmContentFinalListByIdList(List<Integer> idList) {
		if(idList==null||idList.size()<=0) {
			return null;
		}
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc");
		example.createCriteria().andIdIn(idList);
		return mapper.selectByExample(example);
	}

	@Override
	public Long findCmContentFinalListTotalCountByCondition(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record!=null) {
			//根据书id查
			if(record.getBookId()!=null) {
				criteria.andBookIdEqualTo(record.getBookId());
			}
			//根据词条类型查
			if(record.getContentType()!=null) {
				criteria.andContentTypeEqualTo(record.getContentType());
			}
		}

		return mapper.countByExample(example);
	}

	@Override
	public List<CmContentFinalExtends> findCmContentFinalListByHeadAndSeveralNum(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		List<Integer> memberIdList = findMemberIdlistByHeadId(record.getHeadId(),record.getNum());
		criteria.andBookIdEqualTo(record.getBookId()).andGenerationNumIsNotNull().andIdIn(memberIdList);
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
		for(CmContentFinal cmContentFinal:cmContentFinalList){
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			List<PersonInfo> subNodeList = cmRelationService.findSubNodeListByParentId(cmContentFinal.getId());
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			PersonInfo parentNode = cmRelationService.findParentNodeByMainId(cmContentFinal.getId());
			PersonInfo mainNode = cmRelationService.findMainNodeBySpouseId(cmContentFinal.getId());
			cmContentFinalExtends.setMainNode(mainNode);
			cmContentFinalExtends.setParentNode(parentNode);
			cmContentFinalExtends.setSubNodeList(subNodeList);
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}

	@Override
	public List<Integer> findMemberIdlistByHeadId(Integer headId, Integer num) {
		List<Integer> fatherIdList = new ArrayList<>();
		List<Integer> sonIdTempList = new ArrayList<>();
		List<Integer> memberIdList = new ArrayList<>();
		fatherIdList.add(headId);
		memberIdList.add(headId);
		//找所有头id的配偶id
		List<Integer> headSpouseIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,headId);
		memberIdList.addAll(headSpouseIdList);
		for(int i=0;i<num;i++){
			List<Integer> sonIdList = new ArrayList<>();
			for(Integer fatherId:fatherIdList){
				//先找出所有子代
				sonIdTempList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,fatherId);
				sonIdList.addAll(sonIdTempList);
			}
			memberIdList.addAll(sonIdList);
			for(Integer sonId:sonIdList){
				//找所有子id的配偶id
				List<Integer> spouseIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,sonId);
				memberIdList.addAll(spouseIdList);
			}
			fatherIdList.clear();
			fatherIdList.addAll(sonIdList);	
			sonIdList.clear();
		}
		return memberIdList;
	}
	
	@Override
	public List<Integer> findMemberIdlistByHeadIdAndSpouseFlag(Integer headId, Integer num, Integer hasSpouseFlag) {
		List<Integer> fatherIdList = new ArrayList<>();
		List<Integer> sonIdTempList = new ArrayList<>();
		List<Integer> memberIdList = new ArrayList<>();
		fatherIdList.add(headId);
		memberIdList.add(headId);
		//找所有头id的配偶id
		if(hasSpouseFlag==1) {
			List<Integer> headSpouseIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,headId);
			memberIdList.addAll(headSpouseIdList);
		}
		CmContentFinal headInfo = get(headId);
		num = num - headInfo.getGenerationNum();
		for(int i=0;i<num;i++){
			List<Integer> sonIdList = new ArrayList<>();
			for(Integer fatherId:fatherIdList){
				//先找出所有子代
				sonIdTempList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,fatherId);
				sonIdList.addAll(sonIdTempList);
			}
			memberIdList.addAll(sonIdList);
			for(Integer sonId:sonIdList){
				//找所有子id的配偶id
				if(hasSpouseFlag==1) {
					List<Integer> spouseIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,sonId);
					memberIdList.addAll(spouseIdList);
				}
			}
			fatherIdList.clear();
			fatherIdList.addAll(sonIdList);	
			sonIdList.clear();
		}
		return memberIdList;
	}

	@Override
	public List<Integer> findMemberIdlistByHeadIdAndAssignGeneration(Integer headId, Integer generation) {
		List<Integer> fatherIdList = new ArrayList<>();
		List<Integer> sonIdTempList = new ArrayList<>();
//		List<Integer> memberIdList = new ArrayList<>();
		List<Integer> targetIdList = new ArrayList<>();
		
		CmContentFinal cmContentFinal = get(headId);
		if(generation==cmContentFinal.getGenerationNum()) {
			targetIdList.add(headId);
			return targetIdList;
		}
		generation = generation-cmContentFinal.getGenerationNum();
		fatherIdList.add(headId);
//		memberIdList.add(headId);
		//找所有头id的配偶id
//		List<Integer> headSpouseIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,headId);
//		memberIdList.addAll(headSpouseIdList);
		for(int i=0;i<=generation;i++){
			List<Integer> sonIdList = new ArrayList<>();
			for(Integer fatherId:fatherIdList){
				//先找出所有子代
				sonIdTempList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,fatherId);
				//查上一代是否有子孙的成员列表
				if(i==generation) {
					if(sonIdTempList!=null&&sonIdTempList.size()>0) {
						targetIdList.add(fatherId);
					}
				}
				sonIdList.addAll(sonIdTempList);
			}
//			memberIdList.addAll(sonIdList);
//			for(Integer sonId:sonIdList){
//				//找所有子id的配偶id
//				List<Integer> spouseIdList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN,sonId);
//				memberIdList.addAll(spouseIdList);
//			}
			fatherIdList.clear();
			fatherIdList.addAll(sonIdList);	
			sonIdList.clear();
		}
		return targetIdList;
	}
	
	@Override
	public void addTwoNodesConnectionQuicklyByGenerationStartEnd(CmContentFinalExtends record) {
//		//先查未对接的列表，先模糊查父亲名或配偶名是否存在唯一的一个人，存在则将两者关系挂上，同时更新相关数据
//		CmContentFinalExample example = new CmContentFinalExample();
//		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
//		Criteria criteria = example.createCriteria();
//		if(record.getSubClanId()!=0) {
//			criteria.andSubClanIdEqualTo(record.getSubClanId());
//		}
//		criteria.andBookIdEqualTo(record.getBookId());
//		criteria.andRelFlagEqualTo(CommonConstant.RELATIONSHIP_UNFIND);
//		criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration()).andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
//		List<CmContentFinal> unRelatedMemberList = mapper.selectByExample(example);
//		
//		for(CmContentFinal unrelatedMember:unRelatedMemberList) {
//			if(StringUtils.isNotBlank(unrelatedMember.getFatherName())) {
//				String fatherName = unrelatedMember.getFatherName();
//				if(fatherName.length()>=2) {
//					if((fatherName.endsWith("之"))) {
//						fatherName = fatherName.replaceFirst("之", "");
//					}
//					if(fatherName.endsWith("公")) {
//						fatherName = fatherName.replaceFirst("公", "");
//					}
//					unrelatedMember.getGenerationNum();
//					
//				}
//				CmContentFinal cmContentFinalMember = new CmContentFinal();
//				cmContentFinalMember.setMemberName(fatherName);
//				cmContentFinalMember.setBookId(unrelatedMember.getBookId());
//				cmContentFinalMember.setGenerationNum(unrelatedMember.getGenerationNum());
//				cmContentFinalMember.setSubClanId(record.getSubClanId());
//				List<CmContentFinalExtends> fatherList = findMainMemberListByFuzzyName(cmContentFinalMember);
//				if(fatherList!=null&&fatherList.size()==1) {
//					//添加新的节点关系
//					CmRelation cmRelation = new CmRelation();
//					cmRelation.setBookId(unrelatedMember.getBookId());
//					cmRelation.setMaId(unrelatedMember.getId());
//					cmRelation.setMbId(fatherList.get(0).getId());
//					cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
//					cmRelationService.addTwoNodesConnection(cmRelation);
//				}
//				
//			} else if(StringUtils.isNotBlank(unrelatedMember.getSpouseName())) {
//				String spouseName = unrelatedMember.getSpouseName();
//				CmContentFinal cmContentFinal = new CmContentFinal();
//				cmContentFinal.setMemberName(spouseName);
//				cmContentFinal.setBookId(unrelatedMember.getBookId());
//				cmContentFinal.setVolumeId(unrelatedMember.getVolumeId());
//				cmContentFinal.setGenerationNum(unrelatedMember.getGenerationNum()+1);
//				cmContentFinal.setSubClanId(record.getSubClanId());
//				List<CmContentFinalExtends> spouseList = findMainMemberListByFuzzyName(cmContentFinal);
//				if(spouseList!=null&&spouseList.size()==1) {
//					//添加新的节点关系
//					CmRelation cmRelation = new CmRelation();
//					cmRelation.setBookId(unrelatedMember.getBookId());
//					cmRelation.setMaId(unrelatedMember.getId());
//					cmRelation.setMbId(spouseList.get(0).getId());
//					cmRelation.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
//					cmRelationService.addTwoNodesConnection(cmRelation);
//				}
//			}
//		}
		
		
		//先查未对接的列表，先模糊查父亲名或配偶名是否存在唯一的一个人，存在则将两者关系挂上，同时更新相关数据
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		if(record.getSubClanId()!=null&&record.getSubClanId()!=0) {
			criteria.andSubClanIdEqualTo(record.getSubClanId());
		}
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andRelFlagEqualTo(CommonConstant.RELATIONSHIP_UNFIND);
		criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration()).andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		List<CmContentFinal> unRelatedMemberList = mapper.selectByExample(example);
		
		for(CmContentFinal unrelatedMember:unRelatedMemberList) {
			if(StringUtils.isNotBlank(unrelatedMember.getFatherName())) {
				String fatherName = unrelatedMember.getFatherName();
//						System.out.println("fatherName： "+fatherName);
				if(fatherName.length()>=2) {
					if((fatherName.endsWith("之"))) {
						fatherName = fatherName.replaceFirst("之", "");
					}
					if(fatherName.endsWith("公")) {
						fatherName = fatherName.replaceFirst("公", "");
					}
					//找派语 --再进一步
					unrelatedMember.getGenerationNum();
					
				}
				CmContentFinal cmContentFinalMember = new CmContentFinal();
				cmContentFinalMember.setMemberName(fatherName);
				cmContentFinalMember.setBookId(unrelatedMember.getBookId());
				cmContentFinalMember.setGenerationNum(unrelatedMember.getGenerationNum());
				cmContentFinalMember.setSubClanId(unrelatedMember.getSubClanId());
				List<CmContentFinalExtends> fatherList = findMainMemberListByFuzzyName(cmContentFinalMember);
				if(fatherList!=null&&fatherList.size()==1) {
					//添加新的节点关系
					CmRelation cmRelation = new CmRelation();
					cmRelation.setBookId(unrelatedMember.getBookId());
					cmRelation.setMaId(unrelatedMember.getId());
					cmRelation.setMbId(fatherList.get(0).getId());
					cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
					cmRelationService.addTwoNodesConnection(cmRelation);
				}else if(fatherList!=null&&fatherList.size()>1) { //关于出继那边的&&unrelatedMember.getToLocate()==0
					//先看能否转繁体
					String memberName = unrelatedMember.getMemberName();
					try {
						if(StringUtils.isNotBlank(memberName)) {
							memberName = ZhConverterUtil.convertToTraditional(memberName);
						}
					}catch(Exception e) {
						System.out.println("无法转繁体的id和内容："+unrelatedMember.getId()+":"+memberName);
						continue;
					}
					
					//方案1 根据母亲的信息来识别
					//如果不是继子则继续执行,是继子则不做挂载
					CmContentFinalExtends finalFather=null;
					int num =0;
					for(CmContentFinalExtends father:fatherList) {
						List<PersonInfo> spouseInfoList = father.getSpouseNodeList();
						for(PersonInfo spouseInfo:spouseInfoList) {
							if(spouseInfo.getDetail().contains(memberName)||spouseInfo.getDetail().contains(unrelatedMember.getMemberName())){
								finalFather = father;
								++num;
							}
						}
					}
					if(finalFather!=null&&num==1) {
						//添加新的节点关系
						CmRelation cmRelation = new CmRelation();
						cmRelation.setBookId(unrelatedMember.getBookId());
						cmRelation.setMaId(unrelatedMember.getId());
						cmRelation.setMbId(finalFather.getId());
						cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
						cmRelationService.addTwoNodesConnection(cmRelation);
						
					}
					
//							//方案2 先查出是否有多个父亲，有多个父亲的时候再看该父亲是否已经全部挂上了儿子，没有则直接挂
//							//如果不是继子则继续执行,是继子则不做挂载
//							CmContentFinalExtends finalFather=null;
//							int num =0;
//							for(CmContentFinalExtends father:fatherList) {
//								List<PersonInfo> spouseInfoList = father.getSpouseNodeList();
//								for(PersonInfo spouseInfo:spouseInfoList) {
//									if(spouseInfo.getDetail().indexOf(unrelatedMember.getMemberName())>0){
//										finalFather = father;
//										++num;
//									}
//								}
//							}
//							if(finalFather!=null&&num==1) {
//								//添加新的节点关系
//								CmRelation cmRelation = new CmRelation();
//								cmRelation.setBookId(unrelatedMember.getBookId());
//								cmRelation.setMaId(unrelatedMember.getId());
//								cmRelation.setMbId(finalFather.getId());
//								cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
//								cmRelationService.addTwoNodesConnection(cmRelation);
//								
//							}
				}
				
			} else if(StringUtils.isNotBlank(unrelatedMember.getSpouseName())) {
//						//挂载配偶节点方案1
//						String spouseName = unrelatedMember.getSpouseName();
//						if(spouseName.length()>=2) {
//							if((spouseName.endsWith("之"))) {
//								spouseName = spouseName.replaceFirst("之", "");
//							}
//							if(spouseName.endsWith("公")) {
//								spouseName = spouseName.replaceFirst("公", "");
//							}
//						}
//						CmContentFinal cmContentFinal = new CmContentFinal();
//						cmContentFinal.setMemberName(spouseName);
//						cmContentFinal.setBookId(unrelatedMember.getBookId());
//						cmContentFinal.setVolumeId(unrelatedMember.getVolumeId());
//						cmContentFinal.setGenerationNum(unrelatedMember.getGenerationNum()+1);
//						cmContentFinal.setSubClanId(unrelatedMember.getSubClanId());
//						List<CmContentFinalExtends> spouseList = findMainMemberListByFuzzyName(cmContentFinal);
//						if(spouseList!=null&&spouseList.size()>=1) {
//							Integer spouseId = spouseList.get(0).getId();
//							if(spouseList.size()>1) {
//								//计算两人的差值，取最小的作为配偶节点
//								Integer diff = Math.abs(unrelatedMember.getId()-spouseId);
//								for(CmContentFinalExtends cmContentFinalExtends:spouseList) {
//									Integer diffTemp = Math.abs(unrelatedMember.getId()-cmContentFinalExtends.getId());
//									if(diffTemp<diff) {
//										spouseId = cmContentFinalExtends.getId();
//									}
//								}
//							}
//							//添加新的节点关系
//							CmRelation cmRelation = new CmRelation();
//							cmRelation.setBookId(unrelatedMember.getBookId());
//							cmRelation.setMaId(unrelatedMember.getId());
//							cmRelation.setMbId(spouseId);
//							cmRelation.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
//							cmRelationService.addTwoNodesConnection(cmRelation);
//						}
				
				//挂载配偶节点方案2，通过id相近原则 直接挂
				CmContentFinal cmContentFinal = new CmContentFinal();
				cmContentFinal.setId(unrelatedMember.getId());;
				List<CmContentFinal> spouseList = findFiveNodeForSpouse(cmContentFinal);
				if(spouseList!=null&&spouseList.size()>0) {
					//添加新的节点关系
					CmRelation cmRelation = new CmRelation();
					cmRelation.setBookId(unrelatedMember.getBookId());
					cmRelation.setMaId(unrelatedMember.getId());
					cmRelation.setMbId(spouseList.get(0).getId());
					cmRelation.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
					cmRelationService.addTwoNodesConnection(cmRelation);
				}
			}
		}
	}

	@Override
	public Long findUnrelatedNum(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andRelFlagEqualTo(record.getRelFlag());
		criteria.andGenerationNumEqualTo(record.getGenerationNum());
		criteria.andContentTypeEqualTo(1);
		criteria.andBookIdEqualTo(record.getBookId());
		return mapper.countByExample(example);
	}

	@Override
	public void updateCmContentFinalList(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
//		criteria.andMemberNameNewLike("%"+record.getBookName()+"%");
//		criteria.andMemberRelNewLike("%"+record.getBookName()+"%");
		criteria.andMemberDetailNewLike("%"+record.getBookName()+"%");
//		criteria.andSpouseNameLike("%"+record.getBookName()+"%");
//		criteria.andFatherNameLike("%"+record.getBookName()+"%");
		List<CmContentFinal> unRelatedMemberList = mapper.selectByExample(example);
		System.out.println(record.getBookName()+":"+record.getSubClanName()+","+unRelatedMemberList.size());
		for(CmContentFinal cmContentFinal:unRelatedMemberList) {
			CmContentFinal temp = new CmContentFinal();
			temp.setId(cmContentFinal.getId());
			
//			String memberName = cmContentFinal.getMemberNameNew();
//			if(StringUtils.isNotBlank(memberName)){
//				memberName = memberName.replaceAll(record.getBookName(), record.getSubClanName());
//				temp.setMemberNameNew(memberName);
//			}
//			String memberRel = cmContentFinal.getMemberRelNew();
//			if(StringUtils.isNotBlank(memberRel)){
//				memberRel = memberRel.replaceAll(record.getBookName(), record.getSubClanName());
//				temp.setMemberRelNew(memberRel);
//			}
			String memberDetail = cmContentFinal.getMemberDetailNew();
			if(StringUtils.isNotBlank(memberDetail)){
				memberDetail = memberDetail.replaceAll(record.getBookName(), record.getSubClanName());
				temp.setMemberDetailNew(memberDetail);
			}
//			String relKeyword = cmContentFinal.getRelKeyword();
//			if(StringUtils.isNotBlank(relKeyword)){
//				relKeyword = relKeyword.replaceAll(record.getBookName(), record.getSubClanName());
//				temp.setRelKeyword(relKeyword);
//			}
//			String fatherName = cmContentFinal.getFatherName();
//			if(StringUtils.isNotBlank(fatherName)){
//				fatherName = fatherName.replaceAll(record.getBookName(), record.getSubClanName());
//				temp.setFatherName(fatherName);
//			}
			else {
				continue;
			}
//			String spouseName = cmContentFinal.getSpouseName();
//			if(StringUtils.isNotBlank(spouseName)){
//				spouseName = spouseName.replaceAll(record.getBookName(), record.getSubClanName());
//				temp.setSpouseName(spouseName);
//			}
			update(temp);
			
		}
	}

	@Override
	public void updateCmContentFinalFlag(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId()).andRelFlagNotEqualTo(2);
		List<CmContentFinal> unRelatedMemberList = mapper.selectByExample(example);
		System.out.println(unRelatedMemberList.size());
		for(CmContentFinal cmContentFinal:unRelatedMemberList) {
			CmContentFinal temp = new CmContentFinal();
			temp.setId(cmContentFinal.getId());
			temp.setRelFlag(0);
			temp.setSonNumReal(0);
			temp.setSonNumDiff(cmContentFinal.getSonNum());
			update(temp);
		}
	}

	@Override
	public void addRelationListMoreInGeneration(CmContentFinalExtends record) {
		//先查未对接的列表，先模糊查父亲名或配偶名是否存在唯一的一个人，存在则将两者关系挂上，同时更新相关数据
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		if(record.getSubClanId()!=null&&record.getSubClanId()!=0) {
			criteria.andSubClanIdEqualTo(record.getSubClanId());
		}
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andRelFlagEqualTo(CommonConstant.RELATIONSHIP_UNFIND);
		criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration()).andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		List<CmContentFinal> unRelatedMemberList = mapper.selectByExample(example);
		
		for(CmContentFinal unrelatedMember:unRelatedMemberList) {
			if(StringUtils.isNotBlank(unrelatedMember.getFatherName())) {
				String fatherName = unrelatedMember.getFatherName();
//				System.out.println("fatherName： "+fatherName);
				if(fatherName.length()>=2) {
					if((fatherName.endsWith("之"))) {
						fatherName = fatherName.replaceFirst("之", "");
					}
					if(fatherName.endsWith("公")) {
						fatherName = fatherName.replaceFirst("公", "");
					}
					//找派语 --再进一步
					unrelatedMember.getGenerationNum();
					
				}
				CmContentFinal cmContentFinalMember = new CmContentFinal();
				cmContentFinalMember.setMemberName(fatherName);
				cmContentFinalMember.setBookId(unrelatedMember.getBookId());
				cmContentFinalMember.setGenerationNum(unrelatedMember.getGenerationNum());
				cmContentFinalMember.setSubClanId(unrelatedMember.getSubClanId());
				List<CmContentFinalExtends> fatherList = findMainMemberListByFuzzyName(cmContentFinalMember);
				if(fatherList!=null&&fatherList.size()==1) {
					//添加新的节点关系
					CmRelation cmRelation = new CmRelation();
					cmRelation.setBookId(unrelatedMember.getBookId());
					cmRelation.setMaId(unrelatedMember.getId());
					cmRelation.setMbId(fatherList.get(0).getId());
					cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
					cmRelationService.addTwoNodesConnection(cmRelation);
				}else if(fatherList!=null&&fatherList.size()>1) { //关于出继那边的&&unrelatedMember.getToLocate()==0
					//先看能否转繁体
					String memberName = unrelatedMember.getMemberName();
					try {
						if(StringUtils.isNotBlank(memberName)) {
							memberName = ZhConverterUtil.convertToTraditional(memberName);
						}
					}catch(Exception e) {
						System.out.println("无法转繁体的id和内容："+unrelatedMember.getId()+":"+memberName);
						continue;
					}
					
					//方案1 根据母亲的信息来识别
					//如果不是继子则继续执行,是继子则不做挂载
					CmContentFinalExtends finalFather=null;
					int num =0;
					for(CmContentFinalExtends father:fatherList) {
						List<PersonInfo> spouseInfoList = father.getSpouseNodeList();
						for(PersonInfo spouseInfo:spouseInfoList) {
							if(spouseInfo.getDetail().contains(memberName)||spouseInfo.getDetail().contains(unrelatedMember.getMemberName())){
								finalFather = father;
								++num;
							}
						}
					}
					if(finalFather!=null&&num==1) {
						//添加新的节点关系
						CmRelation cmRelation = new CmRelation();
						cmRelation.setBookId(unrelatedMember.getBookId());
						cmRelation.setMaId(unrelatedMember.getId());
						cmRelation.setMbId(finalFather.getId());
						cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
						cmRelationService.addTwoNodesConnection(cmRelation);
						
					}
					
//					//方案2 先查出是否有多个父亲，有多个父亲的时候再看该父亲是否已经全部挂上了儿子，没有则直接挂
//					//如果不是继子则继续执行,是继子则不做挂载
//					CmContentFinalExtends finalFather=null;
//					int num =0;
//					for(CmContentFinalExtends father:fatherList) {
//						List<PersonInfo> spouseInfoList = father.getSpouseNodeList();
//						for(PersonInfo spouseInfo:spouseInfoList) {
//							if(spouseInfo.getDetail().indexOf(unrelatedMember.getMemberName())>0){
//								finalFather = father;
//								++num;
//							}
//						}
//					}
//					if(finalFather!=null&&num==1) {
//						//添加新的节点关系
//						CmRelation cmRelation = new CmRelation();
//						cmRelation.setBookId(unrelatedMember.getBookId());
//						cmRelation.setMaId(unrelatedMember.getId());
//						cmRelation.setMbId(finalFather.getId());
//						cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
//						cmRelationService.addTwoNodesConnection(cmRelation);
//						
//					}
				}
				
			} else if(StringUtils.isNotBlank(unrelatedMember.getSpouseName())) {
//				//挂载配偶节点方案1
//				String spouseName = unrelatedMember.getSpouseName();
//				if(spouseName.length()>=2) {
//					if((spouseName.endsWith("之"))) {
//						spouseName = spouseName.replaceFirst("之", "");
//					}
//					if(spouseName.endsWith("公")) {
//						spouseName = spouseName.replaceFirst("公", "");
//					}
//				}
//				CmContentFinal cmContentFinal = new CmContentFinal();
//				cmContentFinal.setMemberName(spouseName);
//				cmContentFinal.setBookId(unrelatedMember.getBookId());
//				cmContentFinal.setVolumeId(unrelatedMember.getVolumeId());
//				cmContentFinal.setGenerationNum(unrelatedMember.getGenerationNum()+1);
//				cmContentFinal.setSubClanId(unrelatedMember.getSubClanId());
//				List<CmContentFinalExtends> spouseList = findMainMemberListByFuzzyName(cmContentFinal);
//				if(spouseList!=null&&spouseList.size()>=1) {
//					Integer spouseId = spouseList.get(0).getId();
//					if(spouseList.size()>1) {
//						//计算两人的差值，取最小的作为配偶节点
//						Integer diff = Math.abs(unrelatedMember.getId()-spouseId);
//						for(CmContentFinalExtends cmContentFinalExtends:spouseList) {
//							Integer diffTemp = Math.abs(unrelatedMember.getId()-cmContentFinalExtends.getId());
//							if(diffTemp<diff) {
//								spouseId = cmContentFinalExtends.getId();
//							}
//						}
//					}
//					//添加新的节点关系
//					CmRelation cmRelation = new CmRelation();
//					cmRelation.setBookId(unrelatedMember.getBookId());
//					cmRelation.setMaId(unrelatedMember.getId());
//					cmRelation.setMbId(spouseId);
//					cmRelation.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
//					cmRelationService.addTwoNodesConnection(cmRelation);
//				}
				
				//挂载配偶节点方案2，通过id相近原则 直接挂
				CmContentFinal cmContentFinal = new CmContentFinal();
				cmContentFinal.setId(unrelatedMember.getId());;
				List<CmContentFinal> spouseList = findFiveNodeForSpouse(cmContentFinal);
				if(spouseList!=null&&spouseList.size()>0) {
					//添加新的节点关系
					CmRelation cmRelation = new CmRelation();
					cmRelation.setBookId(unrelatedMember.getBookId());
					cmRelation.setMaId(unrelatedMember.getId());
					cmRelation.setMbId(spouseList.get(0).getId());
					cmRelation.setRelType(CommonConstant.RELATIONSHIP_SPOUSEMAIN);
					cmRelationService.addTwoNodesConnection(cmRelation);
				}
			}
		}
		
	}

	@Override
	public void deleteFromBook(int bookId) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(bookId);
		mapper.deleteByExample(example);
	}

	@Override
	public void updateCmContentFinalToSimple(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(6);
//		criteria.andVolumeIdEqualTo(150);
		criteria.andContentTypeEqualTo(1);
		List<CmContentFinal> unRelatedMemberList = mapper.selectByExample(example);
		System.out.println(unRelatedMemberList.size());
		
		int sum=0;
		int one=0;
		int two=0;
		int three=0;
		for(CmContentFinal cmContentFinal:unRelatedMemberList) {
			CmContentFinal temp = new CmContentFinal();
			temp.setId(cmContentFinal.getId());
//			temp.setRelFlag(0);
//			temp.setToLocate(0);
			try {
//				if(StringUtils.isNotBlank(cmContentFinal.getRelKeyword())) {
//					String relKeyword = ZhConverterUtil.convertToSimple(cmContentFinal.getRelKeyword());
//					temp.setRelKeyword(relKeyword);
//				}else {
//					continue;
//				}
				if(StringUtils.isNotBlank(cmContentFinal.getMemberName())) {
//					String memberName = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberName());
					String memberName = cmContentFinal.getMemberName();
					memberName=memberName.replaceAll("　", "");
					temp.setMemberName(memberName);
				}
//				if(StringUtils.isNotBlank(cmContentFinal.getMemberRel())) {
//					String memberRel = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberRel());
//					temp.setMemberRel(memberRel);
//				}
//				if(StringUtils.isNotBlank(cmContentFinal.getFatherName())) {
////					String fatherName = ZhConverterUtil.convertToSimple(cmContentFinal.getFatherName());
//					String fatherName = cmContentFinal.getFatherName();
//					fatherName = fatherName.replaceAll("　", "");
//					temp.setFatherName(fatherName);
//				}
//				if(StringUtils.isNotBlank(cmContentFinal.getSpouseName())) {
//					String spouseName = ZhConverterUtil.convertToSimple(cmContentFinal.getSpouseName());
//					temp.setSpouseName(spouseName);			
//				}
//				if(StringUtils.isNotBlank(cmContentFinal.getMemberDetail())){
//					String memberDetail = cmContentFinal.getMemberDetail();
//					if(StringUtils.isNotBlank(cmContentFinal.getFatherName())) {
//						//出继标志 默认为0：非出继；1、兼祧；2、出继/过继/出繼/过繼；3、出抚/出撫
//						if(memberDetail.indexOf("兼祧子")>=0) {
//							continue;
//						}
//						if(memberDetail.indexOf("兼祧")>=0) {
//							temp.setToLocate(1);
//							one++;
//						}else if(memberDetail.indexOf("出继")>=0||memberDetail.indexOf("过继")>=0||memberDetail.indexOf("出繼")>=0||memberDetail.indexOf("过繼")>=0) {
//							temp.setToLocate(2);
//							two++;
//						}else if(memberDetail.indexOf("出抚")>=0||memberDetail.indexOf("出撫")>=0) {
//							temp.setToLocate(3);
//							three++;
//						}
//					}
//				}
				else {
					continue;
				}
				update(temp);
			} catch(Exception e) {
				sum++;
				System.out.println("错误的id："+cmContentFinal.getId()+"---错误的orderNo："+cmContentFinal.getOrderNo());
				continue;
			}
		}
		System.out.println("总错误数："+sum);
		System.out.println("总错误数："+one);
		System.out.println("总错误数："+two);
		System.out.println("总错误数："+three);
		
	}
	
	public static void main(String[] args) {
		String memberDetail = "出繼民純";
		System.out.println(memberDetail.indexOf("出繼")>=0);
	}

	@Override
	public void setMainMemberForSonNum(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andSonNumEqualTo(0);
		criteria.andFatherNameIsNotNull();
		criteria.andMemberDetailLike("%"+record.getMemberDetail()+" %");//全角空格"　"
		List<CmContentFinal> unSetMemberList = mapper.selectByExample(example);
		System.out.println(unSetMemberList.size());
		for(CmContentFinal unSetMember:unSetMemberList) {
			CmContentFinal cmContentFinal = new CmContentFinal();
			cmContentFinal.setId(unSetMember.getId());
			cmContentFinal.setSonNum(record.getSonNum());
			update(cmContentFinal);
		}
		
	}

	@Override
	public void setMainMemberForSonNumReal(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
//		criteria.andRelFlagEqualTo(1);
//		criteria.andSonNumGreaterThan(0);
		criteria.andFatherNameIsNotNull();
		List<CmContentFinal> unSetMemberList = mapper.selectByExample(example);
		System.out.println(unSetMemberList.size());
		for(CmContentFinal unSetMember:unSetMemberList) {
			CmContentFinal cmContentFinal = new CmContentFinal();
			cmContentFinal.setId(unSetMember.getId());
			//查询某人下有几个儿子
			Long num = cmRelationService.countMaIdListNumByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,unSetMember.getId());
			cmContentFinal.setSonNumReal(num==null?0:num.intValue());
			cmContentFinal.setSonNum(num==null?0:num.intValue());
			cmContentFinal.setSonNumDiff(0);
			update(cmContentFinal);
		}
	}

	@Override
	public void updateNumForCmContentFinal(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andVolumeIdEqualTo(record.getVolumeId());
		criteria.andOrderNoGreaterThanOrEqualTo(1009);
		List<CmContentFinal> cmContentList = mapper.selectByExample(example);
		for(CmContentFinal cmContent:cmContentList) {
			CmContentFinal temp = new CmContentFinal();
			temp.setId(cmContent.getId());
			temp.setOrderNo(cmContent.getOrderNo()+118);
			update(temp);
		}
	}

	@Override
	public List<CmContentFinal> findFiveNodeForSpouse(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("id desc");
//		criteria.andBookIdEqualTo(record.getBookId());
//		criteria.andVolumeIdEqualTo(record.getVolumeId());
		criteria.andIdLessThan(record.getId());
		criteria.andIdGreaterThanOrEqualTo(record.getId()-5);
		criteria.andFatherNameIsNotNull();
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findCmListByPageAndCondition(RequestEntityForCmContentFinal requestEntity) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andContentTypeEqualTo(1);
		criteria.andBookIdEqualTo(requestEntity.getBookId());
		if(requestEntity.getSonNum()!=null&&requestEntity.getSonNum()>0){
			criteria.andSonNumEqualTo(requestEntity.getSonNum());
		}
		if(requestEntity.getBrotherNum()!=null&&requestEntity.getBrotherNum()>0){
			criteria.andBrotherNumEqualTo(requestEntity.getBrotherNum());
		}
		if(StringUtils.isNotBlank(requestEntity.getSpouseName())){
			criteria.andWifeListLike("%"+requestEntity.getSpouseName()+"%");
		}
		
		//精确查询
		if(requestEntity.getPreciseFlag()==1) {
			if(StringUtils.isNotBlank(requestEntity.getFatherName())){
				criteria.andFatherNameEqualTo(requestEntity.getFatherName());
			}
//			if(StringUtils.isNotBlank(requestEntity.getSpouseName())){
//				criteria.andSpouseNameEqualTo(requestEntity.getSpouseName());
//			}
			
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
//			if(StringUtils.isNotBlank(requestEntity.getSpouseName())){
//				try {
//					String spouseNamePY = PinyinHelper.convertToPinyinString(requestEntity.getSpouseName(), "", PinyinFormat.WITHOUT_TONE);
//					criteria.andSpouseNamePinyinLike("%"+spouseNamePY+"%");
//				} catch (PinyinException e) {
//					e.printStackTrace();
//				}
////				criteria.andSpouseNameEqualTo(requestEntity.getSpouseName());
//			}
			if(StringUtils.isNotBlank(requestEntity.getMemberName())){
				try {
					String memberNamePY = PinyinHelper.convertToPinyinString(requestEntity.getMemberName(), "", PinyinFormat.WITHOUT_TONE);
					criteria.andMemberNamePinyinLike(memberNamePY+"%");
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
		//找出
		
		
		return mapper.selectByExample(example);
	}

	@Override
	public List<NumAndClanMembers> findMemberListNumByGenerationStartEnd(CmContentFinalExtends record) {
		List<NumAndClanMembers> numAndClanMembers = new ArrayList<>();
		
		for(int i= record.getStartGeneration();i<=record.getEndGeneration();i++ ) {
			CmContentFinalExample example = new CmContentFinalExample();
			Criteria criteria = example.createCriteria();
			criteria.andBookIdEqualTo(record.getBookId()).andContentTypeEqualTo(CommonConstant.CONTENTTYPE_MEMBER);
			criteria.andRelFlagEqualTo(CommonConstant.RELATIONSHIP_UNFIND);
			criteria.andGenerationNumGreaterThanOrEqualTo(i).andGenerationNumLessThanOrEqualTo(i);
			Long num = mapper.countByExample(example);
			NumAndClanMembers numAndClanMember = new NumAndClanMembers();
			if(i==1) {
				num = 0l;
			}
			numAndClanMember.setGenerationNum(i);
			numAndClanMember.setNum(num.intValue());
			numAndClanMembers.add(numAndClanMember);
		}
		return numAndClanMembers;
	}

	@Override
	public void setRankingForCmContentToFinal(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andRelKeywordLike("%"+record.getRelKeyword()+"%");
		criteria.andContentTypeEqualTo(1);
		criteria.andRankingEqualTo(0);
		List<CmContentFinal> cmContentList = mapper.selectByExample(example);
		System.out.println(cmContentList.size());
		for(CmContentFinal cmContent:cmContentList) {
			CmContentFinal temp = new CmContentFinal();
			temp.setId(cmContent.getId());
			temp.setRanking(record.getRanking());
//			temp.setRanking(0);
			update(temp);
		}
	}

	@Override
	public void setRelationForBrotherNode(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
//		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andGenerationNumEqualTo(record.getGenerationNum());
//		criteria.andVolumeIdEqualTo(record.getVolumeId());
		//未挂载关系的主节点--该节点必须有兄弟 也就是排行要大于0
		criteria.andRelFlagEqualTo(0);
		criteria.andSpouseNameIsNull();
		criteria.andRankingGreaterThan(0);
		criteria.andContentTypeEqualTo(1);
		Integer headRanking = 1;
		Integer tailRanking =12;
		List<CmContentFinal> unrelatedMemberList = mapper.selectByExample(example);
		int num=1;
		System.out.println("世代："+record.getGenerationNum());
		for(CmContentFinal unrelatedMember:unrelatedMemberList) {
			//记录兄弟列表
			List<CmContentFinal> brotherList = new ArrayList<>();
			Integer ranking = unrelatedMember.getRanking();
			//按排行往两头走
			//1、先往前，比如ranking=3  找ranking=2、1
			//往前找到所有兄弟
			if(ranking>headRanking&&ranking<=tailRanking) {
				int pageNum = 0;
				int count = ranking-1;
				PageHelper.offsetPage(pageNum*count,count);
				List<CmContentFinal> bigBrotherList = findBigBrotherListByBookVolumeAndOrderNo(unrelatedMember,null,null);
				brotherList.addAll(bigBrotherList);
			}
			//2、往后，先找其后是否有兄弟
			if(ranking>=headRanking) {
				CmContentFinal smallBrother = unrelatedMember;
				int i=1;
				while(smallBrother!=null) {
					List<CmContentFinal> smallBrotherList = new ArrayList<>();
					int pageNum = 0;
					int count = 1;
					PageHelper.offsetPage(pageNum*count,count);
					smallBrotherList = findSmallBrotherListByBookVolumeAndOrderNo(smallBrother,null,null);
					if(smallBrotherList!=null&&smallBrotherList.size()>0) {
						if(smallBrotherList.get(0).getRanking()==unrelatedMember.getRanking()+i) {
							smallBrother = smallBrotherList.get(0);
							brotherList.add(smallBrother);
							i++;
						}else {
							smallBrother=null;
						}
					}
				}
			}
			System.out.println("--------------------------------------------------------");
			System.out.println("编号："+num);
			System.out.println("未找到关系的人员："+unrelatedMember.getMemberRel()+" 自身id: "+unrelatedMember.getId());
//			for(CmContentFinal brother:brotherList) {
//				if(brother.getRelFlag()!=0) {
//					System.out.println("已挂载："+brother.getMemberRel());
//				}else {
//					System.out.println("未挂载："+brother.getMemberRel());
//				}
//			}
			
			//判断所有兄弟里已挂载的父节点都是一致的
			List<Integer> fatherIdList = new ArrayList<>();
			List<Integer> brotherIdList = new ArrayList<>();
			for(CmContentFinal brother:brotherList) {
				if(brother.getRelFlag()!=0) {
					//获取已挂载的父节点id
					Integer fatherId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, brother.getId());
					System.out.println("已挂载："+brother.getMemberRel()+" 自身id: "+brother.getId()+" 其父节点："+fatherId);
					if(fatherId!=null&&!fatherIdList.contains(fatherId)) {
						fatherIdList.add(fatherId);
					}
				}else {
					System.out.println("未挂载："+brother.getMemberRel()+" 自身id: "+brother.getId());
					//获取所有未挂载的兄弟节点id
					brotherIdList.add(brother.getId());
				}
			}
			num++;
			//如果只有唯一一个父节点，则将所有子节点都挂载上去
			if(fatherIdList.size()==1) {
				//条件满足 添加该成员的节点关系
				CmRelation cmRelation = new CmRelation();
				cmRelation.setBookId(unrelatedMember.getBookId());
				cmRelation.setMaId(unrelatedMember.getId());
				cmRelation.setMbId(fatherIdList.get(0));
				cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
				cmRelationService.addTwoNodesConnection(cmRelation);
				
//				for(Integer brotherId:brotherIdList) {
//					//条件满足 添加该成员兄弟的节点关系
//					CmRelation cmBrotherRelation = new CmRelation();
//					cmBrotherRelation.setBookId(unrelatedMember.getBookId());
//					cmBrotherRelation.setMaId(brotherId);
//					cmBrotherRelation.setMbId(fatherIdList.get(0));
//					cmBrotherRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
//					cmRelationService.addTwoNodesConnection(cmBrotherRelation);
//				}
				System.out.println("已处理");
			}else {
				System.out.println("未处理--有异常！！！");
			}
			System.out.println("--------------------------------------------------------");
				
			brotherList.clear();
		}
		System.out.println("世代："+record.getGenerationNum()+" 未处理总数: "+num);
	}

	//找大哥
	@Override
	public List<CmContentFinal> findBigBrotherListByBookVolumeAndOrderNo(CmContentFinal record,Integer sameSubClanFlag,Integer subNodeNumFlag) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no desc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andVolumeIdEqualTo(record.getVolumeId());
		criteria.andOrderNoLessThan(record.getOrderNo());
//		//要父亲名字相同
//		criteria.andFatherNameEqualTo(record.getFatherName());
//		//ranking不同的
//		criteria.andRankingNotEqualTo(record.getRanking());
		//要求，5代以后 同房系
		if(sameSubClanFlag!=null&&sameSubClanFlag==1&&record.getGenerationNum()>5){
			criteria.andSubClanIdOriginEqualTo(record.getSubClanIdOrigin());
		}
		
		criteria.andSpouseNameIsNull();
		return mapper.selectByExample(example);
	}

	//找小弟
	@Override
	public List<CmContentFinal> findSmallBrotherListByBookVolumeAndOrderNo(CmContentFinal record,Integer sameSubClanFlag,Integer subNodeNumFlag) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andContentTypeEqualTo(1);
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andVolumeIdEqualTo(record.getVolumeId());
		criteria.andOrderNoGreaterThan(record.getOrderNo());
//		//要父亲名字相同
//		criteria.andFatherNameEqualTo(record.getFatherName());
//		//ranking不同的
//		criteria.andRankingNotEqualTo(record.getRanking());
		
		//要求，5代以后 同房系
		if(sameSubClanFlag!=null&&sameSubClanFlag==1&&record.getGenerationNum()>5){
			criteria.andSubClanIdOriginEqualTo(record.getSubClanIdOrigin());
		}
		criteria.andSpouseNameIsNull();
		return mapper.selectByExample(example);
	}

	@Override
	public void setRelationForLocateNode(CmContentFinalExtends record) {
		//查主节点
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andToLocateEqualTo(record.getToLocate());
		criteria.andSpouseNameIsNull();
		criteria.andContentTypeEqualTo(1);
		criteria.andRelFlagEqualTo(0);
		List<CmContentFinal> locateNodeList = mapper.selectByExample(example);
		System.out.println("未挂载的继子："+locateNodeList.size());
		
		int num=0;
		int num1=0;
		for(CmContentFinal locateNode:locateNodeList) {
			//1、先查父亲名的列表
			String fatherName = locateNode.getFatherName();
//			String fatherNamePY = locateNode.getFatherNamePinyin();
			CmContentFinal condition = new CmContentFinal();
			condition.setMemberName(fatherName);
//			condition.setMemberNamePinyin(fatherNamePY);
			condition.setBookId(locateNode.getBookId());
			condition.setGenerationNum(locateNode.getGenerationNum()-1);
			condition.setMemberDetail(locateNode.getMemberName());
			condition.setSubClanId(locateNode.getSubClanId());
			List<CmContentFinal> fatherList = findFatherListByCondition(condition);
			if(fatherList!=null&&fatherList.size()==1) {
				//找到唯一的父亲
				System.out.println("唯一的父亲--------------------------------------------------------");
				System.out.println(locateNode.getId()+" "+locateNode.getMemberName()+": "+locateNode.getMemberRel()+
						" 父亲id："+fatherList.get(0).getId()+" 父亲名："+fatherList.get(0).getMemberName());
			
//				//条件满足 添加该成员的节点关系
//				CmRelation cmRelation = new CmRelation();
//				cmRelation.setBookId(locateNode.getBookId());
//				cmRelation.setMaId(locateNode.getId());
//				cmRelation.setMbId(fatherList.get(0).getId());
//				cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
//				cmRelationService.addTwoNodesConnection(cmRelation);
				
			}else if(fatherList!=null&&fatherList.size()>1) {
				CmContentFinal toLocate = new CmContentFinal();
				toLocate.setMemberName(locateNode.getMemberName());
				toLocate.setBookId(locateNode.getBookId());
				toLocate.setFatherName(locateNode.getFatherName());
				List<CmContentFinal> locateList = findToLocateByCondition(toLocate);
//				//多个父亲
//				System.out.println("多个父亲--------------------------------------------------------");
//				for(CmContentFinal father:fatherList) {
//					System.out.println(locateNode.getId()+" "+locateNode.getMemberName()+": "+locateNode.getMemberRel()+
//							" 父亲id："+father.getId()+" 父亲名："+father.getMemberName());
//				}
//				num1++;
				if(locateList!=null&&locateList.size()==1) {
					CmContentFinal locate = locateList.get(0);
					Integer locateId = locate.getId();
					Integer locateFatherId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, locateId);
					CmContentFinal toLocateAdvance = new CmContentFinal();
					toLocateAdvance.setMemberName(locateNode.getFatherName());
					toLocateAdvance.setBookId(locateNode.getBookId());
					toLocateAdvance.setSubClanId(locateNode.getSubClanId());
					toLocateAdvance.setId(locateFatherId);
					if(locateNode.getId()>locateId) {
						toLocateAdvance.setExtendFlag(1);
					}else {
						toLocateAdvance.setExtendFlag(0);
					}
					List<CmContentFinal> locateFatherList = findToLocateFatherByCondition(toLocateAdvance);
					if(locateFatherList!=null&&locateFatherList.size()==1) {
						//找到唯一的父亲
						System.out.println("方案2：唯一的父亲--------------------------------------------------------");
						System.out.println(locateNode.getId()+" "+locateNode.getMemberName()+": "+locateNode.getMemberRel()+
								" 父亲id："+locateFatherList.get(0).getId()+" 父亲名："+locateFatherList.get(0).getMemberName());
					
						//条件满足 添加该成员的节点关系
						CmRelation cmRelation = new CmRelation();
						cmRelation.setBookId(locateNode.getBookId());
						cmRelation.setMaId(locateNode.getId());
						cmRelation.setMbId(locateFatherList.get(0).getId());
						cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
						cmRelationService.addTwoNodesConnection(cmRelation);
					}
				}
				
			}else {
				//未找到
				System.out.println("未找到--------------------------------------------------------");
				System.out.println(locateNode.getId()+" "+locateNode.getMemberName()+": "+locateNode.getMemberRel());
				num++;
			}
		}
		System.out.println("num: "+num);
		System.out.println("num1: "+num1);
	}

	@Override
	public List<CmContentFinal> findFatherListByCondition(CmContentFinal record) {
		//查主节点
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andMemberNameEqualTo(record.getMemberName());
		criteria.andContentTypeEqualTo(1);
//		criteria.andMemberNamePinyinEqualTo(record.getMemberNamePinyin());
		criteria.andGenerationNumEqualTo(record.getGenerationNum());
		criteria.andSubClanIdEqualTo(record.getSubClanId());
//		String memberDetail = record.getMemberDetail();
//		memberDetail = ZhConverterUtil.convertToTraditional(memberDetail);
//		criteria.andMemberDetailLike("%"+memberDetail+"%");
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findToLocateByCondition(CmContentFinal record) {
		//查主节点
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andMemberNameEqualTo(record.getMemberName());
		criteria.andContentTypeEqualTo(1);
		List<Integer> toLocatedList = new ArrayList<>();
		toLocatedList.add(4);
		toLocatedList.add(5);
		criteria.andToLocateIn(toLocatedList);
		criteria.andRelFlagEqualTo(1);
		String memberDetail = "出繼"+record.getFatherName();
		memberDetail = ZhConverterUtil.convertToTraditional(memberDetail);
		criteria.andMemberDetailLike("%"+memberDetail+"%");
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findToLocateFatherByCondition(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andMemberNameEqualTo(record.getMemberName());
		if(record.getExtendFlag()==1) {
			criteria.andIdGreaterThan(record.getId());
		}else {
			criteria.andIdLessThan(record.getId());
		}
		criteria.andSubClanIdEqualTo(record.getSubClanId());
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findRelatedNodeByLookUp(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,id desc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andRelFlagEqualTo(1);
		criteria.andContentTypeEqualTo(1);
		criteria.andSubClanIdEqualTo(record.getSubClanId());
		criteria.andIdLessThan(record.getId());
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findRelatedNodeByLookDown(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,id asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andRelFlagEqualTo(1);
		criteria.andSubClanIdEqualTo(record.getSubClanId());
		criteria.andIdGreaterThan(record.getId());
		return mapper.selectByExample(example);
	}

	@Override
	public void setRelationInArea(CmContentFinalExtends record) {
		//先找未挂载成员列表
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andSpouseNameIsNull();
		criteria.andRelFlagEqualTo(0);
		List<CmContentFinal> unrelatedMemberList = mapper.selectByExample(example);
		System.out.println("未挂载总数："+unrelatedMemberList.size());
		int num1=1;
		int num2=1;
		for(CmContentFinal unrelatedMember:unrelatedMemberList) {
			Integer upId = 0;
			Integer downId = 0;
			CmContentFinal condition = new CmContentFinal();
			condition.setBookId(unrelatedMember.getBookId());
			condition.setSubClanId(unrelatedMember.getSubClanId());
			condition.setId(unrelatedMember.getId());
			int pageNum = 0;
			int count = 1;
			//1 分页找前一个
			PageHelper.offsetPage(pageNum*count,count);
			List<CmContentFinal> upNodeList = findRelatedNodeByLookUp(condition);
			if(upNodeList!=null&&upNodeList.size()==1) {
				CmContentFinal upNode = upNodeList.get(0);
				upId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, upNode.getId());
				
			}
			
			//2 分页找后一个
			PageHelper.offsetPage(pageNum*count,count);
			List<CmContentFinal> downNodeList = findRelatedNodeByLookDown(condition);
			if(downNodeList!=null&&downNodeList.size()==1) {
				CmContentFinal downNode = downNodeList.get(0);
				downId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, downNode.getId());
			}
			
			CmContentFinalExtends conditionArea = new CmContentFinalExtends();
			conditionArea.setBookId(unrelatedMember.getBookId());
			conditionArea.setSubClanId(unrelatedMember.getSubClanId());
			conditionArea.setUpId(upId);
			conditionArea.setDownId(downId);
			conditionArea.setMemberName(unrelatedMember.getFatherName());
			List<CmContentFinal> fatherList = findRelatedNodeByArea(conditionArea);
			if(fatherList!=null&&fatherList.size()==1) {
				System.out.println("编号："+num1);
				System.out.println("区间找到符合条件人员id："+unrelatedMember.getId()+" "+unrelatedMember.getMemberName()+" 关系："+unrelatedMember.getMemberRel()+
						" 父亲id:"+fatherList.get(0).getId()+" 父亲名:"+fatherList.get(0).getMemberName());
				//条件满足 添加该成员的节点关系
				CmRelation cmRelation = new CmRelation();
				cmRelation.setBookId(unrelatedMember.getBookId());
				cmRelation.setMaId(unrelatedMember.getId());
				cmRelation.setMbId(fatherList.get(0).getId());
				cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
				cmRelationService.addTwoNodesConnection(cmRelation);
//				num1++;
			}else {
//				num2++;
			}
		}
//		System.out.println("区间找到符合条件人员总数："+num1);
//		System.out.println("未找到总数："+num2);
		
	}

	@Override
	public List<CmContentFinal> findRelatedNodeByArea(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,id asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andMemberNameEqualTo(record.getMemberName());
		criteria.andSubClanIdEqualTo(record.getSubClanId());
		criteria.andIdGreaterThan(record.getUpId());
		criteria.andIdLessThan(record.getDownId());
		return mapper.selectByExample(example);
	}

	@Override
	public void setRelationByForceScan(CmContentFinalExtends record) {
		//先找未挂载成员列表
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andSpouseNameIsNull();
		criteria.andRelFlagEqualTo(0);
		List<CmContentFinal> unrelatedMemberList = mapper.selectByExample(example);
		System.out.println("未挂载总数："+unrelatedMemberList.size());
		for(CmContentFinal unrelatedMember:unrelatedMemberList) {
			CmContentFinal condition = new CmContentFinal();
			condition.setBookId(unrelatedMember.getBookId());
			condition.setSubClanId(unrelatedMember.getSubClanId());
			List<CmContentFinal> mainNodeList = findMainNodeInNotAllHangUp(condition);
			if(mainNodeList!=null&&mainNodeList.size()>0) {
				//条件满足 添加该成员的节点关系
				CmRelation cmRelation = new CmRelation();
				cmRelation.setBookId(unrelatedMember.getBookId());
				cmRelation.setMaId(unrelatedMember.getId());
				cmRelation.setMbId(mainNodeList.get(0).getId());
				cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
				cmRelationService.addTwoNodesConnection(cmRelation);
			}
		}
	}

	@Override
	public List<CmContentFinal> findMainNodeInNotAllHangUp(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("volume_id asc,id asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andSubClanIdEqualTo(record.getSubClanId());
		criteria.andSonNumDiffGreaterThan(0);
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinalExtends> packageCmContentFinal(RequestEntityForCmContentFinal requestEntity,List<CmContentFinal> cmContentFinalList) {
		List<CmContentFinalExtends> cmExtendsList = new ArrayList<>();
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			Integer fatherId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, cmContentFinal.getId());
			if(fatherId!=null) {
				//兄弟数量如果不等于父亲的儿子数量
//				CmContentFinal fatherInfo = get(fatherId);
//				if(fatherInfo!=null) {
//					if(requestEntity.getBrotherNum()!=null&&requestEntity.getBrotherNum()>0&&fatherInfo.getSonNum()!=requestEntity.getBrotherNum()) {
//						continue;
//					}
//				}
				cmContentFinalExtends.setFatherId(fatherId);
			}
			
			//封装配偶信息
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
//			Boolean containFlag = false;
//			for(PersonInfo spouseInfo:spouseNodeList) {
//				String spouseName = spouseInfo.getName();
//				if(spouseName!=null&&spouseName.indexOf(requestEntity.getSpouseName())>=0) {
//					containFlag = true;
//					break;
//				}
//			}
//			if(!containFlag) {
//				continue;
//			}
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmExtendsList.add(cmContentFinalExtends);
		}
		return cmExtendsList;
	}

	@Override
	public List<CmContentFinal> findAncestorListBy(Integer id, Integer num) {
		Integer fatherId = id;
		List<CmContentFinal> cmList = new ArrayList<>();
		for(int i=0;i<num;i++) {
			Integer ancestorId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, fatherId);
			if(ancestorId!=null&&ancestorId>0) {
				CmContentFinal cmContentFinal = get(ancestorId);
				cmList.add(cmContentFinal);
				fatherId = ancestorId;
			}else {
				break;
			}
		}
		return cmList;
	}

	@Override
	public Long findSpouseRelationListNumInBook(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record!=null) {
//			criteria.andRelFlagEqualTo(0);
			//根据书id查
			if(record.getBookId()!=null) {
				criteria.andBookIdEqualTo(record.getBookId());
			}
			criteria.andContentTypeEqualTo(1);
			criteria.andSpouseNameIsNotNull();
		}

		return mapper.countByExample(example);
	}

	@Override
	public Long findMainRelationListNumInBook(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record!=null) {
//			criteria.andRelFlagEqualTo(0);
			//根据书id查
			if(record.getBookId()!=null) {
				criteria.andBookIdEqualTo(record.getBookId());
			}
			//根据词条类型查
			if(record.getContentType()!=null) {
				criteria.andContentTypeEqualTo(record.getContentType());
			}
			criteria.andFatherNameIsNotNull();
			if(record.getStartGeneration()!=null&record.getEndGeneration()!=null){
				criteria.andGenerationNumBetween(record.getStartGeneration(), record.getEndGeneration());
			}
		}

		return mapper.countByExample(example);
	}

	@Override
	public List<CmContentFinal> findSpouseCmContentFinalListByCondition(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record!=null) {
//			criteria.andContentTypeEqualTo(1);
//			criteria.andRelFlagEqualTo(0);
			criteria.andSpouseNameIsNotNull();
			//根据书id查
			if(record.getBookId()!=null) {
				criteria.andBookIdEqualTo(record.getBookId());
			}
			//根据卷id查
			if(record.getVolumeId()!=null) {
				criteria.andVolumeIdEqualTo(record.getVolumeId());
			}
			//根据世代查
			if(record.getGenerationNum()!=null) {
				criteria.andGenerationNumEqualTo(record.getGenerationNum());
			}
			//根据成员名查
			if(record.getMemberName()!=null) {
				criteria.andMemberNameEqualTo(record.getMemberName());
			}
			//根据词条类型查
			if(record.getContentType()!=null) {
				criteria.andContentTypeEqualTo(record.getContentType());
			}
		}

		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findMainCmContentFinalListByCondition(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record!=null) {
//			criteria.andContentTypeEqualTo(1);
//			criteria.andRelFlagEqualTo(0);
			criteria.andFatherNameIsNotNull();
			//根据书id查
			if(record.getBookId()!=null) {
				criteria.andBookIdEqualTo(record.getBookId());
			}
			//根据卷id查
			if(record.getVolumeId()!=null) {
				criteria.andVolumeIdEqualTo(record.getVolumeId());
			}
			//根据世代查
			if(record.getGenerationNum()!=null) {
				criteria.andGenerationNumEqualTo(record.getGenerationNum());
			}
			//根据成员名查
			if(record.getMemberName()!=null) {
				criteria.andMemberNameEqualTo(record.getMemberName());
			}
			//根据词条类型查
			if(record.getContentType()!=null) {
				criteria.andContentTypeEqualTo(record.getContentType());
			}
			//查询世代区间的未挂载的成员
			if(record.getStartGeneration()!=null&record.getEndGeneration()!=null){
				criteria.andGenerationNumBetween(record.getStartGeneration(), record.getEndGeneration());
			}
		}

		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findMainNodeForSpouse(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("id desc");
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andIdLessThan(record.getId());
		criteria.andContentTypeEqualTo(1);
		criteria.andSpouseNameIsNull();
		return mapper.selectByExample(example);
	}

	@Override
	public void copyData() {
		
	}

	@Override
	public CmContentFinal findLastGenerationByLastOne(CmContentFinal record) {
		CmContentFinal condition = new CmContentFinal();
		condition.setBookId(record.getBookId());
		int pageNum = 0;
		int count = 1;
		//1 分页找前一个
		PageHelper.offsetPage(pageNum*count,count);
		List<CmContentFinal> upNodeList = findCmContentFinalListInGenerationDescOrder(condition);
		if(upNodeList!=null&&upNodeList.size()==1) {
			return upNodeList.get(0);
			
		}
		return null;
	}

	@Override
	public List<CmContentFinal> findCmContentFinalListInGenerationDescOrder(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("generation_num desc");
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andFatherNameIsNotNull();
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinalExtends> findCmContentFinalLinkBySomeOne(CmContentFinal record) {
		List<CmContentFinal> cmContentFinalList = new ArrayList<>();
		if(record!=null) {
			Integer someOneId = record.getId();
			cmContentFinalList.add(get(someOneId));
			while(someOneId!=null) {
				Integer fatherId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, someOneId);
				if(fatherId!=null) {
					cmContentFinalList.add(get(fatherId));
				}
				someOneId = fatherId;
			}
		}
		
		List<CmContentFinalExtends> cmExtendsList = new ArrayList<>();
		if(cmContentFinalList!=null&&cmContentFinalList.size()>0) {
			for(int i=cmContentFinalList.size()-1;i>=0;i--) {
				CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
				BeanUtils.copyProperties(cmContentFinalList.get(i), cmContentFinalExtends);
				List<PersonInfo> subNodeList = cmRelationService.findSubNodeListByParentId(cmContentFinalList.get(i).getId());
				List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinalList.get(i).getId());
				PersonInfo parentNode = cmRelationService.findParentNodeByMainId(cmContentFinalList.get(i).getId());
				cmContentFinalExtends.setParentNode(parentNode);
				cmContentFinalExtends.setSubNodeList(subNodeList);
				cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
				cmExtendsList.add(cmContentFinalExtends);
			}
		}
		return cmExtendsList;
	}

	@Override
	public List<CmContentFinal> findMainNodeListByGenerationNum(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("id desc");
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andGenerationNumEqualTo(record.getGenerationNum());
		criteria.andFatherNameIsNotNull();
		criteria.andSonNumGreaterThan(0);
		return mapper.selectByExample(example);
	}

	@Override
	public List<CmContentFinal> findSpouseNodeListByGenerationNum(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("id desc");
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andGenerationNumEqualTo(record.getGenerationNum());
		criteria.andSpouseNameIsNotNull();
		return mapper.selectByExample(example);
	}

	@Override
	public Integer findLastGenerationNumByLastOne(CmContentFinal record) {
		CmContentFinal condition = new CmContentFinal();
		condition.setBookId(record.getBookId());
		int pageNum = 0;
		int count = 1;
		//1 分页找前一个
		PageHelper.offsetPage(pageNum*count,count);
		List<CmContentFinal> upNodeList = findCmContentFinalListInGenerationDescOrder(condition);
		if(upNodeList!=null&&upNodeList.size()==1) {
			return upNodeList.get(0).getGenerationNum();
			
		}
		return null;
	}

	@Override
	public void setSubClanInfoForClan(CmContentFinalExtends record) {
//		ClanBook clanBook = clanBookService.get(record.getBookId());
//		CmContentFinal ancestor = get(clanBook.getBookAncestorId());
//		if(ancestor==null) {
//			return;
//		}
//		SubClanInfo subClanInfoAncestor = new SubClanInfo();
//		subClanInfoAncestor.setCmId(ancestor.getId());//成员id
//		subClanInfoAncestor.setLevelType(0);
//		subClanInfoAncestor.setBookId(ancestor.getBookId());
//		subClanInfoAncestor.setVolumeId(ancestor.getVolumeId());
//		subClanInfoAncestor.setSubClanName(ancestor.getMemberName());//成员名
//		subClanInfoAncestor.setGenerationNum(ancestor.getGenerationNum());
//		subClanInfoService.add(subClanInfoAncestor);
//		String subClanSetting = clanBook.getSubClanSetting();
//		if(subClanSetting==null) {
//			return;
//		}
//		String[] levelStr = subClanSetting.split(";");
//		Integer firstLevel = Integer.valueOf(levelStr[0]);//第一级世代数
//		Integer secondLevel = Integer.valueOf(levelStr[1]);//第二级世代数
//		Integer thirdLevel = Integer.valueOf(levelStr[2]);//第三级世代数
//		Integer interval = Integer.valueOf(levelStr[3]);//世代间隔
//		Integer lastGenerationNum = findLastGenerationNumByLastOne(record); //该老谱最后一代人的世代
//		
//		List<Integer> levelList = new ArrayList<>();
//		levelList.add(firstLevel);
//		levelList.add(secondLevel);
//		levelList.add(thirdLevel);
//		Integer fourthLevel=thirdLevel+interval;
//		while(fourthLevel<lastGenerationNum) {
//			levelList.add(fourthLevel);
//			fourthLevel+=interval;
//		}
//		
//		int levelType=1;//等级类型
//		for(Integer generationNum:levelList) {
//			//查该世代的所有主成员出来，保存
//			record.setGenerationNum(generationNum);
//			List<CmContentFinal> mainNodeList = findMainNodeListByGenerationNum(record);
//			for(CmContentFinal mainNode:mainNodeList) {
//				SubClanInfo subClanInfo = new SubClanInfo();
//				subClanInfo.setCmId(mainNode.getId());//成员id
//				subClanInfo.setLevelType(levelType);
//				subClanInfo.setBookId(mainNode.getBookId());
//				subClanInfo.setVolumeId(mainNode.getVolumeId());
//				subClanInfo.setGenerationNum(mainNode.getGenerationNum());
//				subClanInfo.setSubClanName(mainNode.getMemberName());//成员名
//				subClanInfoService.add(subClanInfo);
//			}
//			levelType++;
//		}
	}

	

	@Override
	public void setSubClanIdForAllClanMember(CmContentFinalExtends record) {
//		//读取配置
//		ClanBook clanBook = clanBookService.get(record.getBookId());
//		CmContentFinal ancestor = get(clanBook.getBookAncestorId());
//		if(ancestor==null) {
//			return;
//		}
//		SubClanInfo ancestorSubClan = subClanInfoService.findSubClanInfoByCmId(ancestor.getId(),ancestor.getBookId(),1);
//		if(ancestorSubClan==null) {
//			return;
//		}
//		String subClanSetting = clanBook.getSubClanSetting();
//		if(subClanSetting==null) {
//			return;
//		}
//		String[] levelStr = subClanSetting.split(";");
//		Integer firstLevel = Integer.valueOf(levelStr[0]);//第一级世代数
//		Integer secondLevel = Integer.valueOf(levelStr[1]);//第二级世代数
//		Integer thirdLevel = Integer.valueOf(levelStr[2]);//第三级世代数
//		Integer interval = Integer.valueOf(levelStr[3]);//世代间隔
//		
//		//先处理系对应的世代及之前的所有人的分支id都为始祖的分支id
//		record.setGenerationNum(firstLevel);
//		List<CmContentFinal> firstlevelList = findCmContentFinalListBeforeSomeGeneration(record);
//		updateCmContentFinalListAtSubClanId(firstlevelList,ancestorSubClan.getId());
//		
//		Integer lastGenerationNum = findLastGenerationNumByLastOne(record); //该老谱最后一代人的世代
//		List<Integer> levelList = new ArrayList<>();
//		levelList.add(firstLevel);
//		levelList.add(secondLevel);
//		levelList.add(thirdLevel);
//		Integer fourthLevel=thirdLevel+interval;
//		while(fourthLevel<lastGenerationNum) {
//			levelList.add(fourthLevel);
//			fourthLevel+=interval;
//		}
//		//然后查出分支列表中大于0的也就是系开始的分支，对这些分支及分支下的几层节点进行设置分支id，需要几层都看其代差有多少
//		int level=1;
//		Integer diff=0;
//		//按世代来查询分支列表
//		for(Integer generationNum:levelList) {
//			if(level>levelList.size()-1) {
//				diff = lastGenerationNum - generationNum;
//			}else {
//				diff = levelList.get(level) - generationNum;
//			}
//			//查该世代的所有主成员出来，保存
//			record.setGenerationNum(generationNum);
//			List<SubClanInfo> subClanInfoList = subClanInfoService.findSubClanInfoListByGeneration(record.getBookId(),generationNum,1);
//			for(SubClanInfo subClanInfo:subClanInfoList) {
//				//以每一级为头结点查找其下几代人的数据，并将其subclanId设置为该头结点的id
//				List<Integer> idList = findMemberIdlistByHeadId(subClanInfo.getCmId(),diff);
//				for(Integer id:idList) {
//					CmContentFinal newCM = new CmContentFinal();
//					newCM.setId(id);
//					newCM.setSubClanId(subClanInfo.getId());
//					update(newCM);
//				}
//			}
//			level++;
//		}
	}

	@Override
	public void updateCmContentFinalListAtSubClanId(List<CmContentFinal> cmlist, Integer subClanId) {
		for(CmContentFinal cmContentFinal:cmlist){
			CmContentFinal newCM = new CmContentFinal();
			newCM.setId(cmContentFinal.getId());
			newCM.setSubClanId(subClanId);
			update(newCM);
		}
		
	}

	@Override
	public List<CmContentFinal> findCmContentFinalListBeforeSomeGeneration(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andContentTypeEqualTo(1);
		criteria.andGenerationNumLessThanOrEqualTo(record.getGenerationNum());
		return mapper.selectByExample(example);
	}

	@Override
	public void copyCmContentToFinalContinue(CmContentFinal record) {
		//将原文表中的数据复制一份到老谱终表，
        //查询出原文表该卷的记录
        CmContent cmContent = new CmContent();
        cmContent.setBookId(record.getBookId());
        cmContent.setVolumeId(record.getVolumeId());
        List<CmContent> originalContentList = cmContentService.findCmContentListByCondition(cmContent);
        //复制原文表数据，解析原文中的内容字段和关系字段，
        //根据书id查出姓氏
        ClanBook clanBook = clanBookService.get(record.getBookId());
        addCmContentFinalListForContinue(clanBook.getSurname(),originalContentList);
        clanBook.setDealFlag(1);
        clanBookService.update(clanBook);
	}

	@Override
	public void addCmContentFinalListForContinue(String surname, List<CmContent> cmContentList) {
		//成员的从属编码
		Integer subClanId = -2;
//		Integer generationNum = 0;
		for(CmContent cmContent:cmContentList) {
			CmContentFinal cmContentFinal = new CmContentFinal();
			cmContentFinal.setCmContentId(cmContent.getId());
			String memberRel = cmContent.getMemberRel();
			String memberName = cmContent.getMemberName();
			String memberDetail = cmContent.getMemberDetail();
			cmContentFinal.setBookId(cmContent.getBookId());
			cmContentFinal.setVolumeId(cmContent.getVolumeId());
			cmContentFinal.setOrderNo(cmContent.getOrderNo());
			cmContentFinal.setRelFlag(0);
			cmContentFinal.setExtendFlag(0);
			cmContentFinal.setStatus(0);
			//解析
			if(StringUtils.isEmpty(memberRel) && StringUtils.isEmpty(memberName)){
            	if(StringUtils.isNotEmpty(memberDetail)){
            		cmContentFinal.setMemberDetail(memberDetail);
            		String detail = ZhConverterUtil.convertToSimple(memberDetail);
            		try{
            			if(detail.endsWith("支")) {
            				String subClanName = null;
            				if(detail.indexOf("裔")>0) {
            					subClanName = detail.substring(detail.indexOf("裔")+1, detail.indexOf("支"));
            				}else if(detail.indexOf("房")>0) {
            					subClanName = detail.substring(detail.indexOf("房")+1, detail.indexOf("支"));
            				}
            				//根据分支名查分支表得到id
        					SubClanInfo subClanInfo = subClanInfoService.findSubClanInfoBySubClanName(subClanName,cmContentFinal.getBookId(),0);
        					if(subClanInfo!=null) {
        						subClanId = subClanInfo.getId();
        					}else {
        						subClanId = -2;
        					}
                			cmContentFinal.setContentType(3);
                		}else {
                			cmContentFinal.setContentType(4);
                		}
            		} catch (Exception e) {
    					e.printStackTrace();
    				}
            		add(cmContentFinal);
            		continue;
            	}
            }
			cmContentFinal.setSubClanId(subClanId);
			cmContentFinal.setContentType(1);
			cmContentFinal.setGenerationNum(cmContent.getGenerationNum());
			cmContentFinal.setMemberSurname(surname);
			if(StringUtils.isNotBlank(memberName)){
            	cmContentFinal.setMemberName(memberName);
            	try {
					String memberNamePY = PinyinHelper.convertToPinyinString(memberName, "", PinyinFormat.WITHOUT_TONE);
					cmContentFinal.setMemberNamePinyin(memberNamePY);
            	} catch (PinyinException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }else{
            	cmContentFinal.setMemberName("失考");
            }
			//解析关系
            if(StringUtils.isNotBlank(memberRel)){
            	cmContentFinal.setMemberRel(memberRel);
            	if(cmContent.getHusband()!=null){
            		cmContentFinal.setMemberRel(cmContent.getHusband()+memberRel);
            	}
            	try {
					parsingRel(cmContentFinal);
					//解析完关系再还原
					cmContentFinal.setMemberRel(memberRel);
				} catch (PinyinException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            }else{
            	cmContentFinal.setMemberRel("失考");
            }
            //解析词条内容
            if(memberDetail!=null){
            	cmContentFinal.setMemberDetail(memberDetail);
            	try {
//		            		parsingDel(cmContentFinal);
            		//只解析字和号
//		            		parsingDelSpecial(cmContentFinal);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }else{
            	cmContentFinal.setMemberDetail("失考");
            }
			add(cmContentFinal);
		}
	}

	@Override
	public void setExistFlagForCM(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andVolumeIdEqualTo(record.getVolumeId());
		criteria.andContentTypeEqualTo(1);
		criteria.andMemberDetailLike("%"+"已録"+"%");
		List<CmContentFinal> cmList = mapper.selectByExample(example);
		for(CmContentFinal cmContentFinal:cmList) {
			CmContentFinal newContentFinal = new CmContentFinal();
			newContentFinal.setId(cmContentFinal.getId());
			newContentFinal.setAlreadyExist(1);
			update(newContentFinal);
		}
	}

	@Override
	public void setAncestorForSubClanId(CmContentFinalExtends record) {
		ClanBook clanBook = clanBookService.get(record.getBookId());
		CmContentFinal ancestor = get(clanBook.getBookAncestorId());
		if(ancestor==null) {
			return;
		}
		SubClanInfo subClanInfoAncestor = new SubClanInfo();
		subClanInfoAncestor.setCmId(ancestor.getId());//成员id
		subClanInfoAncestor.setLevelType(0);
		subClanInfoAncestor.setBookId(ancestor.getBookId());
		subClanInfoAncestor.setVolumeId(ancestor.getVolumeId());
		subClanInfoAncestor.setSubClanName(ancestor.getMemberName());//成员名
		subClanInfoAncestor.setGenerationNum(ancestor.getGenerationNum());
		subClanInfoAncestor.setOrderNo(ancestor.getOrderNo());
		subClanInfoAncestor.setStartGeneration(record.getStartGeneration());
		subClanInfoAncestor.setEndGeneration(record.getEndGeneration());
		subClanInfoAncestor.setSubClanType(1);//新分支
//		subClanInfoAncestor.setParentId(0);
		subClanInfoService.add(subClanInfoAncestor);
		
		//以每一级为头结点查找其下几代人的数据，并将其subclanId设置为该头结点的id
		Integer diff = record.getEndGeneration() - record.getStartGeneration();
		List<Integer> idList = findMemberIdlistByHeadId(ancestor.getId(),diff);
		for(Integer id:idList) {
			CmContentFinal newCM = new CmContentFinal();
			newCM.setId(id);
			newCM.setSubClanId(subClanInfoAncestor.getId());
			update(newCM);
		}
	}

	@Override
	public void setXiForSubClanId(CmContentFinalExtends record) {
		// 先找出该世代的人，然后查其节点下是否有子节点，如果有则设为系，没有则不设为系
		List<CmContentFinal> mainNodeList = findMainNodeListByGenerationNum(record);
		for(CmContentFinal mainNode:mainNodeList) {
			//查其节点下是否有子节点
			Long countNum = cmRelationService.countMaIdListNumByMbIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, mainNode.getId());
			if(countNum!=null&&countNum>0) {
				//设置该分支
				SubClanInfo subClanInfo = new SubClanInfo();
				subClanInfo.setCmId(mainNode.getId());//成员id
				subClanInfo.setLevelType(1);
				subClanInfo.setBookId(mainNode.getBookId());
				subClanInfo.setVolumeId(mainNode.getVolumeId());
				subClanInfo.setSubClanName(mainNode.getMemberName());//成员名
				subClanInfo.setGenerationNum(mainNode.getGenerationNum());
				subClanInfo.setStartGeneration(record.getStartGeneration());
				subClanInfo.setEndGeneration(record.getEndGeneration());
				subClanInfo.setOrderNo(mainNode.getOrderNo());
				subClanInfo.setSubClanType(1);//新分支
				subClanInfoService.add(subClanInfo);
				Integer diff = record.getEndGeneration() - record.getStartGeneration();
				List<Integer> idList = findMemberIdlistByHeadId(mainNode.getId(), diff);
				for(Integer id:idList) {
					CmContentFinal newCM = new CmContentFinal();
					newCM.setId(id);
					newCM.setSubClanId(subClanInfo.getId());
					update(newCM);
				}
			}
		}
	}

	@Override
	public void setFangForSubClanId(CmContentFinalExtends record) {
		// 先找出该世代的人，
		List<CmContentFinal> mainNodeList = findMainNodeListByGenerationNum(record);
		Integer diff = record.getEndGeneration() - record.getStartGeneration();
		for(CmContentFinal mainNode:mainNodeList) {
			//查其节点下代差+1 是否有子节点 即 diff+1
			Boolean hasSubNode = findMemberByHeadId(mainNode.getId(),diff+1);
			if(hasSubNode) {
				//设置该分支
				SubClanInfo subClanInfo = new SubClanInfo();
				subClanInfo.setCmId(mainNode.getId());//成员id
				subClanInfo.setLevelType(2);
				subClanInfo.setBookId(mainNode.getBookId());
				subClanInfo.setVolumeId(mainNode.getVolumeId());
				subClanInfo.setSubClanName(mainNode.getMemberName());//成员名
				subClanInfo.setGenerationNum(mainNode.getGenerationNum());
				subClanInfo.setOrderNo(mainNode.getOrderNo());
				subClanInfo.setStartGeneration(record.getStartGeneration());
				subClanInfo.setEndGeneration(record.getEndGeneration());
				subClanInfo.setSubClanType(1);//新分支
				subClanInfoService.add(subClanInfo);
				
				List<Integer> idList = findMemberIdlistByHeadId(mainNode.getId(), diff);
				for(Integer id:idList) {
					CmContentFinal newCM = new CmContentFinal();
					newCM.setId(id);
					newCM.setSubClanId(subClanInfo.getId());
					update(newCM);
				}
			}
		}
	}

	@Override
	public void setYiForSubClanId(CmContentFinalExtends record) {
		// 先找出该世代的人，
		List<CmContentFinal> mainNodeList = findMainNodeListByGenerationNum(record);
		Integer generationArea = record.getEndGeneration() - record.getGenerationNum();
		Integer generationDiff = record.getStartGeneration() - record.getGenerationNum();
		for(CmContentFinal mainNode:mainNodeList) {
			//查其节点下 某个世代区间的开始区间只要有子节点就可以
			Boolean hasSubNode = findMemberByHeadId(mainNode.getId(),generationDiff);
			if(hasSubNode) {
				//设置该分支
				SubClanInfo subClanInfo = new SubClanInfo();
				subClanInfo.setCmId(mainNode.getId());//成员id
				subClanInfo.setLevelType(record.getNum()+2);
				subClanInfo.setBookId(mainNode.getBookId());
				subClanInfo.setVolumeId(mainNode.getVolumeId());
				subClanInfo.setSubClanName(mainNode.getMemberName());//成员名
				subClanInfo.setGenerationNum(mainNode.getGenerationNum());
				subClanInfo.setOrderNo(mainNode.getOrderNo());
				subClanInfo.setStartGeneration(record.getStartGeneration());
				subClanInfo.setEndGeneration(record.getEndGeneration());
				subClanInfo.setSubClanType(1);//新分支
				subClanInfoService.add(subClanInfo);
				
				List<Integer> memberIdList = findMemberIdlistByHeadId(mainNode.getId(), generationArea);
				
				CmContentFinalExample example = new CmContentFinalExample();
				example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
				Criteria criteria = example.createCriteria();
				criteria.andBookIdEqualTo(record.getBookId()).andGenerationNumIsNotNull().andIdIn(memberIdList);
				List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
				
				for(CmContentFinal cmContentFinal:cmContentFinalList) {
					if(cmContentFinal.getGenerationNum()>=record.getStartGeneration()
							&&cmContentFinal.getGenerationNum()<=record.getEndGeneration())
					{
						CmContentFinal newCM = new CmContentFinal();
						newCM.setId(cmContentFinal.getId());
						newCM.setSubClanId(subClanInfo.getId());
						update(newCM);
					}
				}
			}
		}
		
	}

	@Override
	public void updateParentIdForSubClanInfo(CmContentFinalExtends record) {
		//读取配置
		ClanBook clanBook = clanBookService.get(record.getBookId());
		CmContentFinal ancestor = get(clanBook.getBookAncestorId());
		if(ancestor==null) {
			return;
		}
		SubClanInfo ancestorSubClan = subClanInfoService.findSubClanInfoByCmId(ancestor.getId(),ancestor.getBookId(),1);
		if(ancestorSubClan==null) {
			return;
		}
		List<SubClanInfo> subClanInfoList = subClanInfoService.findSubClanInfoListByBookId(record.getBookId(),1);
		for(SubClanInfo subClanInfo:subClanInfoList) {
			Integer levelType = subClanInfo.getLevelType();
			Integer diff=0;
			if(levelType==0) {
				subClanInfo.setParentId(-1);
				subClanInfoService.update(subClanInfo);
			}else if(levelType==1) {
				subClanInfo.setParentId(ancestorSubClan.getId());
				subClanInfoService.update(subClanInfo);
			}else if(levelType==2) {
				//利用代差循环找上级的id
				diff = subClanInfoService.getGenerationNumFrom(record.getBookId(),2) - subClanInfoService.getGenerationNumFrom(record.getBookId(),1);
			}else if(levelType==3) {
				//利用代差循环找上级的id
				diff = subClanInfoService.getGenerationNumFrom(record.getBookId(),3) - subClanInfoService.getGenerationNumFrom(record.getBookId(),2);
			}else if(levelType==4){
				//利用代差循环找上级的id
				diff = subClanInfoService.getGenerationNumFrom(record.getBookId(),4) - subClanInfoService.getGenerationNumFrom(record.getBookId(),3);
			}else if(levelType==5){
				//利用代差循环找上级的id
				diff = subClanInfoService.getGenerationNumFrom(record.getBookId(),5) - subClanInfoService.getGenerationNumFrom(record.getBookId(),4);
			}
			if(diff>0){
				Integer parentId=subClanInfo.getCmId();
				while(diff>0) {
					Integer fatherId = cmRelationService.findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, parentId);
					if(fatherId!=null) {
						parentId = fatherId;
					}else {
						parentId = fatherId;
						break;
					}
					diff--;
				}
				if(parentId!=null) {
					SubClanInfo subClan = subClanInfoService.findSubClanInfoByCmId(parentId,subClanInfo.getBookId(),1);
					if(subClan==null) {
						continue;
					}
					subClanInfo.setParentId(subClan.getId());
					subClanInfoService.update(subClanInfo);
				}
			}
		}
	}
	
	@Override
	public Boolean findMemberByHeadId(Integer headId, Integer num) {
		List<Integer> fatherIdList = new ArrayList<>();
		List<Integer> sonIdTempList = new ArrayList<>();
		fatherIdList.add(headId);
		for(int i=0;i<num;i++){
			List<Integer> sonIdList = new ArrayList<>();
			for(Integer fatherId:fatherIdList){
				//先找出所有子代
				sonIdTempList = cmRelationService.findMaIdListByMbIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,fatherId);
				sonIdList.addAll(sonIdTempList);
			}
			if(sonIdList==null||sonIdList.size()==0) {
				return false;
			}
			
			fatherIdList.clear();
			fatherIdList.addAll(sonIdList);	
			sonIdList.clear();
		}
		
		return true;
	}

	@Override
	public void setBrotherNumAndWifeListForCmContentToFinal(CmContentFinal record) {
		CmContentFinalExample example = new CmContentFinalExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andSpouseNameIsNull();
		criteria.andContentTypeEqualTo(1);
		List<CmContentFinal> cmContentList = mapper.selectByExample(example);
		System.out.println(cmContentList.size());
		for(CmContentFinal cmContent:cmContentList) {
			CmContentFinal temp = new CmContentFinal();
			Integer fatherId = cmRelationService.findMbIdByMaIdAndRelType(CommonConstant.RELATIONSHIP_CHILDFATHER,cmContent.getId());
			if(fatherId!=null&&fatherId>0) {
				CmContentFinal fatherInfo = get(fatherId);
				if(fatherInfo!=null) {
					temp.setBrotherNum(fatherInfo.getSonNum());
				}
			}
			
			String wifeList = "";
			List<PersonInfo> spouseList = cmRelationService.findSpouseNodeListByMainId(cmContent.getId());
			for(PersonInfo spouse:spouseList) {
				wifeList += (spouse.getName()+",");
			}
			if(StringUtils.isNotBlank(wifeList)) {
				temp.setWifeList(wifeList);
			}
			temp.setId(cmContent.getId());
			temp.setStatus(1);
			update(temp);
		}
	}

	@Override
	public void setSubClanIdForOldClan(CmContentFinal record) {
		//将原文表中的数据复制一份到老谱终表，
        //查询出原文表该卷的记录
		CmContentFinal condition = new CmContentFinal();
        condition.setBookId(record.getBookId());
        condition.setVolumeId(record.getVolumeId());
        List<CmContentFinal> originalContentList = findCmContentFinalListByCondition(condition);
        //计算世代
  		//成员的从属编码
  		Integer subClanId = -1;
  		for(CmContentFinal cmContent:originalContentList) {
  			String memberRel = cmContent.getMemberRel();
  			String memberName = cmContent.getMemberName();
  			String memberDetail = cmContent.getMemberDetail();
  			//解析世代
  			if(StringUtils.isEmpty(memberRel) && StringUtils.isEmpty(memberName)){
              	if(StringUtils.isNotEmpty(memberDetail)){
              		try{
              			if(memberDetail.indexOf("系下")>0) {//TODO：解析系房
                  			//先取到某系
                  			String department = memberDetail.substring(0, memberDetail.indexOf("系下"));
                  			//查该系是否已存在,如果不存在则进行添加
                  			SubClanInfo departmentInfo = subClanInfoService.findSubClanInfoBySubClanName(department,condition.getBookId(),0); 
                  			if(departmentInfo==null) {
                  				departmentInfo = new SubClanInfo();
                  				departmentInfo.setBookId(cmContent.getBookId());
                  				departmentInfo.setVolumeId(cmContent.getVolumeId());
                  				departmentInfo.setSubClanName(department);
                  				departmentInfo.setParentId(0);
                  				departmentInfo.setLevelType(1);
                  				departmentInfo.setSubClanType(0);
//                  				departmentInfo.setGenerationNum(generationNum);
//                  				departmentInfo.setCmId(cmContent.getId());
                  				departmentInfo.setLevelName("系下");
                  				subClanInfoService.add(departmentInfo);
                  			}
                  			subClanId = departmentInfo.getId();
                  			if(memberDetail.indexOf("房")>0) {
                  				//先取到某房
                      			String loculus = memberDetail.substring(memberDetail.indexOf("系下")+2, memberDetail.indexOf("房"));
                      			//查该房是否已存在,如果不存在则进行添加
                      			SubClanInfo loculusInfo = subClanInfoService.findSubClanInfoBySubClanName(loculus,condition.getBookId(),0); 
                      			if(loculusInfo==null) {
                      				loculusInfo = new SubClanInfo();
                      				loculusInfo.setBookId(cmContent.getBookId());
                      				loculusInfo.setVolumeId(cmContent.getVolumeId());
                      				loculusInfo.setSubClanName(loculus);
                      				loculusInfo.setLevelType(2);
                      				loculusInfo.setSubClanType(0);
                      				loculusInfo.setParentId(departmentInfo.getId());
                      				loculusInfo.setLevelName("房");
//                      				loculusInfo.setCmId(cmContent.getId());
                      				subClanInfoService.add(loculusInfo);
                      			}
                      			subClanId = loculusInfo.getId();
                  			}
                  		}
              		} catch (Exception e) {
      					e.printStackTrace();
      				}
              		continue;
              	}
            }
  			if(cmContent.getGenerationNum()!=null&&cmContent.getGenerationNum()>=5) {
  				CmContentFinal temp = new CmContentFinal();
  				temp.setId(cmContent.getId());
  				temp.setSubClanIdOrigin(subClanId);
  				update(temp);
  			}
  		}
	}

	@Override
	public void setSubClanIdForOldClanHeadFirst(CmContentFinal record) {
		Integer ancestoreId = clanBookService.get(record.getBookId()).getBookAncestorId();
		CmContentFinal ancestor = get(ancestoreId);
		SubClanInfo subClanInfo = new SubClanInfo();
		subClanInfo.setBookId(ancestor.getBookId());
		subClanInfo.setVolumeId(ancestor.getVolumeId());
		subClanInfo.setSubClanName(ancestor.getMemberName());
		subClanInfo.setLevelType(0);
		subClanInfo.setSubClanType(0);
		subClanInfo.setParentId(0);
		subClanInfo.setLevelName("始祖");
		subClanInfo.setGenerationNum(1);
		subClanInfo.setCmId(ancestoreId);
		subClanInfoService.add(subClanInfo);
		Integer subclanId = subClanInfo.getId();
		
		CmContentFinal condition = new CmContentFinal();
        condition.setBookId(record.getBookId());
        condition.setContentType(1);
        List<CmContentFinal> originalContentList = findCmContentFinalListByCondition(condition);
        for(CmContentFinal cmContentFinal:originalContentList) {
        	CmContentFinal temp = new CmContentFinal();
        	temp.setId(cmContentFinal.getId());
        	temp.setSubClanIdOrigin(subclanId);
        	update(temp);
        }
		
	}

	@Override
	public List<CmContentFinalExtends> findMemberListByHalfFuzzyName(CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		
		criteria.andMemberNameLike(record.getMemberName()+"%");
		criteria.andSpouseNameIsNull();
		if(record.getStartGeneration()!=null&&record.getEndGeneration()!=null) {
			criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration());
			criteria.andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		}
		
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		
		
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<>();
		
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			
			//封装配偶信息
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}

	@Override
	public void setThreeContentBy(List<CmContentFinal> cmContentFinalList) {
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			Integer cmId = cmContentFinal.getCmContentId();
			if(cmId!=null) {
				CmContent cmContent = cmContentService.get(cmId);
				CmContentFinal newCmContentFinal = new CmContentFinal();
				newCmContentFinal.setId(cmContentFinal.getId());
				newCmContentFinal.setMemberRelOriginal(cmContent.getMemberRel());
				newCmContentFinal.setMemberNameOriginal(cmContent.getMemberName());
				newCmContentFinal.setMemberDetailOriginal(cmContent.getMemberDetail());
				try {
					String memberDetail = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberDetail());
					if(StringUtils.isNotBlank(memberDetail)) {
						newCmContentFinal.setMemberDetail(memberDetail);
					}
				}catch(Exception e) {
				}
				try {
					String memberName = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberName());
					if(StringUtils.isNotBlank(memberName)) {
						newCmContentFinal.setMemberName(memberName);
					}
				}catch(Exception e) {
				}
				try {
					String memberRel = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberRel());
					if(StringUtils.isNotBlank(memberRel)) {
						newCmContentFinal.setMemberRel(memberRel);
					}
				}catch(Exception e) {
				}
				try {
					String fatherName = cmContentFinal.getFatherName();
					if(StringUtils.isNotBlank(fatherName)) {
						fatherName = ZhConverterUtil.convertToSimple(fatherName);
						newCmContentFinal.setFatherName(fatherName);
					}
				}catch(Exception e) {
				}
				try {
					String spouseName = cmContentFinal.getSpouseName();
					if(StringUtils.isNotBlank(spouseName)) {
						spouseName = ZhConverterUtil.convertToSimple(spouseName);
						newCmContentFinal.setSpouseName(spouseName);
					}
				}catch(Exception e) {
				}
				update(newCmContentFinal);
			}
		}
		
//		//繁体转简体
//		for(CmContentFinal cmContentFinal:cmContentFinalList) {
//			CmContentFinal newCmContentFinal = new CmContentFinal();
//			newCmContentFinal.setId(cmContentFinal.getId());
//			String memberDetail = null;
//			memberDetail = cmContentFinal.getMemberDetailNew();
//			String memberName = null;
//			memberName = cmContentFinal.getMemberNameNew();
//			String memberRel = null;
//			memberRel = cmContentFinal.getMemberRelNew();
//			
//			if(StringUtils.isNotBlank(memberDetail)) {
//				try {
//					memberDetail = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberDetailNew());
//				}catch(Exception e) {
//					memberDetail = cmContentFinal.getMemberDetailNew();
//				}
//				newCmContentFinal.setMemberDetailNew(memberDetail);
//				try {
//					update(newCmContentFinal);
//				}catch(Exception e) {
//				}
//			}
//			if(StringUtils.isNotBlank(memberName)) {
//				try {
//					memberName = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberNameNew());
//				}catch(Exception e) {
//					memberName = cmContentFinal.getMemberNameNew();
//				}
//				newCmContentFinal.setMemberNameNew(memberName);
//				try {
//					update(newCmContentFinal);
//				}catch(Exception e) {
//				}
//			}
//			if(StringUtils.isNotBlank(memberRel)) {
//				try {
//					memberRel = ZhConverterUtil.convertToSimple(cmContentFinal.getMemberRelNew());
//				}catch(Exception e) {
//					memberRel = cmContentFinal.getMemberRelNew();
//				}
//				newCmContentFinal.setMemberRelNew(memberRel);
//				try {
//					update(newCmContentFinal);
//				}catch(Exception e) {
//				}
//			}
//			
//		}
	}

	@Override
	public List<CmContentFinalExtends> findCmContentFinalListByHeadAndAssignGenerationNum(
			CmContentFinalExtends record) {
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		List<Integer> memberIdList = findMemberIdlistByHeadIdAndSpouseFlag(record.getHeadId(),record.getEndGeneration(),record.getHasSpouseFlag());
		criteria.andBookIdEqualTo(record.getBookId()).andGenerationNumIsNotNull().andIdIn(memberIdList);
		criteria.andDisplayFlagNotEqualTo(3);
		if(record.getStartGeneration()!=null) {
			criteria.andGenerationNumGreaterThanOrEqualTo(record.getStartGeneration());
		}
		if(record.getEndGeneration()!=null) {
			criteria.andGenerationNumLessThanOrEqualTo(record.getEndGeneration());
		}
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
		for(CmContentFinal cmContentFinal:cmContentFinalList){
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			List<PersonInfo> subNodeList = cmRelationService.findSubNodeListByParentId(cmContentFinal.getId());
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			PersonInfo parentNode = cmRelationService.findParentNodeByMainId(cmContentFinal.getId());
			PersonInfo mainNode = cmRelationService.findMainNodeBySpouseId(cmContentFinal.getId());
			cmContentFinalExtends.setMainNode(mainNode);
			cmContentFinalExtends.setParentNode(parentNode);
			cmContentFinalExtends.setSubNodeList(subNodeList);
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}

	@Override
	public List<CmContentFinalExtends> findAssignGenerationMemberListByHeadAndAssignGenerationNum(
			CmContentFinalExtends record) {
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
		CmContentFinalExample example = new CmContentFinalExample();
		example.setOrderByClause("generation_num asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		List<Integer> memberIdList = findMemberIdlistByHeadIdAndAssignGeneration(record.getHeadId(),record.getGenerationNum());
		criteria.andBookIdEqualTo(record.getBookId()).andGenerationNumIsNotNull();
		criteria.andGenerationNumEqualTo(record.getGenerationNum());
		if(memberIdList!=null&&memberIdList.size()>0) {
			criteria.andIdIn(memberIdList);
		}else {
			return cmContentFinalExtendsList;
		}
		List<CmContentFinal> cmContentFinalList = mapper.selectByExample(example);
		for(CmContentFinal cmContentFinal:cmContentFinalList){
			CmContentFinalExtends cmContentFinalExtends = new CmContentFinalExtends();
			BeanUtils.copyProperties(cmContentFinal, cmContentFinalExtends);
			List<PersonInfo> subNodeList = cmRelationService.findSubNodeListByParentId(cmContentFinal.getId());
			List<PersonInfo> spouseNodeList = cmRelationService.findSpouseNodeListByMainId(cmContentFinal.getId());
			PersonInfo parentNode = cmRelationService.findParentNodeByMainId(cmContentFinal.getId());
			PersonInfo mainNode = cmRelationService.findMainNodeBySpouseId(cmContentFinal.getId());
			cmContentFinalExtends.setMainNode(mainNode);
			cmContentFinalExtends.setParentNode(parentNode);
			cmContentFinalExtends.setSubNodeList(subNodeList);
			cmContentFinalExtends.setSpouseNodeList(spouseNodeList);
			cmContentFinalExtendsList.add(cmContentFinalExtends);
		}
		return cmContentFinalExtendsList;
	}
}
