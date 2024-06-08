package com.postgresql.dental.controllers;

import com.postgresql.dental.models.Report;
import com.postgresql.dental.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
	@Autowired
    private ReportService reportService;

    @PostMapping("/generate")
    public ResponseEntity<Report> generateMonthlyReport() {
        Report report = reportService.generateMonthlyReport();
        return ResponseEntity.ok(report);
    }

    @GetMapping
    public ResponseEntity<List<Report>> getAllReports() {
        List<Report> reports = reportService.getAllReports();
        return ResponseEntity.ok(reports);
    }

}
