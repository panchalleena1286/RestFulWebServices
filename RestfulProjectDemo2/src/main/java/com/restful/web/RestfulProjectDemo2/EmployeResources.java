package com.restful.web.RestfulProjectDemo2;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employe")
public class EmployeResources {
	
	EmployeRepository rep = new EmployeRepository();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employe> getEmployes()
	{
		
		System.out.println("getEmploye Called...");
		
		return rep.getEmps();
	}
	
	@POST
	@Path("emp")
	public int createEmploye(int e1)
	{
		System.out.println(e1);
		rep.getEmploye(e1);
		return e1;
	}
}
