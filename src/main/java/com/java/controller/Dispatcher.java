package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dispatcher {
	
	
	@GetMapping("/cloud")
	public String ping() {
		return "Spring Boot Deployed To Cloud";
	}

}
