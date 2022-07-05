package com.zensar.spring_jdbc_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring_jdbc_1.dao.EmployeeDao;
import com.zensar.spring_jdbc_1.entities.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// spring jdbc => JdbcTemplate

		ApplicationContext context = new ClassPathXmlApplicationContext("com/zensar/spring_jdbc_1/config.xml");

		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);

		// *****CREATE NEW EMPLOYEE*****

		/*
		 * Employee employee = new Employee(); employee.setEmployeeId(112);
		 * employee.setEmployeeName("Rohan"); employee.setEmployeeAge(32);
		 * 
		 * int result = employeeDao.insertEmployee(employee);
		 * 
		 * System.out.println("Employee added " + result);
		 */

		// *****UPDATE THE EMPLOYEE*****

		/*
		 * Employee employee = new Employee(); employee.setEmployeeId(112);
		 * employee.setEmployeeName("Sohan"); employee.setEmployeeAge(36); int result =
		 * employeeDao.updateEmployee(employee);
		 * System.out.println("Employee data updated " + result);
		 */

		// *****DELETE THE EMPLOYEE*****

		int result = employeeDao.deleteEmployee(111);
		System.out.println("Deleted " + result);

		Employee employee = employeeDao.getEmployee(100);
		System.out.println(employee);
	}
}
