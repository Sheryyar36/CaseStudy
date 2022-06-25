package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRegDto;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRepo;

public class AuthServiceImpl implements AuthService{	
	
	@Autowired
	private AuthRepo authrepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Auth saveAuth(AuthRegDto authregdto){
	       Auth auth = new Auth();
	       auth.id.setFullName(authregdto.getFullname());
	       auth.id.setDOB(authregdto.getDOB());
	       auth.setEmail(authregdto.getEmail());
	       auth.setPassword(authregdto.getPassword());
	       auth.setEmtId(authregdto.getEmtId());
	       return authrepo.save(auth);
	   }

	@Override
	public Auth findByEmail(String email) {
		return authrepo.findByEmail(email);
	}


}
