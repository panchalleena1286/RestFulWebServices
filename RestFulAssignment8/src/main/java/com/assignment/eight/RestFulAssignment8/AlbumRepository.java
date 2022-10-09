package com.assignment.eight.RestFulAssignment8;

public class AlbumRepository {

	
	Album a = new Album();
	public AlbumRepository(){
		
		a.setAlbumId(101);
		a.setAlbumName("Kesariya");
		a.setAlbumTitle("newsong");
		a.setSinger("Ariji Singh");
	}
	
	public Album getAlbum(){
		
		return a;
	}
}
