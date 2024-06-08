package com.postgresql.dental.services;

import com.postgresql.dental.models.Clinic;
import com.postgresql.dental.repositories.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class ClinicService {
	 @Autowired
	    private ClinicRepository clinicRepository;

	    public Clinic saveClinic(Clinic clinic) {
	        return clinicRepository.save(clinic);
	    }

	    public List<Clinic> getAllClinics() {
	        return clinicRepository.findAll();
	    }

	    public Clinic getClinicById(Long id) {
	        return clinicRepository.findById(id).orElse(null);
	    }

	    public void deleteClinic(Long id) {
	        clinicRepository.deleteById(id);
	    }

}
