package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "record")

public class Record {
	
	@EmbeddedId
	private UserId id;
	@Column(name = "allergies", nullable = true, length = 50)
	private String allergies;
	@Column(name = "medications", nullable = true, length = 100)
	private String medications;
	@Column(name = "history", nullable = true, length = 100)
	private String history;
	@OneToOne(mappedBy = "record")
    private User user;

	public Record() {
	}
	public Record(String allergies, String medications, String history, User user) {
		super();
		this.allergies = allergies;
		this.medications = medications;
		this.history = history;
		this.user = user;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public int hashCode() {
		return Objects.hash(allergies, history, medications, user);
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
		return Objects.equals(allergies, other.allergies) && Objects.equals(history, other.history)
				&& Objects.equals(medications, other.medications) && Objects.equals(user, other.user);
	}
	@Override
	public String toString() {
		return "Record [allergies=" + allergies + ", medications=" + medications + ", history=" + history + ", user="
				+ user + "]";
	}
	
	
	
	
	
	
	
}
