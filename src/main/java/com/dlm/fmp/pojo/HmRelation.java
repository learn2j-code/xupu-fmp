package com.dlm.fmp.pojo;

import java.util.Date;

public class HmRelation {
    private Integer id;

    private Integer householdId;

    private Integer relType;

    private Integer maId;

    private Integer mbId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Integer getRelType() {
        return relType;
    }

    public void setRelType(Integer relType) {
        this.relType = relType;
    }

    public Integer getMaId() {
        return maId;
    }

    public void setMaId(Integer maId) {
        this.maId = maId;
    }

    public Integer getMbId() {
        return mbId;
    }

    public void setMbId(Integer mbId) {
        this.mbId = mbId;
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