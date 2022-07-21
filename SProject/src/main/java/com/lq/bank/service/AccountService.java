package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class AccountService {
	
	
	public Map<String, Object> buildAccountInfo(Account account)
	{
		Map<String,Object> accountInfo = new HashMap<String, Object>();
		
		
		
		accountInfo.put("AccountId", account.getAccountID());
		accountInfo.put("type",account.getType());
		accountInfo.put("balance",account.getType());
		accountInfo.put("label", account.getLabel());
		accountInfo.put("branchID", account.getBranchID());
		
		return accountInfo;
	}
	
	
	public ArrayList<Map<String,Object>> listAllAccounts()
	{
		
		ArrayList<Map<String,Object>> ml = new ArrayList<Map<String,Object>>();
		
		
		Branch branchA = new Branch("branch a",1);
		Customer c_1 = new Customer("Rodney", "Mckay", 10,branchA );
		Account ac_1 = new Account(1, AccountType.CHECKING, 10,"checking",branchA,c_1);
		Account ac_2 = new Account(1, AccountType.CHECKING, 10,"second checking",branchA,c_1);

		
		
		ml.add(buildAccountInfo(ac_1));
		ml.add(buildAccountInfo(ac_2));
		
		
		return ml;
	}
	
	public ArrayList<Map<String,Object>> getAccountInfo()
	{
		
		ArrayList<Map<String,Object>> ml = new ArrayList<Map<String,Object>>();
		
		
		Branch branchA = new Branch("branch a",1);
		Customer c_1 = new Customer("Rodney", "Mckay", 10,branchA );
		Account ac_1 = new Account(1, AccountType.CHECKING, 10,"checking",branchA,c_1);
		
		
		ml.add(buildAccountInfo(ac_1));
		
		
		return ml;
	}
}
