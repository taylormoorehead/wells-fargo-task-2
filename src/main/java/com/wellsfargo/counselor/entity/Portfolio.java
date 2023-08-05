package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(long clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getClientId() {
        return clientId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
