package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Auth;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;

public interface AuthRepo extends JpaRepository<Auth, UserId>{

}
