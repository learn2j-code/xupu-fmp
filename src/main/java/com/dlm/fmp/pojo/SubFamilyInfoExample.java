package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubFamilyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubFamilyInfoExample() {
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

        public Criteria andSubFamilyNoIsNull() {
            addCriterion("sub_family_no is null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoIsNotNull() {
            addCriterion("sub_family_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoEqualTo(String value) {
            addCriterion("sub_family_no =", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoNotEqualTo(String value) {
            addCriterion("sub_family_no <>", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoGreaterThan(String value) {
            addCriterion("sub_family_no >", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoGreaterThanOrEqualTo(String value) {
            addCriterion("sub_family_no >=", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoLessThan(String value) {
            addCriterion("sub_family_no <", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoLessThanOrEqualTo(String value) {
            addCriterion("sub_family_no <=", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoLike(String value) {
            addCriterion("sub_family_no like", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoNotLike(String value) {
            addCriterion("sub_family_no not like", value, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoIn(List<String> values) {
            addCriterion("sub_family_no in", values, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoNotIn(List<String> values) {
            addCriterion("sub_family_no not in", values, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoBetween(String value1, String value2) {
            addCriterion("sub_family_no between", value1, value2, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNoNotBetween(String value1, String value2) {
            addCriterion("sub_family_no not between", value1, value2, "subFamilyNo");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeIsNull() {
            addCriterion("sub_family_code is null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeIsNotNull() {
            addCriterion("sub_family_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeEqualTo(String value) {
            addCriterion("sub_family_code =", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotEqualTo(String value) {
            addCriterion("sub_family_code <>", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeGreaterThan(String value) {
            addCriterion("sub_family_code >", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_family_code >=", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeLessThan(String value) {
            addCriterion("sub_family_code <", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_family_code <=", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeLike(String value) {
            addCriterion("sub_family_code like", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotLike(String value) {
            addCriterion("sub_family_code not like", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeIn(List<String> values) {
            addCriterion("sub_family_code in", values, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotIn(List<String> values) {
            addCriterion("sub_family_code not in", values, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeBetween(String value1, String value2) {
            addCriterion("sub_family_code between", value1, value2, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotBetween(String value1, String value2) {
            addCriterion("sub_family_code not between", value1, value2, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameIsNull() {
            addCriterion("sub_ancestor_name is null");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameIsNotNull() {
            addCriterion("sub_ancestor_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameEqualTo(String value) {
            addCriterion("sub_ancestor_name =", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameNotEqualTo(String value) {
            addCriterion("sub_ancestor_name <>", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameGreaterThan(String value) {
            addCriterion("sub_ancestor_name >", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_ancestor_name >=", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameLessThan(String value) {
            addCriterion("sub_ancestor_name <", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameLessThanOrEqualTo(String value) {
            addCriterion("sub_ancestor_name <=", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameLike(String value) {
            addCriterion("sub_ancestor_name like", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameNotLike(String value) {
            addCriterion("sub_ancestor_name not like", value, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameIn(List<String> values) {
            addCriterion("sub_ancestor_name in", values, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameNotIn(List<String> values) {
            addCriterion("sub_ancestor_name not in", values, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameBetween(String value1, String value2) {
            addCriterion("sub_ancestor_name between", value1, value2, "subAncestorName");
            return (Criteria) this;
        }

        public Criteria andSubAncestorNameNotBetween(String value1, String value2) {
            addCriterion("sub_ancestor_name not between", value1, value2, "subAncestorName");
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

        public Criteria andSubManagerIdIsNull() {
            addCriterion("sub_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdIsNotNull() {
            addCriterion("sub_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdEqualTo(Integer value) {
            addCriterion("sub_manager_id =", value, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdNotEqualTo(Integer value) {
            addCriterion("sub_manager_id <>", value, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdGreaterThan(Integer value) {
            addCriterion("sub_manager_id >", value, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_manager_id >=", value, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdLessThan(Integer value) {
            addCriterion("sub_manager_id <", value, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_manager_id <=", value, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdIn(List<Integer> values) {
            addCriterion("sub_manager_id in", values, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdNotIn(List<Integer> values) {
            addCriterion("sub_manager_id not in", values, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_manager_id between", value1, value2, "subManagerId");
            return (Criteria) this;
        }

        public Criteria andSubManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_manager_id not between", value1, value2, "subManagerId");
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

        public Criteria andFamilyMemeberIdIsNull() {
            addCriterion("family_memeber_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdIsNotNull() {
            addCriterion("family_memeber_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdEqualTo(Integer value) {
            addCriterion("family_memeber_id =", value, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdNotEqualTo(Integer value) {
            addCriterion("family_memeber_id <>", value, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdGreaterThan(Integer value) {
            addCriterion("family_memeber_id >", value, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_memeber_id >=", value, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdLessThan(Integer value) {
            addCriterion("family_memeber_id <", value, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_memeber_id <=", value, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdIn(List<Integer> values) {
            addCriterion("family_memeber_id in", values, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdNotIn(List<Integer> values) {
            addCriterion("family_memeber_id not in", values, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdBetween(Integer value1, Integer value2) {
            addCriterion("family_memeber_id between", value1, value2, "familyMemeberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemeberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_memeber_id not between", value1, value2, "familyMemeberId");
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