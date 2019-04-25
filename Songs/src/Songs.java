import java.util.ArrayList;

public class Songs {
	
	private String name;
	private String albumName;
	public static ArrayList<String> music= new ArrayList<String>();
	private double duration;
	
	public Songs(String name, String albumName, double duration) {
		this.name = name;
		if (music.contains(name) == false) this.music.add(name);
		Album album = new Album(albumName);
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public String getAlbumName() {
		return albumName;
	}

	public static ArrayList<String> getMusic() {
		return music;
	}

	public double getDuration() {
		return duration;
	}
	
	
	
	

}
