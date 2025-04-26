package com.anand.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anand.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{

	List<Patient> findByAge(String age);
	List<Patient> findByAgeAndGender(String age,String gender);

}
