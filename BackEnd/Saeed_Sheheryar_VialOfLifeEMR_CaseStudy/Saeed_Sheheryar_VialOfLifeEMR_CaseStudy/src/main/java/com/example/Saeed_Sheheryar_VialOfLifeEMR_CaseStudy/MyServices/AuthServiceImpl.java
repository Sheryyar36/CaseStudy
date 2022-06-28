package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.AuthId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Role;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRegDto;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRepo;
@Service
public class AuthServiceImpl implements AuthService{	
	
	@Autowired
	private AuthRepo authrepo;
	
	@Autowired
	   private BCryptPasswordEncoder passwordEncoder;
	
	public Auth saveAuth(AuthRegDto authregdto){
	       Auth auth = new Auth();
	       auth.setId(new AuthId(authregdto.getFullname(), authregdto.getDOB()));
	       auth.setEmail(authregdto.getEmail());
	       auth.setPassword(authregdto.getPassword());
	       auth.setEmtId(authregdto.getEmtId());
	       return authrepo.save(auth);
	   }

	@Override
	public Auth findByEmail(String email) {
		return authrepo.findByEmail(email);
	}

	@Override
	   public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	       Auth auth = authrepo.findByEmail(email);
	       if (auth == null){
	           throw new UsernameNotFoundException("Invalid username or password.");
	       }
	       return new org.springframework.security.core.userdetails.User(auth.getEmail(),
	               auth.getPassword(),
	               mapRolesToAuthorities(auth.getRoles()));
	   }
	
	 private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
	       return roles.stream()
	               .map(role -> new SimpleGrantedAuthority(role.getName()))
	               .collect(Collectors.toList());
	   }



}
