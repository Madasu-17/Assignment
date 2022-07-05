package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class CouponsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponsServiceApplication.class, args);

		System.out.println("CouponsService Started..!!");
	}

}
