package com.assignment.nine.RestFulAssignment9;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
	MovieRepository rep = new MovieRepository();
	
	@GET
	@Path("movies")
	@Produces(MediaType.APPLICATION_XML)
	public List<Movie> getMovieDetails()
	{
		System.out.println("getMovieDetails Called..");
		
		return rep.getMovie();
	}
	
	@GET
	@Path("movie")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getMovieDetail()
	{
		System.out.println("JSON Called..");
		
		return rep.getMovies();
	}
}
