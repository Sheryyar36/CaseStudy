package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRegDto;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.SearchDto;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices.AuthService;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private AuthService authservice;
	
	@GetMapping
	public String search(Model model) {
		SearchDto searchdto = new SearchDto();
		model.addAttribute("searchdto", searchdto);
		return "search";
	}
	
	@PostMapping
	   public String registerAuth(@ModelAttribute("searchdto") final SearchDto searchdto, final RedirectAttributes redirectattributes){
		redirectattributes.addFlashAttribute("searchdto", searchdto);
		return "redirect:/searchedresults";
	   
		
		
	   }
}
