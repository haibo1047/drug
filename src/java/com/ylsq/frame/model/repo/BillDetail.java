package com.ylsq.frame.model.repo;

import java.util.Date;
import java.util.Map;

import com.ylsq.frame.model.common.PK;


public class BillDetail implements PK{
    private Long id;

    private Integer drugCount;

    private Double drugPrice;

    private Date productDate;

    private Long billId;

    private Long drugId;

    private Long providerId;
    
    private Map<String,String> extraInfo;

    public Map<String, String> getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(Map<String, String> extraInfo) {
		this.extraInfo = extraInfo;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDrugCount() {
        return drugCount;
    }

    public void setDrugCount(Integer drugCount) {
        this.drugCount = drugCount;
    }

    public Double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }
}