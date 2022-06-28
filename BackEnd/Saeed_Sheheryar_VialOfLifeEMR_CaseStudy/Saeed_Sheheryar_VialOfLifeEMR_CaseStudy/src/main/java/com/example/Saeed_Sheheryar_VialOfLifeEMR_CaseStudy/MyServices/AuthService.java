package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRegDto;

public interface AuthService extends UserDetailsService{
	
	Auth findByEmail(String email);
	
	Auth saveAuth(AuthRegDto authregdto);
}
