package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubClanInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubClanInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubClanNameIsNull() {
            addCriterion("sub_clan_name is null");
            return (Criteria) this;
        }

        public Criteria andSubClanNameIsNotNull() {
            addCriterion("sub_clan_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubClanNameEqualTo(String value) {
            addCriterion("sub_clan_name =", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameNotEqualTo(String value) {
            addCriterion("sub_clan_name <>", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameGreaterThan(String value) {
            addCriterion("sub_clan_name >", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_clan_name >=", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameLessThan(String value) {
            addCriterion("sub_clan_name <", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameLessThanOrEqualTo(String value) {
            addCriterion("sub_clan_name <=", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameLike(String value) {
            addCriterion("sub_clan_name like", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameNotLike(String value) {
            addCriterion("sub_clan_name not like", value, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameIn(List<String> values) {
            addCriterion("sub_clan_name in", values, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameNotIn(List<String> values) {
            addCriterion("sub_clan_name not in", values, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameBetween(String value1, String value2) {
            addCriterion("sub_clan_name between", value1, value2, "subClanName");
            return (Criteria) this;
        }

        public Criteria andSubClanNameNotBetween(String value1, String value2) {
            addCriterion("sub_clan_name not between", value1, value2, "subClanName");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIsNull() {
            addCriterion("volume_id is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIsNotNull() {
            addCriterion("volume_id is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeIdEqualTo(Integer value) {
            addCriterion("volume_id =", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotEqualTo(Integer value) {
            addCriterion("volume_id <>", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdGreaterThan(Integer value) {
            addCriterion("volume_id >", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume_id >=", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdLessThan(Integer value) {
            addCriterion("volume_id <", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("volume_id <=", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIn(List<Integer> values) {
            addCriterion("volume_id in", values, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotIn(List<Integer> values) {
            addCriterion("volume_id not in", values, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdBetween(Integer value1, Integer value2) {
            addCriterion("volume_id between", value1, value2, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("volume_id not between", value1, value2, "volumeId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNull() {
            addCriterion("cm_id is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("cm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("cm_id =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("cm_id <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("cm_id >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_id >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("cm_id <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_id <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("cm_id in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("cm_id not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_id between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_id not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNull() {
            addCriterion("level_type is null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNotNull() {
            addCriterion("level_type is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeEqualTo(Integer value) {
            addCriterion("level_type =", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotEqualTo(Integer value) {
            addCriterion("level_type <>", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThan(Integer value) {
            addCriterion("level_type >", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_type >=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThan(Integer value) {
            addCriterion("level_type <", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("level_type <=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIn(List<Integer> values) {
            addCriterion("level_type in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotIn(List<Integer> values) {
            addCriterion("level_type not in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeBetween(Integer value1, Integer value2) {
            addCriterion("level_type between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("level_type not between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("level_name =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("level_name >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("level_name <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("level_name like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("level_name not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("level_name in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andGenerationNumIsNull() {
            addCriterion("generation_num is null");
            return (Criteria) this;
        }

        public Criteria andGenerationNumIsNotNull() {
            addCriterion("generation_num is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationNumEqualTo(Integer value) {
            addCriterion("generation_num =", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumNotEqualTo(Integer value) {
            addCriterion("generation_num <>", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumGreaterThan(Integer value) {
            addCriterion("generation_num >", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("generation_num >=", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumLessThan(Integer value) {
            addCriterion("generation_num <", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumLessThanOrEqualTo(Integer value) {
            addCriterion("generation_num <=", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumIn(List<Integer> values) {
            addCriterion("generation_num in", values, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumNotIn(List<Integer> values) {
            addCriterion("generation_num not in", values, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumBetween(Integer value1, Integer value2) {
            addCriterion("generation_num between", value1, value2, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumNotBetween(Integer value1, Integer value2) {
            addCriterion("generation_num not between", value1, value2, "generationNum");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeIsNull() {
            addCriterion("sub_clan_type is null");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeIsNotNull() {
            addCriterion("sub_clan_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeEqualTo(Integer value) {
            addCriterion("sub_clan_type =", value, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeNotEqualTo(Integer value) {
            addCriterion("sub_clan_type <>", value, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeGreaterThan(Integer value) {
            addCriterion("sub_clan_type >", value, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_clan_type >=", value, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeLessThan(Integer value) {
            addCriterion("sub_clan_type <", value, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sub_clan_type <=", value, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeIn(List<Integer> values) {
            addCriterion("sub_clan_type in", values, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeNotIn(List<Integer> values) {
            addCriterion("sub_clan_type not in", values, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeBetween(Integer value1, Integer value2) {
            addCriterion("sub_clan_type between", value1, value2, "subClanType");
            return (Criteria) this;
        }

        public Criteria andSubClanTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_clan_type not between", value1, value2, "subClanType");
            return (Criteria) this;
        }

        public Criteria andStartGenerationIsNull() {
            addCriterion("start_generation is null");
            return (Criteria) this;
        }

        public Criteria andStartGenerationIsNotNull() {
            addCriterion("start_generation is not null");
            return (Criteria) this;
        }

        public Criteria andStartGenerationEqualTo(Integer value) {
            addCriterion("start_generation =", value, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationNotEqualTo(Integer value) {
            addCriterion("start_generation <>", value, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationGreaterThan(Integer value) {
            addCriterion("start_generation >", value, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_generation >=", value, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationLessThan(Integer value) {
            addCriterion("start_generation <", value, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationLessThanOrEqualTo(Integer value) {
            addCriterion("start_generation <=", value, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationIn(List<Integer> values) {
            addCriterion("start_generation in", values, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationNotIn(List<Integer> values) {
            addCriterion("start_generation not in", values, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationBetween(Integer value1, Integer value2) {
            addCriterion("start_generation between", value1, value2, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andStartGenerationNotBetween(Integer value1, Integer value2) {
            addCriterion("start_generation not between", value1, value2, "startGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationIsNull() {
            addCriterion("end_generation is null");
            return (Criteria) this;
        }

        public Criteria andEndGenerationIsNotNull() {
            addCriterion("end_generation is not null");
            return (Criteria) this;
        }

        public Criteria andEndGenerationEqualTo(Integer value) {
            addCriterion("end_generation =", value, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationNotEqualTo(Integer value) {
            addCriterion("end_generation <>", value, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationGreaterThan(Integer value) {
            addCriterion("end_generation >", value, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_generation >=", value, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationLessThan(Integer value) {
            addCriterion("end_generation <", value, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationLessThanOrEqualTo(Integer value) {
            addCriterion("end_generation <=", value, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationIn(List<Integer> values) {
            addCriterion("end_generation in", values, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationNotIn(List<Integer> values) {
            addCriterion("end_generation not in", values, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationBetween(Integer value1, Integer value2) {
            addCriterion("end_generation between", value1, value2, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andEndGenerationNotBetween(Integer value1, Integer value2) {
            addCriterion("end_generation not between", value1, value2, "endGeneration");
            return (Criteria) this;
        }

        public Criteria andExtendFlagIsNull() {
            addCriterion("extend_flag is null");
            return (Criteria) this;
        }

        public Criteria andExtendFlagIsNotNull() {
            addCriterion("extend_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExtendFlagEqualTo(Integer value) {
            addCriterion("extend_flag =", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagNotEqualTo(Integer value) {
            addCriterion("extend_flag <>", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagGreaterThan(Integer value) {
            addCriterion("extend_flag >", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("extend_flag >=", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagLessThan(Integer value) {
            addCriterion("extend_flag <", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagLessThanOrEqualTo(Integer value) {
            addCriterion("extend_flag <=", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagIn(List<Integer> values) {
            addCriterion("extend_flag in", values, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagNotIn(List<Integer> values) {
            addCriterion("extend_flag not in", values, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagBetween(Integer value1, Integer value2) {
            addCriterion("extend_flag between", value1, value2, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("extend_flag not between", value1, value2, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagIsNull() {
            addCriterion("migrate_flag is null");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagIsNotNull() {
            addCriterion("migrate_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagEqualTo(Integer value) {
            addCriterion("migrate_flag =", value, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagNotEqualTo(Integer value) {
            addCriterion("migrate_flag <>", value, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagGreaterThan(Integer value) {
            addCriterion("migrate_flag >", value, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("migrate_flag >=", value, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagLessThan(Integer value) {
            addCriterion("migrate_flag <", value, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagLessThanOrEqualTo(Integer value) {
            addCriterion("migrate_flag <=", value, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagIn(List<Integer> values) {
            addCriterion("migrate_flag in", values, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagNotIn(List<Integer> values) {
            addCriterion("migrate_flag not in", values, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagBetween(Integer value1, Integer value2) {
            addCriterion("migrate_flag between", value1, value2, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andMigrateFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("migrate_flag not between", value1, value2, "migrateFlag");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressIsNull() {
            addCriterion("immigrate_address is null");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressIsNotNull() {
            addCriterion("immigrate_address is not null");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressEqualTo(String value) {
            addCriterion("immigrate_address =", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressNotEqualTo(String value) {
            addCriterion("immigrate_address <>", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressGreaterThan(String value) {
            addCriterion("immigrate_address >", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressGreaterThanOrEqualTo(String value) {
            addCriterion("immigrate_address >=", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressLessThan(String value) {
            addCriterion("immigrate_address <", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressLessThanOrEqualTo(String value) {
            addCriterion("immigrate_address <=", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressLike(String value) {
            addCriterion("immigrate_address like", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressNotLike(String value) {
            addCriterion("immigrate_address not like", value, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressIn(List<String> values) {
            addCriterion("immigrate_address in", values, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressNotIn(List<String> values) {
            addCriterion("immigrate_address not in", values, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressBetween(String value1, String value2) {
            addCriterion("immigrate_address between", value1, value2, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateAddressNotBetween(String value1, String value2) {
            addCriterion("immigrate_address not between", value1, value2, "immigrateAddress");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeIsNull() {
            addCriterion("immigrate_time is null");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeIsNotNull() {
            addCriterion("immigrate_time is not null");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeEqualTo(String value) {
            addCriterion("immigrate_time =", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeNotEqualTo(String value) {
            addCriterion("immigrate_time <>", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeGreaterThan(String value) {
            addCriterion("immigrate_time >", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("immigrate_time >=", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeLessThan(String value) {
            addCriterion("immigrate_time <", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeLessThanOrEqualTo(String value) {
            addCriterion("immigrate_time <=", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeLike(String value) {
            addCriterion("immigrate_time like", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeNotLike(String value) {
            addCriterion("immigrate_time not like", value, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeIn(List<String> values) {
            addCriterion("immigrate_time in", values, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeNotIn(List<String> values) {
            addCriterion("immigrate_time not in", values, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeBetween(String value1, String value2) {
            addCriterion("immigrate_time between", value1, value2, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andImmigrateTimeNotBetween(String value1, String value2) {
            addCriterion("immigrate_time not between", value1, value2, "immigrateTime");
            return (Criteria) this;
        }

        public Criteria andSubManagerIsNull() {
            addCriterion("sub_manager is null");
            return (Criteria) this;
        }

        public Criteria andSubManagerIsNotNull() {
            addCriterion("sub_manager is not null");
            return (Criteria) this;
        }

        public Criteria andSubManagerEqualTo(String value) {
            addCriterion("sub_manager =", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerNotEqualTo(String value) {
            addCriterion("sub_manager <>", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerGreaterThan(String value) {
            addCriterion("sub_manager >", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerGreaterThanOrEqualTo(String value) {
            addCriterion("sub_manager >=", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerLessThan(String value) {
            addCriterion("sub_manager <", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerLessThanOrEqualTo(String value) {
            addCriterion("sub_manager <=", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerLike(String value) {
            addCriterion("sub_manager like", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerNotLike(String value) {
            addCriterion("sub_manager not like", value, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerIn(List<String> values) {
            addCriterion("sub_manager in", values, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerNotIn(List<String> values) {
            addCriterion("sub_manager not in", values, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerBetween(String value1, String value2) {
            addCriterion("sub_manager between", value1, value2, "subManager");
            return (Criteria) this;
        }

        public Criteria andSubManagerNotBetween(String value1, String value2) {
            addCriterion("sub_manager not between", value1, value2, "subManager");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNull() {
            addCriterion("manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNotNull() {
            addCriterion("manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneEqualTo(String value) {
            addCriterion("manager_phone =", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotEqualTo(String value) {
            addCriterion("manager_phone <>", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThan(String value) {
            addCriterion("manager_phone >", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("manager_phone >=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThan(String value) {
            addCriterion("manager_phone <", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("manager_phone <=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLike(String value) {
            addCriterion("manager_phone like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotLike(String value) {
            addCriterion("manager_phone not like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIn(List<String> values) {
            addCriterion("manager_phone in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotIn(List<String> values) {
            addCriterion("manager_phone not in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneBetween(String value1, String value2) {
            addCriterion("manager_phone between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("manager_phone not between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andSubContactorIsNull() {
            addCriterion("sub_contactor is null");
            return (Criteria) this;
        }

        public Criteria andSubContactorIsNotNull() {
            addCriterion("sub_contactor is not null");
            return (Criteria) this;
        }

        public Criteria andSubContactorEqualTo(String value) {
            addCriterion("sub_contactor =", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorNotEqualTo(String value) {
            addCriterion("sub_contactor <>", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorGreaterThan(String value) {
            addCriterion("sub_contactor >", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorGreaterThanOrEqualTo(String value) {
            addCriterion("sub_contactor >=", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorLessThan(String value) {
            addCriterion("sub_contactor <", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorLessThanOrEqualTo(String value) {
            addCriterion("sub_contactor <=", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorLike(String value) {
            addCriterion("sub_contactor like", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorNotLike(String value) {
            addCriterion("sub_contactor not like", value, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorIn(List<String> values) {
            addCriterion("sub_contactor in", values, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorNotIn(List<String> values) {
            addCriterion("sub_contactor not in", values, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorBetween(String value1, String value2) {
            addCriterion("sub_contactor between", value1, value2, "subContactor");
            return (Criteria) this;
        }

        public Criteria andSubContactorNotBetween(String value1, String value2) {
            addCriterion("sub_contactor not between", value1, value2, "subContactor");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneIsNull() {
            addCriterion("contactor_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneIsNotNull() {
            addCriterion("contactor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneEqualTo(String value) {
            addCriterion("contactor_phone =", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneNotEqualTo(String value) {
            addCriterion("contactor_phone <>", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneGreaterThan(String value) {
            addCriterion("contactor_phone >", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactor_phone >=", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneLessThan(String value) {
            addCriterion("contactor_phone <", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneLessThanOrEqualTo(String value) {
            addCriterion("contactor_phone <=", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneLike(String value) {
            addCriterion("contactor_phone like", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneNotLike(String value) {
            addCriterion("contactor_phone not like", value, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneIn(List<String> values) {
            addCriterion("contactor_phone in", values, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneNotIn(List<String> values) {
            addCriterion("contactor_phone not in", values, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneBetween(String value1, String value2) {
            addCriterion("contactor_phone between", value1, value2, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andContactorPhoneNotBetween(String value1, String value2) {
            addCriterion("contactor_phone not between", value1, value2, "contactorPhone");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalIsNull() {
            addCriterion("sub_clan_name_original is null");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalIsNotNull() {
            addCriterion("sub_clan_name_original is not null");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalEqualTo(String value) {
            addCriterion("sub_clan_name_original =", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalNotEqualTo(String value) {
            addCriterion("sub_clan_name_original <>", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalGreaterThan(String value) {
            addCriterion("sub_clan_name_original >", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("sub_clan_name_original >=", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalLessThan(String value) {
            addCriterion("sub_clan_name_original <", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalLessThanOrEqualTo(String value) {
            addCriterion("sub_clan_name_original <=", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalLike(String value) {
            addCriterion("sub_clan_name_original like", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalNotLike(String value) {
            addCriterion("sub_clan_name_original not like", value, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalIn(List<String> values) {
            addCriterion("sub_clan_name_original in", values, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalNotIn(List<String> values) {
            addCriterion("sub_clan_name_original not in", values, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalBetween(String value1, String value2) {
            addCriterion("sub_clan_name_original between", value1, value2, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andSubClanNameOriginalNotBetween(String value1, String value2) {
            addCriterion("sub_clan_name_original not between", value1, value2, "subClanNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalIsNull() {
            addCriterion("level_name_original is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalIsNotNull() {
            addCriterion("level_name_original is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalEqualTo(String value) {
            addCriterion("level_name_original =", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalNotEqualTo(String value) {
            addCriterion("level_name_original <>", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalGreaterThan(String value) {
            addCriterion("level_name_original >", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("level_name_original >=", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalLessThan(String value) {
            addCriterion("level_name_original <", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalLessThanOrEqualTo(String value) {
            addCriterion("level_name_original <=", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalLike(String value) {
            addCriterion("level_name_original like", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalNotLike(String value) {
            addCriterion("level_name_original not like", value, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalIn(List<String> values) {
            addCriterion("level_name_original in", values, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalNotIn(List<String> values) {
            addCriterion("level_name_original not in", values, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalBetween(String value1, String value2) {
            addCriterion("level_name_original between", value1, value2, "levelNameOriginal");
            return (Criteria) this;
        }

        public Criteria andLevelNameOriginalNotBetween(String value1, String value2) {
            addCriterion("level_name_original not between", value1, value2, "levelNameOriginal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}