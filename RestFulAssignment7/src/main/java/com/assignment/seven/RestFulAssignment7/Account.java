package com.assignment.seven.RestFulAssignment7;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	private int acno;
	private String name;
	private String actype;
	private int balance;
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActype() {
		return actype;
	}
	public void setActype(String actype) {
		this.actype = actype;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + ", actype=" + actype + ", balance=" + balance + "]";
	}
	
	

}
