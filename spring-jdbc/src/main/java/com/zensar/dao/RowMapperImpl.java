package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zensar.entitiy.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt(1));
		employee.setEmployeeName(rs.getString(2));
		employee.setEmployeeAge(rs.getInt(3));
		return employee;
	}

}
