package com.dlm.fmp.bam_basemanagement.vo;


import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.SubClanInfo;
import com.dlm.fmp.util.Page;


public class RequestEntity {
	private ClanBook clanBook;
	private SubClanInfo subClanInfo;
	private Page page;
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public SubClanInfo getSubClanInfo() {
		return subClanInfo;
	}

	public void setSubClanInfo(SubClanInfo subClanInfo) {
		this.subClanInfo = subClanInfo;
	}

	public ClanBook getClanBook() {
		return clanBook;
	}

	public void setClanBook(ClanBook clanBook) {
		this.clanBook = clanBook;
	}

}
