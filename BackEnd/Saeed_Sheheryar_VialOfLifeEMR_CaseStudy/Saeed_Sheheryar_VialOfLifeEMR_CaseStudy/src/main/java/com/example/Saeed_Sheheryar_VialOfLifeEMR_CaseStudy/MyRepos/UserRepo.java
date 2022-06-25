package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.User;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;

public interface UserRepo extends JpaRepository<User, UserId>{

}
