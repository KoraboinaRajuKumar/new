package com.infy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String accountHolderName;

	private Double balance;

	private Long phNumber;

	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(Long phNumber) {
		this.phNumber = phNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", accountHolderName=" + accountHolderName + ", balance=" + balance
				+ ", phNumber=" + phNumber + ", email=" + email + "]";
	}

}
