package com.lq.bank.model;

import com.lq.bank.enums.*;

public class Account {

	
	private int accountID;
	private AccountType type;
	private double balance;
	private String label;
	private Branch branchID;
	private Customer customer;
	
	public Account(int accountID, AccountType type, double balance, String label,Branch branchID, Customer customer) {
		super();
		this.accountID = accountID;
		this.type = type;
		this.balance = balance;
		this.label = label;
		this.branchID = branchID;
		this.customer = customer;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Branch getBranchID() {
		return branchID;
	}

	public void setBranchID(Branch branchID) {
		this.branchID = branchID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

	
}
