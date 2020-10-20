package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseholdPayEvidenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdPayEvidenceExample() {
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

        public Criteria andEvidenceAddressIsNull() {
            addCriterion("evidence_address is null");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressIsNotNull() {
            addCriterion("evidence_address is not null");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressEqualTo(String value) {
            addCriterion("evidence_address =", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressNotEqualTo(String value) {
            addCriterion("evidence_address <>", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressGreaterThan(String value) {
            addCriterion("evidence_address >", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("evidence_address >=", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressLessThan(String value) {
            addCriterion("evidence_address <", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressLessThanOrEqualTo(String value) {
            addCriterion("evidence_address <=", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressLike(String value) {
            addCriterion("evidence_address like", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressNotLike(String value) {
            addCriterion("evidence_address not like", value, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressIn(List<String> values) {
            addCriterion("evidence_address in", values, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressNotIn(List<String> values) {
            addCriterion("evidence_address not in", values, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressBetween(String value1, String value2) {
            addCriterion("evidence_address between", value1, value2, "evidenceAddress");
            return (Criteria) this;
        }

        public Criteria andEvidenceAddressNotBetween(String value1, String value2) {
            addCriterion("evidence_address not between", value1, value2, "evidenceAddress");
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

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
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