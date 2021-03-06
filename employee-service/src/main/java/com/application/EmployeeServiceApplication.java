package com.application;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
		
		System.out.println("Employee Service Started.!!!");
	}
	
	@Bean
	public ModelMapper getModelmapper() {
	return new ModelMapper();
	}
}
