package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import javax.validation.constraints.NotEmpty;

public class RecordDto {

	@NotEmpty
	private String address;
	
	@NotEmpty
	private String sex;
	
	private String allergies;
	
	private String medications;
	
	private String history;

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getMedications() {
		return medications;
	}

	public void setMedications(String medications) {
		this.medications = medications;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}
	
	
}
