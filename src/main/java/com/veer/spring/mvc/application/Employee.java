package com.veer.spring.mvc.application;

public class Employee {

	private String empId;
	private String ssn;
	private String name;
	private String email;
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ssn=" + ssn + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
