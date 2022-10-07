package com.assignment.seven.RestFulAssignment7;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("account")
public class AccountResource {
	
AccountRepository rep = new AccountRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Account> getDetails()
	{
		System.out.println("getEmploye Called..");
		
		return rep.getDetails();
	}
	
	@GET
	@Path("deposite/{amt}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Account getdeposite(@PathParam("amt") int amt)
	{
		
		return rep.deposite(amt);
	}

	@GET
	@Path("withdrawal/{amt}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public int getwithdrawal(@PathParam("amt") int amt)
	{
		
		return rep.withdraw(amt);
	}


	@GET
	@Path("bal")
	@Produces(MediaType.APPLICATION_XML)
	public int getBalance()
	{
		System.out.println("Account Balance is : ");
		
		return rep.balance();
	}
	
}
