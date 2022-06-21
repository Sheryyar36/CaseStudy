package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "fullname", nullable = false, length = 50)
	private String fullname;
	@Column(name = "DOB", nullable = false, length = 50, columnDefinition = "DATE")
	private LocalDate DOB;
	public UserId() {
	}
	public UserId(String fullName, LocalDate DOB) {
		this.fullname = fullName;
		this.DOB = DOB;
	}
	public String getFullName() {
		return fullname;
	}
	public void setFullName(String fullName) {
		this.fullname = fullName;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DOB, fullname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserId other = (UserId) obj;
		return Objects.equals(DOB, other.DOB) && Objects.equals(fullname, other.fullname);
	}
}
