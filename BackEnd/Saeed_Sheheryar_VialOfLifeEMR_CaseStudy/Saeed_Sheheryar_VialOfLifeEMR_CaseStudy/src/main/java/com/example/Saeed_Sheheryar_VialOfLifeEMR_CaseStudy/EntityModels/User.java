package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	@EmbeddedId
	private AuthId id;
	@Column(name = "sex", nullable = false, length = 10)
	private String sex;
	@Column(name = "address", nullable = false, length = 100)
	private String address;
	
	@OneToOne(mappedBy = "user")
    private Auth auth;
	
	public User() {
	}
	public User(AuthId id, String sex, String address) {
		super();
		this.id = id;
		this.sex = sex;
		this.address = address;
	}
	
	public AuthId getId() {
		return id;
	}
	public void setId(AuthId id) {
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

	
	
	
	
	
	
	
}
