package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessageController {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hello world once again this is cicd testing full flow";
	}
}
