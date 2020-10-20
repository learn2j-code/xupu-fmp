package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.ClanPictureService;
import com.dlm.fmp.bam_basemanagement.service.ClanVolumeService;
import com.dlm.fmp.mapper.ClanVolumeMapper;
import com.dlm.fmp.pojo.ClanPicture;
import com.dlm.fmp.pojo.ClanVolume;
import com.dlm.fmp.pojo.ClanVolumeExample;
import com.dlm.fmp.pojo.ClanVolumeExample.Criteria;

@Service
public class ClanVolumeServiceImpl implements ClanVolumeService {
	@Autowired
	ClanVolumeMapper mapper;
	
	@Autowired
	ClanPictureService clanPictureService;
	
	@Override
	public List<ClanVolume> list() {
		ClanVolumeExample example = new ClanVolumeExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(ClanVolume record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(ClanVolume record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public ClanVolume get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ClanVolume> findClanVolumeListByBookId(int bookId, Integer status) {
		ClanVolumeExample example = new ClanVolumeExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(bookId);
		if(status!=null) {
			criteria.andStatusEqualTo(status);
		}
		return mapper.selectByExample(example);
	}

	@Override
	public void addClanVolume(ClanVolume record) {
		
		add(record);
	}

	@Override
	public void updateStatus(ClanVolume record) {
		update(record);
//		List<ClanPicture> clanPictureList = clanPictureService.findClanPictureListByVolumeId(record.getId(), null);
//		for(ClanPicture clanPicture:clanPictureList) {
//			clanPicture.setStatus(record.getStatus());
//			clanPictureService.update(clanPicture);
//		}
	}

}
