package com.ylsq.frame.model.common;

import java.util.ArrayList;
import java.util.List;

public class ProviderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviderExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommonContactIsNull() {
            addCriterion("COMMON_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andCommonContactIsNotNull() {
            addCriterion("COMMON_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andCommonContactEqualTo(String value) {
            addCriterion("COMMON_CONTACT =", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactNotEqualTo(String value) {
            addCriterion("COMMON_CONTACT <>", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactGreaterThan(String value) {
            addCriterion("COMMON_CONTACT >", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactGreaterThanOrEqualTo(String value) {
            addCriterion("COMMON_CONTACT >=", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactLessThan(String value) {
            addCriterion("COMMON_CONTACT <", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactLessThanOrEqualTo(String value) {
            addCriterion("COMMON_CONTACT <=", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactLike(String value) {
            addCriterion("COMMON_CONTACT like", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactNotLike(String value) {
            addCriterion("COMMON_CONTACT not like", value, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactIn(List<String> values) {
            addCriterion("COMMON_CONTACT in", values, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactNotIn(List<String> values) {
            addCriterion("COMMON_CONTACT not in", values, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactBetween(String value1, String value2) {
            addCriterion("COMMON_CONTACT between", value1, value2, "commonContact");
            return (Criteria) this;
        }

        public Criteria andCommonContactNotBetween(String value1, String value2) {
            addCriterion("COMMON_CONTACT not between", value1, value2, "commonContact");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNull() {
            addCriterion("PROVIDER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("PROVIDER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("PROVIDER_NAME =", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("PROVIDER_NAME <>", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("PROVIDER_NAME >", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME >=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("PROVIDER_NAME <", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME <=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("PROVIDER_NAME like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("PROVIDER_NAME not like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("PROVIDER_NAME in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("PROVIDER_NAME not in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME not between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderTelIsNull() {
            addCriterion("PROVIDER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andProviderTelIsNotNull() {
            addCriterion("PROVIDER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andProviderTelEqualTo(String value) {
            addCriterion("PROVIDER_TEL =", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotEqualTo(String value) {
            addCriterion("PROVIDER_TEL <>", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelGreaterThan(String value) {
            addCriterion("PROVIDER_TEL >", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_TEL >=", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelLessThan(String value) {
            addCriterion("PROVIDER_TEL <", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_TEL <=", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelLike(String value) {
            addCriterion("PROVIDER_TEL like", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotLike(String value) {
            addCriterion("PROVIDER_TEL not like", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelIn(List<String> values) {
            addCriterion("PROVIDER_TEL in", values, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotIn(List<String> values) {
            addCriterion("PROVIDER_TEL not in", values, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelBetween(String value1, String value2) {
            addCriterion("PROVIDER_TEL between", value1, value2, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_TEL not between", value1, value2, "providerTel");
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