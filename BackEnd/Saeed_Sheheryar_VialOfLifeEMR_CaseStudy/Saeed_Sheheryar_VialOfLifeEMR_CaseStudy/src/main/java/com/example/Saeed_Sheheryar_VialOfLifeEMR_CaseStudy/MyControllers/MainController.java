package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@GetMapping("/index")
	public String about() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/search")
	public String search() {
		return "search";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/results")
	public String results() {
		return "results";
	}
}
