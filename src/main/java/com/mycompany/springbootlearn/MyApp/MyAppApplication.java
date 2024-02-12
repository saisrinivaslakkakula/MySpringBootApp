package com.mycompany.springbootlearn.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// This is the entry point of our application
// @SpringBootApplication annotation is the combination of three other annotations provided by spring
// @EnableAutoConfiguration - Provides Spring Boot autoconfiguration enablement
// @ComponentScan - Scans the @Components in the same package by default
// In this case, it would be com.mycompany.springbootlearn.MyApp
// @Configuration - Says that we can register extra beans with @bean annotation apart from the configured @Components
// Also, this says to import any other  Configuration classes apart from default configuration

public class MyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

}
