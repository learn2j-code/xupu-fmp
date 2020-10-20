package com.dlm.fmp.pojo;

import java.util.Date;

public class HouseholdInAudition {
    private Integer id;

    private Integer familyId;

    private Integer householdId;

    private String subFamilyName;

    private String subFamilyCode;

    private Integer familyMemberId;

    private String familyMemberName;

    private Integer familyMemberGm;

    private String familyName;

    private String totemAddress;

    private String proposer;

    private String phone;

    private Integer payFlag;

    private Integer auditFlag;

    private Integer conformFlag;

    private String failReason;

    private String totalMoney;

    private Date createTime;

    private Date updateTime;

    private String receiveMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public String getSubFamilyName() {
        return subFamilyName;
    }

    public void setSubFamilyName(String subFamilyName) {
        this.subFamilyName = subFamilyName == null ? null : subFamilyName.trim();
    }

    public String getSubFamilyCode() {
        return subFamilyCode;
    }

    public void setSubFamilyCode(String subFamilyCode) {
        this.subFamilyCode = subFamilyCode == null ? null : subFamilyCode.trim();
    }

    public Integer getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(Integer familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public String getFamilyMemberName() {
        return familyMemberName;
    }

    public void setFamilyMemberName(String familyMemberName) {
        this.familyMemberName = familyMemberName == null ? null : familyMemberName.trim();
    }

    public Integer getFamilyMemberGm() {
        return familyMemberGm;
    }

    public void setFamilyMemberGm(Integer familyMemberGm) {
        this.familyMemberGm = familyMemberGm;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getTotemAddress() {
        return totemAddress;
    }

    public void setTotemAddress(String totemAddress) {
        this.totemAddress = totemAddress == null ? null : totemAddress.trim();
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    public Integer getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(Integer auditFlag) {
        this.auditFlag = auditFlag;
    }

    public Integer getConformFlag() {
        return conformFlag;
    }

    public void setConformFlag(Integer conformFlag) {
        this.conformFlag = conformFlag;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney == null ? null : totalMoney.trim();
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

    public String getReceiveMoney() {
        return receiveMoney;
    }

    public void setReceiveMoney(String receiveMoney) {
        this.receiveMoney = receiveMoney == null ? null : receiveMoney.trim();
    }
}