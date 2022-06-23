package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.DAO;

import java.time.LocalDate;

public interface UserDAOInterface {
	
	void createUser(String address, Integer emtId, String password, String sex, String username, LocalDate DOB,
			String fullname);
	
	String readUser(String fullname, LocalDate DOB);
	
	String readDemo(String fullname, LocalDate DOB);
	
	void updateUser(String address, String password, String sex, String username, LocalDate DOB, String fullname);

	void deleteUser(String username, String password);	
	
}
