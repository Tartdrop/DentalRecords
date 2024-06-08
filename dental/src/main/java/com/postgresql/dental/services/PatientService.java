package com.postgresql.dental.services;

import com.postgresql.dental.models.Patient;
import com.postgresql.dental.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	 @Autowired
	    private PatientRepository patientRepository;

	    public Patient savePatient(Patient patient) {
	        return patientRepository.save(patient);
	    }
}
