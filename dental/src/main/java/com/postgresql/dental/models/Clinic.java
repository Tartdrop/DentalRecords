package com.postgresql.dental.models;

import jakarta.persistence.*;

@Entity
public class Clinic {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clinicId;

    private String clinicName;
    private String region;
	public Long getClinicId() {
		return clinicId;
	}
	public void setClinicId(Long clinicId) {
		this.clinicId = clinicId;
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
