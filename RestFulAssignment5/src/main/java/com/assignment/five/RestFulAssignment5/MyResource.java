package com.assignment.five.RestFulAssignment5;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/add/{v1}/{v2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAdd(@PathParam("v1") int val1, @PathParam("v2") int val2) {
    	int sum = val1+val2;
        return "Addition = ["+ sum + "]";
    }
    
    @GET
    @Path("/sub/{v1}/{v2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getSub(@PathParam("v1") int val1, @PathParam("v2") int val2) {
    	int diff = val1-val2;
        return "Difference = ["+ diff + "]";
    }
}
