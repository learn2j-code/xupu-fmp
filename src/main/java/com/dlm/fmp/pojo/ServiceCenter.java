package com.dlm.fmp.pojo;

import java.util.Date;

public class ServiceCenter {
    private Integer id;

    private String iconAddress;

    private String serviceNo;

    private String serviceCode;

    private String serviceName;

    private Integer servicePayType;

    private String serviceIntro;

    private String priceUnit;

    private String timeUnit;

    private String measureUnit;

    private String discount;

    private String price;

    private String confType;

    private String confFramework;

    private Integer internalFlag;

    private Integer useFlag;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIconAddress() {
        return iconAddress;
    }

    public void setIconAddress(String iconAddress) {
        this.iconAddress = iconAddress == null ? null : iconAddress.trim();
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

    public Integer getServicePayType() {
        return servicePayType;
    }

    public void setServicePayType(Integer servicePayType) {
        this.servicePayType = servicePayType;
    }

    public String getServiceIntro() {
        return serviceIntro;
    }

    public void setServiceIntro(String serviceIntro) {
        this.serviceIntro = serviceIntro == null ? null : serviceIntro.trim();
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit == null ? null : priceUnit.trim();
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit == null ? null : timeUnit.trim();
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit == null ? null : measureUnit.trim();
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
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

    public Integer getInternalFlag() {
        return internalFlag;
    }

    public void setInternalFlag(Integer internalFlag) {
        this.internalFlag = internalFlag;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
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