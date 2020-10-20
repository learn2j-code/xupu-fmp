package com.dlm.fmp.bam_basemanagement.vo;



import com.dlm.fmp.pojo.CmRelation;


public class RequestEntityForCmRelation {
	private CmRelation originalRecord;
	private CmRelation destRecord;
	public CmRelation getOriginalRecord() {
		return originalRecord;
	}
	public void setOriginalRecord(CmRelation originalRecord) {
		this.originalRecord = originalRecord;
	}
	public CmRelation getDestRecord() {
		return destRecord;
	}
	public void setDestRecord(CmRelation destRecord) {
		this.destRecord = destRecord;
	}



}
