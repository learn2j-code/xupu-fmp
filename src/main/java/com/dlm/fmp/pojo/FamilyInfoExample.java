package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FamilyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilyInfoExample() {
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

        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleIsNull() {
            addCriterion("family_title is null");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleIsNotNull() {
            addCriterion("family_title is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleEqualTo(String value) {
            addCriterion("family_title =", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleNotEqualTo(String value) {
            addCriterion("family_title <>", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleGreaterThan(String value) {
            addCriterion("family_title >", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("family_title >=", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleLessThan(String value) {
            addCriterion("family_title <", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleLessThanOrEqualTo(String value) {
            addCriterion("family_title <=", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleLike(String value) {
            addCriterion("family_title like", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleNotLike(String value) {
            addCriterion("family_title not like", value, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleIn(List<String> values) {
            addCriterion("family_title in", values, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleNotIn(List<String> values) {
            addCriterion("family_title not in", values, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleBetween(String value1, String value2) {
            addCriterion("family_title between", value1, value2, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andFamilyTitleNotBetween(String value1, String value2) {
            addCriterion("family_title not between", value1, value2, "familyTitle");
            return (Criteria) this;
        }

        public Criteria andSurnameIdIsNull() {
            addCriterion("surname_id is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIdIsNotNull() {
            addCriterion("surname_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameIdEqualTo(Integer value) {
            addCriterion("surname_id =", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdNotEqualTo(Integer value) {
            addCriterion("surname_id <>", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdGreaterThan(Integer value) {
            addCriterion("surname_id >", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("surname_id >=", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdLessThan(Integer value) {
            addCriterion("surname_id <", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdLessThanOrEqualTo(Integer value) {
            addCriterion("surname_id <=", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdIn(List<Integer> values) {
            addCriterion("surname_id in", values, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdNotIn(List<Integer> values) {
            addCriterion("surname_id not in", values, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdBetween(Integer value1, Integer value2) {
            addCriterion("surname_id between", value1, value2, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("surname_id not between", value1, value2, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNull() {
            addCriterion("surname is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNotNull() {
            addCriterion("surname is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameEqualTo(String value) {
            addCriterion("surname =", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotEqualTo(String value) {
            addCriterion("surname <>", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThan(String value) {
            addCriterion("surname >", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThanOrEqualTo(String value) {
            addCriterion("surname >=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThan(String value) {
            addCriterion("surname <", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThanOrEqualTo(String value) {
            addCriterion("surname <=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLike(String value) {
            addCriterion("surname like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotLike(String value) {
            addCriterion("surname not like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameIn(List<String> values) {
            addCriterion("surname in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotIn(List<String> values) {
            addCriterion("surname not in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameBetween(String value1, String value2) {
            addCriterion("surname between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotBetween(String value1, String value2) {
            addCriterion("surname not between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andAncestorNameIsNull() {
            addCriterion("ancestor_name is null");
            return (Criteria) this;
        }

        public Criteria andAncestorNameIsNotNull() {
            addCriterion("ancestor_name is not null");
            return (Criteria) this;
        }

        public Criteria andAncestorNameEqualTo(String value) {
            addCriterion("ancestor_name =", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotEqualTo(String value) {
            addCriterion("ancestor_name <>", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameGreaterThan(String value) {
            addCriterion("ancestor_name >", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameGreaterThanOrEqualTo(String value) {
            addCriterion("ancestor_name >=", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameLessThan(String value) {
            addCriterion("ancestor_name <", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameLessThanOrEqualTo(String value) {
            addCriterion("ancestor_name <=", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameLike(String value) {
            addCriterion("ancestor_name like", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotLike(String value) {
            addCriterion("ancestor_name not like", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameIn(List<String> values) {
            addCriterion("ancestor_name in", values, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotIn(List<String> values) {
            addCriterion("ancestor_name not in", values, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameBetween(String value1, String value2) {
            addCriterion("ancestor_name between", value1, value2, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotBetween(String value1, String value2) {
            addCriterion("ancestor_name not between", value1, value2, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyIsNull() {
            addCriterion("settlement_roughly is null");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyIsNotNull() {
            addCriterion("settlement_roughly is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyEqualTo(String value) {
            addCriterion("settlement_roughly =", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyNotEqualTo(String value) {
            addCriterion("settlement_roughly <>", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyGreaterThan(String value) {
            addCriterion("settlement_roughly >", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_roughly >=", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyLessThan(String value) {
            addCriterion("settlement_roughly <", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyLessThanOrEqualTo(String value) {
            addCriterion("settlement_roughly <=", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyLike(String value) {
            addCriterion("settlement_roughly like", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyNotLike(String value) {
            addCriterion("settlement_roughly not like", value, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyIn(List<String> values) {
            addCriterion("settlement_roughly in", values, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyNotIn(List<String> values) {
            addCriterion("settlement_roughly not in", values, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyBetween(String value1, String value2) {
            addCriterion("settlement_roughly between", value1, value2, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementRoughlyNotBetween(String value1, String value2) {
            addCriterion("settlement_roughly not between", value1, value2, "settlementRoughly");
            return (Criteria) this;
        }

        public Criteria andSettlementExactIsNull() {
            addCriterion("settlement_exact is null");
            return (Criteria) this;
        }

        public Criteria andSettlementExactIsNotNull() {
            addCriterion("settlement_exact is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementExactEqualTo(String value) {
            addCriterion("settlement_exact =", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactNotEqualTo(String value) {
            addCriterion("settlement_exact <>", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactGreaterThan(String value) {
            addCriterion("settlement_exact >", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_exact >=", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactLessThan(String value) {
            addCriterion("settlement_exact <", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactLessThanOrEqualTo(String value) {
            addCriterion("settlement_exact <=", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactLike(String value) {
            addCriterion("settlement_exact like", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactNotLike(String value) {
            addCriterion("settlement_exact not like", value, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactIn(List<String> values) {
            addCriterion("settlement_exact in", values, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactNotIn(List<String> values) {
            addCriterion("settlement_exact not in", values, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactBetween(String value1, String value2) {
            addCriterion("settlement_exact between", value1, value2, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementExactNotBetween(String value1, String value2) {
            addCriterion("settlement_exact not between", value1, value2, "settlementExact");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNull() {
            addCriterion("settlement_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNotNull() {
            addCriterion("settlement_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeEqualTo(String value) {
            addCriterion("settlement_time =", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotEqualTo(String value) {
            addCriterion("settlement_time <>", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThan(String value) {
            addCriterion("settlement_time >", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_time >=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThan(String value) {
            addCriterion("settlement_time <", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThanOrEqualTo(String value) {
            addCriterion("settlement_time <=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLike(String value) {
            addCriterion("settlement_time like", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotLike(String value) {
            addCriterion("settlement_time not like", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIn(List<String> values) {
            addCriterion("settlement_time in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotIn(List<String> values) {
            addCriterion("settlement_time not in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeBetween(String value1, String value2) {
            addCriterion("settlement_time between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotBetween(String value1, String value2) {
            addCriterion("settlement_time not between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyIsNull() {
            addCriterion("emigration_roughly is null");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyIsNotNull() {
            addCriterion("emigration_roughly is not null");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyEqualTo(String value) {
            addCriterion("emigration_roughly =", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyNotEqualTo(String value) {
            addCriterion("emigration_roughly <>", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyGreaterThan(String value) {
            addCriterion("emigration_roughly >", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyGreaterThanOrEqualTo(String value) {
            addCriterion("emigration_roughly >=", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyLessThan(String value) {
            addCriterion("emigration_roughly <", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyLessThanOrEqualTo(String value) {
            addCriterion("emigration_roughly <=", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyLike(String value) {
            addCriterion("emigration_roughly like", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyNotLike(String value) {
            addCriterion("emigration_roughly not like", value, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyIn(List<String> values) {
            addCriterion("emigration_roughly in", values, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyNotIn(List<String> values) {
            addCriterion("emigration_roughly not in", values, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyBetween(String value1, String value2) {
            addCriterion("emigration_roughly between", value1, value2, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationRoughlyNotBetween(String value1, String value2) {
            addCriterion("emigration_roughly not between", value1, value2, "emigrationRoughly");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactIsNull() {
            addCriterion("emigration_exact is null");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactIsNotNull() {
            addCriterion("emigration_exact is not null");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactEqualTo(String value) {
            addCriterion("emigration_exact =", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactNotEqualTo(String value) {
            addCriterion("emigration_exact <>", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactGreaterThan(String value) {
            addCriterion("emigration_exact >", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactGreaterThanOrEqualTo(String value) {
            addCriterion("emigration_exact >=", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactLessThan(String value) {
            addCriterion("emigration_exact <", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactLessThanOrEqualTo(String value) {
            addCriterion("emigration_exact <=", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactLike(String value) {
            addCriterion("emigration_exact like", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactNotLike(String value) {
            addCriterion("emigration_exact not like", value, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactIn(List<String> values) {
            addCriterion("emigration_exact in", values, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactNotIn(List<String> values) {
            addCriterion("emigration_exact not in", values, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactBetween(String value1, String value2) {
            addCriterion("emigration_exact between", value1, value2, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationExactNotBetween(String value1, String value2) {
            addCriterion("emigration_exact not between", value1, value2, "emigrationExact");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeIsNull() {
            addCriterion("emigration_time is null");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeIsNotNull() {
            addCriterion("emigration_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeEqualTo(String value) {
            addCriterion("emigration_time =", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeNotEqualTo(String value) {
            addCriterion("emigration_time <>", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeGreaterThan(String value) {
            addCriterion("emigration_time >", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("emigration_time >=", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeLessThan(String value) {
            addCriterion("emigration_time <", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeLessThanOrEqualTo(String value) {
            addCriterion("emigration_time <=", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeLike(String value) {
            addCriterion("emigration_time like", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeNotLike(String value) {
            addCriterion("emigration_time not like", value, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeIn(List<String> values) {
            addCriterion("emigration_time in", values, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeNotIn(List<String> values) {
            addCriterion("emigration_time not in", values, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeBetween(String value1, String value2) {
            addCriterion("emigration_time between", value1, value2, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andEmigrationTimeNotBetween(String value1, String value2) {
            addCriterion("emigration_time not between", value1, value2, "emigrationTime");
            return (Criteria) this;
        }

        public Criteria andTotemAddressIsNull() {
            addCriterion("totem_address is null");
            return (Criteria) this;
        }

        public Criteria andTotemAddressIsNotNull() {
            addCriterion("totem_address is not null");
            return (Criteria) this;
        }

        public Criteria andTotemAddressEqualTo(String value) {
            addCriterion("totem_address =", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotEqualTo(String value) {
            addCriterion("totem_address <>", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressGreaterThan(String value) {
            addCriterion("totem_address >", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressGreaterThanOrEqualTo(String value) {
            addCriterion("totem_address >=", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressLessThan(String value) {
            addCriterion("totem_address <", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressLessThanOrEqualTo(String value) {
            addCriterion("totem_address <=", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressLike(String value) {
            addCriterion("totem_address like", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotLike(String value) {
            addCriterion("totem_address not like", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressIn(List<String> values) {
            addCriterion("totem_address in", values, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotIn(List<String> values) {
            addCriterion("totem_address not in", values, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressBetween(String value1, String value2) {
            addCriterion("totem_address between", value1, value2, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotBetween(String value1, String value2) {
            addCriterion("totem_address not between", value1, value2, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemStoryIsNull() {
            addCriterion("totem_story is null");
            return (Criteria) this;
        }

        public Criteria andTotemStoryIsNotNull() {
            addCriterion("totem_story is not null");
            return (Criteria) this;
        }

        public Criteria andTotemStoryEqualTo(String value) {
            addCriterion("totem_story =", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryNotEqualTo(String value) {
            addCriterion("totem_story <>", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryGreaterThan(String value) {
            addCriterion("totem_story >", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryGreaterThanOrEqualTo(String value) {
            addCriterion("totem_story >=", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryLessThan(String value) {
            addCriterion("totem_story <", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryLessThanOrEqualTo(String value) {
            addCriterion("totem_story <=", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryLike(String value) {
            addCriterion("totem_story like", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryNotLike(String value) {
            addCriterion("totem_story not like", value, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryIn(List<String> values) {
            addCriterion("totem_story in", values, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryNotIn(List<String> values) {
            addCriterion("totem_story not in", values, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryBetween(String value1, String value2) {
            addCriterion("totem_story between", value1, value2, "totemStory");
            return (Criteria) this;
        }

        public Criteria andTotemStoryNotBetween(String value1, String value2) {
            addCriterion("totem_story not between", value1, value2, "totemStory");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentIsNull() {
            addCriterion("seniority_content is null");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentIsNotNull() {
            addCriterion("seniority_content is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentEqualTo(String value) {
            addCriterion("seniority_content =", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentNotEqualTo(String value) {
            addCriterion("seniority_content <>", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentGreaterThan(String value) {
            addCriterion("seniority_content >", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentGreaterThanOrEqualTo(String value) {
            addCriterion("seniority_content >=", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentLessThan(String value) {
            addCriterion("seniority_content <", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentLessThanOrEqualTo(String value) {
            addCriterion("seniority_content <=", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentLike(String value) {
            addCriterion("seniority_content like", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentNotLike(String value) {
            addCriterion("seniority_content not like", value, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentIn(List<String> values) {
            addCriterion("seniority_content in", values, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentNotIn(List<String> values) {
            addCriterion("seniority_content not in", values, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentBetween(String value1, String value2) {
            addCriterion("seniority_content between", value1, value2, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andSeniorityContentNotBetween(String value1, String value2) {
            addCriterion("seniority_content not between", value1, value2, "seniorityContent");
            return (Criteria) this;
        }

        public Criteria andContactorIsNull() {
            addCriterion("contactor is null");
            return (Criteria) this;
        }

        public Criteria andContactorIsNotNull() {
            addCriterion("contactor is not null");
            return (Criteria) this;
        }

        public Criteria andContactorEqualTo(String value) {
            addCriterion("contactor =", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotEqualTo(String value) {
            addCriterion("contactor <>", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThan(String value) {
            addCriterion("contactor >", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThanOrEqualTo(String value) {
            addCriterion("contactor >=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThan(String value) {
            addCriterion("contactor <", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThanOrEqualTo(String value) {
            addCriterion("contactor <=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLike(String value) {
            addCriterion("contactor like", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotLike(String value) {
            addCriterion("contactor not like", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorIn(List<String> values) {
            addCriterion("contactor in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotIn(List<String> values) {
            addCriterion("contactor not in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorBetween(String value1, String value2) {
            addCriterion("contactor between", value1, value2, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotBetween(String value1, String value2) {
            addCriterion("contactor not between", value1, value2, "contactor");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNull() {
            addCriterion("location_code is null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNotNull() {
            addCriterion("location_code is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeEqualTo(String value) {
            addCriterion("location_code =", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotEqualTo(String value) {
            addCriterion("location_code <>", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThan(String value) {
            addCriterion("location_code >", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("location_code >=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThan(String value) {
            addCriterion("location_code <", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThanOrEqualTo(String value) {
            addCriterion("location_code <=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLike(String value) {
            addCriterion("location_code like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotLike(String value) {
            addCriterion("location_code not like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIn(List<String> values) {
            addCriterion("location_code in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotIn(List<String> values) {
            addCriterion("location_code not in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeBetween(String value1, String value2) {
            addCriterion("location_code between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotBetween(String value1, String value2) {
            addCriterion("location_code not between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagIsNull() {
            addCriterion("frozen_flag is null");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagIsNotNull() {
            addCriterion("frozen_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagEqualTo(Integer value) {
            addCriterion("frozen_flag =", value, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagNotEqualTo(Integer value) {
            addCriterion("frozen_flag <>", value, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagGreaterThan(Integer value) {
            addCriterion("frozen_flag >", value, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("frozen_flag >=", value, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagLessThan(Integer value) {
            addCriterion("frozen_flag <", value, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagLessThanOrEqualTo(Integer value) {
            addCriterion("frozen_flag <=", value, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagIn(List<Integer> values) {
            addCriterion("frozen_flag in", values, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagNotIn(List<Integer> values) {
            addCriterion("frozen_flag not in", values, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagBetween(Integer value1, Integer value2) {
            addCriterion("frozen_flag between", value1, value2, "frozenFlag");
            return (Criteria) this;
        }

        public Criteria andFrozenFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("frozen_flag not between", value1, value2, "frozenFlag");
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