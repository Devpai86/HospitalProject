package com.mindtree.hospital;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.hospital.hospitalrepository.PatientRepository;

@SpringBootTest
class HospitalApplicationTests {
	
	@Autowired
	PatientRepository  patientRepository;

	@Test
	public void  jUnitTest() {
		assertNotNull(patientRepository.findById(1).get());
	}

}
