package com.assignment.eight.RestFulAssignment8;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Album {
	private String albumName;
	private int albumId;
	private String albumTitle;
	private String Singer;
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	

}
