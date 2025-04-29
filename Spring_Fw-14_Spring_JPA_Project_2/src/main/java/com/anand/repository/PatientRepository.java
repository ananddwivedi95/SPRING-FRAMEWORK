package com.anand.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anand.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{

	//index based Parameter
	@Query(value="select * from patient where patientId=8",nativeQuery=true)
	public List	<Patient> getAllPatients();
	
	@Query(value="select * from patient where emialId=?1",nativeQuery=true)
	public List<Patient> getDetailsByEmail(String emailId);

	@Query(value="select * from patient where emialId=?1 And gender=?2",nativeQuery=true)
	public List<Patient> getEmailAndGender(String emaildId,String Gender);
	
	//using name based query Parameter
	//adding patient details
	@Transactional
	@Modifying
	@Query(value=" insert into patient values(:patientId,:age,:contactNo,:emialId,:gender,:name)",nativeQuery=true)
	public  void addPatientByNamedParameter( @Param(value = "patientId") int patientId,
			                                 @Param(value = "age") String age,
			                                 @Param(value = "contactNo")long contactNo,
			                                 @Param(value = "emialId")String emialId,
			                                 @Param(value = "gender")String gender,
			                                 @Param(value = "name")String name);
    
	

}
