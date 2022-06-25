package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRepo;

public class AuthServiceImpl implements AuthService{
	
	private AuthRepo authrepo;
	
	public AuthServiceImpl(AuthRepo authrepo) {
		super();
		this.authrepo = authrepo;
		
	}

	@Override
	public Auth createAuth(Auth auth) {
		return authrepo.save(auth);
	}

	@Override
	public Auth readAuthByID(UserId id) {
		return authrepo.findById(id).get();
	}

	@Override
	public Auth updateAuth(Auth auth) {
		return authrepo.save(auth);
	}

	@Override
	public void deleteAuthByID(UserId id) {
		authrepo.deleteById(id);
	}

}
