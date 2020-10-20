package com.dlm.fmp.pojo;

import java.util.Date;

public class SubClanInfo {
    private Integer id;

    private String subClanName;

    private Integer parentId;

    private Integer bookId;

    private Integer volumeId;

    private Integer orderNo;

    private Integer cmId;

    private Integer levelType;

    private String levelName;

    private Date createTime;

    private Date updateTime;

    private Integer generationNum;

    private Integer subClanType;

    private Integer startGeneration;

    private Integer endGeneration;

    private Integer extendFlag;

    private Integer migrateFlag;

    private String immigrateAddress;

    private String immigrateTime;

    private String subManager;

    private String managerPhone;

    private String subContactor;

    private String contactorPhone;

    private String subClanNameOriginal;

    private String levelNameOriginal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubClanName() {
        return subClanName;
    }

    public void setSubClanName(String subClanName) {
        this.subClanName = subClanName == null ? null : subClanName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public Integer getLevelType() {
        return levelType;
    }

    public void setLevelType(Integer levelType) {
        this.levelType = levelType;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
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

    public Integer getGenerationNum() {
        return generationNum;
    }

    public void setGenerationNum(Integer generationNum) {
        this.generationNum = generationNum;
    }

    public Integer getSubClanType() {
        return subClanType;
    }

    public void setSubClanType(Integer subClanType) {
        this.subClanType = subClanType;
    }

    public Integer getStartGeneration() {
        return startGeneration;
    }

    public void setStartGeneration(Integer startGeneration) {
        this.startGeneration = startGeneration;
    }

    public Integer getEndGeneration() {
        return endGeneration;
    }

    public void setEndGeneration(Integer endGeneration) {
        this.endGeneration = endGeneration;
    }

    public Integer getExtendFlag() {
        return extendFlag;
    }

    public void setExtendFlag(Integer extendFlag) {
        this.extendFlag = extendFlag;
    }

    public Integer getMigrateFlag() {
        return migrateFlag;
    }

    public void setMigrateFlag(Integer migrateFlag) {
        this.migrateFlag = migrateFlag;
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

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone == null ? null : managerPhone.trim();
    }

    public String getSubContactor() {
        return subContactor;
    }

    public void setSubContactor(String subContactor) {
        this.subContactor = subContactor == null ? null : subContactor.trim();
    }

    public String getContactorPhone() {
        return contactorPhone;
    }

    public void setContactorPhone(String contactorPhone) {
        this.contactorPhone = contactorPhone == null ? null : contactorPhone.trim();
    }

    public String getSubClanNameOriginal() {
        return subClanNameOriginal;
    }

    public void setSubClanNameOriginal(String subClanNameOriginal) {
        this.subClanNameOriginal = subClanNameOriginal == null ? null : subClanNameOriginal.trim();
    }

    public String getLevelNameOriginal() {
        return levelNameOriginal;
    }

    public void setLevelNameOriginal(String levelNameOriginal) {
        this.levelNameOriginal = levelNameOriginal == null ? null : levelNameOriginal.trim();
    }
}