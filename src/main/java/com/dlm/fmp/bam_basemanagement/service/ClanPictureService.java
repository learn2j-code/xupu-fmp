package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.ClanPicture;

public interface ClanPictureService {
	List<ClanPicture> list();
	void add(ClanPicture record);
	void update(ClanPicture record);
	void delete(int id);
	ClanPicture get(int id);
	void deleteByVolumeId(int volumeId);
	void addOnePictureAfterSelected(ClanPicture record);
	List<ClanPicture> findClanPictureListByVolumeId(int volumeId, Integer status);
	//根据卷id查询某图号之后的所有图片
	List<ClanPicture> findClanPictureListByVolumeIdAndLargerThanPictureNo(ClanPicture record);
}
