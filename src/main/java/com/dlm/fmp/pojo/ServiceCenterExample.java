package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceCenterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceCenterExample() {
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

        public Criteria andIconAddressIsNull() {
            addCriterion("icon_address is null");
            return (Criteria) this;
        }

        public Criteria andIconAddressIsNotNull() {
            addCriterion("icon_address is not null");
            return (Criteria) this;
        }

        public Criteria andIconAddressEqualTo(String value) {
            addCriterion("icon_address =", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressNotEqualTo(String value) {
            addCriterion("icon_address <>", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressGreaterThan(String value) {
            addCriterion("icon_address >", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressGreaterThanOrEqualTo(String value) {
            addCriterion("icon_address >=", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressLessThan(String value) {
            addCriterion("icon_address <", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressLessThanOrEqualTo(String value) {
            addCriterion("icon_address <=", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressLike(String value) {
            addCriterion("icon_address like", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressNotLike(String value) {
            addCriterion("icon_address not like", value, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressIn(List<String> values) {
            addCriterion("icon_address in", values, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressNotIn(List<String> values) {
            addCriterion("icon_address not in", values, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressBetween(String value1, String value2) {
            addCriterion("icon_address between", value1, value2, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andIconAddressNotBetween(String value1, String value2) {
            addCriterion("icon_address not between", value1, value2, "iconAddress");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNull() {
            addCriterion("service_no is null");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNotNull() {
            addCriterion("service_no is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNoEqualTo(String value) {
            addCriterion("service_no =", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotEqualTo(String value) {
            addCriterion("service_no <>", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThan(String value) {
            addCriterion("service_no >", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("service_no >=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThan(String value) {
            addCriterion("service_no <", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThanOrEqualTo(String value) {
            addCriterion("service_no <=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLike(String value) {
            addCriterion("service_no like", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotLike(String value) {
            addCriterion("service_no not like", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoIn(List<String> values) {
            addCriterion("service_no in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotIn(List<String> values) {
            addCriterion("service_no not in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoBetween(String value1, String value2) {
            addCriterion("service_no between", value1, value2, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotBetween(String value1, String value2) {
            addCriterion("service_no not between", value1, value2, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("service_code is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("service_code is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("service_code =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("service_code <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("service_code >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("service_code >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("service_code <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("service_code <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("service_code like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("service_code not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("service_code in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("service_code not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("service_code between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("service_code not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeIsNull() {
            addCriterion("service_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeIsNotNull() {
            addCriterion("service_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeEqualTo(Integer value) {
            addCriterion("service_pay_type =", value, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeNotEqualTo(Integer value) {
            addCriterion("service_pay_type <>", value, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeGreaterThan(Integer value) {
            addCriterion("service_pay_type >", value, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_pay_type >=", value, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeLessThan(Integer value) {
            addCriterion("service_pay_type <", value, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("service_pay_type <=", value, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeIn(List<Integer> values) {
            addCriterion("service_pay_type in", values, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeNotIn(List<Integer> values) {
            addCriterion("service_pay_type not in", values, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeBetween(Integer value1, Integer value2) {
            addCriterion("service_pay_type between", value1, value2, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServicePayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_pay_type not between", value1, value2, "servicePayType");
            return (Criteria) this;
        }

        public Criteria andServiceIntroIsNull() {
            addCriterion("service_intro is null");
            return (Criteria) this;
        }

        public Criteria andServiceIntroIsNotNull() {
            addCriterion("service_intro is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIntroEqualTo(String value) {
            addCriterion("service_intro =", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroNotEqualTo(String value) {
            addCriterion("service_intro <>", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroGreaterThan(String value) {
            addCriterion("service_intro >", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroGreaterThanOrEqualTo(String value) {
            addCriterion("service_intro >=", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroLessThan(String value) {
            addCriterion("service_intro <", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroLessThanOrEqualTo(String value) {
            addCriterion("service_intro <=", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroLike(String value) {
            addCriterion("service_intro like", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroNotLike(String value) {
            addCriterion("service_intro not like", value, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroIn(List<String> values) {
            addCriterion("service_intro in", values, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroNotIn(List<String> values) {
            addCriterion("service_intro not in", values, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroBetween(String value1, String value2) {
            addCriterion("service_intro between", value1, value2, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andServiceIntroNotBetween(String value1, String value2) {
            addCriterion("service_intro not between", value1, value2, "serviceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNull() {
            addCriterion("price_unit is null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNotNull() {
            addCriterion("price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitEqualTo(String value) {
            addCriterion("price_unit =", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotEqualTo(String value) {
            addCriterion("price_unit <>", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThan(String value) {
            addCriterion("price_unit >", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("price_unit >=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThan(String value) {
            addCriterion("price_unit <", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThanOrEqualTo(String value) {
            addCriterion("price_unit <=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLike(String value) {
            addCriterion("price_unit like", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotLike(String value) {
            addCriterion("price_unit not like", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIn(List<String> values) {
            addCriterion("price_unit in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotIn(List<String> values) {
            addCriterion("price_unit not in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitBetween(String value1, String value2) {
            addCriterion("price_unit between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotBetween(String value1, String value2) {
            addCriterion("price_unit not between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNull() {
            addCriterion("time_unit is null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNotNull() {
            addCriterion("time_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitEqualTo(String value) {
            addCriterion("time_unit =", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotEqualTo(String value) {
            addCriterion("time_unit <>", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThan(String value) {
            addCriterion("time_unit >", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("time_unit >=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThan(String value) {
            addCriterion("time_unit <", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThanOrEqualTo(String value) {
            addCriterion("time_unit <=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLike(String value) {
            addCriterion("time_unit like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotLike(String value) {
            addCriterion("time_unit not like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIn(List<String> values) {
            addCriterion("time_unit in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotIn(List<String> values) {
            addCriterion("time_unit not in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitBetween(String value1, String value2) {
            addCriterion("time_unit between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotBetween(String value1, String value2) {
            addCriterion("time_unit not between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNull() {
            addCriterion("measure_unit is null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNotNull() {
            addCriterion("measure_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitEqualTo(String value) {
            addCriterion("measure_unit =", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotEqualTo(String value) {
            addCriterion("measure_unit <>", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThan(String value) {
            addCriterion("measure_unit >", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThanOrEqualTo(String value) {
            addCriterion("measure_unit >=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThan(String value) {
            addCriterion("measure_unit <", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThanOrEqualTo(String value) {
            addCriterion("measure_unit <=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLike(String value) {
            addCriterion("measure_unit like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotLike(String value) {
            addCriterion("measure_unit not like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIn(List<String> values) {
            addCriterion("measure_unit in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotIn(List<String> values) {
            addCriterion("measure_unit not in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitBetween(String value1, String value2) {
            addCriterion("measure_unit between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotBetween(String value1, String value2) {
            addCriterion("measure_unit not between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(String value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(String value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(String value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(String value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(String value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLike(String value) {
            addCriterion("discount like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotLike(String value) {
            addCriterion("discount not like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<String> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<String> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(String value1, String value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(String value1, String value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andConfTypeIsNull() {
            addCriterion("conf_type is null");
            return (Criteria) this;
        }

        public Criteria andConfTypeIsNotNull() {
            addCriterion("conf_type is not null");
            return (Criteria) this;
        }

        public Criteria andConfTypeEqualTo(String value) {
            addCriterion("conf_type =", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotEqualTo(String value) {
            addCriterion("conf_type <>", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeGreaterThan(String value) {
            addCriterion("conf_type >", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("conf_type >=", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeLessThan(String value) {
            addCriterion("conf_type <", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeLessThanOrEqualTo(String value) {
            addCriterion("conf_type <=", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeLike(String value) {
            addCriterion("conf_type like", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotLike(String value) {
            addCriterion("conf_type not like", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeIn(List<String> values) {
            addCriterion("conf_type in", values, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotIn(List<String> values) {
            addCriterion("conf_type not in", values, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeBetween(String value1, String value2) {
            addCriterion("conf_type between", value1, value2, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotBetween(String value1, String value2) {
            addCriterion("conf_type not between", value1, value2, "confType");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkIsNull() {
            addCriterion("conf_framework is null");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkIsNotNull() {
            addCriterion("conf_framework is not null");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkEqualTo(String value) {
            addCriterion("conf_framework =", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkNotEqualTo(String value) {
            addCriterion("conf_framework <>", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkGreaterThan(String value) {
            addCriterion("conf_framework >", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkGreaterThanOrEqualTo(String value) {
            addCriterion("conf_framework >=", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkLessThan(String value) {
            addCriterion("conf_framework <", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkLessThanOrEqualTo(String value) {
            addCriterion("conf_framework <=", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkLike(String value) {
            addCriterion("conf_framework like", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkNotLike(String value) {
            addCriterion("conf_framework not like", value, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkIn(List<String> values) {
            addCriterion("conf_framework in", values, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkNotIn(List<String> values) {
            addCriterion("conf_framework not in", values, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkBetween(String value1, String value2) {
            addCriterion("conf_framework between", value1, value2, "confFramework");
            return (Criteria) this;
        }

        public Criteria andConfFrameworkNotBetween(String value1, String value2) {
            addCriterion("conf_framework not between", value1, value2, "confFramework");
            return (Criteria) this;
        }

        public Criteria andInternalFlagIsNull() {
            addCriterion("internal_flag is null");
            return (Criteria) this;
        }

        public Criteria andInternalFlagIsNotNull() {
            addCriterion("internal_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInternalFlagEqualTo(Integer value) {
            addCriterion("internal_flag =", value, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagNotEqualTo(Integer value) {
            addCriterion("internal_flag <>", value, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagGreaterThan(Integer value) {
            addCriterion("internal_flag >", value, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("internal_flag >=", value, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagLessThan(Integer value) {
            addCriterion("internal_flag <", value, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagLessThanOrEqualTo(Integer value) {
            addCriterion("internal_flag <=", value, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagIn(List<Integer> values) {
            addCriterion("internal_flag in", values, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagNotIn(List<Integer> values) {
            addCriterion("internal_flag not in", values, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagBetween(Integer value1, Integer value2) {
            addCriterion("internal_flag between", value1, value2, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andInternalFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("internal_flag not between", value1, value2, "internalFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNull() {
            addCriterion("use_flag is null");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNotNull() {
            addCriterion("use_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUseFlagEqualTo(Integer value) {
            addCriterion("use_flag =", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotEqualTo(Integer value) {
            addCriterion("use_flag <>", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThan(Integer value) {
            addCriterion("use_flag >", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_flag >=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThan(Integer value) {
            addCriterion("use_flag <", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThanOrEqualTo(Integer value) {
            addCriterion("use_flag <=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagIn(List<Integer> values) {
            addCriterion("use_flag in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotIn(List<Integer> values) {
            addCriterion("use_flag not in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagBetween(Integer value1, Integer value2) {
            addCriterion("use_flag between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("use_flag not between", value1, value2, "useFlag");
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