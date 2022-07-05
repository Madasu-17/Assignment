package com.zensar.service;

import java.util.List;

import com.zensar.entity.Employee;

public interface EmployeeService {

	public Employee getEmployee(int employeeId);

	public List<Employee> getEmployees();

	public Employee insertEmployee(Employee employee);

	public void deleteEmployee(int employeeId);

	public Employee updateEmployee(int employeeId, Employee employee);
}
