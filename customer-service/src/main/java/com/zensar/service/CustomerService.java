package com.zensar.service;

import java.util.List;

import com.zensar.entity.Customer;

public interface CustomerService {

	public Customer getCustomer(int customerId);

	public List<Customer> getAllCustomers();

	public void insertCustomer(Customer customer);

	public void updateCustomer(int customerId, Customer customer);

	public void deleteCustomer(int customerId);
}
