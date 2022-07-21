package com.lq.bank.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.model.Customer;
import com.lq.bank.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping
	public ArrayList<Map<String,Object>> listAllCustomers()
	{
		
		ArrayList<Map<String,Object>> ml = customerservice.listAllCustomers();
		
		return ml;
	}
	
	@GetMapping("/{id}")
	public Map<String,Object> getCustomerInfo(@RequestParam("id") int userId)
	{
		HashMap<String,Object> r = new HashMap<String,Object>();
		Customer cus = new Customer("John", "doe", 34);
		r.put("name",  cus.getName());
		r.put("family", cus.getFamily());
		r.put("age", cus.getAge());
		return r;
	}
	
	
	@PostMapping
	public String createNewCustomer()
	{
		return "soon create!";
	}
	
	@PutMapping("/{id}")
	public String updateCustomer()
	{
		return "soon put!";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer()
	{
		return "soon delete!";
	}
	
}
