package com.anand.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.entity.Patient;
import com.anand.operation.PatientDBOperation;

public class MainApp {
   public static void main(String[] args)
   {
	AnnotationConfigApplicationContext context=
	context=new AnnotationConfigApplicationContext();
	context.scan("com.anand");
	context.refresh();
	
	PatientDBOperation pdbop= (PatientDBOperation) context.getBean("pdbop");
	Patient patient= new Patient();
	patient.setPatientId(11);
	patient.setEmialId("xyz@gmail.com");
	patient.setName("karan sahul");
	patient.setAge("18");
	patient.setGender("F");
	patient.setContactNo(9336044);
	
	//multiple patient details;
	Patient p1= new Patient();
	p1.setPatientId(4);
	p1.setEmialId("xyz@gmail.com");
	p1.setName("karan");
	p1.setAge("18");
	p1.setGender("M");
	p1.setContactNo(9336044);
	
	Patient p2= new Patient();
	p2.setPatientId(5);
	p2.setEmialId("xyz@gmail.com");
	p2.setName("karan");
	p2.setAge("18");
	p2.setGender("M");
	p2.setContactNo(9336044);
	
	Patient p3= new Patient();
	p3.setPatientId(8);
	p3.setEmialId("xyz@gmail.com");
	p3.setName("skka");
	p3.setAge("18");
	p3.setGender("M");
	p3.setContactNo(9336044);
	List<Patient> patientList= new ArrayList<>();
	Collections.addAll(patientList,p1,p2,p3); // using collection interface add all patient type object into ArrayList in single time
	System.out.println("************************************************");

	
	pdbop.addSinglePatientDetail(patient); //add single patient details
	System.out.println("************************************************");

	
	pdbop.addMoreThanOnePatientDetail(patientList); //add list of patient details
	System.out.println("************************************************");

	
	pdbop.updatePatientDetail(patient); //for update the existing data 
	System.out.println("************************************************");

	
	Patient p=pdbop.findOrFetchPatientDetail(8);  // for select or search operation but based on the primary key , if primary key will present then return otherwise not return
	System.out.println(p);
	System.out.println("************************************************");

	
	// select or search operation perform on the bases of any column not primary key ,if column name present and data present in that column then return data otherwise not return (return NoSuchElementFound)
	List<Patient> p4=(List<Patient>) pdbop.findOrFetchDetailNonPrimaryKey("18");  
	System.out.println(p4);
	System.out.println("************************************************");

	
	//select operation happen bases on more then one argument 
	 List<Patient> p5=(List<Patient>) pdbop.getPatientWithAgeandGender("18","M");
	 System.out.println(p5);
	 System.out.println("************************************************");

	 
	 //select operation on the basis of all data select 
	List<Patient> p6=pdbop.findAllPatient();
	for(Patient pp:p6)
	{
		System.out.println(pp);
	}
	System.out.println("************************************************");

	
	 //delete operation happen with the basis of Primary key
     pdbop.deleteData(11);
 	 System.out.println("************************************************");

   }
}
