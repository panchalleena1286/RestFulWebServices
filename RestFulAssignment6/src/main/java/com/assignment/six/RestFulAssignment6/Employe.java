package com.assignment.six.RestFulAssignment6;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employe {

	private int empid;
	private String empname;
	private String email;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employe [empid=" + empid + ", empname=" + empname + ", email=" + email + "]";
	}
	
	
	
}
