package com.mindtree.hospital.hospitalImplementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.hospital.hospitalentity.Doctor;
import com.mindtree.hospital.hospitalentity.Patient;
import com.mindtree.hospital.hospitalrepository.DoctorRepository;
import com.mindtree.hospital.hospitalrepository.PatientRepository;
import com.mindtree.hospital.hospitalservice.HosptalService;

@Repository
@Transactional

public class HospitalImplementation implements HosptalService{
	
	@Autowired
	DoctorRepository  doctorRepository;
	@Autowired
	PatientRepository patientRepository;
	
	
	@Override
	public Doctor showDoctorInformation(String name) {
		// TODO Auto-generated method stub
		return doctorRepository.findByName(name);
	}
	
	@Override
	public Patient showPatientInformation(Integer Id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(Id).get();
	}
	
	@Override
	public boolean saveDoctorInformation(Doctor doctor) {
		doctorRepository.save(doctor);
		return false;
	}
	
	@Override
	public boolean savePatientInformation(Patient patient) {
		Doctor doctor = doctorRepository.findByName(patient.getDoctor_name());
		doctor.addPatients(patient);
		patientRepository.save(patient);
		doctor.getPatient_count();
		return true;
	}
	@Override
	public List<Patient> getPatientListOfDoctor(String name, Doctor doctor) {
		return doctor.getPatients();
	}
	@Override
	public List<Doctor> getDoctors() {
		return (List<Doctor>) doctorRepository.findAll();
	}
}
