package com.mindtree.hospital.hospitalcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hospital.hospitalentity.Patient;
import com.mindtree.hospital.hospitalexception.PatientNotFoundException;
import com.mindtree.hospital.hospitalservice.HosptalService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PatientController {
	
	@Autowired
	HosptalService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/patients/patient/{id}")
	public Patient showPatientInformation(@PathVariable Integer id) {
		Patient patient = service.showPatientInformation(id);
		if(patient == null) {
			throw new PatientNotFoundException(id + "is not in database");
		}
		return patient;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("patients/patient")
	public boolean cratePatient(@RequestBody Patient patient) {
		service.savePatientInformation(patient);
		return true;
	}

}
