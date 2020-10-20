package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FamilySettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilySettingExample() {
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

        public Criteria andXupuFlagIsNull() {
            addCriterion("xupu_flag is null");
            return (Criteria) this;
        }

        public Criteria andXupuFlagIsNotNull() {
            addCriterion("xupu_flag is not null");
            return (Criteria) this;
        }

        public Criteria andXupuFlagEqualTo(Integer value) {
            addCriterion("xupu_flag =", value, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagNotEqualTo(Integer value) {
            addCriterion("xupu_flag <>", value, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagGreaterThan(Integer value) {
            addCriterion("xupu_flag >", value, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("xupu_flag >=", value, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagLessThan(Integer value) {
            addCriterion("xupu_flag <", value, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagLessThanOrEqualTo(Integer value) {
            addCriterion("xupu_flag <=", value, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagIn(List<Integer> values) {
            addCriterion("xupu_flag in", values, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagNotIn(List<Integer> values) {
            addCriterion("xupu_flag not in", values, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagBetween(Integer value1, Integer value2) {
            addCriterion("xupu_flag between", value1, value2, "xupuFlag");
            return (Criteria) this;
        }

        public Criteria andXupuFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("xupu_flag not between", value1, value2, "xupuFlag");
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

        public Criteria andSoninlawFlagIsNull() {
            addCriterion("soninlaw_flag is null");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagIsNotNull() {
            addCriterion("soninlaw_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagEqualTo(Integer value) {
            addCriterion("soninlaw_flag =", value, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagNotEqualTo(Integer value) {
            addCriterion("soninlaw_flag <>", value, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagGreaterThan(Integer value) {
            addCriterion("soninlaw_flag >", value, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("soninlaw_flag >=", value, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagLessThan(Integer value) {
            addCriterion("soninlaw_flag <", value, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagLessThanOrEqualTo(Integer value) {
            addCriterion("soninlaw_flag <=", value, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagIn(List<Integer> values) {
            addCriterion("soninlaw_flag in", values, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagNotIn(List<Integer> values) {
            addCriterion("soninlaw_flag not in", values, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagBetween(Integer value1, Integer value2) {
            addCriterion("soninlaw_flag between", value1, value2, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andSoninlawFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("soninlaw_flag not between", value1, value2, "soninlawFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagIsNull() {
            addCriterion("unpay_flag is null");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagIsNotNull() {
            addCriterion("unpay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagEqualTo(Integer value) {
            addCriterion("unpay_flag =", value, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagNotEqualTo(Integer value) {
            addCriterion("unpay_flag <>", value, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagGreaterThan(Integer value) {
            addCriterion("unpay_flag >", value, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("unpay_flag >=", value, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagLessThan(Integer value) {
            addCriterion("unpay_flag <", value, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("unpay_flag <=", value, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagIn(List<Integer> values) {
            addCriterion("unpay_flag in", values, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagNotIn(List<Integer> values) {
            addCriterion("unpay_flag not in", values, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagBetween(Integer value1, Integer value2) {
            addCriterion("unpay_flag between", value1, value2, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andUnpayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("unpay_flag not between", value1, value2, "unpayFlag");
            return (Criteria) this;
        }

        public Criteria andXupuChargeIsNull() {
            addCriterion("xupu_charge is null");
            return (Criteria) this;
        }

        public Criteria andXupuChargeIsNotNull() {
            addCriterion("xupu_charge is not null");
            return (Criteria) this;
        }

        public Criteria andXupuChargeEqualTo(Integer value) {
            addCriterion("xupu_charge =", value, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeNotEqualTo(Integer value) {
            addCriterion("xupu_charge <>", value, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeGreaterThan(Integer value) {
            addCriterion("xupu_charge >", value, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xupu_charge >=", value, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeLessThan(Integer value) {
            addCriterion("xupu_charge <", value, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeLessThanOrEqualTo(Integer value) {
            addCriterion("xupu_charge <=", value, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeIn(List<Integer> values) {
            addCriterion("xupu_charge in", values, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeNotIn(List<Integer> values) {
            addCriterion("xupu_charge not in", values, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeBetween(Integer value1, Integer value2) {
            addCriterion("xupu_charge between", value1, value2, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andXupuChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("xupu_charge not between", value1, value2, "xupuCharge");
            return (Criteria) this;
        }

        public Criteria andEachCostIsNull() {
            addCriterion("each_cost is null");
            return (Criteria) this;
        }

        public Criteria andEachCostIsNotNull() {
            addCriterion("each_cost is not null");
            return (Criteria) this;
        }

        public Criteria andEachCostEqualTo(String value) {
            addCriterion("each_cost =", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostNotEqualTo(String value) {
            addCriterion("each_cost <>", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostGreaterThan(String value) {
            addCriterion("each_cost >", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostGreaterThanOrEqualTo(String value) {
            addCriterion("each_cost >=", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostLessThan(String value) {
            addCriterion("each_cost <", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostLessThanOrEqualTo(String value) {
            addCriterion("each_cost <=", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostLike(String value) {
            addCriterion("each_cost like", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostNotLike(String value) {
            addCriterion("each_cost not like", value, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostIn(List<String> values) {
            addCriterion("each_cost in", values, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostNotIn(List<String> values) {
            addCriterion("each_cost not in", values, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostBetween(String value1, String value2) {
            addCriterion("each_cost between", value1, value2, "eachCost");
            return (Criteria) this;
        }

        public Criteria andEachCostNotBetween(String value1, String value2) {
            addCriterion("each_cost not between", value1, value2, "eachCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostIsNull() {
            addCriterion("council_cost is null");
            return (Criteria) this;
        }

        public Criteria andCouncilCostIsNotNull() {
            addCriterion("council_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCouncilCostEqualTo(String value) {
            addCriterion("council_cost =", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostNotEqualTo(String value) {
            addCriterion("council_cost <>", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostGreaterThan(String value) {
            addCriterion("council_cost >", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostGreaterThanOrEqualTo(String value) {
            addCriterion("council_cost >=", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostLessThan(String value) {
            addCriterion("council_cost <", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostLessThanOrEqualTo(String value) {
            addCriterion("council_cost <=", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostLike(String value) {
            addCriterion("council_cost like", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostNotLike(String value) {
            addCriterion("council_cost not like", value, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostIn(List<String> values) {
            addCriterion("council_cost in", values, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostNotIn(List<String> values) {
            addCriterion("council_cost not in", values, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostBetween(String value1, String value2) {
            addCriterion("council_cost between", value1, value2, "councilCost");
            return (Criteria) this;
        }

        public Criteria andCouncilCostNotBetween(String value1, String value2) {
            addCriterion("council_cost not between", value1, value2, "councilCost");
            return (Criteria) this;
        }

        public Criteria andDiscountsIsNull() {
            addCriterion("discounts is null");
            return (Criteria) this;
        }

        public Criteria andDiscountsIsNotNull() {
            addCriterion("discounts is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountsEqualTo(String value) {
            addCriterion("discounts =", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotEqualTo(String value) {
            addCriterion("discounts <>", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsGreaterThan(String value) {
            addCriterion("discounts >", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsGreaterThanOrEqualTo(String value) {
            addCriterion("discounts >=", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLessThan(String value) {
            addCriterion("discounts <", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLessThanOrEqualTo(String value) {
            addCriterion("discounts <=", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLike(String value) {
            addCriterion("discounts like", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotLike(String value) {
            addCriterion("discounts not like", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsIn(List<String> values) {
            addCriterion("discounts in", values, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotIn(List<String> values) {
            addCriterion("discounts not in", values, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsBetween(String value1, String value2) {
            addCriterion("discounts between", value1, value2, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotBetween(String value1, String value2) {
            addCriterion("discounts not between", value1, value2, "discounts");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(Integer value) {
            addCriterion("payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(Integer value) {
            addCriterion("payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(Integer value) {
            addCriterion("payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(Integer value) {
            addCriterion("payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(Integer value) {
            addCriterion("payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<Integer> values) {
            addCriterion("payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<Integer> values) {
            addCriterion("payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(Integer value1, Integer value2) {
            addCriterion("payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(Integer value1, Integer value2) {
            addCriterion("payee not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIsNull() {
            addCriterion("payment_way is null");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIsNotNull() {
            addCriterion("payment_way is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentWayEqualTo(Integer value) {
            addCriterion("payment_way =", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotEqualTo(Integer value) {
            addCriterion("payment_way <>", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayGreaterThan(Integer value) {
            addCriterion("payment_way >", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_way >=", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLessThan(Integer value) {
            addCriterion("payment_way <", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLessThanOrEqualTo(Integer value) {
            addCriterion("payment_way <=", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIn(List<Integer> values) {
            addCriterion("payment_way in", values, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotIn(List<Integer> values) {
            addCriterion("payment_way not in", values, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayBetween(Integer value1, Integer value2) {
            addCriterion("payment_way between", value1, value2, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_way not between", value1, value2, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andChangePaymentIsNull() {
            addCriterion("change_payment is null");
            return (Criteria) this;
        }

        public Criteria andChangePaymentIsNotNull() {
            addCriterion("change_payment is not null");
            return (Criteria) this;
        }

        public Criteria andChangePaymentEqualTo(Integer value) {
            addCriterion("change_payment =", value, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentNotEqualTo(Integer value) {
            addCriterion("change_payment <>", value, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentGreaterThan(Integer value) {
            addCriterion("change_payment >", value, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_payment >=", value, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentLessThan(Integer value) {
            addCriterion("change_payment <", value, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentLessThanOrEqualTo(Integer value) {
            addCriterion("change_payment <=", value, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentIn(List<Integer> values) {
            addCriterion("change_payment in", values, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentNotIn(List<Integer> values) {
            addCriterion("change_payment not in", values, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentBetween(Integer value1, Integer value2) {
            addCriterion("change_payment between", value1, value2, "changePayment");
            return (Criteria) this;
        }

        public Criteria andChangePaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("change_payment not between", value1, value2, "changePayment");
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