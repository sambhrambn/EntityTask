package com.wellsfargo.counselor.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
    
    @OneToMany(mappedBy = "advisorId", cascade = CascadeType.ALL)
    private List<Client> clientId;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

	public long getAdvisorId() {
		return advisorId;
	}

	public void setAdvisorId(long advisorId) {
		this.advisorId = advisorId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public List<Client> getClientId() {
		return clientId;
	}

	public void setClientId(List<Client> clientId) {
		this.clientId = clientId;
	}
    
	 @Override
		public String toString() {
			return "Advisor [advisorId=" + advisorId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
					+ address + ", phone=" + phone + ", email=" + email + ", clientId=" + clientId + "]";
		}
    
}
