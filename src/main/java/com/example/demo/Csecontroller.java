package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	
	@GetMapping("/home")
	public String rocks() {
		return "Welcome to AWS Jenkins cse";
	}
	
	@GetMapping("/cse")
	public String rocks1() {
		return "Hello all";
	}
	
}
