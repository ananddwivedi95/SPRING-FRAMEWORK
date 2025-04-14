package com.anand.jdbc.module.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDetails e= new EmployeeDetails();
		e.setEmpid(rs.getString("empid"));
		e.setEmpName(rs.getString("empName"));
		e.setSaliary(rs.getString("saliary"));
		return e;
	}
   
}
