package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices.AuthService;

@Controller
public class ResultsController {

	@Autowired
	private AuthService authservice;
	
	@GetMapping("/results")
	public String savedResults(Model model, HttpSession session, Authentication authentication) {
		Auth currentUser = authservice.findByEmail(authentication.getName()); 
		model.addAttribute("currentUser", currentUser);
		return "results";
	}
}
