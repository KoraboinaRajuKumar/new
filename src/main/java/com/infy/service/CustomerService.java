package com.infy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.entity.CustomerEntity;

@Service
public interface CustomerService {
	
	public String saveCustomer(CustomerEntity customerEntity);
	
	public List<CustomerEntity> findAll();

}
