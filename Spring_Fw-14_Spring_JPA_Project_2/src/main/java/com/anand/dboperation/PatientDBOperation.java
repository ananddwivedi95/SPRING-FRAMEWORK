package com.anand.dboperation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anand.entity.Patient;
import com.anand.repository.PatientRepository;
import com.anand.repository.v.second.PatientRepositoryv1;

@Component("pdbop")
public class PatientDBOperation {

	@Autowired
	PatientRepository prepo;
	@Autowired
	PatientRepositoryv1 prepo1;
	public List<Patient> getPatientDetails()
	{
		return (List<Patient>) prepo.getAllPatients();
		
	}
	public List<Patient> getDetailsByEmail(String emailId) {
		
		return (List<Patient>) prepo.getDetailsByEmail(emailId);
	}
	public List<Patient> getDetailsByEmailAndGender(String emailid,String gender)
	{
		return (List<Patient>) prepo.getEmailAndGender(emailid,gender);
	}
	public void addDetails(Patient patient)
	{
		prepo.save(patient);
	}
	public void addDetailByNameParameter(int patientId,String age,long contactNo,String emialId,String gender,String name)
	{
		prepo.addPatientByNamedParameter(patientId,age,contactNo,emialId,gender,name);
	}
	
	public List<Patient> getAllDetail()
	{
		return (List<Patient>) prepo1.getAllDetail();
	}
}
