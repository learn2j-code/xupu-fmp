package com.dlm.fmp.bam_basemanagement.vo;



import com.dlm.fmp.pojo.FmRelation;


public class RequestEntityForFmRelation {
	private FmRelation originalRecord;
	private FmRelation destRecord;
	public FmRelation getOriginalRecord() {
		return originalRecord;
	}
	public void setOriginalRecord(FmRelation originalRecord) {
		this.originalRecord = originalRecord;
	}
	public FmRelation getDestRecord() {
		return destRecord;
	}
	public void setDestRecord(FmRelation destRecord) {
		this.destRecord = destRecord;
	}



}
