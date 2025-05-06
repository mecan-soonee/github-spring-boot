package com.meiziya.example.interfaces.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/api")
	public String getApi() {
		System.out.println("Invoking Get API");
		return "Welcome to API";
	}
}
