package com.credit.model;

public class Customer {
	
	private String name;
	private Integer id;
	private Integer creditBalance;
	private Integer creditLimit;
	
	public Customer(String name, Integer id, Integer creditBalance, Integer creditLimit) {
		super();
		this.name = name;
		this.id = id;
		this.creditBalance = creditBalance;
		this.creditLimit = creditLimit;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCreditBalance() {
		return creditBalance;
	}
	public void setCreditBalance(Integer creditBalance) {
		this.creditBalance = creditBalance;
	}
	public Integer getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}
	

}
