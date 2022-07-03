package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.SearchDto;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices.AuthService;

@Controller
@RequestMapping("/searchedresults")
public class SearchedResultsController {

	@Autowired
	private AuthService authservice;
	
	@GetMapping
	public String searchedResults(@ModelAttribute("searchdto") final SearchDto searchdto, Model model) {
		System.out.println(searchdto.getEmail());
		Auth searchedRecord = authservice.findByEmail(searchdto.getEmail());
		System.out.println("searchedRecord: " + searchedRecord.toString());
		model.addAttribute("currentUser", searchedRecord);
		return "searchedresults";
		
	}
}
