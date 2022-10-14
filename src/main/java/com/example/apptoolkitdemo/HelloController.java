package com.example.apptoolkitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings Steven! from Application Toolkit in Tanzu Community Edition!";
	}

}