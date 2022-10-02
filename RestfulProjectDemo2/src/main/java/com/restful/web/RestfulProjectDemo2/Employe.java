package com.restful.web.RestfulProjectDemo2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employe {
	private String Ename;
	private int Eno;
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEno() {
		return Eno;
	}
	public void setEno(int eno) {
		Eno = eno;
	}
	@Override
	public String toString() {
		return "Employe [Ename=" + Ename + ", Eno=" + Eno + "]";
	}
	
	

}
