package com.anand.jdbc.module.employee;


public class EmployeeDetails {
  
	//add employee/inserting employee details
	private String empid;
	private String empName;
	private String saliary;
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(String empid, String empName, String saliary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.saliary = saliary;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSaliary() {
		return saliary;
	}

	public void setSaliary(String saliary) {
		this.saliary = saliary;
	}
	
	
	
	
}
