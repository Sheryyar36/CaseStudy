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
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Role;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRegDto;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.AuthRepo;
@Service
public class AuthServiceImpl implements AuthService{	
	
	@Autowired
	private AuthRepo authrepo;
	
	@Autowired
	   private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public Auth findByEmail(String email){
	       return authrepo.findByEmail(email);
	   }
	
	public Auth saveAuth(AuthRegDto authregdto){
	       Auth auth = new Auth();
	       auth.setFullname(authregdto.getFullname());
	       auth.setDOB(authregdto.getDOB());
	       auth.setEmail(authregdto.getEmail());
	       auth.setPassword(passwordEncoder.encode(authregdto.getPassword()));
	       auth.setEmtId(authregdto.getEmtId());
	       if (auth.getEmtId() == null){
	    	   auth.setRoles(Arrays.asList(new Role("ROLE_USER")));
	       }
	       else {
	    	   auth.setRoles(Arrays.asList(new Role("ROLE_EMT")));
	       }
	       return authrepo.save(auth);
	   }

	
	@Override
	   public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	       System.out.println("authrepo find by email");
			Auth auth = authrepo.findByEmail(email);
	       System.out.println("email searched");
	       if (auth == null){
	    	   System.out.println("email not found");
	           throw new UsernameNotFoundException("Invalid username or password.");
	       }
	       return new org.springframework.security.core.userdetails.User(auth.getEmail(),
	               auth.getPassword(),
	               mapRolesToAuthorities(auth.getRoles()));
	   }
	
	 private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		 	System.out.println("return");
	       return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName()))
	               .collect(Collectors.toList());
	   }




}
