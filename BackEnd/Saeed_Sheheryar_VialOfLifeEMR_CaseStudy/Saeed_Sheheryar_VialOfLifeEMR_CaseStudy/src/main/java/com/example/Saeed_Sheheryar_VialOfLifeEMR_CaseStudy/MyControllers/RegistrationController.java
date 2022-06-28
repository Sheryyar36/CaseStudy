package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.DAO.UserDAO;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRegDto;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices.AuthService;

@Controller
@RequestMapping("/register")
public class RegistrationController {

	@Autowired
	private AuthService authservice;
	
	@ModelAttribute("user")
	public AuthRegDto authRegDto(){
		return new AuthRegDto();
	}
	
	@GetMapping
	public String showRegForm() {
		return "register";
	}
	
	@PostMapping
	   public String registerAuth(@ModelAttribute("user") @Valid AuthRegDto authregdto, BindingResult result){
	       Auth existing = authservice.findByEmail(authregdto.getEmail());
	       if (existing != null){
	           result.rejectValue("email", null, "There is already an account registered with that email");
	       }

	       if (result.hasErrors()){
	    	   System.out.println("error occured");
	    	   System.out.println(result.toString());
	           return "register";
	       }
	       
	       authservice.saveAuth(authregdto);
	       System.out.println("Reg success");
	       return "redirect:/registration?success";
	   }
}
