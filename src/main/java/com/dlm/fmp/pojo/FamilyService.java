package com.dlm.fmp.pojo;

import java.util.Date;

public class FamilyService {
    private Integer id;

    private Integer serviceId;

    private String serviceNo;

    private String serviceCode;

    private String serviceName;

    private String serviceIntro;

    private String confType;

    private String confFramework;

    private String confContent;

    private String price;

    private Date boughtTime;

    private Date endTime;

    private Integer endType;

    private Integer boughtNum;

    private String discount;

    private String serviceFee;

    private Integer familyId;

    private Integer enableFlag;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo == null ? null : serviceNo.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getServiceIntro() {
        return serviceIntro;
    }

    public void setServiceIntro(String serviceIntro) {
        this.serviceIntro = serviceIntro == null ? null : serviceIntro.trim();
    }

    public String getConfType() {
        return confType;
    }

    public void setConfType(String confType) {
        this.confType = confType == null ? null : confType.trim();
    }

    public String getConfFramework() {
        return confFramework;
    }

    public void setConfFramework(String confFramework) {
        this.confFramework = confFramework == null ? null : confFramework.trim();
    }

    public String getConfContent() {
        return confContent;
    }

    public void setConfContent(String confContent) {
        this.confContent = confContent == null ? null : confContent.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Date getBoughtTime() {
        return boughtTime;
    }

    public void setBoughtTime(Date boughtTime) {
        this.boughtTime = boughtTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getEndType() {
        return endType;
    }

    public void setEndType(Integer endType) {
        this.endType = endType;
    }

    public Integer getBoughtNum() {
        return boughtNum;
    }

    public void setBoughtNum(Integer boughtNum) {
        this.boughtNum = boughtNum;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee == null ? null : serviceFee.trim();
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
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