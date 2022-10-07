package com.assignment.six.RestFulAssignment6;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employes")
public class EmployeResource {

	EmployeRepository rep = new EmployeRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employe> getEmployes()
	{
		System.out.println("getEmploye Called..");
		
		return rep.getEmployes();
	}
	
	@GET
	@Path("employe/{empid}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employe getEmploye(@PathParam("empid") int empid)
	{
		
		return rep.getEmploye(empid);
	}
	
	
	@POST
	@Path("employe")
	public Employe createEmploye(Employe e1)
	{
		System.out.println(e1);
		rep.create(e1);
		
		return e1;
		
	}
	

	@DELETE
	@Path("employe/delete/{empid}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employe deleteEmploye(@PathParam("empid") int empid)
	{
		
		return rep.delete(empid);
	}
}

