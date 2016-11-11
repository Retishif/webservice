package org.musicPlyalist.webservice;

public class test {
	public static void main(String[] args){
		PlayList list = new PlayList();
		
		
		//test add new song
		list.addSong("Alleyzonme", "tupack", 2017);
		for(Song s: list.getSongs()){
			System.out.println("Album : " + s.getAlbum());
			System.out.println("Artist : " + s.getArtist());
			System.out.println("year : " + s.getAlbumYear());
		}
		
		//test add music
		if(list.addMusic("God is good"))
			System.out.println("music added");
		
		System.out.println("TRUCKLIST:" );	
		for(int i = 0; i< list.sg.getMusicTitle().size(); i++)
			
			System.out.println(list.sg.getMusicTitle().get(i));
	
		//test deleting music
				int k = 0;
				if(list.deleteMusic( k=list.sg.getMusicTitle().indexOf("God is good")))
					System.out.println("Music deleted at index of " + k);
				
				System.out.println("TRUCKLIST after deletion:" );	
				for(int i = 0; i< list.sg.getMusicTitle().size(); i++)
					
					System.out.println(list.sg.getMusicTitle().get(i));
				
				
	}

}
