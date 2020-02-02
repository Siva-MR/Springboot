package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.beans.Employee;


@RestController
public class ServiceController {

	
	@GetMapping("/getEmployee")
	public Employee getEmployee(){
		Employee employee=new Employee();
		employee.setEmpId(1770);	
		employee.setEmpName("Siva MR");
		employee.setAccount("Eagle");
		employee.setEmpSalary("9K");
		employee.setDesignation("Sr Software Developer");
		return employee;
	}
}
