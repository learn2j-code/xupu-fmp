package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.ClanVolume;

public interface ClanVolumeService {
	List<ClanVolume> list();
	void add(ClanVolume record);
	void update(ClanVolume record);
	void updateStatus(ClanVolume record);
	void delete(int id);
	ClanVolume get(int id);
	
	void addClanVolume(ClanVolume record);
	List<ClanVolume> findClanVolumeListByBookId(int bookId, Integer status);
}
