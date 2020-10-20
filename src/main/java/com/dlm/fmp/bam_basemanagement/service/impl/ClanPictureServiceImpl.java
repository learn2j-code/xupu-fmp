package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.ClanBookService;
import com.dlm.fmp.bam_basemanagement.service.ClanPictureService;
import com.dlm.fmp.bam_basemanagement.service.ClanVolumeService;
import com.dlm.fmp.bam_basemanagement.service.ServiceCenterService;
import com.dlm.fmp.mapper.ClanBookMapper;
import com.dlm.fmp.mapper.ClanPictureMapper;
import com.dlm.fmp.mapper.ClanVolumeMapper;
import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.ClanBookExample;
import com.dlm.fmp.pojo.ClanPicture;
import com.dlm.fmp.pojo.ClanPictureExample;
import com.dlm.fmp.pojo.ClanPictureExample.Criteria;
import com.github.pagehelper.util.StringUtil;
import com.dlm.fmp.pojo.ClanVolume;
import com.dlm.fmp.pojo.ClanVolumeExample;

@Service
public class ClanPictureServiceImpl implements ClanPictureService {
	@Autowired
	ClanPictureMapper mapper;
	
	@Override
	public List<ClanPicture> list() {
		ClanPictureExample example = new ClanPictureExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(ClanPicture record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(ClanPicture record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public ClanPicture get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ClanPicture> findClanPictureListByVolumeId(int volumeId, Integer status) {
		ClanPictureExample example = new ClanPictureExample();
		example.setOrderByClause("picture_no asc");
		Criteria criteria = example.createCriteria();
		criteria.andVolumeIdEqualTo(volumeId);
		if(status!=null) {
			criteria.andStatusEqualTo(status);
		}
		return mapper.selectByExample(example);
	}

	@Override
	public void addOnePictureAfterSelected(ClanPicture record) {
		List<ClanPicture> clanPictureList = findClanPictureListByVolumeIdAndLargerThanPictureNo(record);
		for(ClanPicture clanPicture:clanPictureList) {
			clanPicture.setPictureNo(clanPicture.getPictureNo()+1);
			update(clanPicture);
		}
		ClanPicture clanPicture = new ClanPicture();
		clanPicture.setVolumeId(record.getVolumeId());
		clanPicture.setPictureAddress(record.getPictureAddress());
		clanPicture.setPictureNo(record.getPictureNo()+1);
		if(StringUtil.isNotEmpty(record.getPictureAddress())){
			clanPicture.setPictureName(record.getPictureAddress().substring(record.getPictureAddress().lastIndexOf("\\")));
		}
		add(clanPicture);
	}

	@Override
	public List<ClanPicture> findClanPictureListByVolumeIdAndLargerThanPictureNo(ClanPicture record) {
		ClanPictureExample example = new ClanPictureExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andVolumeIdEqualTo(record.getVolumeId()).andPictureNoGreaterThan(record.getPictureNo());
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteByVolumeId(int volumeId) {
		ClanPictureExample example = new ClanPictureExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andVolumeIdEqualTo(volumeId);
		List<ClanPicture> clanPictureList = mapper.selectByExample(example);
		for(ClanPicture clanPicture:clanPictureList) {
			delete(clanPicture.getId());
		}
	}

}
