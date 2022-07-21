package com.lq.bank.model;

public class Customer {
	private String name;
	private String family;
	private int age;
	private Branch BID;
	
	
	
	public Customer(String name, String family, int age) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
	}
	public Customer(String name, String family, int age, Branch BID) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
		this.BID = BID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setID(Branch BID) {
		this.BID = BID;
	}
	
	
}
