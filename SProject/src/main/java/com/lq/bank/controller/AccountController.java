package com.lq.bank.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
	
	
	@Autowired
	private AccountService accountservice;
	
	@GetMapping
	public ArrayList<Map<String,Object>> listAllAccounts()
	{
		
		ArrayList<Map<String,Object>> ml = accountservice.listAllAccounts();
		
		return ml;
	}
	
	@GetMapping("/{id}")
	public Map<String,Object> getAccountInfo(@RequestParam("id") int userId)
	{
		HashMap<String,Object> r = new HashMap<String,Object>();
		r.put("AccountId", 202);
		r.put("type",1);
		r.put("balance",15000.00);
		r.put("label", "checking");
		r.put("branchID", "checking");
		return r;
	}
	
	
	@PostMapping
	public String createNewAccount()
	{
		return "soon create!";
	}
	
	@PutMapping("/{id}/deposit")
	public String depositAccount()
	{
		return "soon put!";
	}
	
	@PutMapping("/{id}/withdraw")
	public String withdrawAccount()
	{
		return "soon withdraw";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAccount()
	{
		return "soon delete!";
	}
	
}
