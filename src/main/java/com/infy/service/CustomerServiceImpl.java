package com.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.CustomerEntity;
import com.infy.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public String saveCustomer(CustomerEntity customerEntity) {

		CustomerEntity save = repo.save(customerEntity);

		if (save != null && !save.getAccountHolderName().isEmpty()) {

			return "Customer Account is created..!";
		}
		return "Customer Account Not created..!";

	}

	@Override
	public List<CustomerEntity> findAll() {

		return repo.findAll();
	}

}
