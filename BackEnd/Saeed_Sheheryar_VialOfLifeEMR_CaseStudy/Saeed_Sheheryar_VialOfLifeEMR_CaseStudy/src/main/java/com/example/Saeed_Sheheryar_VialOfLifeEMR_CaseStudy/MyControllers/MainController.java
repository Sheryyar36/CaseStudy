package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Role;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices.AuthService;

@Controller
public class MainController {
	
	@Autowired
	private AuthService authservice;
	
	@GetMapping("/")
	public String about(HttpSession session, Authentication authentication) {
		
		Auth current = authservice.findByEmail(authentication.getName());
		Role currentrole = (Role) current.getRoles().stream().findFirst().orElse(null);
		System.out.println(currentrole.getName());
		if (currentrole.getName().equals("ROLE_EMT")) {
			System.out.println(currentrole.getName().toString());
			return "redirect:/search";
		}
		else if (currentrole.getName().equals("ROLE_USER")) {
			return "redirect:/create";
		}
		else {	
		return "index";
		}
	}
	@GetMapping("/create")
	public String create() {
		return "create";
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
