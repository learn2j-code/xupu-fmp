package com.dlm.fmp.pojo;

import java.util.Date;

public class KeywordsConfig {
    private Integer id;

    private String keywordsName;

    private String keywordsCode;

    private String keywordsValue;

    private Integer bookId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeywordsName() {
        return keywordsName;
    }

    public void setKeywordsName(String keywordsName) {
        this.keywordsName = keywordsName == null ? null : keywordsName.trim();
    }

    public String getKeywordsCode() {
        return keywordsCode;
    }

    public void setKeywordsCode(String keywordsCode) {
        this.keywordsCode = keywordsCode == null ? null : keywordsCode.trim();
    }

    public String getKeywordsValue() {
        return keywordsValue;
    }

    public void setKeywordsValue(String keywordsValue) {
        this.keywordsValue = keywordsValue == null ? null : keywordsValue.trim();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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