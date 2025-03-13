package com.wellsfargo.counselor.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long portfolioId;
    
    @Column(nullable = false)
	private Date createdDate;
    
    @OneToOne
	private Client clientId;
    
    @OneToMany(mappedBy = "portfolioId", cascade = CascadeType.ALL)
    private List<Security> securityId;
	
    public Portfolio() {
		
	}

	public Portfolio(long portfolioId, Date createdDate) {
		super();
		this.portfolioId = portfolioId;
		this.createdDate = createdDate;
	}
	
	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Client getClientId() {
		return clientId;
	}

	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}

	public List<Security> getSecurityId() {
		return securityId;
	}

	public void setSecurityId(List<Security> securityId) {
		this.securityId = securityId;
	}

	@Override
	public String toString() {
		return "Portfolio [portfolioId=" + portfolioId + ", createdDate=" + createdDate + ", clientId=" + clientId
				+ ", securityId=" + securityId + "]";
	}
	
}
