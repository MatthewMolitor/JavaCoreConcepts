package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.bank.data.BranchRepository;
import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class BranchService {
	
	@Autowired
	private AccountService accountService;
	
	
	@Autowired
	private BranchRepository branchRepository;
	
	public void newBranch(String name) {
		
		
		Branch newBranch = new Branch(name,1000);
		branchRepository.save(newBranch);
	}
	
	
//	
//	public ArrayList<Map<String,Object>> listAllAccounts()
//	{
//		
//		ArrayList<Map<String,Object>> ml = new ArrayList<Map<String,Object>>();
//		
//		
//		Branch branchA = new Branch("branch a",1);
//		Customer c_1 = new Customer("Rodney", "Mckay", 10,branchA );
//		Account ac_1 = new Account(1, AccountType.CHECKING, 10,"checking",branchA,c_1);
//		Account ac_2 = new Account(1, AccountType.CHECKING, 10,"second checking",branchA,c_1);
//
//		
//		
//		ml.add(accountService.buildAccountInfo(ac_1));
//		ml.add(accountService.buildAccountInfo(ac_2));
//		
//		
//		return ml;
//	}
	
	public List<Map<String, Object>> getAllBranches()
	{
		List<Map<String, Object>> ml = new ArrayList<Map<String,Object>>();
		
		HashMap<String,Object> r = new HashMap<String, Object>();
		Branch branch = new Branch( "branch A", 1);
		
		r.put("name", branch.getName());
		r.put("branch id", branch.getBranchID());
		
		ml.add(r);
		
		HashMap<String,Object> r1 = new HashMap<String, Object>();
		
		r1.put("name", branch.getName());
		r1.put("branch id", branch.getBranchID());
		
		
		ml.add(r1);
		return ml;
	}
}
