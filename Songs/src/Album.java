import java.util.ArrayList;

public class Album {
	
	public String name;
	public static ArrayList<String> albums = new ArrayList<String>();
	
	
	public Album(String name) {
		this.name = name;
		if (albums.contains(name) == false) this.albums.add(name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static ArrayList<String> getAlbums() {
		return albums;
	}


	public void setAlbums(String albums) {
		if (albums.contains(albums) == false)
			this.albums.add(albums);
		
	}
	
	
	
}
