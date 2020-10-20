package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FamilyServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilyServiceExample() {
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

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
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

        public Criteria andConfContentIsNull() {
            addCriterion("conf_content is null");
            return (Criteria) this;
        }

        public Criteria andConfContentIsNotNull() {
            addCriterion("conf_content is not null");
            return (Criteria) this;
        }

        public Criteria andConfContentEqualTo(String value) {
            addCriterion("conf_content =", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentNotEqualTo(String value) {
            addCriterion("conf_content <>", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentGreaterThan(String value) {
            addCriterion("conf_content >", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentGreaterThanOrEqualTo(String value) {
            addCriterion("conf_content >=", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentLessThan(String value) {
            addCriterion("conf_content <", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentLessThanOrEqualTo(String value) {
            addCriterion("conf_content <=", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentLike(String value) {
            addCriterion("conf_content like", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentNotLike(String value) {
            addCriterion("conf_content not like", value, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentIn(List<String> values) {
            addCriterion("conf_content in", values, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentNotIn(List<String> values) {
            addCriterion("conf_content not in", values, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentBetween(String value1, String value2) {
            addCriterion("conf_content between", value1, value2, "confContent");
            return (Criteria) this;
        }

        public Criteria andConfContentNotBetween(String value1, String value2) {
            addCriterion("conf_content not between", value1, value2, "confContent");
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

        public Criteria andBoughtTimeIsNull() {
            addCriterion("bought_time is null");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeIsNotNull() {
            addCriterion("bought_time is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeEqualTo(Date value) {
            addCriterion("bought_time =", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeNotEqualTo(Date value) {
            addCriterion("bought_time <>", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeGreaterThan(Date value) {
            addCriterion("bought_time >", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bought_time >=", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeLessThan(Date value) {
            addCriterion("bought_time <", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeLessThanOrEqualTo(Date value) {
            addCriterion("bought_time <=", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeIn(List<Date> values) {
            addCriterion("bought_time in", values, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeNotIn(List<Date> values) {
            addCriterion("bought_time not in", values, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeBetween(Date value1, Date value2) {
            addCriterion("bought_time between", value1, value2, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeNotBetween(Date value1, Date value2) {
            addCriterion("bought_time not between", value1, value2, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTypeIsNull() {
            addCriterion("end_type is null");
            return (Criteria) this;
        }

        public Criteria andEndTypeIsNotNull() {
            addCriterion("end_type is not null");
            return (Criteria) this;
        }

        public Criteria andEndTypeEqualTo(Integer value) {
            addCriterion("end_type =", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotEqualTo(Integer value) {
            addCriterion("end_type <>", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeGreaterThan(Integer value) {
            addCriterion("end_type >", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_type >=", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeLessThan(Integer value) {
            addCriterion("end_type <", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeLessThanOrEqualTo(Integer value) {
            addCriterion("end_type <=", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeIn(List<Integer> values) {
            addCriterion("end_type in", values, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotIn(List<Integer> values) {
            addCriterion("end_type not in", values, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeBetween(Integer value1, Integer value2) {
            addCriterion("end_type between", value1, value2, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_type not between", value1, value2, "endType");
            return (Criteria) this;
        }

        public Criteria andBoughtNumIsNull() {
            addCriterion("bought_num is null");
            return (Criteria) this;
        }

        public Criteria andBoughtNumIsNotNull() {
            addCriterion("bought_num is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtNumEqualTo(Integer value) {
            addCriterion("bought_num =", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumNotEqualTo(Integer value) {
            addCriterion("bought_num <>", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumGreaterThan(Integer value) {
            addCriterion("bought_num >", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bought_num >=", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumLessThan(Integer value) {
            addCriterion("bought_num <", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumLessThanOrEqualTo(Integer value) {
            addCriterion("bought_num <=", value, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumIn(List<Integer> values) {
            addCriterion("bought_num in", values, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumNotIn(List<Integer> values) {
            addCriterion("bought_num not in", values, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumBetween(Integer value1, Integer value2) {
            addCriterion("bought_num between", value1, value2, "boughtNum");
            return (Criteria) this;
        }

        public Criteria andBoughtNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bought_num not between", value1, value2, "boughtNum");
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

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(String value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(String value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(String value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(String value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(String value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(String value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLike(String value) {
            addCriterion("service_fee like", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotLike(String value) {
            addCriterion("service_fee not like", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<String> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<String> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(String value1, String value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(String value1, String value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
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

        public Criteria andEnableFlagIsNull() {
            addCriterion("enable_flag is null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNotNull() {
            addCriterion("enable_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagEqualTo(Integer value) {
            addCriterion("enable_flag =", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotEqualTo(Integer value) {
            addCriterion("enable_flag <>", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThan(Integer value) {
            addCriterion("enable_flag >", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_flag >=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThan(Integer value) {
            addCriterion("enable_flag <", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThanOrEqualTo(Integer value) {
            addCriterion("enable_flag <=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIn(List<Integer> values) {
            addCriterion("enable_flag in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotIn(List<Integer> values) {
            addCriterion("enable_flag not in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagBetween(Integer value1, Integer value2) {
            addCriterion("enable_flag between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_flag not between", value1, value2, "enableFlag");
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