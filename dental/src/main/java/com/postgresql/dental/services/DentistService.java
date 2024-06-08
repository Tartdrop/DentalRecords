package com.postgresql.dental.services;

import com.postgresql.dental.models.Dentist;	
import com.postgresql.dental.repositories.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DentistService {

    @Autowired
    private DentistRepository dentistRepository;

    public Dentist saveDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

}
