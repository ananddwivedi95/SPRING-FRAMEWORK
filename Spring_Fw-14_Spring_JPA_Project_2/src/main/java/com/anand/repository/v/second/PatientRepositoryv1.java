package com.anand.repository.v.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anand.entity.Patient;

import java.util.*;

@Repository
public interface PatientRepositoryv1 extends JpaRepository<Patient,Integer> {
	
	//here we are using JPQL (Jakarta/java persistance Query language) instead of pure SQL Query
	@Query(value="select p from Patient p")
	public List<Patient> getAllDetail();

}
