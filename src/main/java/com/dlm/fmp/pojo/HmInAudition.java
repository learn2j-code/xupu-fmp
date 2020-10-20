package com.dlm.fmp.pojo;

import java.util.Date;

public class HmInAudition {
    private Integer id;

    private Integer familyId;

    private Integer householdId;

    private Integer householdMemberId;

    private String identityNo;

    private Integer householdInFlag;

    private Integer mainFlag;

    private Integer payFlag;

    private String inMoney;

    private String discounts;

    private String storyMoney;

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

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Integer getHouseholdMemberId() {
        return householdMemberId;
    }

    public void setHouseholdMemberId(Integer householdMemberId) {
        this.householdMemberId = householdMemberId;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public Integer getHouseholdInFlag() {
        return householdInFlag;
    }

    public void setHouseholdInFlag(Integer householdInFlag) {
        this.householdInFlag = householdInFlag;
    }

    public Integer getMainFlag() {
        return mainFlag;
    }

    public void setMainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    public String getInMoney() {
        return inMoney;
    }

    public void setInMoney(String inMoney) {
        this.inMoney = inMoney == null ? null : inMoney.trim();
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts == null ? null : discounts.trim();
    }

    public String getStoryMoney() {
        return storyMoney;
    }

    public void setStoryMoney(String storyMoney) {
        this.storyMoney = storyMoney == null ? null : storyMoney.trim();
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