package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.User;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.UserRepo;

public class UserServiceImpl implements UserService{
	
	private UserRepo userrepo;
	
	public UserServiceImpl(UserRepo userrepo) {
		super();
		this.userrepo = userrepo;
	}

	@Override
	public User createAuth(User user) {
		return userrepo.save(user);
	}

	@Override
	public User readAuthByID(UserId id) {
		return userrepo.findById(id).get();
	}

	@Override
	public User updateAuth(User user) {
		return userrepo.save(user);
	}

	@Override
	public void deleteAuthByID(UserId id) {
		userrepo.deleteById(id);
		
	}

}
