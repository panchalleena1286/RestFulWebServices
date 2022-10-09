package com.assignment.nine.RestFulAssignment9;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	
	private String movieId;
	private String movieName;
	private String movieActor;
	private Float movieCollection;
	
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	public Float getMovieCollection() {
		return movieCollection;
	}
	public void setMovieCollection(Float movieCollection) {
		this.movieCollection = movieCollection;
	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieActor=" + movieActor
				+ ", movieCollection=" + movieCollection + "]";
	}
	
	
}
