package com.bryanlor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/greeting")
	public String retrieveGreeting() {
		return "Welcome to Minnesota!";
	}
	
}
