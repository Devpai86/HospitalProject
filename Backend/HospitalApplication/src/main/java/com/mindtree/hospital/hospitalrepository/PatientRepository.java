package com.mindtree.hospital.hospitalrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hospital.hospitalentity.Patient;

@Repository

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
