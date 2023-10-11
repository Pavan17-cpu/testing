package com.p1.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DAO {
	@Autowired
	Repository repo;
	@Autowired
	PatientRepository repository ;
	public void register(Doctor d)
	{
		repo.save(d);
	}
	  public boolean isNameAndPasswordMatch(String name, String password) {
	        List<Doctor> doctorsWithMatchingPassword = repo.findByPassword(password);
	        for (Doctor doctor : doctorsWithMatchingPassword) {
	            if (doctor.getName().equals(name) && doctor.getPassword().equals(password)) {
	                return true; 
	            }
	        }	       
	        return false;
	    }
	  public List<Patient> getAll()
		{
			return repository.findAll();
		}
	  public void add(Patient p)
		{
			repository.save(p);
		}
	  public void updatePatient(Patient updatedPatient) {
		    List<Patient> allPatients = repository.findAll();
		    for (Patient existingPatient : allPatients) {
		        if (existingPatient.getName().equals(updatedPatient.getName())) {
		            
		            existingPatient.setName(updatedPatient.getName());
		            existingPatient.setAge(updatedPatient.getAge());
		            existingPatient.setGender(updatedPatient.getGender());
		            existingPatient.setHealthissue(updatedPatient.getHealthissue());
		            existingPatient.setAddress(updatedPatient.getAddress());
		            
		            repository.save(existingPatient);
		          
		            return; 
		        }
		    }
		    throw new IllegalArgumentException("Patient not found for ID: " + updatedPatient.getName());
		}
	  public boolean deleteUserByUsername(String name) {
		    List<Patient> patients = repository.findByName(name);
		    if (!patients.isEmpty()) {
		        repository.delete(patients.get(0));
		        return true;
		    }
		    return false; 
		}



	
	
	
	
}
