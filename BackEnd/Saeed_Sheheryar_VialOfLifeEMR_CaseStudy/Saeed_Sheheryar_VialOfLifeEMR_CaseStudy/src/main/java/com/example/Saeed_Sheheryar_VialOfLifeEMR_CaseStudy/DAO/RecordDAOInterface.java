package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.DAO;

import java.time.LocalDate;

public interface RecordDAOInterface {
	
	void createRecord(LocalDate DOB, String fullname, String allergies, String history, String medications);
	
	String readRecord(LocalDate DOB, String fullname);
	
	void updateRecord(LocalDate DOB, String fullname, String allergies, String history, String medications);
	
	void deleteRecord(LocalDate DOB, String fullname);

}
