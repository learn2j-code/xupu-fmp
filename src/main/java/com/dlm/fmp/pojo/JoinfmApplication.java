package com.dlm.fmp.pojo;

import java.util.Date;

public class JoinfmApplication {
    private Integer id;

    private Integer applicationType;

    private Integer clanMemberId;

    private String hmIdList;

    private Integer surnameId;

    private String surname;

    private Integer familyId;

    private String familyName;

    private Integer hmId;

    private String hmName;

    private Integer householdId;

    private Integer paidFlag;

    private Integer auditResult;

    private String reason;

    private String auditor;

    private String comments;

    private Date createTime;

    private Date updateTime;

    private String money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
    }

    public Integer getClanMemberId() {
        return clanMemberId;
    }

    public void setClanMemberId(Integer clanMemberId) {
        this.clanMemberId = clanMemberId;
    }

    public String getHmIdList() {
        return hmIdList;
    }

    public void setHmIdList(String hmIdList) {
        this.hmIdList = hmIdList == null ? null : hmIdList.trim();
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

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    public String getHmName() {
        return hmName;
    }

    public void setHmName(String hmName) {
        this.hmName = hmName == null ? null : hmName.trim();
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Integer getPaidFlag() {
        return paidFlag;
    }

    public void setPaidFlag(Integer paidFlag) {
        this.paidFlag = paidFlag;
    }

    public Integer getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(Integer auditResult) {
        this.auditResult = auditResult;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }
}