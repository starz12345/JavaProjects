import java.util.LinkedList;

public class test extends Playlist{
	
	public test(LinkedList<String> songs) {
		super(songs);
	}

	public static void main(String[] args) {
		
		LinkedList<String> best = new LinkedList<String>();
		
		Playlist good = new Playlist(best);
		
		Songs olamide = new Songs("Don't Stop", "Eyan Mayweather", 3.45);
		Songs olamide1 = new Songs("Arara", "Eyan Mayweather", 3.45);
		Songs olamide2 = new Songs("Durosoke", "Eyan Mayweather", 3.45);
		Songs olamide3 = new Songs("Kana", "Eyan Mayweather", 3.45);
		Songs wiz = new Songs("Fever", "Superstar", 3.45);
		Songs wiz1 = new Songs("Ole", "Superstar", 3.45);
		Songs wiz2 = new Songs("67", "Superstar", 3.45);
		Songs wiz3 = new Songs("ope", "Superstar", 3.45);
		
		addSong();
		
		boolean done = false;
		while (done == false) {
			int entry = keys.nextInt();
			keys.nextLine();
			
			switch (entry) {
			case 1:
				updatePlaylist(olamide.getName());
				break;
			case 2:
				updatePlaylist(olamide1.getName());
				break;
			case 3:
				updatePlaylist(olamide2.getName());
				break;
			case 4:
				updatePlaylist(olamide3.getName());
				break;
			case 5:
				updatePlaylist(wiz.getName());
				break;
			case 6:
				updatePlaylist(wiz1.getName());
				break;
			case 7:
				updatePlaylist(wiz2.getName());
				break;
			case 8:
				updatePlaylist(wiz3.getName());
				break;
			case 9:
				setSongs(Songs.getMusic());
				break;
			case 0:
				done = true;
				System.out.println("Playlist Saved");
				break;

			default:
				System.out.println("Invalid Song");
				break;
			}
			
		}
		
		instructions();
		boolean musicPlaying = true;
		while (musicPlaying == true) {
			
			int entry = keys.nextInt();
			keys.nextLine();
			
			switch (entry) {
			case 1:
				printMenu();
				break;
			case 2:
				//replayPlaylist();
				break;
			case 3:
				removeSongs();
				break;	
			case 4:
				getSongs();
				break;
			case 0:
				musicPlaying = false;
				break;

			default:
				break;
			}
			
		}
		
		
		
		
	}

}
