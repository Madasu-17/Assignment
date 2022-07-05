package com.zensar.dao;

import com.zensar.entitiy.Employee;

public interface EmployeeDao {

	public int insertEmployee(Employee employee);

	public int updateEmployee(Employee employee);

	public int deleteEmployee(int employeeId);

	public Employee getEmployee(int employeeId);

}
