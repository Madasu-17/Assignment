package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
