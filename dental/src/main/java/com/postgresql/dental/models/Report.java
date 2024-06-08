package com.postgresql.dental.models;

import jakarta.persistence.*;

public class Report {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long reportNo;

	    @OneToOne
	    @JoinColumn(name = "record_id", referencedColumnName = "recordId")
	    private Record record;

	    private String patientType;

	    private Long unif_consultation;
	    private Long unif_oral_prophylaxis;
	    private Long unif_dental_sealant;
	    private Long unif_fluoride_application;
	    private Long unif_restoration;
	    private Long unif_extraction;
	    private Long unif_prosthodontics;
	    private Long unif_other_procedures;

	    private Long nonunif_consultation;
	    private Long nonunif_oral_prophylaxis;
	    private Long nonunif_dental_sealant;
	    private Long nonunif_fluoride_application;
	    private Long nonunif_restoration;
	    private Long nonunif_extraction;
	    private Long nonunif_prosthodontics;
	    private Long nonunif_other_procedures;

	    private Long dpd_consultation;
	    private Long dpd_oral_prophylaxis;
	    private Long dpd_dental_sealant;
	    private Long dpd_fluoride_application;
	    private Long dpd_restoration;
	    private Long dpd_extraction;
	    private Long dpd_prosthodontics;
	    private Long dpd_other_procedures;

	    private Long cvl_consultation;
	    private Long cvl_oral_prophylaxis;
	    private Long cvl_dental_sealant;
	    private Long cvl_fluoride_application;
	    private Long cvl_restoration;
	    private Long cvl_extraction;
	    private Long cvl_prosthodontics;
	    private Long cvl_other_procedures;

	    private Long rtr_consultation;
	    private Long rtr_oral_prophylaxis;
	    private Long rtr_dental_sealant;
	    private Long rtr_fluoride_application;
	    private Long rtr_restoration;
	    private Long rtr_extraction;
	    private Long rtr_prosthodontics;
	    private Long rtr_other_procedures;
		public Long getReportNo() {
			return reportNo;
		}
		public void setReportNo(Long reportNo) {
			this.reportNo = reportNo;
		}
		public Record getRecord() {
			return record;
		}
		public void setRecord(Record record) {
			this.record = record;
		}
		public String getPatientType() {
			return patientType;
		}
		public void setPatientType(String patientType) {
			this.patientType = patientType;
		}
		public Long getUnif_consultation() {
			return unif_consultation;
		}
		public void setUnif_consultation(Long unif_consultation) {
			this.unif_consultation = unif_consultation;
		}
		public Long getUnif_oral_prophylaxis() {
			return unif_oral_prophylaxis;
		}
		public void setUnif_oral_prophylaxis(Long unif_oral_prophylaxis) {
			this.unif_oral_prophylaxis = unif_oral_prophylaxis;
		}
		public Long getUnif_dental_sealant() {
			return unif_dental_sealant;
		}
		public void setUnif_dental_sealant(Long unif_dental_sealant) {
			this.unif_dental_sealant = unif_dental_sealant;
		}
		public Long getUnif_fluoride_application() {
			return unif_fluoride_application;
		}
		public void setUnif_fluoride_application(Long unif_fluoride_application) {
			this.unif_fluoride_application = unif_fluoride_application;
		}
		public Long getUnif_restoration() {
			return unif_restoration;
		}
		public void setUnif_restoration(Long unif_restoration) {
			this.unif_restoration = unif_restoration;
		}
		public Long getUnif_extraction() {
			return unif_extraction;
		}
		public void setUnif_extraction(Long unif_extraction) {
			this.unif_extraction = unif_extraction;
		}
		public Long getUnif_prosthodontics() {
			return unif_prosthodontics;
		}
		public void setUnif_prosthodontics(Long unif_prosthodontics) {
			this.unif_prosthodontics = unif_prosthodontics;
		}
		public Long getUnif_other_procedures() {
			return unif_other_procedures;
		}
		public void setUnif_other_procedures(Long unif_other_procedures) {
			this.unif_other_procedures = unif_other_procedures;
		}
		public Long getNonunif_consultation() {
			return nonunif_consultation;
		}
		public void setNonunif_consultation(Long nonunif_consultation) {
			this.nonunif_consultation = nonunif_consultation;
		}
		public Long getNonunif_oral_prophylaxis() {
			return nonunif_oral_prophylaxis;
		}
		public void setNonunif_oral_prophylaxis(Long nonunif_oral_prophylaxis) {
			this.nonunif_oral_prophylaxis = nonunif_oral_prophylaxis;
		}
		public Long getNonunif_dental_sealant() {
			return nonunif_dental_sealant;
		}
		public void setNonunif_dental_sealant(Long nonunif_dental_sealant) {
			this.nonunif_dental_sealant = nonunif_dental_sealant;
		}
		public Long getNonunif_fluoride_application() {
			return nonunif_fluoride_application;
		}
		public void setNonunif_fluoride_application(Long nonunif_fluoride_application) {
			this.nonunif_fluoride_application = nonunif_fluoride_application;
		}
		public Long getNonunif_restoration() {
			return nonunif_restoration;
		}
		public void setNonunif_restoration(Long nonunif_restoration) {
			this.nonunif_restoration = nonunif_restoration;
		}
		public Long getNonunif_extraction() {
			return nonunif_extraction;
		}
		public void setNonunif_extraction(Long nonunif_extraction) {
			this.nonunif_extraction = nonunif_extraction;
		}
		public Long getNonunif_prosthodontics() {
			return nonunif_prosthodontics;
		}
		public void setNonunif_prosthodontics(Long nonunif_prosthodontics) {
			this.nonunif_prosthodontics = nonunif_prosthodontics;
		}
		public Long getNonunif_other_procedures() {
			return nonunif_other_procedures;
		}
		public void setNonunif_other_procedures(Long nonunif_other_procedures) {
			this.nonunif_other_procedures = nonunif_other_procedures;
		}
		public Long getDpd_consultation() {
			return dpd_consultation;
		}
		public void setDpd_consultation(Long dpd_consultation) {
			this.dpd_consultation = dpd_consultation;
		}
		public Long getDpd_oral_prophylaxis() {
			return dpd_oral_prophylaxis;
		}
		public void setDpd_oral_prophylaxis(Long dpd_oral_prophylaxis) {
			this.dpd_oral_prophylaxis = dpd_oral_prophylaxis;
		}
		public Long getDpd_dental_sealant() {
			return dpd_dental_sealant;
		}
		public void setDpd_dental_sealant(Long dpd_dental_sealant) {
			this.dpd_dental_sealant = dpd_dental_sealant;
		}
		public Long getDpd_fluoride_application() {
			return dpd_fluoride_application;
		}
		public void setDpd_fluoride_application(Long dpd_fluoride_application) {
			this.dpd_fluoride_application = dpd_fluoride_application;
		}
		public Long getDpd_restoration() {
			return dpd_restoration;
		}
		public void setDpd_restoration(Long dpd_restoration) {
			this.dpd_restoration = dpd_restoration;
		}
		public Long getDpd_extraction() {
			return dpd_extraction;
		}
		public void setDpd_extraction(Long dpd_extraction) {
			this.dpd_extraction = dpd_extraction;
		}
		public Long getDpd_prosthodontics() {
			return dpd_prosthodontics;
		}
		public void setDpd_prosthodontics(Long dpd_prosthodontics) {
			this.dpd_prosthodontics = dpd_prosthodontics;
		}
		public Long getDpd_other_procedures() {
			return dpd_other_procedures;
		}
		public void setDpd_other_procedures(Long dpd_other_procedures) {
			this.dpd_other_procedures = dpd_other_procedures;
		}
		public Long getCvl_consultation() {
			return cvl_consultation;
		}
		public void setCvl_consultation(Long cvl_consultation) {
			this.cvl_consultation = cvl_consultation;
		}
		public Long getCvl_oral_prophylaxis() {
			return cvl_oral_prophylaxis;
		}
		public void setCvl_oral_prophylaxis(Long cvl_oral_prophylaxis) {
			this.cvl_oral_prophylaxis = cvl_oral_prophylaxis;
		}
		public Long getCvl_dental_sealant() {
			return cvl_dental_sealant;
		}
		public void setCvl_dental_sealant(Long cvl_dental_sealant) {
			this.cvl_dental_sealant = cvl_dental_sealant;
		}
		public Long getCvl_fluoride_application() {
			return cvl_fluoride_application;
		}
		public void setCvl_fluoride_application(Long cvl_fluoride_application) {
			this.cvl_fluoride_application = cvl_fluoride_application;
		}
		public Long getCvl_restoration() {
			return cvl_restoration;
		}
		public void setCvl_restoration(Long cvl_restoration) {
			this.cvl_restoration = cvl_restoration;
		}
		public Long getCvl_extraction() {
			return cvl_extraction;
		}
		public void setCvl_extraction(Long cvl_extraction) {
			this.cvl_extraction = cvl_extraction;
		}
		public Long getCvl_prosthodontics() {
			return cvl_prosthodontics;
		}
		public void setCvl_prosthodontics(Long cvl_prosthodontics) {
			this.cvl_prosthodontics = cvl_prosthodontics;
		}
		public Long getCvl_other_procedures() {
			return cvl_other_procedures;
		}
		public void setCvl_other_procedures(Long cvl_other_procedures) {
			this.cvl_other_procedures = cvl_other_procedures;
		}
		public Long getRtr_consultation() {
			return rtr_consultation;
		}
		public void setRtr_consultation(Long rtr_consultation) {
			this.rtr_consultation = rtr_consultation;
		}
		public Long getRtr_oral_prophylaxis() {
			return rtr_oral_prophylaxis;
		}
		public void setRtr_oral_prophylaxis(Long rtr_oral_prophylaxis) {
			this.rtr_oral_prophylaxis = rtr_oral_prophylaxis;
		}
		public Long getRtr_dental_sealant() {
			return rtr_dental_sealant;
		}
		public void setRtr_dental_sealant(Long rtr_dental_sealant) {
			this.rtr_dental_sealant = rtr_dental_sealant;
		}
		public Long getRtr_fluoride_application() {
			return rtr_fluoride_application;
		}
		public void setRtr_fluoride_application(Long rtr_fluoride_application) {
			this.rtr_fluoride_application = rtr_fluoride_application;
		}
		public Long getRtr_restoration() {
			return rtr_restoration;
		}
		public void setRtr_restoration(Long rtr_restoration) {
			this.rtr_restoration = rtr_restoration;
		}
		public Long getRtr_extraction() {
			return rtr_extraction;
		}
		public void setRtr_extraction(Long rtr_extraction) {
			this.rtr_extraction = rtr_extraction;
		}
		public Long getRtr_prosthodontics() {
			return rtr_prosthodontics;
		}
		public void setRtr_prosthodontics(Long rtr_prosthodontics) {
			this.rtr_prosthodontics = rtr_prosthodontics;
		}
		public Long getRtr_other_procedures() {
			return rtr_other_procedures;
		}
		public void setRtr_other_procedures(Long rtr_other_procedures) {
			this.rtr_other_procedures = rtr_other_procedures;
		}
	    
	    

}
