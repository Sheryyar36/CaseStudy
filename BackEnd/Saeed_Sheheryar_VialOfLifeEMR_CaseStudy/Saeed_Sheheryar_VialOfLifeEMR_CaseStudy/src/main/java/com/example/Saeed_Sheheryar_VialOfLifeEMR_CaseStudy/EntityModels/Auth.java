package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "auth", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "fullname", nullable = false, length = 50)
	private String fullname;
	@Column(name = "DOB", nullable = false, length = 50, columnDefinition = "DATE")
	private Date DOB;
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	@Column(name = "password", nullable = false, length = 100)
	private String password;
	@Column(name = "emtid", nullable = true)
	private Integer emtId;
	
	@OneToOne
    private Record record;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	   @JoinTable(
	           name = "users_roles",
	           joinColumns = @JoinColumn(
	        		   name = "auth_id", referencedColumnName = "id"),
	           inverseJoinColumns = @JoinColumn(
	                   name = "role_id", referencedColumnName = "id"))
	   private Collection<Role> roles;
	
	public Auth() {
	}

	public Auth(Long id, String email, String password, Integer emtId) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.emtId = emtId;
	}
	
	public Auth(Long id, String email, String password, Integer emtId, Record record, Collection<Role> roles) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.emtId = emtId;
		this.record = record;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DOB, email, emtId, fullname, id, password, record, roles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auth other = (Auth) obj;
		return Objects.equals(DOB, other.DOB) && Objects.equals(email, other.email)
				&& Objects.equals(emtId, other.emtId) && Objects.equals(fullname, other.fullname)
				&& Objects.equals(id, other.id) && Objects.equals(password, other.password)
				&& Objects.equals(record, other.record) && Objects.equals(roles, other.roles);
	}

	@Override
	public String toString() {
		return "Auth [id=" + id + ", fullname=" + fullname + ", DOB=" + DOB + ", email=" + email + ", password="
				+ password + ", emtId=" + emtId + ", record=" + record + ", roles=" + roles + "]";
	}

	
	
}
