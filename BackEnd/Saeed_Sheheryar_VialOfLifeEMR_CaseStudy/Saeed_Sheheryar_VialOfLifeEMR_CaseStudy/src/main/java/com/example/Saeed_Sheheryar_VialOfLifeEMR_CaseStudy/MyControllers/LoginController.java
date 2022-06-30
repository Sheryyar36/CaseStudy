package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(Model model) {
		System.out.println("login controller");
		return "login";
	}
	
	//@PostMapping
	
}
