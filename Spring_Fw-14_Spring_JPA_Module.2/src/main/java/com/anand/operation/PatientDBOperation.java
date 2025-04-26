package com.anand.operation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anand.entity.Patient;
import com.anand.repository.PatientRepository;

@Component("pdbop")
public class PatientDBOperation {

	@Autowired
	PatientRepository prepo;
	public void addSinglePatientDetail(Patient patient)
	{
		prepo.save(patient); // passing the single object for single store in table
		//save() method is predefined method of JpaRepository which is used to insert the values in database 
	}
	public void addMoreThanOnePatientDetail(List<Patient> patient)
	{
	    prepo.saveAll(patient);// passing list of patient and store all patient in list of patient
	    // saveAll() method is preeDefiend method of JpaRepositry which is used to save Multiple object more then one object in single time in table 
	}
	public void updatePatientDetail(Patient patient)
	{
		prepo.save(patient);
		// save() is the predefined method in JpaRepository which is used for both like 1-> if data does't exist in table then store it means insert it and if data already exist in table then update it
		// then insert and update operation happen automatically when calling save() method and it done on the bases of primaryKey;
		// save() its check the data is present or not based on primaryKey and if not present then execute insert query and if present then execute update query
	}
	
	//based on the primarykey we try to get or fetch the information here
	public Patient findOrFetchPatientDetail(int patientId)
	{
	    Patient p= prepo.findById(patientId).get(); //If a value is present, returns the value, otherwise throws NoSuchElementException.

	    return p;
	}
	//find or select operation is perform here but not on the  bases of primarykey here operation happen on the bases of any column name 
	public List<Patient> findOrFetchDetailNonPrimaryKey(String age)
	{
		List<Patient> p=(List<Patient>) prepo.findByAge(age);
		return p;
	}
	//find or Select operation is perform for more then 2 non Primary Key (column) 
	public List<Patient> getPatientWithAgeandGender(String age,String gender)
	{
		List<Patient> p=(List<Patient>) prepo.findByAgeAndGender(age,gender);
		return p;
	}
	
	public List<Patient> findAllPatient()
	{
		return prepo.findAll();
	}
}
