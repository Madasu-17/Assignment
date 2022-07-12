package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.EmployeeDto;
import com.application.entity.Employee;
import com.application.service.EmployeeService;

@RestController
@RequestMapping(value="/employee-api", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<EmployeeDto>  getEmployeeId(@PathVariable("employeeId") int employeeId) {
		return new ResponseEntity<>(employeeService.getEmployeeId(employeeId), HttpStatus.OK) ;
	}

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeDto>>  getAllEmployees() {
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getAllEmployees(), HttpStatus.OK);
	}

	@PostMapping("/employee")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
		return  new ResponseEntity(employeeService.createEmployee(employeeDto),HttpStatus.CREATED) ;
	}

	@PutMapping("/employee/{employeeId}")
	public ResponseEntity<String> updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
		 employeeService.updateEmployee(employeeId, employee);
		return new ResponseEntity<String>("Employee Updated Successfullyy...!!!", HttpStatus.OK) ;
	}

	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("employeeId") int employeeId) {
		employeeService.deleteEmployee(employeeId);
		return new ResponseEntity<String>("Employee Deleted Successfullyy...!!!", HttpStatus.OK);
	}

}
