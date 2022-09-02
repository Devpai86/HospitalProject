package com.mindtree.hospital.hospitalservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.hospital.hospitalentity.Doctor;
import com.mindtree.hospital.hospitalentity.Patient;

@Service

public interface HosptalService {
	
	public Doctor showDoctorInformation(String Name);
	public Patient showPatientInformation(Integer Id);
	public boolean saveDoctorInformation(Doctor doctor);
	public boolean savePatientInformation(Patient patient);
	public List<Patient> getPatientListOfDoctor(String name, Doctor doctor);
	public List<Doctor> getDoctors();
}
