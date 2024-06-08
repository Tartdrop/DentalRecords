package com.postgresql.dental.repositories;

import com.postgresql.dental.models.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {

}
