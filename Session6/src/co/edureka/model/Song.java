package co.edureka.model;

public class Song {
	
	public String title;
	public String artists;
	public double duration;
	
	// HAS-A Relationship
	public Song nextSong;			// Reference to the Next Song
	public Song previousSong;		// Reference to the Previous Song
	
	public Song() {
		
	}
	
	public Song(String title, String artists, double duration) {
		this.title = title;
		this.artists = artists;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artists=" + artists + ", duration=" + duration + "]";
	}

}
