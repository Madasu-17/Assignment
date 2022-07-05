package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	
}
