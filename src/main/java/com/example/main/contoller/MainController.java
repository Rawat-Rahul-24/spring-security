package com.example.main.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String userLogin() {
		return "Welcome user";
	}
	
	@GetMapping("/admin")
	public String adminLogin() {
		return "Welocme admin";
	}
	
}
