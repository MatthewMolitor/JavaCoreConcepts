package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private AccountService accountService;
	
	
	public Map<String, Object> buildCustomerInfo(Customer customer)
	{
		Map<String,Object> customerInfo = new HashMap<String, Object>();
		
		
		
		customerInfo.put("name", customer.getName());
		customerInfo.put("family",customer.getFamily());
		customerInfo.put("age",customer.getAge());
		
		return customerInfo;
	}
	
	public ArrayList<Map<String,Object>> listAllAccounts()
	{
		
		ArrayList<Map<String,Object>> ml = new ArrayList<Map<String,Object>>();
		
		
		Branch branchA = new Branch("branch a",1);
		Customer c_1 = new Customer("Rodney", "Mckay", 10,branchA );
		Account ac_1 = new Account(1, AccountType.CHECKING, 10,"checking",branchA,c_1);
		Account ac_2 = new Account(1, AccountType.CHECKING, 10,"second checking",branchA,c_1);

		
		
		ml.add(accountService.buildAccountInfo(ac_1));
		ml.add(accountService.buildAccountInfo(ac_2));
		
		
		return ml;
	}
	
	public ArrayList<Map<String,Object>> listAllCustomers()
	{
		
		ArrayList<Map<String,Object>> customerList = new ArrayList<Map<String,Object>>();
		
		Branch branchA = new Branch("br",1);
		Customer cus = new Customer("John", "doe", 34, branchA);
		Customer cus2 = new Customer("billy","madison", 22,branchA);
		
		
		customerList.add(buildCustomerInfo(cus));
		customerList.add(buildCustomerInfo(cus2));

		return customerList;
	}
	
	public List<Map> getCustomerInfo()
	{
		List<Map> customerInfo = new ArrayList<Map>();
		Branch branchA = new Branch("branch a",1);
		Customer c_1 = new Customer("Rodney", "Mckay", 10,branchA );
		customerInfo.add(buildCustomerInfo(c_1));
		return customerInfo;
		
	}
}
