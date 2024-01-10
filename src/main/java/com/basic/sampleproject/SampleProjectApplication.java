package com.basic.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleProjectApplication {

	@GetMapping("/api")
	public String get(){
		return "Welcome to PavanTechie";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

}
