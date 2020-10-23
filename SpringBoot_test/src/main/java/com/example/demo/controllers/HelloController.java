package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody
	public String index() {
		return "こんにちは、世界！";
	}

	@GetMapping("/greet")
	public String greet(Model model) {
		model.addAttribute("message","こんにちは、世界！");
		return "greet";
	}
}
