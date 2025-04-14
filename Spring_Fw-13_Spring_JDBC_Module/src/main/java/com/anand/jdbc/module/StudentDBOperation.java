package com.anand.jdbc.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("std")
public class StudentDBOperation {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	//test single insertion
	public int addStudent()
	{
		String query="INSERT INTO student VALUEs('anand', '1010')";
		return jdbcTemplate.update(query);
	}
	
	//test multiple insertion
	public int addStudentAll()
	{ 
		String query="insert into student values('Anand Dwivedi','1414'),('raj ','2525'),('ding','5555')";
		return jdbcTemplate.update(query);
	}
	
	//test for delete operation
	  public int deleteStudent() {
		  String quary="delete from student where name='anand'"; 
		  return jdbcTemplate.update(quary);
		  }
	 
}
