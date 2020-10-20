package com.dlm.fmp.pojo;

import java.util.Date;

public class FamilySetting {
    private Integer id;

    private Integer familyId;

    private Integer xupuFlag;

    private String seniorityContent;

    private Integer soninlawFlag;

    private Integer unpayFlag;

    private Integer xupuCharge;

    private String eachCost;

    private String councilCost;

    private String discounts;

    private Integer payee;

    private Integer paymentWay;

    private String qrCode;

    private Integer changePayment;

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

    public Integer getXupuFlag() {
        return xupuFlag;
    }

    public void setXupuFlag(Integer xupuFlag) {
        this.xupuFlag = xupuFlag;
    }

    public String getSeniorityContent() {
        return seniorityContent;
    }

    public void setSeniorityContent(String seniorityContent) {
        this.seniorityContent = seniorityContent == null ? null : seniorityContent.trim();
    }

    public Integer getSoninlawFlag() {
        return soninlawFlag;
    }

    public void setSoninlawFlag(Integer soninlawFlag) {
        this.soninlawFlag = soninlawFlag;
    }

    public Integer getUnpayFlag() {
        return unpayFlag;
    }

    public void setUnpayFlag(Integer unpayFlag) {
        this.unpayFlag = unpayFlag;
    }

    public Integer getXupuCharge() {
        return xupuCharge;
    }

    public void setXupuCharge(Integer xupuCharge) {
        this.xupuCharge = xupuCharge;
    }

    public String getEachCost() {
        return eachCost;
    }

    public void setEachCost(String eachCost) {
        this.eachCost = eachCost == null ? null : eachCost.trim();
    }

    public String getCouncilCost() {
        return councilCost;
    }

    public void setCouncilCost(String councilCost) {
        this.councilCost = councilCost == null ? null : councilCost.trim();
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts == null ? null : discounts.trim();
    }

    public Integer getPayee() {
        return payee;
    }

    public void setPayee(Integer payee) {
        this.payee = payee;
    }

    public Integer getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public Integer getChangePayment() {
        return changePayment;
    }

    public void setChangePayment(Integer changePayment) {
        this.changePayment = changePayment;
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