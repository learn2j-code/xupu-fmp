package com.dlm.fmp.bam_basemanagement.vo;

import java.util.List;

import com.dlm.fmp.pojo.FamilyMember;

public class FamilyMemberExtends extends FamilyMember {
	//前端用
	private String relationship;
	
	private PersonInfo parentNode;
	
	private PersonInfo mainNode;
	
	private List<PersonInfo> subNodeList;
	
	private List<PersonInfo> spouseNodeList;

	private Integer startGeneration;
	
	private Integer endGeneration;

	private Integer relId;
	
	private String comeFrom;
	
	private Integer headId;
	
	private Integer num;
	
	private Integer fatherId;
	
	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
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

	public String getComeFrom() {
		return comeFrom;
	}

	public void setComeFrom(String comeFrom) {
		this.comeFrom = comeFrom;
	}

	public Integer getHeadId() {
		return headId;
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

	public Integer getFatherId() {
		return fatherId;
	}

	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}
}
