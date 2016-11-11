package org.musicPlyalist.webservice;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public class Song {
	private String artist;
	private ArrayList<String>musicTitle;
	private String album;
	private  int albumYear;
	
	public Song(){
		
	}
	
	public Song(String artistName, String albbumName, int year){
		artist = artistName;
		album = albbumName;
		albumYear = year;
		musicTitle = new ArrayList<>();
		
		
	}
	public String getArtist() {
		return artist;
	}

  
   
	@XmlElement
	public void setArtist(String artist) {
		this.artist = artist;
	}



	public ArrayList<String> getMusicTitle() {
		return musicTitle;
	}


	@XmlElement
	public void setMusicTitle(ArrayList<String> musicTitle) {
		this.musicTitle = musicTitle;
	}



	public String getAlbum() {
		return album;
	}


	@XmlElement
	public void setAlbum(String album) {
		this.album = album;
	}



	public int getAlbumYear() {
		return albumYear;
	}


	@XmlElement
	public void setAlbumYear(int albumYear) {
		this.albumYear = albumYear;
	}
   
 

	
	
	
	
	

}
