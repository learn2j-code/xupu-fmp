package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmHmRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmHmRelationExample() {
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

        public Criteria andHouseholdMemberIdIsNull() {
            addCriterion("household_member_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdIsNotNull() {
            addCriterion("household_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdEqualTo(Integer value) {
            addCriterion("household_member_id =", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdNotEqualTo(Integer value) {
            addCriterion("household_member_id <>", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdGreaterThan(Integer value) {
            addCriterion("household_member_id >", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("household_member_id >=", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdLessThan(Integer value) {
            addCriterion("household_member_id <", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("household_member_id <=", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdIn(List<Integer> values) {
            addCriterion("household_member_id in", values, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdNotIn(List<Integer> values) {
            addCriterion("household_member_id not in", values, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("household_member_id between", value1, value2, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("household_member_id not between", value1, value2, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeIsNull() {
            addCriterion("household_member_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeIsNotNull() {
            addCriterion("household_member_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeEqualTo(String value) {
            addCriterion("household_member_code =", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotEqualTo(String value) {
            addCriterion("household_member_code <>", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeGreaterThan(String value) {
            addCriterion("household_member_code >", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_member_code >=", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeLessThan(String value) {
            addCriterion("household_member_code <", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeLessThanOrEqualTo(String value) {
            addCriterion("household_member_code <=", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeLike(String value) {
            addCriterion("household_member_code like", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotLike(String value) {
            addCriterion("household_member_code not like", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeIn(List<String> values) {
            addCriterion("household_member_code in", values, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotIn(List<String> values) {
            addCriterion("household_member_code not in", values, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeBetween(String value1, String value2) {
            addCriterion("household_member_code between", value1, value2, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotBetween(String value1, String value2) {
            addCriterion("household_member_code not between", value1, value2, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIsNull() {
            addCriterion("household_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIsNotNull() {
            addCriterion("household_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdEqualTo(Integer value) {
            addCriterion("household_id =", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotEqualTo(Integer value) {
            addCriterion("household_id <>", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdGreaterThan(Integer value) {
            addCriterion("household_id >", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("household_id >=", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdLessThan(Integer value) {
            addCriterion("household_id <", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdLessThanOrEqualTo(Integer value) {
            addCriterion("household_id <=", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIn(List<Integer> values) {
            addCriterion("household_id in", values, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotIn(List<Integer> values) {
            addCriterion("household_id not in", values, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdBetween(Integer value1, Integer value2) {
            addCriterion("household_id between", value1, value2, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("household_id not between", value1, value2, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNull() {
            addCriterion("household_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNotNull() {
            addCriterion("household_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeEqualTo(String value) {
            addCriterion("household_code =", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotEqualTo(String value) {
            addCriterion("household_code <>", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThan(String value) {
            addCriterion("household_code >", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_code >=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThan(String value) {
            addCriterion("household_code <", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThanOrEqualTo(String value) {
            addCriterion("household_code <=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLike(String value) {
            addCriterion("household_code like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotLike(String value) {
            addCriterion("household_code not like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIn(List<String> values) {
            addCriterion("household_code in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotIn(List<String> values) {
            addCriterion("household_code not in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeBetween(String value1, String value2) {
            addCriterion("household_code between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotBetween(String value1, String value2) {
            addCriterion("household_code not between", value1, value2, "householdCode");
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