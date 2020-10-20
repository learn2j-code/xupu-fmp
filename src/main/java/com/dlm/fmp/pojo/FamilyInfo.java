package com.dlm.fmp.pojo;

import java.util.Date;

public class FamilyInfo {
    private Integer id;

    private String familyName;

    private String familyTitle;

    private Integer surnameId;

    private String surname;

    private String ancestorName;

    private String settlementRoughly;

    private String settlementExact;

    private String settlementTime;

    private String emigrationRoughly;

    private String emigrationExact;

    private String emigrationTime;

    private String totemAddress;

    private String totemStory;

    private String seniorityContent;

    private String contactor;

    private String phone;

    private String location;

    private String locationCode;

    private Integer frozenFlag;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getFamilyTitle() {
        return familyTitle;
    }

    public void setFamilyTitle(String familyTitle) {
        this.familyTitle = familyTitle == null ? null : familyTitle.trim();
    }

    public Integer getSurnameId() {
        return surnameId;
    }

    public void setSurnameId(Integer surnameId) {
        this.surnameId = surnameId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    public String getAncestorName() {
        return ancestorName;
    }

    public void setAncestorName(String ancestorName) {
        this.ancestorName = ancestorName == null ? null : ancestorName.trim();
    }

    public String getSettlementRoughly() {
        return settlementRoughly;
    }

    public void setSettlementRoughly(String settlementRoughly) {
        this.settlementRoughly = settlementRoughly == null ? null : settlementRoughly.trim();
    }

    public String getSettlementExact() {
        return settlementExact;
    }

    public void setSettlementExact(String settlementExact) {
        this.settlementExact = settlementExact == null ? null : settlementExact.trim();
    }

    public String getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(String settlementTime) {
        this.settlementTime = settlementTime == null ? null : settlementTime.trim();
    }

    public String getEmigrationRoughly() {
        return emigrationRoughly;
    }

    public void setEmigrationRoughly(String emigrationRoughly) {
        this.emigrationRoughly = emigrationRoughly == null ? null : emigrationRoughly.trim();
    }

    public String getEmigrationExact() {
        return emigrationExact;
    }

    public void setEmigrationExact(String emigrationExact) {
        this.emigrationExact = emigrationExact == null ? null : emigrationExact.trim();
    }

    public String getEmigrationTime() {
        return emigrationTime;
    }

    public void setEmigrationTime(String emigrationTime) {
        this.emigrationTime = emigrationTime == null ? null : emigrationTime.trim();
    }

    public String getTotemAddress() {
        return totemAddress;
    }

    public void setTotemAddress(String totemAddress) {
        this.totemAddress = totemAddress == null ? null : totemAddress.trim();
    }

    public String getTotemStory() {
        return totemStory;
    }

    public void setTotemStory(String totemStory) {
        this.totemStory = totemStory == null ? null : totemStory.trim();
    }

    public String getSeniorityContent() {
        return seniorityContent;
    }

    public void setSeniorityContent(String seniorityContent) {
        this.seniorityContent = seniorityContent == null ? null : seniorityContent.trim();
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor == null ? null : contactor.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public Integer getFrozenFlag() {
        return frozenFlag;
    }

    public void setFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}