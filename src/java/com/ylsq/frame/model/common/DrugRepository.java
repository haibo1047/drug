package com.ylsq.frame.model.common;

import java.util.Date;

public class DrugRepository implements PK{
    private Long id;

    private String batchNum;

    private Integer drugNumber;

    private Double drugPrice;

    private Date produceDate;

    private Long drugId;

    private Long repositoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }

    public Double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }
}