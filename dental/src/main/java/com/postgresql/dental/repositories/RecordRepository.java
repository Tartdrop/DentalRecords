package com.postgresql.dental.repositories;

import com.postgresql.dental.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
