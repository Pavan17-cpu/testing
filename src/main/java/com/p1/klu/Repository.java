package com.p1.klu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Doctor, String>{
public List<Doctor> findByName(String name);
public List<Doctor> findByPassword(String password);
}
