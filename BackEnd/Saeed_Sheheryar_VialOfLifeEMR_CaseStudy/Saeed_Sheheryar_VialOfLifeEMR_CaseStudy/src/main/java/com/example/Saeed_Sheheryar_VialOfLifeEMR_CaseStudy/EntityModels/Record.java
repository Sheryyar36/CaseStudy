package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "record")

public class Record {
	
	@EmbeddedId
	private AuthId id;
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
	public Record(String allergies, String medications, String history) {
		super();
		this.allergies = allergies;
		this.medications = medications;
		this.history = history;
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
	@Override
	public int hashCode() {
		return Objects.hash(allergies, auth, history, id, medications);
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
		return Objects.equals(allergies, other.allergies) && Objects.equals(auth, other.auth)
				&& Objects.equals(history, other.history) && Objects.equals(id, other.id)
				&& Objects.equals(medications, other.medications);
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", allergies=" + allergies + ", medications=" + medications + ", history=" + history
				+ ", auth=" + auth + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
