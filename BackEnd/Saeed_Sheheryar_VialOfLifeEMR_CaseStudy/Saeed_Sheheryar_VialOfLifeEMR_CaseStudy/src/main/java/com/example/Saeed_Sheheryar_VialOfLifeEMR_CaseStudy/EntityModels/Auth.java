package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Objects;

import javax.persistence.*;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;

@Entity
@Table(name = "auth")
public class Auth {
	
	@EmbeddedId
	public AuthId id= new AuthId();
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	@Column(name = "emtid", nullable = true)
	private Integer emtId;
	
	@OneToOne
    @JoinColumn(name="fullname", referencedColumnName="fullname")
    @JoinColumn(name="DOB", referencedColumnName="DOB")
    @MapsId
    private Record record;
	
	@OneToOne
    @JoinColumn(name="fullname", referencedColumnName="fullname")
    @JoinColumn(name="DOB", referencedColumnName="DOB")
    @MapsId
    private User user;
	
	public Auth() {
	}

	public Auth(AuthId id, String username, String password, Integer emtId) {
		super();
		this.id = id;
		this.email = username;
		this.password = password;
		this.emtId = emtId;
	}

	
	
	public AuthId getId() {
		return id;
	}

	public void setId(AuthId id) {
		this.id = id;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emtId, id, password, user, email);
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
		return Objects.equals(emtId, other.emtId) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(user, other.user)
				&& Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "Auth [id=" + id + ", username=" + email + ", password=" + password + ", emtId=" + emtId + ", user="
				+ user + "]";
	}
	
	
	
	
}
