package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Employee;
import com.zensar.service.EmployeeService;

@RestController
@RequestMapping("/employe-api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@GetMapping("/")
	public String Home() {
		return "Home Page";
	}

	@GetMapping("/user")
	public String User() {
		return "User Page";

	}

	@GetMapping("/admin")
	public String Admin() {
		return "Admin Page";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

}
