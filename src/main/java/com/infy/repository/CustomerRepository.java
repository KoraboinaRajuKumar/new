package com.infy.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Serializable> {

}
