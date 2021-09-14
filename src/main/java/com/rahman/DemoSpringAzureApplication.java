package com.rahman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringAzureApplication {

	public String displayMessage() {
		
		return ("My First Application for Azure !!!!!");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAzureApplication.class, args);
	}

}
      