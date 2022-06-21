package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/index.html")
	public String about() {
		return "index";
	}
	@RequestMapping("/login.html")
	public String login() {
		return "login";
	}
	@RequestMapping("/create.html")
	public String create() {
		return "create";
	}
	@RequestMapping("/register.html")
	public String register() {
		return "register";
	}
	@RequestMapping("/search.html")
	public String search() {
		return "search";
	}
	@RequestMapping("/contact.html")
	public String contact() {
		return "contact";
	}
	@RequestMapping("/results.html")
	public String results() {
		return "results";
	}
}
