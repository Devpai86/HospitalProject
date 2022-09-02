package com.mindtree.hospital.hospitalentity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;

@Table
@Entity
@JsonFilter("DoctorFilter")

public class Doctor {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String field;
	private Integer patient_count = 0;
	
	@OneToMany
	private List<Patient> patients;
	
	public List<Patient> getPatients() {
		return patients;
	}
	
	public void addPatients(Patient patient) {
		patients.add(patient);
		}
	
	public Doctor() {
	}

	public Doctor(String name, Integer age, String gender, String field) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.field = field;
	}
	
	@Override
	public String toString() {
		return "Doctor [age=" + age + ", field" + field +  ",gender=" + gender + ", id" + id +
				",name" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Integer getPatient_count() {
		return patient_count;
	}

	public void setPatient_count(Integer patient_count) {
		this.patient_count = patient_count;
	}
}
