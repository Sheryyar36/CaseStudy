package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@FieldMatch.List({
    @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
    @FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
})

public class AuthRegDto {
	
	@NotEmpty
	private String fullname;
	
	@NotNull
	@DateTimeFormat(iso = ISO.DATE, fallbackPatterns = { "M/d/yy", "MM.DD.yyyy" })
	private Date DOB;
	
	@Email
    @NotEmpty
    private String email;

    @Email
    @NotEmpty
    private String confirmEmail;
    
    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;
    
    private Integer emtId;

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

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Integer getEmtId() {
		return emtId;
	}

	public void setEmtId(Integer emtId) {
		this.emtId = emtId;
	}
}
