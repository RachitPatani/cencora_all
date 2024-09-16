package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {
	
	@GetMapping("/")
	public String home()
	{
		return "Hello World from Controller!!!";
	}

}
