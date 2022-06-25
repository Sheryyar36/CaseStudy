package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;

public interface AuthService {
	
	Auth createAuth(Auth auth);
	
	Auth readAuthByID(UserId id);
	
	Auth updateAuth(Auth auth);
	
	void deleteAuthByID(UserId id);
	
	
}
