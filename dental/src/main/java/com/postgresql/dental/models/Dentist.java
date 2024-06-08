package com.postgresql.dental.models;

import jakarta.persistence.*;

@Entity
public class Dentist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dentistId;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User user;

	private String credentials;
	private String clinicName;
	private String region;
	
	public Long getDentistId() {
		return dentistId;
	}
	public void setDentistId(Long dentistId) {
		this.dentistId = dentistId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public String getClinicName() {
		return clinicName;
	}
	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	 
	 

}
