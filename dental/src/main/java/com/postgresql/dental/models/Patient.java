package com.postgresql.dental.models;

import jakarta.persistence.*;

@Entity
public class Patient {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long patientId;

	    @OneToOne
	    @JoinColumn(name = "user_id", referencedColumnName = "userId")
	    private User user;

	    private String sponsor;
	    private String unitAssignment;
	    private String patientType;
	    private String dentalHistory;
	    private String pictureFileName;

	    // Getters and setters
	    public Long getPatientId() {
	        return patientId;
	    }

	    public void setPatientId(Long patientId) {
	        this.patientId = patientId;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public String getSponsor() {
	        return sponsor;
	    }

	    public void setSponsor(String sponsor) {
	        this.sponsor = sponsor;
	    }

	    public String getUnitAssignment() {
	        return unitAssignment;
	    }

	    public void setUnitAssignment(String unitAssignment) {
	        this.unitAssignment = unitAssignment;
	    }

	    public String getPatientType() {
	        return patientType;
	    }

	    public void setPatientType(String patientType) {
	        this.patientType = patientType;
	    }

	    public String getDentalHistory() {
	        return dentalHistory;
	    }

	    public void setDentalHistory(String dentalHistory) {
	        this.dentalHistory = dentalHistory;
	    }

	    public String getPictureFileName() {
	        return pictureFileName;
	    }

	    public void setPictureFileName(String pictureFileName) {
	        this.pictureFileName = pictureFileName;
	    }
}
