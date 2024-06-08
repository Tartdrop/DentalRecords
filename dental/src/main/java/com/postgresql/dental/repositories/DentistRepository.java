package com.postgresql.dental.repositories;

import com.postgresql.dental.models.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Long>{

}
