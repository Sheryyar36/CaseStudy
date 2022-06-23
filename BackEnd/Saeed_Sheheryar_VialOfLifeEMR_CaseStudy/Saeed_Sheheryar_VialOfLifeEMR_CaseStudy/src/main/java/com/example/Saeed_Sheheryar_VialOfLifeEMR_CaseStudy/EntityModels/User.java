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
	@Column(name = "username", nullable = false, length = 50)
	private String username;
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	@Column(name = "emtid", nullable = true)
	private Integer emtId;
	@OneToOne
    @JoinColumn(name="fullname", referencedColumnName="fullname")
    @JoinColumn(name="DOB", referencedColumnName="DOB")
    @MapsId
    private Record record;
	
	
	public User() {
	}
	public User(UserId id, String sex, String address, String username, String password, Integer emtId) {
		super();
		this.id = id;
		this.sex = sex;
		this.address = address;
		this.username = username;
		this.password = password;
		this.emtId = emtId;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEmtId() {
		return emtId;
	}
	public void setEmtId(Integer emtId) {
		this.emtId = emtId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, emtId, id, password, record, sex, username);
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
		return Objects.equals(address, other.address) && Objects.equals(emtId, other.emtId)
				&& Objects.equals(id, other.id) && Objects.equals(password, other.password)
				&& Objects.equals(record, other.record) && Objects.equals(sex, other.sex)
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", sex=" + sex + ", address=" + address + ", username=" + username + ", password="
				+ password + ", emtId=" + emtId + "]";
	}
	
	
	
	
	
	
}
