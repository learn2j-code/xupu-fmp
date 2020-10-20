package com.dlm.fmp.pojo;

import java.util.Date;

public class FamilyCouncil {
    private Integer id;

    private Integer familyId;

    private Integer generationNum;

    private String generationWord;

    private String memberName;

    private String phone;

    private String identityCard;

    private String discounts;

    private String duty;

    private String period;

    private Integer retired;

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

    public Integer getGenerationNum() {
        return generationNum;
    }

    public void setGenerationNum(Integer generationNum) {
        this.generationNum = generationNum;
    }

    public String getGenerationWord() {
        return generationWord;
    }

    public void setGenerationWord(String generationWord) {
        this.generationWord = generationWord == null ? null : generationWord.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts == null ? null : discounts.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public Integer getRetired() {
        return retired;
    }

    public void setRetired(Integer retired) {
        this.retired = retired;
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