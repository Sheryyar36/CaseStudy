package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.User;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;

public interface UserService {

	User createAuth(User user);
	
	User readAuthByID(UserId id);
	
	User updateAuth(User user);
	
	void deleteAuthByID(UserId id);
}
