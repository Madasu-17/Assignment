package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.dao.EmployeeDao;
import com.zensar.entitiy.Employee;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		

		ApplicationContext context = new ClassPathXmlApplicationContext("com/zensar/spring_jdbc/config.xml");		// spring jdbc => JdbcTemplate

		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);

		int result = employeeDao.deleteEmployee(111);
		System.out.println("Deleted " + result);

		Employee employee = employeeDao.getEmployee(100);
		System.out.println(employee);
	}
}
