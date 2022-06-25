package com.jenkin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/health")
	public String healthCheck() {
		System.out.println("Health Check API is called");
		return "ok";
	}
}
