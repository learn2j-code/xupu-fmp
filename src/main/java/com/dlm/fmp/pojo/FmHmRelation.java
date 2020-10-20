package com.dlm.fmp.pojo;

import java.util.Date;

public class FmHmRelation {
    private Integer id;

    private Integer familyId;

    private Integer familyMemberId;

    private String familyMemberCode;

    private Integer householdMemberId;

    private String householdMemberCode;

    private Integer householdId;

    private String householdCode;

    private Date createTime;

    private Date updateTime;

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
        this.familyMemberCode = familyMemberCode == null ? null : familyMemberCode.trim();
    }

    public Integer getHouseholdMemberId() {
        return householdMemberId;
    }

    public void setHouseholdMemberId(Integer householdMemberId) {
        this.householdMemberId = householdMemberId;
    }

    public String getHouseholdMemberCode() {
        return householdMemberCode;
    }

    public void setHouseholdMemberCode(String householdMemberCode) {
        this.householdMemberCode = householdMemberCode == null ? null : householdMemberCode.trim();
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public String getHouseholdCode() {
        return householdCode;
    }

    public void setHouseholdCode(String householdCode) {
        this.householdCode = householdCode == null ? null : householdCode.trim();
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