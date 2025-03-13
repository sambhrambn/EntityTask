package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clientId;
	
    @Column(nullable = false)
	private String firstName;
    
    @Column(nullable = false)
	private String lastName;
    
    @Column(nullable = false)
	private String email;
    
    @Column(nullable = false)
	private String phone;
    
    @ManyToOne
    private Advisor advisorId;
    
    @OneToOne(mappedBy = "clientId")
    private Portfolio portfolioId;

	public Client() {
		
   	}

	public Client(long clientId, String firstName, String lastName, String email, String phone) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
    
	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
	public Advisor getAdvisorId() {
		return advisorId;
	}

	public void setAdvisorId(Advisor advisorId) {
		this.advisorId = advisorId;
	}
	
	public Portfolio getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Portfolio portfolioId) {
		this.portfolioId = portfolioId;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phone=" + phone + ", advisorId=" + advisorId + ", portfolioId=" + portfolioId + "]";
	}
    
}
