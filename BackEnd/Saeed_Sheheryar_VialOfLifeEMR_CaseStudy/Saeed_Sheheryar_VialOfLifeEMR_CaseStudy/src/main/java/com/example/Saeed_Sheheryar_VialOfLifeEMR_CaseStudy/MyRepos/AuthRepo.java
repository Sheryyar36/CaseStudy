package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;

@Repository
public interface AuthRepo extends JpaRepository<Auth, Long>{

	Auth findByEmail(String email);
	List<Auth> findAll();

}
