package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Objects;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "record")

public class Record {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "sex", nullable = false, length = 10)
	private String sex;
	@Column(name = "address", nullable = false, length = 100)
	private String address;
	@Column(name = "allergies", nullable = true, length = 50)
	private String allergies;
	@Column(name = "medications", nullable = true, length = 100)
	private String medications;
	@Column(name = "history", nullable = true, length = 100)
	private String history;
	
	@OneToOne(mappedBy = "record")
    private Auth auth;

	public Record() {
	}

	public Record(Long id, String sex, String address, String allergies, String medications, String history) {
		super();
		this.id = id;
		this.sex = sex;
		this.address = address;
		this.allergies = allergies;
		this.medications = medications;
		this.history = history;
	}

	public Record(Long id, String sex, String address, String allergies, String medications, String history,
			Auth auth) {
		super();
		this.id = id;
		this.sex = sex;
		this.address = address;
		this.allergies = allergies;
		this.medications = medications;
		this.history = history;
		this.auth = auth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, allergies, auth, history, id, medications, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Record other = (Record) obj;
		return Objects.equals(address, other.address) && Objects.equals(allergies, other.allergies)
				&& Objects.equals(auth, other.auth) && Objects.equals(history, other.history)
				&& Objects.equals(id, other.id) && Objects.equals(medications, other.medications)
				&& Objects.equals(sex, other.sex);
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", sex=" + sex + ", address=" + address + ", allergies=" + allergies
				+ ", medications=" + medications + ", history=" + history + ", auth=" + auth + "]";
	}

	
	
	
}
