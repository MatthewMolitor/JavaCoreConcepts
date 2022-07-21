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
		
		Branch newBranch = new Branch(name);
		branchRepository.save(newBranch);
	}
	
	
	
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
