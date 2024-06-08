package com.postgresql.dental.controllers;

import com.postgresql.dental.models.User;
import com.postgresql.dental.models.Dentist;
import com.postgresql.dental.models.Patient;
import com.postgresql.dental.services.UserService;
import com.postgresql.dental.services.DentistService;
import com.postgresql.dental.services.PatientService;
import com.postgresql.dental.models.AuthenticationRequest;
import com.postgresql.dental.models.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/auth")
public class AuthController {

	    @Autowired
	    private DentistService dentistService;

	    @Autowired
	    private PatientService patientService;

	    @PostMapping("/register/patient")
	    public ResponseEntity<?> registerPatient(@RequestBody Patient patient) {
			try {
				User user = userService.registerUser(patient.getUser());
				patient.setUser(user);
				patientService.savePatient(patient);
				return ResponseEntity.ok("Patient registered successfully");
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
			}
	    }

	    @PostMapping("/register/dentist")
	    public ResponseEntity<?> registerDentist(@RequestBody Dentist dentist) {
			try {
				User user = userService.registerUser(dentist.getUser());
				dentist.setUser(user);
				dentistService.saveDentist(dentist);
				return ResponseEntity.ok("Dentist registered successfully");
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
			}
	    }

	    @Autowired
	    private UserService userService;

	    @Autowired
	    private AuthenticationManager authenticationManager;

	    @PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody AuthenticationRequest authenticationRequest) {
	        Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword())
	        );

	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
	        return ResponseEntity.ok(new AuthenticationResponse("Login successful"));
	    }
}

