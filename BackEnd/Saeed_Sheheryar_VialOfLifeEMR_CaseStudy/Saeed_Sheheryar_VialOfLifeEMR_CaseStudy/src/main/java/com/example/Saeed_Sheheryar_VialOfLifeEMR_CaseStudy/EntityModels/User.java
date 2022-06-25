package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	@EmbeddedId
	private UserId id;
	@Column(name = "sex", nullable = false, length = 10)
	private String sex;
	@Column(name = "address", nullable = false, length = 100)
	private String address;
	@OneToOne
    @JoinColumn(name="fullname", referencedColumnName="fullname")
    @JoinColumn(name="DOB", referencedColumnName="DOB")
    @MapsId
    private Record record;
	@OneToOne
    @JoinColumn(name="fullname", referencedColumnName="fullname")
    @JoinColumn(name="DOB", referencedColumnName="DOB")
    @MapsId
    private Auth auth;
	
	public User() {
	}
	public User(UserId id, String sex, String address) {
		super();
		this.id = id;
		this.sex = sex;
		this.address = address;
	}
	
	public UserId getId() {
		return id;
	}
	public void setId(UserId id) {
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
	@Override
	public int hashCode() {
		return Objects.hash(address, auth, id, record, sex);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(auth, other.auth)
				&& Objects.equals(id, other.id) && Objects.equals(record, other.record)
				&& Objects.equals(sex, other.sex);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", sex=" + sex + ", address=" + address + ", record=" + record + ", auth=" + auth
				+ "]";
	}
	
	
	
	
	
	
	
	
}
