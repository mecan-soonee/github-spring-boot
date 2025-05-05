package com.meiziya.example.interfaces.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/api")
	public ResponseEntity<Void> getApi() {
		System.out.println("Invoking Get API");
		return ResponseEntity.ok().build();
	}
}
