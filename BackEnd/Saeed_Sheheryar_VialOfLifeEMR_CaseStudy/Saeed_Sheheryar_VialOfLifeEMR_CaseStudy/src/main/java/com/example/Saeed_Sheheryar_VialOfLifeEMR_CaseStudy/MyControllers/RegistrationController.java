package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.DAO.UserDAO;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@ModelAttribute("user")
	public UserDAO User() {
		return User();
	}
}
