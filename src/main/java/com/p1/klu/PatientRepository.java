package com.p1.klu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String>{
	public List<Patient> findByName(String name);	
}
