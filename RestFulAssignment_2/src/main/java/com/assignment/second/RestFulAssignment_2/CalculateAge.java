package com.assignment.second.RestFulAssignment_2;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("calculateage")
public class CalculateAge {
	

	@GET
	@Path("/{d_b}/{m_b}/{y_b}")
	@Produces(MediaType.TEXT_PLAIN)
	public String findAge(@PathParam("d_b") int D_B, @PathParam("m_b")  int M_B, @PathParam("y_b")  int Y_B){
		
		DateOFBirth d = new DateOFBirth(15,9,2022);
		int pd = d.getCurrent_date();
		int pm = d.getCurrent_month();
		int py = d.getCurrent_year();
		
		int m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,};
				//jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec
		if(D_B > pd)
		{	
			 pd = pd + m[M_B - 1];
			 pm = pm - 1;
		}
		
		if(M_B > pm)
		{
			 py -= 1;
			 pm += 12;
		}
		
		int caldate = pd - D_B;
		int calmonth = pm - M_B;
		int calyear = py - Y_B;
	
		return " Current Age: [ Days = "+caldate+" month = "+ calmonth + " year = "+calyear+" ] ";
		
	}

}
