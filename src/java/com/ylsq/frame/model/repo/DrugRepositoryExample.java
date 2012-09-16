package com.ylsq.frame.model.repo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrugRepositoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugRepositoryExample() {
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

        public Criteria andBatchNumIsNull() {
            addCriterion("BATCH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNotNull() {
            addCriterion("BATCH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumEqualTo(String value) {
            addCriterion("BATCH_NUM =", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotEqualTo(String value) {
            addCriterion("BATCH_NUM <>", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThan(String value) {
            addCriterion("BATCH_NUM >", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NUM >=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThan(String value) {
            addCriterion("BATCH_NUM <", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NUM <=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLike(String value) {
            addCriterion("BATCH_NUM like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotLike(String value) {
            addCriterion("BATCH_NUM not like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumIn(List<String> values) {
            addCriterion("BATCH_NUM in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotIn(List<String> values) {
            addCriterion("BATCH_NUM not in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumBetween(String value1, String value2) {
            addCriterion("BATCH_NUM between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotBetween(String value1, String value2) {
            addCriterion("BATCH_NUM not between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIsNull() {
            addCriterion("DRUG_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIsNotNull() {
            addCriterion("DRUG_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNumberEqualTo(Integer value) {
            addCriterion("DRUG_NUMBER =", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotEqualTo(Integer value) {
            addCriterion("DRUG_NUMBER <>", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberGreaterThan(Integer value) {
            addCriterion("DRUG_NUMBER >", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRUG_NUMBER >=", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberLessThan(Integer value) {
            addCriterion("DRUG_NUMBER <", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberLessThanOrEqualTo(Integer value) {
            addCriterion("DRUG_NUMBER <=", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIn(List<Integer> values) {
            addCriterion("DRUG_NUMBER in", values, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotIn(List<Integer> values) {
            addCriterion("DRUG_NUMBER not in", values, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberBetween(Integer value1, Integer value2) {
            addCriterion("DRUG_NUMBER between", value1, value2, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("DRUG_NUMBER not between", value1, value2, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNull() {
            addCriterion("DRUG_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNotNull() {
            addCriterion("DRUG_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceEqualTo(Double value) {
            addCriterion("DRUG_PRICE =", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotEqualTo(Double value) {
            addCriterion("DRUG_PRICE <>", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThan(Double value) {
            addCriterion("DRUG_PRICE >", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("DRUG_PRICE >=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThan(Double value) {
            addCriterion("DRUG_PRICE <", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThanOrEqualTo(Double value) {
            addCriterion("DRUG_PRICE <=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIn(List<Double> values) {
            addCriterion("DRUG_PRICE in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotIn(List<Double> values) {
            addCriterion("DRUG_PRICE not in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceBetween(Double value1, Double value2) {
            addCriterion("DRUG_PRICE between", value1, value2, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotBetween(Double value1, Double value2) {
            addCriterion("DRUG_PRICE not between", value1, value2, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andProduceDateIsNull() {
            addCriterion("PRODUCE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProduceDateIsNotNull() {
            addCriterion("PRODUCE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProduceDateEqualTo(Date value) {
            addCriterion("PRODUCE_DATE =", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotEqualTo(Date value) {
            addCriterion("PRODUCE_DATE <>", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThan(Date value) {
            addCriterion("PRODUCE_DATE >", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRODUCE_DATE >=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThan(Date value) {
            addCriterion("PRODUCE_DATE <", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThanOrEqualTo(Date value) {
            addCriterion("PRODUCE_DATE <=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateIn(List<Date> values) {
            addCriterion("PRODUCE_DATE in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotIn(List<Date> values) {
            addCriterion("PRODUCE_DATE not in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateBetween(Date value1, Date value2) {
            addCriterion("PRODUCE_DATE between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotBetween(Date value1, Date value2) {
            addCriterion("PRODUCE_DATE not between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNull() {
            addCriterion("DRUG_ID is null");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNotNull() {
            addCriterion("DRUG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIdEqualTo(Long value) {
            addCriterion("DRUG_ID =", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotEqualTo(Long value) {
            addCriterion("DRUG_ID <>", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThan(Long value) {
            addCriterion("DRUG_ID >", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DRUG_ID >=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThan(Long value) {
            addCriterion("DRUG_ID <", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThanOrEqualTo(Long value) {
            addCriterion("DRUG_ID <=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdIn(List<Long> values) {
            addCriterion("DRUG_ID in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotIn(List<Long> values) {
            addCriterion("DRUG_ID not in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdBetween(Long value1, Long value2) {
            addCriterion("DRUG_ID between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotBetween(Long value1, Long value2) {
            addCriterion("DRUG_ID not between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdIsNull() {
            addCriterion("REPOSITORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdIsNotNull() {
            addCriterion("REPOSITORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdEqualTo(Long value) {
            addCriterion("REPOSITORY_ID =", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdNotEqualTo(Long value) {
            addCriterion("REPOSITORY_ID <>", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdGreaterThan(Long value) {
            addCriterion("REPOSITORY_ID >", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REPOSITORY_ID >=", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdLessThan(Long value) {
            addCriterion("REPOSITORY_ID <", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdLessThanOrEqualTo(Long value) {
            addCriterion("REPOSITORY_ID <=", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdIn(List<Long> values) {
            addCriterion("REPOSITORY_ID in", values, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdNotIn(List<Long> values) {
            addCriterion("REPOSITORY_ID not in", values, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdBetween(Long value1, Long value2) {
            addCriterion("REPOSITORY_ID between", value1, value2, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdNotBetween(Long value1, Long value2) {
            addCriterion("REPOSITORY_ID not between", value1, value2, "repositoryId");
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