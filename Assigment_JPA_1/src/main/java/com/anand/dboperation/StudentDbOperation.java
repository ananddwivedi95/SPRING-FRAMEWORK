package com.anand.dboperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anand.entity.Student;
import com.anand.repository.StudentRepository;

@Component("stop")
public class StudentDbOperation {

	@Autowired
	StudentRepository strepo;
	//inserting operation 
	public void addStudentDetails(int stId,String stName,String stCource,long stCont)
	{
		strepo.addAllDetail(stId,stName,stCource,stCont);
	}
	
	//delete operation
	public void deleteStudentDetail(int stId)
	{
		strepo.deleteDetails(stId);
	}
	
	public void updateStudentDetail(int stId,String stName,String stCource,long stCont)
	{
		strepo.update(stId,stName,stCource,stCont);
	}
	
	public Optional<Student> select(int stId) {
	    return strepo.findById(stId);
	}
}
