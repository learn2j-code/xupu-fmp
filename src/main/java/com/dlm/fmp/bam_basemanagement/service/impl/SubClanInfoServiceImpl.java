package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.SubClanInfoService;
import com.dlm.fmp.bam_basemanagement.vo.SubClanInfoExtends;
import com.dlm.fmp.mapper.SubClanInfoMapper;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.SubClanInfo;
import com.dlm.fmp.pojo.SubClanInfoExample;
import com.dlm.fmp.pojo.SubClanInfoExample.Criteria;

@Service
public class SubClanInfoServiceImpl implements SubClanInfoService {
	@Autowired
	SubClanInfoMapper mapper;
	
	@Autowired
	CmContentFinalService cmContentFinalService;
	
	@Override
	public List<SubClanInfo> list() {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(SubClanInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(SubClanInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public SubClanInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SubClanInfo> findSubClanInfoListByBookId(int bookId, Integer subClanTyp) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("level_type asc,id asc");
		example.createCriteria().andBookIdEqualTo(bookId).andSubClanTypeEqualTo(subClanTyp);
		return mapper.selectByExample(example);
	}

	@Override
	public SubClanInfo findSubClanInfoBySubClanName(String subClanName, Integer bookId, Integer subClanTyp) {
		if(subClanName==null) {
			return null;
		}
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andSubClanNameEqualTo(subClanName).andBookIdEqualTo(bookId).andSubClanTypeEqualTo(subClanTyp);
		List<SubClanInfo> subClanInfoList = mapper.selectByExample(example);
		if(subClanInfoList!=null&&subClanInfoList.size()>0) {
			return subClanInfoList.get(0);
		}
		return null;
	}

	@Override
	public List<SubClanInfo> findSubClanInfoListByParentId(int parentId,int bookId, Integer subClanType) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andParentIdEqualTo(parentId).andBookIdEqualTo(bookId).andSubClanTypeEqualTo(subClanType);
		return mapper.selectByExample(example);
	}

	@Override
	public List<SubClanInfoExtends> findSubClanInfoListByBookIdAndParentId(int bookId,int parentId, Integer subClanType) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andBookIdEqualTo(bookId).andParentIdEqualTo(parentId).andSubClanTypeEqualTo(subClanType);
		List<SubClanInfo> subClanInfoList = mapper.selectByExample(example);
		List<SubClanInfoExtends> subClanInfoExtendsList = new ArrayList<SubClanInfoExtends>();
		for(SubClanInfo subClanInfo:subClanInfoList) {
			SubClanInfoExtends subClanInfoExtends = new SubClanInfoExtends();
			BeanUtils.copyProperties(subClanInfo, subClanInfoExtends);
//			String fullName = findFullNameById(subClanInfo.getId());
//			subClanInfoExtends.setFullName(fullName);
			subClanInfoExtendsList.add(subClanInfoExtends);
		}
		return subClanInfoExtendsList;
	}

	@Override
	public String findFullNameById(Integer id) {
		SubClanInfo subClanInfo = get(id);
		String fullName="";
		while(subClanInfo!=null&&subClanInfo.getParentId()!=null&&subClanInfo.getParentId()!=0) {
			fullName = subClanInfo.getSubClanName()+subClanInfo.getLevelName() +fullName;
			subClanInfo = get(subClanInfo.getParentId());
		}
		return fullName;
	}

	@Override
	public List<Integer> findSubClanInfoIdListByParentId(int parentId, int bookId, Integer subClanTyp) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andBookIdEqualTo(bookId).andParentIdEqualTo(parentId).andSubClanTypeEqualTo(subClanTyp);
		List<SubClanInfo> subClanInfoList = mapper.selectByExample(example);
		List<Integer> subClanInfoIdList = new ArrayList<>();
		for(SubClanInfo subClanInfo:subClanInfoList){
			subClanInfoIdList.add(subClanInfo.getId());
		}
		return subClanInfoIdList;
	}

	@Override
	public List<Integer> findAllSubClanInfoIdListByParentId(int parentId, int bookId, Integer subClanTyp) {
		List<Integer> allSubClanInfoIdList = new ArrayList<>();
		allSubClanInfoIdList.add(parentId);
		List<Integer> subClanInfoIdList = new ArrayList<>();
		subClanInfoIdList.add(parentId);
		while(subClanInfoIdList!=null&&!subClanInfoIdList.isEmpty()){
			List<Integer> subClanInfoTempIdList = new ArrayList<>();
			for(Integer subClanInfoId:subClanInfoIdList){
				List<Integer> idList = findSubClanInfoIdListByParentId(subClanInfoId, bookId, subClanTyp);
				subClanInfoTempIdList.addAll(idList);
			}
			subClanInfoIdList.clear();
			subClanInfoIdList.addAll(subClanInfoTempIdList);
			allSubClanInfoIdList.addAll(subClanInfoTempIdList);
		}
		return allSubClanInfoIdList;
	}

	@Override
	public SubClanInfo findSubClanInfoByCmId(int cmId, int bookId, Integer subClanTyp) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andBookIdEqualTo(bookId).andCmIdEqualTo(cmId).andSubClanTypeEqualTo(subClanTyp);
		List<SubClanInfo> subClanInfoList = mapper.selectByExample(example);
		if(subClanInfoList!=null&&subClanInfoList.size()==1) {
			return subClanInfoList.get(0);
		}
		return null;
	}

	@Override
	public List<SubClanInfo> findSubClanInfoListByGeneration(Integer bookId, Integer generationNum, Integer subClanTyp) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andBookIdEqualTo(bookId).andGenerationNumEqualTo(generationNum).andSubClanTypeEqualTo(subClanTyp);
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteByBookId(int bookId, Integer subClanTyp) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andBookIdEqualTo(bookId).andSubClanTypeEqualTo(subClanTyp);
		mapper.deleteByExample(example);
	}

	@Override
	public List<SubClanInfo> findSubClanInfoInCondition(SubClanInfo condition) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(condition.getBookId());
		if(condition.getExtendFlag()!=null) {
			criteria.andExtendFlagEqualTo(condition.getExtendFlag());
		}
		criteria.andSubClanTypeEqualTo(condition.getSubClanType());
		if(StringUtils.isNotBlank(condition.getSubClanName())) {
			criteria.andSubClanNameLike("%"+condition.getSubClanName()+"%");
		}
		return mapper.selectByExample(example);
	}

	@Override
	public List<SubClanInfoExtends> packageSubClanInfoExtendsBy(List<SubClanInfo> list) {
		List<SubClanInfoExtends> subClanInfoExtendsList = new ArrayList<SubClanInfoExtends>();
		for(SubClanInfo subClanInfo:list) {
			SubClanInfoExtends subClanInfoExtends = new SubClanInfoExtends();
			BeanUtils.copyProperties(subClanInfo, subClanInfoExtends);
			if(subClanInfo.getCmId()!=null) {
				CmContentFinal cmContentFinal = cmContentFinalService.get(subClanInfo.getCmId());
				if(cmContentFinal!=null) {
					subClanInfoExtends.setCmName(cmContentFinal.getMemberName());
				}
			}
			subClanInfoExtendsList.add(subClanInfoExtends);
		}
		return subClanInfoExtendsList;
	}

	@Override
	public List<SubClanInfo> findSubClanInfoListByFuzzyName(SubClanInfoExtends condition) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(condition.getBookId());
		criteria.andSubClanTypeEqualTo(1);
		if(StringUtils.isNotBlank(condition.getSubClanName())) {
			criteria.andSubClanNameLike(condition.getSubClanName()+"%");
		}
		if(condition.getStartGeneration()!=null&&condition.getEndGeneration()!=null) {
			criteria.andGenerationNumGreaterThanOrEqualTo(condition.getStartGeneration());
			criteria.andGenerationNumLessThanOrEqualTo(condition.getEndGeneration());
		}
		return mapper.selectByExample(example);
	}

	@Override
	public List<SubClanInfo> findSubClanInfoListByBookId(SubClanInfoExtends condition) {
		SubClanInfoExample example = new SubClanInfoExample();
		example.setOrderByClause("level_type asc,volume_id asc,order_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(condition.getBookId());
		criteria.andSubClanTypeEqualTo(1);
		if(condition.getStartGeneration()!=null&&condition.getEndGeneration()!=null) {
			criteria.andGenerationNumGreaterThanOrEqualTo(condition.getStartGeneration());
			criteria.andGenerationNumLessThanOrEqualTo(condition.getEndGeneration());
		}
		return mapper.selectByExample(example);
	}

	@Override
	public Integer getGenerationNumFrom(Integer bookId, Integer levelType) {
		SubClanInfoExample example = new SubClanInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(bookId);
		criteria.andSubClanTypeEqualTo(1);
		criteria.andLevelTypeEqualTo(levelType);
		List<SubClanInfo> list = mapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			return list.get(0).getGenerationNum();
		}
		return 0;
	}

}
