package com.ylsq.frame.model.common;

import java.util.ArrayList;
import java.util.List;

public class RepositoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepositoryExample() {
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

        public Criteria andRepoAddressIsNull() {
            addCriterion("REPO_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRepoAddressIsNotNull() {
            addCriterion("REPO_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRepoAddressEqualTo(String value) {
            addCriterion("REPO_ADDRESS =", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressNotEqualTo(String value) {
            addCriterion("REPO_ADDRESS <>", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressGreaterThan(String value) {
            addCriterion("REPO_ADDRESS >", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REPO_ADDRESS >=", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressLessThan(String value) {
            addCriterion("REPO_ADDRESS <", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressLessThanOrEqualTo(String value) {
            addCriterion("REPO_ADDRESS <=", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressLike(String value) {
            addCriterion("REPO_ADDRESS like", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressNotLike(String value) {
            addCriterion("REPO_ADDRESS not like", value, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressIn(List<String> values) {
            addCriterion("REPO_ADDRESS in", values, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressNotIn(List<String> values) {
            addCriterion("REPO_ADDRESS not in", values, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressBetween(String value1, String value2) {
            addCriterion("REPO_ADDRESS between", value1, value2, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepoAddressNotBetween(String value1, String value2) {
            addCriterion("REPO_ADDRESS not between", value1, value2, "repoAddress");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameIsNull() {
            addCriterion("REPOSITORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameIsNotNull() {
            addCriterion("REPOSITORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameEqualTo(String value) {
            addCriterion("REPOSITORY_NAME =", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotEqualTo(String value) {
            addCriterion("REPOSITORY_NAME <>", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameGreaterThan(String value) {
            addCriterion("REPOSITORY_NAME >", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPOSITORY_NAME >=", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameLessThan(String value) {
            addCriterion("REPOSITORY_NAME <", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameLessThanOrEqualTo(String value) {
            addCriterion("REPOSITORY_NAME <=", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameLike(String value) {
            addCriterion("REPOSITORY_NAME like", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotLike(String value) {
            addCriterion("REPOSITORY_NAME not like", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameIn(List<String> values) {
            addCriterion("REPOSITORY_NAME in", values, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotIn(List<String> values) {
            addCriterion("REPOSITORY_NAME not in", values, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameBetween(String value1, String value2) {
            addCriterion("REPOSITORY_NAME between", value1, value2, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotBetween(String value1, String value2) {
            addCriterion("REPOSITORY_NAME not between", value1, value2, "repositoryName");
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