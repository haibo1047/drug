package com.ylsq.frame.model.common;

import java.util.ArrayList;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
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

        public Criteria andApprovalNumberIsNull() {
            addCriterion("APPROVAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIsNotNull() {
            addCriterion("APPROVAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberEqualTo(String value) {
            addCriterion("APPROVAL_NUMBER =", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotEqualTo(String value) {
            addCriterion("APPROVAL_NUMBER <>", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThan(String value) {
            addCriterion("APPROVAL_NUMBER >", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_NUMBER >=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThan(String value) {
            addCriterion("APPROVAL_NUMBER <", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_NUMBER <=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLike(String value) {
            addCriterion("APPROVAL_NUMBER like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotLike(String value) {
            addCriterion("APPROVAL_NUMBER not like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIn(List<String> values) {
            addCriterion("APPROVAL_NUMBER in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotIn(List<String> values) {
            addCriterion("APPROVAL_NUMBER not in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberBetween(String value1, String value2) {
            addCriterion("APPROVAL_NUMBER between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_NUMBER not between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andDrugFormIsNull() {
            addCriterion("DRUG_FORM is null");
            return (Criteria) this;
        }

        public Criteria andDrugFormIsNotNull() {
            addCriterion("DRUG_FORM is not null");
            return (Criteria) this;
        }

        public Criteria andDrugFormEqualTo(String value) {
            addCriterion("DRUG_FORM =", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotEqualTo(String value) {
            addCriterion("DRUG_FORM <>", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormGreaterThan(String value) {
            addCriterion("DRUG_FORM >", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_FORM >=", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLessThan(String value) {
            addCriterion("DRUG_FORM <", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLessThanOrEqualTo(String value) {
            addCriterion("DRUG_FORM <=", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLike(String value) {
            addCriterion("DRUG_FORM like", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotLike(String value) {
            addCriterion("DRUG_FORM not like", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormIn(List<String> values) {
            addCriterion("DRUG_FORM in", values, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotIn(List<String> values) {
            addCriterion("DRUG_FORM not in", values, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormBetween(String value1, String value2) {
            addCriterion("DRUG_FORM between", value1, value2, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotBetween(String value1, String value2) {
            addCriterion("DRUG_FORM not between", value1, value2, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("DRUG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("DRUG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("DRUG_NAME =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("DRUG_NAME <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("DRUG_NAME >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_NAME >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("DRUG_NAME <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("DRUG_NAME <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("DRUG_NAME like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("DRUG_NAME not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("DRUG_NAME in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("DRUG_NAME not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("DRUG_NAME between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("DRUG_NAME not between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNull() {
            addCriterion("DRUG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNotNull() {
            addCriterion("DRUG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeEqualTo(Integer value) {
            addCriterion("DRUG_TYPE =", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotEqualTo(Integer value) {
            addCriterion("DRUG_TYPE <>", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThan(Integer value) {
            addCriterion("DRUG_TYPE >", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRUG_TYPE >=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThan(Integer value) {
            addCriterion("DRUG_TYPE <", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DRUG_TYPE <=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIn(List<Integer> values) {
            addCriterion("DRUG_TYPE in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotIn(List<Integer> values) {
            addCriterion("DRUG_TYPE not in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeBetween(Integer value1, Integer value2) {
            addCriterion("DRUG_TYPE between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DRUG_TYPE not between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugUnitIsNull() {
            addCriterion("DRUG_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andDrugUnitIsNotNull() {
            addCriterion("DRUG_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDrugUnitEqualTo(String value) {
            addCriterion("DRUG_UNIT =", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitNotEqualTo(String value) {
            addCriterion("DRUG_UNIT <>", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitGreaterThan(String value) {
            addCriterion("DRUG_UNIT >", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_UNIT >=", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitLessThan(String value) {
            addCriterion("DRUG_UNIT <", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitLessThanOrEqualTo(String value) {
            addCriterion("DRUG_UNIT <=", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitLike(String value) {
            addCriterion("DRUG_UNIT like", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitNotLike(String value) {
            addCriterion("DRUG_UNIT not like", value, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitIn(List<String> values) {
            addCriterion("DRUG_UNIT in", values, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitNotIn(List<String> values) {
            addCriterion("DRUG_UNIT not in", values, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitBetween(String value1, String value2) {
            addCriterion("DRUG_UNIT between", value1, value2, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andDrugUnitNotBetween(String value1, String value2) {
            addCriterion("DRUG_UNIT not between", value1, value2, "drugUnit");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthIsNull() {
            addCriterion("GUARANTEE_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthIsNotNull() {
            addCriterion("GUARANTEE_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthEqualTo(Integer value) {
            addCriterion("GUARANTEE_MONTH =", value, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthNotEqualTo(Integer value) {
            addCriterion("GUARANTEE_MONTH <>", value, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthGreaterThan(Integer value) {
            addCriterion("GUARANTEE_MONTH >", value, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUARANTEE_MONTH >=", value, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthLessThan(Integer value) {
            addCriterion("GUARANTEE_MONTH <", value, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthLessThanOrEqualTo(Integer value) {
            addCriterion("GUARANTEE_MONTH <=", value, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthIn(List<Integer> values) {
            addCriterion("GUARANTEE_MONTH in", values, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthNotIn(List<Integer> values) {
            addCriterion("GUARANTEE_MONTH not in", values, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthBetween(Integer value1, Integer value2) {
            addCriterion("GUARANTEE_MONTH between", value1, value2, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("GUARANTEE_MONTH not between", value1, value2, "guaranteeMonth");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNull() {
            addCriterion("PRODUCT_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNotNull() {
            addCriterion("PRODUCT_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andProductModelEqualTo(String value) {
            addCriterion("PRODUCT_MODEL =", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotEqualTo(String value) {
            addCriterion("PRODUCT_MODEL <>", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThan(String value) {
            addCriterion("PRODUCT_MODEL >", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MODEL >=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThan(String value) {
            addCriterion("PRODUCT_MODEL <", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MODEL <=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLike(String value) {
            addCriterion("PRODUCT_MODEL like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotLike(String value) {
            addCriterion("PRODUCT_MODEL not like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelIn(List<String> values) {
            addCriterion("PRODUCT_MODEL in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotIn(List<String> values) {
            addCriterion("PRODUCT_MODEL not in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelBetween(String value1, String value2) {
            addCriterion("PRODUCT_MODEL between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MODEL not between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellIsNull() {
            addCriterion("SIMPLE_SPELL is null");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellIsNotNull() {
            addCriterion("SIMPLE_SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellEqualTo(String value) {
            addCriterion("SIMPLE_SPELL =", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellNotEqualTo(String value) {
            addCriterion("SIMPLE_SPELL <>", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellGreaterThan(String value) {
            addCriterion("SIMPLE_SPELL >", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellGreaterThanOrEqualTo(String value) {
            addCriterion("SIMPLE_SPELL >=", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellLessThan(String value) {
            addCriterion("SIMPLE_SPELL <", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellLessThanOrEqualTo(String value) {
            addCriterion("SIMPLE_SPELL <=", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellLike(String value) {
            addCriterion("SIMPLE_SPELL like", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellNotLike(String value) {
            addCriterion("SIMPLE_SPELL not like", value, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellIn(List<String> values) {
            addCriterion("SIMPLE_SPELL in", values, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellNotIn(List<String> values) {
            addCriterion("SIMPLE_SPELL not in", values, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellBetween(String value1, String value2) {
            addCriterion("SIMPLE_SPELL between", value1, value2, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellNotBetween(String value1, String value2) {
            addCriterion("SIMPLE_SPELL not between", value1, value2, "simpleSpell");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNull() {
            addCriterion("PROVIDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("PROVIDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(Long value) {
            addCriterion("PROVIDER_ID =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(Long value) {
            addCriterion("PROVIDER_ID <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(Long value) {
            addCriterion("PROVIDER_ID >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROVIDER_ID >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(Long value) {
            addCriterion("PROVIDER_ID <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(Long value) {
            addCriterion("PROVIDER_ID <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<Long> values) {
            addCriterion("PROVIDER_ID in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<Long> values) {
            addCriterion("PROVIDER_ID not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(Long value1, Long value2) {
            addCriterion("PROVIDER_ID between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(Long value1, Long value2) {
            addCriterion("PROVIDER_ID not between", value1, value2, "providerId");
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