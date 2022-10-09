package com.assignment.eight.RestFulAssignment8;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

   AlbumRepository album = new AlbumRepository();
	
    @GET
    @Path("album")
    @Produces(MediaType.APPLICATION_XML)
    public Album getAlbumDetails() {
    	
        return  album.getAlbum() ;
    }
}
