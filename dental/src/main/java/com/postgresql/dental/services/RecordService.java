package com.postgresql.dental.services;

import com.postgresql.dental.models.Record;
import com.postgresql.dental.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class RecordService {
	@Autowired
    private RecordRepository recordRepository;

    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    public Record getRecordById(Long id) {
        return recordRepository.findById(id).orElse(null);
    }

}
