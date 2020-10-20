package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.ClanPicture;

public interface ClanBookService {
	List<ClanBook> list();
	void add(ClanBook record);
	void update(ClanBook record);
	void updateStatus(ClanBook record);
	void delete(int id);
	ClanBook get(int id);
	
	void addClanBook(ClanBook record);
	List<ClanBook> findClanBookListByFamilyId(int familyId);
	List<ClanBook> findClanBookListByFamilyIdAndStatus(int familyId, Integer status);
	
	List<ClanPicture> findClanPictureListByBookId(int bookId, Integer status);
	
	List<ClanBook> findClanBookListInCondition(ClanBook record);
}
