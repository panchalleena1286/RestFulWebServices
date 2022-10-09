package com.assignment.nine.RestFulAssignment9;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
	
	List<Movie> movies;
	public MovieRepository(){
		
		movies = new ArrayList<>();
		
		Movie m1 = new Movie();
		m1.setMovieName("Top Gun");
		m1.setMovieId("M001");
		m1.setMovieActor("Tom Cruise");
		m1.setMovieCollection(35000000.00F);
		
		Movie m2 = new Movie();
		m2.setMovieName("Bhool Bhulaiyaa2");
		m2.setMovieId("M002");
		m2.setMovieActor("Kartik Aryan");
		m2.setMovieCollection(50000000.00F);
		
		Movie m3 = new Movie();
		m3.setMovieName("Phir Hera Pheri");
		m3.setMovieId("M003");
		m3.setMovieActor("Ranvir Kapoor");
		m3.setMovieCollection(30000000.00F);
		
		Movie m4 = new Movie();
		m4.setMovieName("CutPutli");
		m4.setMovieId("M004");
		m4.setMovieActor("Akshay kumar");
		m4.setMovieCollection(70000000.00F);
		
		Movie m5 = new Movie();
		m5.setMovieName("Hero Panti");
		m5.setMovieId("M005");
		m5.setMovieActor("Tiger shof");
		m5.setMovieCollection(6000000.00F);
		
		Movie m6 = new Movie();
		m6.setMovieName("Brahmastra");
		m6.setMovieId("M006");
		m6.setMovieActor("Ranvir Kapoor");
		m6.setMovieCollection(30000000.00F);
		
		Movie m7 = new Movie();
		m7.setMovieName("RRR");
		m7.setMovieId("M007");
		m7.setMovieActor("Ram Charan");
		m7.setMovieCollection(90000000.00F);
		
		Movie m8 = new Movie();
		m8.setMovieName("Kabil");
		m8.setMovieId("M008");
		m8.setMovieActor("Hritik Roshan");
		m8.setMovieCollection(30000000.00F);
		
		Movie m9 = new Movie();
		m9.setMovieName("Kipuche");
		m9.setMovieId("M009");
		m9.setMovieActor("Shushant Singh");
		m9.setMovieCollection(30000000F);
		
		Movie m10 = new Movie();
		m10.setMovieName("KGF");
		m10.setMovieId("M010");
		m10.setMovieActor("Yesh");
		m10.setMovieCollection(30000000F);
		
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		movies.add(m8);
		movies.add(m9);
		movies.add(m10);
			
	}
	
	public List<Movie> getMovie()
	{
		
		return movies;
		
	}
	
	public List<Movie> getMovies()
	{
		
		return movies;
		
	}

}
