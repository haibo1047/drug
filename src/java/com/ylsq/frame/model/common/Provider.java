package com.ylsq.frame.model.common;

public class Provider implements PK{
    private Long id;

    private String commonContact;

    private String providerName;

    private String providerTel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommonContact() {
        return commonContact;
    }

    public void setCommonContact(String commonContact) {
        this.commonContact = commonContact;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderTel() {
        return providerTel;
    }

    public void setProviderTel(String providerTel) {
        this.providerTel = providerTel;
    }
}