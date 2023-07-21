package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	// bug-100
	System.out.println(hello 100);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	// bug-200
	System.out.println("hello 200");

}
