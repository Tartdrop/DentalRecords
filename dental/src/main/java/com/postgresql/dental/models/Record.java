package com.postgresql.dental.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Record {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long recordId;

	    @ManyToOne
	    @JoinColumn(name = "patient_user_id", referencedColumnName = "patientId")
	    private Patient patient;

	    @ManyToOne
	    @JoinColumn(name = "dentist_user_id", referencedColumnName = "dentistId")
	    private Dentist dentist;

	    @ManyToOne
	    @JoinColumn(name = "clinic_id", referencedColumnName = "clinicId")
	    private Clinic clinic;

	    private String patientType;
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private Date birthday;
	    private String address;
	    private String sponsor;
	    private String unitAssignment;
	    private String contactNumber;
	    private String pictureFileName;
	    private String dentalHistory;
	    private byte[] teethData;
	    private String calculus;
	    private String remarks;
	    private Boolean diabetes;
	    private Boolean bleedingTendency;
	    private Boolean drugSensitivity;
	    private Boolean hypertension;
	    private Boolean asthma;
	    private Boolean foodAllergy;
	    private Boolean consultation;
	    private Boolean oralProphylaxis;
	    private Boolean dentalSealant;
	    private Boolean fluorideApplication;
	    private Boolean restoration;
	    private Boolean extraction;
	    private Boolean prosthodontics;
	    private String otherProcedures;
		public Long getRecordId() {
			return recordId;
		}
		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}
		public Patient getPatient() {
			return patient;
		}
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public Dentist getDentist() {
			return dentist;
		}
		public void setDentist(Dentist dentist) {
			this.dentist = dentist;
		}
		public Clinic getClinic() {
			return clinic;
		}
		public void setClinic(Clinic clinic) {
			this.clinic = clinic;
		}
		public String getPatientType() {
			return patientType;
		}
		public void setPatientType(String patientType) {
			this.patientType = patientType;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
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
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getPictureFileName() {
			return pictureFileName;
		}
		public void setPictureFileName(String pictureFileName) {
			this.pictureFileName = pictureFileName;
		}
		public String getDentalHistory() {
			return dentalHistory;
		}
		public void setDentalHistory(String dentalHistory) {
			this.dentalHistory = dentalHistory;
		}
		public byte[] getTeethData() {
			return teethData;
		}
		public void setTeethData(byte[] teethData) {
			this.teethData = teethData;
		}
		public String getCalculus() {
			return calculus;
		}
		public void setCalculus(String calculus) {
			this.calculus = calculus;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public Boolean getDiabetes() {
			return diabetes;
		}
		public void setDiabetes(Boolean diabetes) {
			this.diabetes = diabetes;
		}
		public Boolean getBleedingTendency() {
			return bleedingTendency;
		}
		public void setBleedingTendency(Boolean bleedingTendency) {
			this.bleedingTendency = bleedingTendency;
		}
		public Boolean getDrugSensitivity() {
			return drugSensitivity;
		}
		public void setDrugSensitivity(Boolean drugSensitivity) {
			this.drugSensitivity = drugSensitivity;
		}
		public Boolean getHypertension() {
			return hypertension;
		}
		public void setHypertension(Boolean hypertension) {
			this.hypertension = hypertension;
		}
		public Boolean getAsthma() {
			return asthma;
		}
		public void setAsthma(Boolean asthma) {
			this.asthma = asthma;
		}
		public Boolean getFoodAllergy() {
			return foodAllergy;
		}
		public void setFoodAllergy(Boolean foodAllergy) {
			this.foodAllergy = foodAllergy;
		}
		public Boolean getConsultation() {
			return consultation;
		}
		public void setConsultation(Boolean consultation) {
			this.consultation = consultation;
		}
		public Boolean getOralProphylaxis() {
			return oralProphylaxis;
		}
		public void setOralProphylaxis(Boolean oralProphylaxis) {
			this.oralProphylaxis = oralProphylaxis;
		}
		public Boolean getDentalSealant() {
			return dentalSealant;
		}
		public void setDentalSealant(Boolean dentalSealant) {
			this.dentalSealant = dentalSealant;
		}
		public Boolean getFluorideApplication() {
			return fluorideApplication;
		}
		public void setFluorideApplication(Boolean fluorideApplication) {
			this.fluorideApplication = fluorideApplication;
		}
		public Boolean getRestoration() {
			return restoration;
		}
		public void setRestoration(Boolean restoration) {
			this.restoration = restoration;
		}
		public Boolean getExtraction() {
			return extraction;
		}
		public void setExtraction(Boolean extraction) {
			this.extraction = extraction;
		}
		public Boolean getProsthodontics() {
			return prosthodontics;
		}
		public void setProsthodontics(Boolean prosthodontics) {
			this.prosthodontics = prosthodontics;
		}
		public String getOtherProcedures() {
			return otherProcedures;
		}
		public void setOtherProcedures(String otherProcedures) {
			this.otherProcedures = otherProcedures;
		}
	    
	
}
