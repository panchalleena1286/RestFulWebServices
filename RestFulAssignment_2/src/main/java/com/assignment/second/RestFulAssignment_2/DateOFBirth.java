package com.assignment.second.RestFulAssignment_2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DateOFBirth {
	
	
	private int current_date;
	private int current_month;
	private int current_year;
	
	public DateOFBirth(int current_date, int current_month, int current_year) {
		super();
		this.current_date = current_date;
		this.current_month = current_month;
		this.current_year = current_year;
	}
	
	public int getCurrent_date() {
		return current_date;
	}
	public void setCurrent_date(int current_date) {
		this.current_date = current_date;
	}
	public int getCurrent_month() {
		return current_month;
	}
	public void setCurrent_month(int current_month) {
		this.current_month = current_month;
	}
	public int getCurrent_year() {
		return current_year;
	}
	public void setCurrent_year(int current_year) {
		this.current_year = current_year;
	}
	
	
	
	
}


