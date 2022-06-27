package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.AuthId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.User;

public interface UserService {

	User createAuth(User user);
	
	User readAuthByID(AuthId id);
	
	User updateAuth(User user);
	
	void deleteAuthByID(AuthId id);
}
