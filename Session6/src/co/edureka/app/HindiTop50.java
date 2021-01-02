package co.edureka.app;

import co.edureka.model.Song;

public class HindiTop50 {

	public static void main(String[] args) {
		
		
		Song song1 = new Song("1. Song1", "john, fionna", 2.2);
		Song song2 = new Song("2. Song2", "kim, fionna", 4.2);
		Song song3 = new Song("3. Song3", "sia", 2.8);
		Song song4 = new Song("4. Song4", "fionna, george", 3.5);
		Song song5 = new Song("5. Song5", "dave", 5.8);
		
		
		// Create Links
		song1.nextSong = song2;
		song2.nextSong = song3;
		song3.nextSong = song4;
		song4.nextSong = song5;
		song5.nextSong = song1;
		
		song1.previousSong = song5;
		song2.previousSong = song1;
		song3.previousSong = song2;
		song4.previousSong = song3;
		song5.previousSong = song4;
		
		
		Song temp = song1;
		
		while(temp.nextSong != song1) {
			System.out.println(temp);
			temp = temp.nextSong;
		}
		
		System.out.println(temp);
		
		// Assignment:
		// Try writing a loop which can iterate in backward direction
		
	}

}
