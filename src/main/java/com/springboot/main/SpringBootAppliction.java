package com.springboot.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.controller.ServiceController;



@SpringBootApplication
@ComponentScan(basePackageClasses = ServiceController.class)
public class SpringBootAppliction {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppliction.class, args);
	}
}
