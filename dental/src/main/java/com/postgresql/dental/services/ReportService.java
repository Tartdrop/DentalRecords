package com.postgresql.dental.services;

import com.postgresql.dental.models.Record;
import com.postgresql.dental.models.Report;
import com.postgresql.dental.repositories.RecordRepository;
import com.postgresql.dental.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

	@Autowired
    private ReportRepository reportRepository;

    @Autowired
    private RecordRepository recordRepository;

    public Report generateMonthlyReport() {
        List<Record> records = recordRepository.findAll();
        Report report = new Report();
        
        // Initialize all counters to 0
        report.setUnif_consultation(0L);
        report.setUnif_oral_prophylaxis(0L);
        report.setUnif_dental_sealant(0L);
        report.setUnif_fluoride_application(0L);
        report.setUnif_restoration(0L);
        report.setUnif_extraction(0L);
        report.setUnif_prosthodontics(0L);
        report.setUnif_other_procedures(0L);

        report.setNonunif_consultation(0L);
        report.setNonunif_oral_prophylaxis(0L);
        report.setNonunif_dental_sealant(0L);
        report.setNonunif_fluoride_application(0L);
        report.setNonunif_restoration(0L);
        report.setNonunif_extraction(0L);
        report.setNonunif_prosthodontics(0L);
        report.setNonunif_other_procedures(0L);

        report.setDpd_consultation(0L);
        report.setDpd_oral_prophylaxis(0L);
        report.setDpd_dental_sealant(0L);
        report.setDpd_fluoride_application(0L);
        report.setDpd_restoration(0L);
        report.setDpd_extraction(0L);
        report.setDpd_prosthodontics(0L);
        report.setDpd_other_procedures(0L);

        report.setCvl_consultation(0L);
        report.setCvl_oral_prophylaxis(0L);
        report.setCvl_dental_sealant(0L);
        report.setCvl_fluoride_application(0L);
        report.setCvl_restoration(0L);
        report.setCvl_extraction(0L);
        report.setCvl_prosthodontics(0L);
        report.setCvl_other_procedures(0L);

        report.setRtr_consultation(0L);
        report.setRtr_oral_prophylaxis(0L);
        report.setRtr_dental_sealant(0L);
        report.setRtr_fluoride_application(0L);
        report.setRtr_restoration(0L);
        report.setRtr_extraction(0L);
        report.setRtr_prosthodontics(0L);
        report.setRtr_other_procedures(0L);

        // Process records
        for (Record record : records) {
            switch (record.getPatientType().toLowerCase()) {
                case "uniformed":
                    report.setUnif_consultation(report.getUnif_consultation() + (record.getConsultation() ? 1 : 0));
                    report.setUnif_oral_prophylaxis(report.getUnif_oral_prophylaxis() + (record.getOralProphylaxis() ? 1 : 0));
                    report.setUnif_dental_sealant(report.getUnif_dental_sealant() + (record.getDentalSealant() ? 1 : 0));
                    report.setUnif_fluoride_application(report.getUnif_fluoride_application() + (record.getFluorideApplication() ? 1 : 0));
                    report.setUnif_restoration(report.getUnif_restoration() + (record.getRestoration() ? 1 : 0));
                    report.setUnif_extraction(report.getUnif_extraction() + (record.getExtraction() ? 1 : 0));
                    report.setUnif_prosthodontics(report.getUnif_prosthodontics() + (record.getProsthodontics() ? 1 : 0));
                    report.setUnif_other_procedures(report.getUnif_other_procedures() + (record.getOtherProcedures() != null ? 1 : 0));
                    break;
                case "non-uniformed":
                    report.setNonunif_consultation(report.getNonunif_consultation() + (record.getConsultation() ? 1 : 0));
                    report.setNonunif_oral_prophylaxis(report.getNonunif_oral_prophylaxis() + (record.getOralProphylaxis() ? 1 : 0));
                    report.setNonunif_dental_sealant(report.getNonunif_dental_sealant() + (record.getDentalSealant() ? 1 : 0));
                    report.setNonunif_fluoride_application(report.getNonunif_fluoride_application() + (record.getFluorideApplication() ? 1 : 0));
                    report.setNonunif_restoration(report.getNonunif_restoration() + (record.getRestoration() ? 1 : 0));
                    report.setNonunif_extraction(report.getNonunif_extraction() + (record.getExtraction() ? 1 : 0));
                    report.setNonunif_prosthodontics(report.getNonunif_prosthodontics() + (record.getProsthodontics() ? 1 : 0));
                    report.setNonunif_other_procedures(report.getNonunif_other_procedures() + (record.getOtherProcedures() != null ? 1 : 0));
                    break;
                case "dependent":
                    report.setDpd_consultation(report.getDpd_consultation() + (record.getConsultation() ? 1 : 0));
                    report.setDpd_oral_prophylaxis(report.getDpd_oral_prophylaxis() + (record.getOralProphylaxis() ? 1 : 0));
                    report.setDpd_dental_sealant(report.getDpd_dental_sealant() + (record.getDentalSealant() ? 1 : 0));
                    report.setDpd_fluoride_application(report.getDpd_fluoride_application() + (record.getFluorideApplication() ? 1 : 0));
                    report.setDpd_restoration(report.getDpd_restoration() + (record.getRestoration() ? 1 : 0));
                    report.setDpd_extraction(report.getDpd_extraction() + (record.getExtraction() ? 1 : 0));
                    report.setDpd_prosthodontics(report.getDpd_prosthodontics() + (record.getProsthodontics() ? 1 : 0));
                    report.setDpd_other_procedures(report.getDpd_other_procedures() + (record.getOtherProcedures() != null ? 1 : 0));
                    break;
                case "civilian":
                    report.setCvl_consultation(report.getCvl_consultation() + (record.getConsultation() ? 1 : 0));
                    report.setCvl_oral_prophylaxis(report.getCvl_oral_prophylaxis() + (record.getOralProphylaxis() ? 1 : 0));
                    report.setCvl_dental_sealant(report.getCvl_dental_sealant() + (record.getDentalSealant() ? 1 : 0));
                    report.setCvl_fluoride_application(report.getCvl_fluoride_application() + (record.getFluorideApplication() ? 1 : 0));
                    report.setCvl_restoration(report.getCvl_restoration() + (record.getRestoration() ? 1 : 0));
                    report.setCvl_extraction(report.getCvl_extraction() + (record.getExtraction() ? 1 : 0));
                    report.setCvl_prosthodontics(report.getCvl_prosthodontics() + (record.getProsthodontics() ? 1 : 0));
                    report.setCvl_other_procedures(report.getCvl_other_procedures() + (record.getOtherProcedures() != null ? 1 : 0));
                    break;
                case "retiree":
                    report.setRtr_consultation(report.getRtr_consultation() + (record.getConsultation() ? 1 : 0));
                    report.setRtr_oral_prophylaxis(report.getRtr_oral_prophylaxis() + (record.getOralProphylaxis() ? 1 : 0));
                    report.setRtr_dental_sealant(report.getRtr_dental_sealant() + (record.getDentalSealant() ? 1 : 0));
                    report.setRtr_fluoride_application(report.getRtr_fluoride_application() + (record.getFluorideApplication() ? 1 : 0));
                    report.setRtr_restoration(report.getRtr_restoration() + (record.getRestoration() ? 1 : 0));
                    report.setRtr_extraction(report.getRtr_extraction() + (record.getExtraction() ? 1 : 0));
                    report.setRtr_prosthodontics(report.getRtr_prosthodontics() + (record.getProsthodontics() ? 1 : 0));
                    report.setRtr_other_procedures(report.getRtr_other_procedures() + (record.getOtherProcedures() != null ? 1 : 0));
                    break;
            }
        }

        return reportRepository.save(report);
    }

    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

}
