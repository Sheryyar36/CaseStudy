package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;
@Repository
public interface RecordRepo extends JpaRepository<Record, Long>{

}
