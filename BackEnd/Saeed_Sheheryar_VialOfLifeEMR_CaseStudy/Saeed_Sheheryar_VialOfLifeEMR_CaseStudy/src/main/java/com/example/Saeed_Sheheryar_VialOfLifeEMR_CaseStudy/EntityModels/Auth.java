package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "auth")
public class Auth {
	
	@EmbeddedId
	private UserId id;
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	@Column(name = "emtid", nullable = true)
	private Integer emtId;
	@OneToOne(mappedBy = "auth")
    private User user;
	
	public Auth() {
	}

	public Auth(UserId id, String username, String password, Integer emtId) {
		super();
		this.id = id;
		this.email = username;
		this.password = password;
		this.emtId = emtId;
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
