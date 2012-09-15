package com.ylsq.frame.model.common;

public class Repository implements PK{
    private Long id;

    private String repoAddress;

    private String repositoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRepoAddress() {
        return repoAddress;
    }

    public void setRepoAddress(String repoAddress) {
        this.repoAddress = repoAddress;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
}