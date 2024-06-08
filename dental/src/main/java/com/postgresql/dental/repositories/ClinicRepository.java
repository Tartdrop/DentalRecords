package com.postgresql.dental.repositories;

import com.postgresql.dental.models.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Long> {

}
