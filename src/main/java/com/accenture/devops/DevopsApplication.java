package com.accenture.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevopsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}
}
