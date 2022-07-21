package com.lq.bank.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.model.Branch;
import com.lq.bank.service.BranchService;

@RestController
@RequestMapping("/api/branches")
public class BranchController {
	
	@Autowired
	private BranchService branchservice;
	
	
	
	@GetMapping
	public List<Map<String,Object>> listAllBranches()
	{
	
		
		List<Map<String,Object>> ml = branchservice.getAllBranches();		
		return ml;
	}
	
	@GetMapping("/{id}")
	public Map<String,Object> getBranchInfo(@RequestParam("id") int userId)
	{
		HashMap<String,Object> r = new HashMap<String,Object>();
		Branch branch = new Branch("branch 1", 1);
		r.put("name", branch.getName());
		r.put("branch id", branch.getBranchID());
		
		return r;
	}
	
	
	@PostMapping
	public String createNewBranch(@ModelAttribute("name") String branchName)
	{
		branchservice.newBranch(branchName);
		
		return "soon create!";
	}
	
	@PutMapping("/{id}")
	public String updateBranch()
	{
		return "soon put!";
	}
	
	@DeleteMapping("/{id}")
	public String deleteBranch()
	{
		return "soon delete!";
	}
	
}
