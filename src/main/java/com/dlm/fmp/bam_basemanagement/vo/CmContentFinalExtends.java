package com.dlm.fmp.bam_basemanagement.vo;

import java.util.List;

import com.dlm.fmp.pojo.CmContentFinal;

public class CmContentFinalExtends extends CmContentFinal{
	//前端用
	private String relationship;
	
	private PersonInfo parentNode;
	
	private PersonInfo mainNode;
	
	private List<PersonInfo> subNodeList;
	
	private List<PersonInfo> spouseNodeList;

	private Integer startGeneration;
	
	private Integer endGeneration;
	
	private String bookName;
	
	private Integer familyMemberId;
	
	private String familyMemberCode;
	
	private Integer familyId;
	
	private Integer relId;
	
	private String subFamilyCode;
	
	private List<CmContentFinal> fiveGenerationContent;
	
	private Integer headId;
	
	private Integer num;
	
	private String subClanName;
	
	private Integer upId;
	private Integer downId;
	
	private Integer fatherId;
	
	private Integer firstLevel;//第一级世代数
	private Integer secondLevel;//第二级世代数
	private Integer thirdLevel;//第三级世代数
	private Integer interval;//世代间隔
	
	private Integer hasSpouseFlag;//0为去掉配偶，1为有配偶
	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}


	public Integer getStartGeneration() {
		return startGeneration;
	}

	public void setStartGeneration(Integer startGeneration) {
		this.startGeneration = startGeneration;
	}

	public Integer getEndGeneration() {
		return endGeneration;
	}

	public void setEndGeneration(Integer endGeneration) {
		this.endGeneration = endGeneration;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getFamilyMemberId() {
		return familyMemberId;
	}

	public void setFamilyMemberId(Integer familyMemberId) {
		this.familyMemberId = familyMemberId;
	}

	public String getFamilyMemberCode() {
		return familyMemberCode;
	}

	public void setFamilyMemberCode(String familyMemberCode) {
		this.familyMemberCode = familyMemberCode;
	}

	public Integer getFamilyId() {
		return familyId;
	}

	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}

	public PersonInfo getParentNode() {
		return parentNode;
	}

	public void setParentNode(PersonInfo parentNode) {
		this.parentNode = parentNode;
	}

	public List<PersonInfo> getSubNodeList() {
		return subNodeList;
	}

	public void setSubNodeList(List<PersonInfo> subNodeList) {
		this.subNodeList = subNodeList;
	}

	public List<PersonInfo> getSpouseNodeList() {
		return spouseNodeList;
	}

	public void setSpouseNodeList(List<PersonInfo> spouseNodeList) {
		this.spouseNodeList = spouseNodeList;
	}

	public PersonInfo getMainNode() {
		return mainNode;
	}

	public void setMainNode(PersonInfo mainNode) {
		this.mainNode = mainNode;
	}

	public Integer getRelId() {
		return relId;
	}

	public void setRelId(Integer relId) {
		this.relId = relId;
	}

	public String getSubFamilyCode() {
		return subFamilyCode;
	}

	public void setSubFamilyCode(String subFamilyCode) {
		this.subFamilyCode = subFamilyCode;
	}

	public List<CmContentFinal> getFiveGenerationContent() {
		return fiveGenerationContent;
	}

	public void setFiveGenerationContent(List<CmContentFinal> fiveGenerationContent) {
		this.fiveGenerationContent = fiveGenerationContent;
	}

	public Integer getHeadId() {
		return headId;
	}

	public Integer getFirstLevel() {
		return firstLevel;
	}

	public void setFirstLevel(Integer firstLevel) {
		this.firstLevel = firstLevel;
	}

	public Integer getSecondLevel() {
		return secondLevel;
	}

	public void setSecondLevel(Integer secondLevel) {
		this.secondLevel = secondLevel;
	}

	public Integer getThirdLevel() {
		return thirdLevel;
	}

	public void setThirdLevel(Integer thirdLevel) {
		this.thirdLevel = thirdLevel;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getFatherId() {
		return fatherId;
	}

	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}

	public Integer getUpId() {
		return upId;
	}

	public void setUpId(Integer upId) {
		this.upId = upId;
	}

	public Integer getDownId() {
		return downId;
	}

	public void setDownId(Integer downId) {
		this.downId = downId;
	}

	public String getSubClanName() {
		return subClanName;
	}

	public void setSubClanName(String subClanName) {
		this.subClanName = subClanName;
	}

	public void setHeadId(Integer headId) {
		this.headId = headId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getHasSpouseFlag() {
		return hasSpouseFlag;
	}

	public void setHasSpouseFlag(Integer hasSpouseFlag) {
		this.hasSpouseFlag = hasSpouseFlag;
	}
}
