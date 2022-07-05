package com.zensar.spring_jdbc_1.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zensar.spring_jdbc_1.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public int insertEmployee(Employee employee) {
		// for inserting employee
		String query = "insert into employee(employeeId,employeeName,employeeAge) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, employee.getEmployeeId(), employee.getEmployeeName(),
				employee.getEmployeeAge());
		return r;
	}

	public int updateEmployee(Employee employee) {
		// for updating employee
		String query = "update employee set employeeName=?, employeeAge=? where employeeId=?";
		int r = this.jdbcTemplate.update(query, employee.getEmployeeName(), employee.getEmployeeAge(),
				employee.getEmployeeId());
		return r;
	}

	public int deleteEmployee(int employeeId) {
		// for deleting employee
		String query = "delete from employee where employeeId=? ";
		int r = this.jdbcTemplate.update(query, employeeId);
		return r;
	}

	public Employee getEmployee(int employeeId) {
		// select single employee data
		String query = "select * from employee where employeeId=?";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query, rowMapper, employeeId);
		return employee;
	}

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
