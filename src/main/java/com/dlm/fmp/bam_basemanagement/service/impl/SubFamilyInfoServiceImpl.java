package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.SubFamilyInfoService;
import com.dlm.fmp.constant.FamilyConstant;
import com.dlm.fmp.mapper.SubFamilyInfoMapper;
import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.SubFamilyInfo;
import com.dlm.fmp.pojo.SubFamilyInfoExample;

@Service
public class SubFamilyInfoServiceImpl implements SubFamilyInfoService {
	@Autowired
	SubFamilyInfoMapper mapper;
	
	@Autowired
	FamilyMemberService familyMemberService;

	@Override
	public List<SubFamilyInfo> list() {
		SubFamilyInfoExample example = new SubFamilyInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(SubFamilyInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(SubFamilyInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public SubFamilyInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void addSubFamilyInfo(SubFamilyInfo record) {
		add(record);	
		//获取record的subFamilyCode然后与id拼成新的subFamilyCode，更新保存，最后将该subFamilyCode更新到该分支下的所有成员上；
		String subFamilyCode = record.getSubFamilyCode()+"_"+record.getId();
		
		SubFamilyInfo subFamilyInfo = new SubFamilyInfo();
		subFamilyInfo.setId(record.getId());
		subFamilyInfo.setSubFamilyCode(subFamilyCode);
		update(subFamilyInfo);
		//更新该分支始祖的标识--需要传入其familyMemberId
		FamilyMember familyMember = new FamilyMember();
		familyMember.setId(record.getFamilyMemeberId());
		familyMember.setSubFamilyFlag(FamilyConstant.SUBFAMILYFLAG_SPECIAL);
		familyMemberService.update(familyMember);
		//获取某个成员下的所有分支成员，然后更新信息
		familyMemberService.updateRelationNodeSubFamilyCodeByHeadNode(record.getFamilyMemeberId(), subFamilyCode);
	}

	@Override
	public List<SubFamilyInfo> findSubFamilyInfoListByFamilyId(Integer familyId) {
		SubFamilyInfoExample example = new SubFamilyInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}

	@Override
	public String findSubFamilyCodeBySubManagerId(Integer subManagerId) {
		SubFamilyInfoExample example = new SubFamilyInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andSubManagerIdEqualTo(subManagerId);
		List<SubFamilyInfo> subFamilyInfoList = mapper.selectByExample(example);
		if(subFamilyInfoList!=null&&subFamilyInfoList.size()>0) {
			return subFamilyInfoList.get(0).getSubFamilyCode();
		}
		return null;
	}

	@Override
	public Long findSubFamilyInfoListNumByPhone(String phone) {
		SubFamilyInfoExample example = new SubFamilyInfoExample();
		example.createCriteria().andPhoneLike("%"+phone+"%");
		return mapper.countByExample(example);
	}

	@Override
	public String findSubFamilyCodeByPhone(String phone) {
		SubFamilyInfoExample example = new SubFamilyInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andPhoneEqualTo(phone);
		List<SubFamilyInfo> subFamilyInfoList = mapper.selectByExample(example);
		if(subFamilyInfoList!=null&&subFamilyInfoList.size()>0) {
			return subFamilyInfoList.get(0).getSubFamilyCode();
		}
		return null;
	}

}
