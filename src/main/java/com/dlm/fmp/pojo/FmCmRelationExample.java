package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmCmRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmCmRelationExample() {
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

        public Criteria andFamilyMemberIdIsNull() {
            addCriterion("family_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdIsNotNull() {
            addCriterion("family_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdEqualTo(Integer value) {
            addCriterion("family_member_id =", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotEqualTo(Integer value) {
            addCriterion("family_member_id <>", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdGreaterThan(Integer value) {
            addCriterion("family_member_id >", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_member_id >=", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdLessThan(Integer value) {
            addCriterion("family_member_id <", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_member_id <=", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdIn(List<Integer> values) {
            addCriterion("family_member_id in", values, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotIn(List<Integer> values) {
            addCriterion("family_member_id not in", values, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("family_member_id between", value1, value2, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_member_id not between", value1, value2, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeIsNull() {
            addCriterion("family_member_code is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeIsNotNull() {
            addCriterion("family_member_code is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeEqualTo(String value) {
            addCriterion("family_member_code =", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotEqualTo(String value) {
            addCriterion("family_member_code <>", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeGreaterThan(String value) {
            addCriterion("family_member_code >", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("family_member_code >=", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeLessThan(String value) {
            addCriterion("family_member_code <", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeLessThanOrEqualTo(String value) {
            addCriterion("family_member_code <=", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeLike(String value) {
            addCriterion("family_member_code like", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotLike(String value) {
            addCriterion("family_member_code not like", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeIn(List<String> values) {
            addCriterion("family_member_code in", values, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotIn(List<String> values) {
            addCriterion("family_member_code not in", values, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeBetween(String value1, String value2) {
            addCriterion("family_member_code between", value1, value2, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotBetween(String value1, String value2) {
            addCriterion("family_member_code not between", value1, value2, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdIsNull() {
            addCriterion("cm_content_final_id is null");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdIsNotNull() {
            addCriterion("cm_content_final_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdEqualTo(Integer value) {
            addCriterion("cm_content_final_id =", value, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdNotEqualTo(Integer value) {
            addCriterion("cm_content_final_id <>", value, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdGreaterThan(Integer value) {
            addCriterion("cm_content_final_id >", value, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_content_final_id >=", value, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdLessThan(Integer value) {
            addCriterion("cm_content_final_id <", value, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_content_final_id <=", value, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdIn(List<Integer> values) {
            addCriterion("cm_content_final_id in", values, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdNotIn(List<Integer> values) {
            addCriterion("cm_content_final_id not in", values, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_content_final_id between", value1, value2, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andCmContentFinalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_content_final_id not between", value1, value2, "cmContentFinalId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNull() {
            addCriterion("family_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("family_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(Integer value) {
            addCriterion("family_id =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(Integer value) {
            addCriterion("family_id <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(Integer value) {
            addCriterion("family_id >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_id >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(Integer value) {
            addCriterion("family_id <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_id <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<Integer> values) {
            addCriterion("family_id in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<Integer> values) {
            addCriterion("family_id not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("family_id between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_id not between", value1, value2, "familyId");
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