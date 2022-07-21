package com.lq.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int branchID;
	
	@Column
	private String name;
	
	

	
	public Branch(String name, int branchID) {
		super();
		this.name = name;
		this.branchID = branchID;
	}	

	public Branch(String name) {
		super();
		this.name = name;
		System.out.println("new branch:"+ name);
	}	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}


}
