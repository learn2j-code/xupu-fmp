package com.dlm.fmp.pojo;

import java.util.Date;

public class HouseholdPayment {
    private Integer id;

    private Integer familyId;

    private String outTradeNo;

    private String money;

    private Integer payDone;

    private Integer invalidFlag;

    private Integer paymentWay;

    private Integer householdId;

    private Date createTime;

    private Date updateTime;

    private Integer auditionId;

    private Integer applicationId;

    private Integer apFlag;

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

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public Integer getPayDone() {
        return payDone;
    }

    public void setPayDone(Integer payDone) {
        this.payDone = payDone;
    }

    public Integer getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(Integer invalidFlag) {
        this.invalidFlag = invalidFlag;
    }

    public Integer getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
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

    public Integer getAuditionId() {
        return auditionId;
    }

    public void setAuditionId(Integer auditionId) {
        this.auditionId = auditionId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getApFlag() {
        return apFlag;
    }

    public void setApFlag(Integer apFlag) {
        this.apFlag = apFlag;
    }
}