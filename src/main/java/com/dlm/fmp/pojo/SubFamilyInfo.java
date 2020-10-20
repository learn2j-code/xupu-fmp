package com.dlm.fmp.pojo;

import java.util.Date;

public class SubFamilyInfo {
    private Integer id;

    private String subFamilyNo;

    private String subFamilyCode;

    private String subAncestorName;

    private String immigrateAddress;

    private String immigrateTime;

    private String subManager;

    private Integer subManagerId;

    private String phone;

    private Integer migrateFlag;

    private Integer familyId;

    private Integer familyMemeberId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubFamilyNo() {
        return subFamilyNo;
    }

    public void setSubFamilyNo(String subFamilyNo) {
        this.subFamilyNo = subFamilyNo == null ? null : subFamilyNo.trim();
    }

    public String getSubFamilyCode() {
        return subFamilyCode;
    }

    public void setSubFamilyCode(String subFamilyCode) {
        this.subFamilyCode = subFamilyCode == null ? null : subFamilyCode.trim();
    }

    public String getSubAncestorName() {
        return subAncestorName;
    }

    public void setSubAncestorName(String subAncestorName) {
        this.subAncestorName = subAncestorName == null ? null : subAncestorName.trim();
    }

    public String getImmigrateAddress() {
        return immigrateAddress;
    }

    public void setImmigrateAddress(String immigrateAddress) {
        this.immigrateAddress = immigrateAddress == null ? null : immigrateAddress.trim();
    }

    public String getImmigrateTime() {
        return immigrateTime;
    }

    public void setImmigrateTime(String immigrateTime) {
        this.immigrateTime = immigrateTime == null ? null : immigrateTime.trim();
    }

    public String getSubManager() {
        return subManager;
    }

    public void setSubManager(String subManager) {
        this.subManager = subManager == null ? null : subManager.trim();
    }

    public Integer getSubManagerId() {
        return subManagerId;
    }

    public void setSubManagerId(Integer subManagerId) {
        this.subManagerId = subManagerId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getMigrateFlag() {
        return migrateFlag;
    }

    public void setMigrateFlag(Integer migrateFlag) {
        this.migrateFlag = migrateFlag;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public Integer getFamilyMemeberId() {
        return familyMemeberId;
    }

    public void setFamilyMemeberId(Integer familyMemeberId) {
        this.familyMemeberId = familyMemeberId;
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