package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.AuthId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;

public interface RecordRepo extends JpaRepository<Record, AuthId>{

}
