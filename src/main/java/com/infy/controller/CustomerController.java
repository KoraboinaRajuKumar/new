package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.CustomerEntity;
import com.infy.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String msg() {
		return "Hello Docker Application";
	}
	

	@PostMapping("/save")
	public ResponseEntity<String> saveAccount(@RequestBody CustomerEntity customerEntity) {
		String saveCitizenData = customerService.saveCustomer(customerEntity);
		return new ResponseEntity<String>(saveCitizenData, HttpStatus.OK);

	}
	
	@GetMapping("/save")
	public ResponseEntity<List<CustomerEntity>> getAllAccounts() {
		List<CustomerEntity> findAll = customerService.findAll();
		return new ResponseEntity<List<CustomerEntity>>(findAll, HttpStatus.OK);

	}

}
