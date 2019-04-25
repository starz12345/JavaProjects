import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
	
	private String name;
	

	private static Songs music;
	public static Scanner keys = new Scanner(System.in);
	private static LinkedList<String> songs = new LinkedList<String>();
	
	public Playlist(LinkedList<String> songs) {
		this.songs = songs;
	}
	
	
	
	public static void updatePlaylist(String name) {
		if (songs.contains(name) == false) {
			songs.add(name);
			System.out.println(name + " Added");
		} else {
			System.out.println(name + " Already exists");
		}
		
		
		
	}
	
	public static void instructions() {
		
		System.out.println("1 - Play");
		System.out.println("2 - Next");
		System.out.println("3 - Previous");
		System.out.println("4 - Replay");
		System.out.println("5 - List");
		System.out.println("0 - Quit");
		
	}
	
	public static void addSong() {
		
		System.out.println("Pick a Song");
		
		
		for (int i = 0; i < Songs.getMusic().size(); i++) {
			
			System.out.println((i + 1) + " " + Songs.getMusic().get(i));
			
		}
		
		System.out.println(0 + " Press to save");
		
		
	}



	public static void getSongs() {
		for (int i = 0; i < songs.size(); i++) {
			
			System.out.println((i + 1) + " " + songs.get(i));
			
		}
	}
	
	public static void changeSong() {
		
//		System.out.println("Change Song");
//		System.out.println("1. Next \n" + "2. Previous");
		
		ListIterator<String> i = songs.listIterator();
		boolean goingForward = true;
		
		System.out.println("Now Playing " + i.next());
		
		boolean quit = false;
		
		while (!quit) {
			
			int entry = keys.nextInt();
			keys.nextLine();
			
			switch (entry) {
			case 1:
				if(!goingForward) {
	                if(i.hasNext()) {
	                    i.next();
	                }
	                goingForward = true;
	            }
				if (i.hasNext()) {
					System.out.println(i.next() + " Now Playing");
				} else {
					System.out.println("End of the  Playlist");
					goingForward = false;
				}
				
				break;
			case 2:
				if(goingForward) {
	                if(i.hasPrevious()) {
	                    i.previous();
	                }
	                goingForward = false;
	            }
				if (i.hasPrevious()) {
					System.out.println(i.previous() + " Now Playing");
				} else {
					System.out.println("Start of the  Playlist");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
                break;	
				
			case 4:
				printMenu();
                break;
                
			case 0:
				quit = true;
				instructions();
				break;

			default:
				instructions();
				break;
			};
			
		}
				
		
		
	}

	
	public static void setSongs(ArrayList<String> arrayList) {
		
		for (String a: arrayList) {
			songs.add(a);
		}
		System.out.println("All songs added");
	}



	public static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - print menu options");
        changeSong();
    }
	
	public static void removeSongs() {
		getSongs();
		System.out.println("Enter name of song to remove");
		String entry = keys.nextLine();
		deleteSong(entry);
		
	}
	
	private static void deleteSong(String name) {
		
		songs.remove(name);
		
	}
	
	
	
}