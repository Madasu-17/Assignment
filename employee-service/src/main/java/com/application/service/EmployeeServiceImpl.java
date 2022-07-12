package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dto.EmployeeDto;
import com.application.entity.Employee;
import com.application.execption.EmployeeNotFound;
import com.application.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public EmployeeDto getEmployeeId(int employeeId) {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFound("Employee not found"));
		return modelMapper.map(employee, EmployeeDto.class);

	}

	@Override
	public List<EmployeeDto> getAllEmployees() {

		List<Employee> employee = employeeRepository.findAll();
		List<EmployeeDto> listOfDtos = new ArrayList<>();
		for (Employee employee1 : employee) {
			listOfDtos.add(modelMapper.map(employee1, EmployeeDto.class));

		}
		return listOfDtos;
	}

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = modelMapper.map(employeeDto, Employee.class);
		Employee insertedEmployee = employeeRepository.save(employee);
		return modelMapper.map(insertedEmployee, EmployeeDto.class);

	}

	@Override
	public void updateEmployee(int employeeId, Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);

	}

}
