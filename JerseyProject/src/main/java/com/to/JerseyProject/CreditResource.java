package com.to.JerseyProject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("creditcard")
public class CreditResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public boolean getCC()
	{	
		CreditCard c = new CreditCard();
		c.setCreditCardNo("0123456787654321");
		String ccNo = c.getCreditCardNo().substring(c.getCreditCardNo().length()-1);
		
		if(Integer.parseInt(ccNo)%2 == 0)
			return true;
		
		return false;
		
			
				
	}

}
