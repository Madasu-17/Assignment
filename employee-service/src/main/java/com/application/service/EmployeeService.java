package com.application.service;

import java.util.List;

import com.application.dto.EmployeeDto;
import com.application.entity.Employee;
import com.application.execption.EmployeeNotFound;

public interface EmployeeService {

	public EmployeeDto getEmployeeId(int employeeId) throws EmployeeNotFound;

	public List<EmployeeDto> getAllEmployees();

	public EmployeeDto createEmployee(EmployeeDto employeeDto);

	public void updateEmployee(int employeeId, Employee employee)throws EmployeeNotFound;

	public void deleteEmployee(int employeeId) throws EmployeeNotFound;

}
