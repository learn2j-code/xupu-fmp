package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.ClanBookService;
import com.dlm.fmp.bam_basemanagement.service.ClanPictureService;
import com.dlm.fmp.bam_basemanagement.service.ClanVolumeService;
import com.dlm.fmp.mapper.ClanBookMapper;
import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.ClanBookExample;
import com.dlm.fmp.pojo.ClanBookExample.Criteria;
import com.dlm.fmp.pojo.ClanPicture;
import com.dlm.fmp.pojo.ClanVolume;

@Service
public class ClanBookServiceImpl implements ClanBookService {
	@Autowired
	ClanBookMapper mapper;
	
	@Autowired
	ClanVolumeService clanVolumeService;
	@Autowired
	ClanPictureService clanPictureService;
	@Override
	public List<ClanBook> list() {
		ClanBookExample example = new ClanBookExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(ClanBook record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(ClanBook record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public ClanBook get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ClanBook> findClanBookListByFamilyId(int familyId) {
		ClanBookExample example = new ClanBookExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}

	@Override
	public void addClanBook(ClanBook record) {
		//添加谱书的时候，添加相应的卷
		add(record);
		int volumeNum = record.getVolumeNum();
		for(int i=0;i<volumeNum;i++) {
			ClanVolume clanVolume = new ClanVolume();
			clanVolume.setBookId(record.getId());
			clanVolume.setVolumeNo(i+1);
			clanVolume.setVolumeName(String.valueOf(i+1));
			clanVolume.setCoverImage(record.getCoverImage());
			clanVolumeService.add(clanVolume);
		}
	}

	@Override
	public List<ClanBook> findClanBookListByFamilyIdAndStatus(int familyId, Integer status) {
		ClanBookExample example = new ClanBookExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(familyId);
		if(status!=null) {
			criteria.andStatusEqualTo(status);
		}
		return mapper.selectByExample(example);
	}

	@Override
	public void updateStatus(ClanBook record) {
		//先更新谱书状态
		update(record);
//		//更新谱书下所有卷的状态
//		List<ClanVolume> clanVolumeList = clanVolumeService.findClanVolumeListByBookId(record.getId(), null);
//		for(ClanVolume clanVolume:clanVolumeList) {
//			clanVolume.setStatus(record.getStatus());
//			clanVolumeService.updateStatus(clanVolume);
//		}
	}

	@Override
	public List<ClanPicture> findClanPictureListByBookId(int bookId, Integer status) {
		List<ClanVolume> clanVolumeList = clanVolumeService.findClanVolumeListByBookId(bookId, null);
		List<ClanPicture> clanPictureList = new ArrayList<ClanPicture>();
		for(ClanVolume clanVolume:clanVolumeList) {
			List<ClanPicture> clanPictureListTemp = clanPictureService.findClanPictureListByVolumeId(clanVolume.getId(), status);
			if(clanPictureListTemp!=null) {
				clanPictureList.addAll(clanPictureListTemp);
			}
		}
		return clanPictureList;
	}

	@Override
	public List<ClanBook> findClanBookListInCondition(ClanBook record) {
		ClanBookExample example = new ClanBookExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record.getPublishFlag()!=null) {
			criteria.andPublishFlagEqualTo(record.getPublishFlag());
		}
		return mapper.selectByExample(example);
	}

}
