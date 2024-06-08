package com.postgresql.dental.repositories;

import com.postgresql.dental.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
