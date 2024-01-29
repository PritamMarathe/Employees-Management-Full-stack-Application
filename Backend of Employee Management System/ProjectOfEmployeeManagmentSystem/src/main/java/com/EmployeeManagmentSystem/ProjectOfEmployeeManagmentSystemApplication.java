package com.EmployeeManagmentSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.EmployeeManagmentSystem"})
public class ProjectOfEmployeeManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectOfEmployeeManagmentSystemApplication.class, args);
		System.out.println("Welcome in Employee Managment System...");
	
	}
}


