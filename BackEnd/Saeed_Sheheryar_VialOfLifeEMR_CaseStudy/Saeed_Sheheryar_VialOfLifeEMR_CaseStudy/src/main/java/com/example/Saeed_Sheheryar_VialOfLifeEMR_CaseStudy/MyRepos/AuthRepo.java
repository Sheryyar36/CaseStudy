package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.AuthId;

@Repository
public interface AuthRepo extends JpaRepository<Auth, AuthId>{

	Auth findByEmail(String email);
	List<Auth> findAll();

}
