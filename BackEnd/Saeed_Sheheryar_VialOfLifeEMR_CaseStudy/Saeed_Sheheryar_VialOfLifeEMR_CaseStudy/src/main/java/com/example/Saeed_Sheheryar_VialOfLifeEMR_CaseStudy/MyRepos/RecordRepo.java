package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;

public interface RecordRepo extends JpaRepository<Record, UserId>{

}
