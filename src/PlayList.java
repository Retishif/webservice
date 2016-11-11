package org.musicPlyalist.webservice;

import java.util.ArrayList;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
//import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlElement;
@Path("/PlayList")
public class PlayList {

	
	private String name;
	ArrayList<Song>songs;
	Song sg;
	
	
	public PlayList() {
		sg = new Song();
		songs = new ArrayList<>();
		sg = new Song("Queen", "Innuendo", 1991);
		sg.setAlbum("Innuendo");
		sg.setArtist("Queen");
		sg.setAlbumYear(1991);
		songs.add(new Song (sg.getAlbum(), sg.getArtist(), sg.getAlbumYear()));
		sg.getMusicTitle().add("I'm Going Slightly Mad");
		sg.getMusicTitle().add("Headlong");
		sg.getMusicTitle().add("I Can't Live With You ");
		sg.getMusicTitle().add("Ride The Wild Wind");
		name="playlist1";
		
	}
	@GET
	@Produces("text/xml")
	public String getName() {
		return name;
	}

   @XmlElement
	public void setPlayLsName(String name) {
		this.name = name;
	}

   @GET
   @Produces("text/xml")
	public ArrayList<Song> getSongs() {
		return songs;
	}

    @XmlElement
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
    @Path("/putnewsong/{album, artist, year")
	@PUT
    @Consumes("text/xml")
    public boolean addSong(@PathParam("album, artist year") String album, String artist, int year){
		sg.setAlbum(album);
		sg.setArtist(artist);
		sg.setAlbumYear(year);
		
    	return songs.add(new Song (sg.getArtist(), sg.getAlbum(), sg.getAlbumYear()));
    }
	
	@Path("/put/{music}")
	@PUT
    @Consumes("text/xml")
   public boolean addMusic(@PathParam("music") String music){
	   return sg.getMusicTitle().add(music);
   }
   @GET
   @Produces("text/xml")
   public ArrayList<String> getTruckList(){
	   return sg.getMusicTitle();
	   
   }
   @DELETE
   @Path("/delete/{index}")
   public boolean deleteMusic(@PathParam("index") int index){
	   if(getTruckList().size() < index)
		   return false;
	   try {
		   getTruckList().remove(index);
	} catch (Exception e) {
		
   
	}
	   
	   return true;
	   
   }
   
}
