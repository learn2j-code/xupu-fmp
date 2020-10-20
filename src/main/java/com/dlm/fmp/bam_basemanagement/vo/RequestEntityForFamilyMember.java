package com.dlm.fmp.bam_basemanagement.vo;

import com.dlm.fmp.pojo.FamilyMember;

public class RequestEntityForFamilyMember extends RequestEntity{
	private Integer bookId;
	private Integer volumeId;
	private Integer familyId;
	private String memberName;
	private String fatherName;
	private String spouseName;
	private String memberDetail;
	private String secPersonalName;//字
	private String mark;//号
	private Integer generationNum;//世代
	private String generationWord;//派
	private Integer originalId;
	private Integer preciseFlag;//精确模糊标志默认为：1 精确；
	private Integer destId;
	private FamilyMember familyMember;
	
	private FamilyMemberExtends requestParameter;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getFamilyId() {
		return familyId;
	}
	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}
	public FamilyMemberExtends getRequestParameter() {
		return requestParameter;
	}
	public void setRequestParameter(FamilyMemberExtends requestParameter) {
		this.requestParameter = requestParameter;
	}
	public Integer getOriginalId() {
		return originalId;
	}
	public void setOriginalId(Integer originalId) {
		this.originalId = originalId;
	}
	public Integer getDestId() {
		return destId;
	}
	public void setDestId(Integer destId) {
		this.destId = destId;
	}
	public FamilyMember getFamilyMember() {
		return familyMember;
	}
	public void setFamilyMember(FamilyMember familyMember) {
		this.familyMember = familyMember;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getSecPersonalName() {
		return secPersonalName;
	}
	public void setSecPersonalName(String secPersonalName) {
		this.secPersonalName = secPersonalName;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getGenerationWord() {
		return generationWord;
	}
	public Integer getVolumeId() {
		return volumeId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public void setVolumeId(Integer volumeId) {
		this.volumeId = volumeId;
	}
	public String getMemberDetail() {
		return memberDetail;
	}
	public Integer getPreciseFlag() {
		return preciseFlag;
	}
	public void setPreciseFlag(Integer preciseFlag) {
		this.preciseFlag = preciseFlag;
	}
	public void setMemberDetail(String memberDetail) {
		this.memberDetail = memberDetail;
	}
	public void setGenerationWord(String generationWord) {
		this.generationWord = generationWord;
	}
	public Integer getGenerationNum() {
		return generationNum;
	}
	public void setGenerationNum(Integer generationNum) {
		this.generationNum = generationNum;
	}


}
