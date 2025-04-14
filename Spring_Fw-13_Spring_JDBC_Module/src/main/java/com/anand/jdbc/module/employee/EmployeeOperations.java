package com.anand.jdbc.module.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {

	 @Autowired
	 JdbcTemplate jdbctemplate;
	 
	 //insertion operation dynamically 
	  public int addEmployee(EmployeeDetails emp)
	  {
		  String query="insert into employee values('"+emp.getEmpid()+"','"+emp.getEmpName()+"','"+emp.getSaliary()+"')";
		  return jdbctemplate.update(query);
	  }
	  //deletion operation dynamically
	  public int deleteEmployee(EmployeeDetails emp)
	  {
		  String query="delete from employee where empName='"+emp.getEmpName()+"'";
		  return jdbctemplate.update(query);
	  }
	  
	  //select data from employee and finally i want to get it as list of employee object
	  public List<EmployeeDetails> loadAllEmployee()
	  {
		  String allQuery="select * from employee";
		  
		 List<EmployeeDetails> allemp= jdbctemplate.query(allQuery, new EmployeeRowMapper());
		  
		 System.out.println(allemp);
		 
		 for(EmployeeDetails e:allemp)
		 {
			 System.out.print(e.getEmpid());
			 System.out.print(" "+e.getEmpName());
			 System.out.print(" "+e.getSaliary());
			 System.out.println();
		 }
		 return allemp;
	  }
}
