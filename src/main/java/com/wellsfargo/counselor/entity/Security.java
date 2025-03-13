package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long securityId;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private Date purchaseDate;
	
	@Column(nullable = false)
	private long purchasePrice;
	
	@Column(nullable = false)
	private int quantity;
	
	@ManyToOne
	private Portfolio portfolioId;
	
	public Security() {
		
	}
	
	public Security(long securityId, String firstName, String lastName, String category, Date purchaseDate,
			long purchasePrice, int quantity) {
		super();
		this.securityId = securityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.category = category;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	}

	public long getSecurityId() {
		return securityId;
	}

	public void setSecurityId(long securityId) {
		this.securityId = securityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public long getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Portfolio getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Portfolio portfolioId) {
		this.portfolioId = portfolioId;
	}

	@Override
	public String toString() {
		return "Security [securityId=" + securityId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", category=" + category + ", purchaseDate=" + purchaseDate + ", purchasePrice=" + purchasePrice
				+ ", quantity=" + quantity + ", portfolioId=" + portfolioId + "]";
	}
	
}
