package com.postgresql.dental.controllers;

import com.postgresql.dental.models.Record;
import com.postgresql.dental.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordController {
	 private final RecordService recordService;

	    @Autowired
	    public RecordController(RecordService recordService) {
	        this.recordService = recordService;
	    }

    @PostMapping
    public ResponseEntity<Record> createRecord(@RequestBody Record record) {
        Record savedRecord = recordService.saveRecord(record);
        return ResponseEntity.ok(savedRecord);
    }

    @GetMapping
    public ResponseEntity<List<Record>> getAllRecords() {
        List<Record> records = recordService.getAllRecords();
        return ResponseEntity.ok(records);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Record> getRecordById(@PathVariable Long id) {
        Record record = recordService.getRecordById(id);
        if (record == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(record);
    }

}
