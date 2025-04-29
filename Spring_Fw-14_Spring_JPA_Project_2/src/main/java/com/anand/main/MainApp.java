package com.anand.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.entity.Patient;
import com.anand.dboperation.*;;

public class MainApp {
   public static void main(String[] args)
   {
	AnnotationConfigApplicationContext context=
	context=new AnnotationConfigApplicationContext();
	context.scan("com.anand");
	context.refresh();
	
	PatientDBOperation pdbop= (PatientDBOperation) context.getBean("pdbop");
    List<Patient> allPatient =pdbop.getPatientDetails();
    System.out.println(allPatient);
    
    List<Patient> patientEmailid=pdbop.getDetailsByEmail("xyz@gmail.com");
    System.out.println(patientEmailid);
    
    Patient patient=new Patient();
    patient.setPatientId(1212);
    patient.setName("sem");
    patient.setGender("m");
    patient.setEmialId("abc@gmail.com");
    patient.setContactNo(525252);
    pdbop.addDetails(patient);

   List<Patient> patientByEmailAndGender=pdbop.getDetailsByEmailAndGender("abc@gmail.com","m");
   System.out.println(patientByEmailAndGender);
   
   pdbop.addDetailByNameParameter(15,"21", 25254545, "anand@google.com", "M", "anand");
   
   System.out.println("*******************************************");
   System.out.println(pdbop.getAllDetail());
   }
}
