package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyControllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices.AuthService;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices.RecordService;

@Controller
@RequestMapping("/create")
public class CreateController {

	@Autowired
	private AuthService authservice;
	@Autowired
	private RecordService recordservice;
	
	@GetMapping()
	public String showcreateform(Model model) {
		Record record = new Record();
		model.addAttribute(record);
		System.out.println("showing create form");
		return "create";
	}
	
	@PostMapping()
	public String createRecord(@ModelAttribute("record") Record record, HttpSession session, Authentication authentication ) {
		Auth currentUser = authservice.findByEmail(authentication.getName());
		currentUser.setRecord(recordservice.createRecord(record));
		Auth userRecord = authservice.updateAuth(currentUser);
		System.out.println("record created:" + userRecord.toString());
		return "redirect:/results";
		
	}
}
