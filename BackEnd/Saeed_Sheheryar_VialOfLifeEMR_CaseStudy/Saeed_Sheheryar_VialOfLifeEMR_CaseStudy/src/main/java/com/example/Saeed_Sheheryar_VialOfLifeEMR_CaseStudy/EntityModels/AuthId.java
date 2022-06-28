package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class AuthId implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name = "fullname", nullable = false, length = 50)
	private String fullname;
	@Column(name = "DOB", nullable = false, length = 50, columnDefinition = "DATE")
	private Date DOB;
	
	public AuthId() {
	}
	public AuthId(String fullName, Date DOB) {
		this.fullname = fullName;
		this.DOB = DOB;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
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
		AuthId other = (AuthId) obj;
		return Objects.equals(DOB, other.DOB) && Objects.equals(fullname, other.fullname);
	}
	@Override
	public String toString() {
		return "AuthId [fullname=" + fullname + ", DOB=" + DOB + "]";
	}
	
	
}
