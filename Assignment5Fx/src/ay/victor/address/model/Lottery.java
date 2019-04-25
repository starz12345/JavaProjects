package ay.victor.address.model;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public Scanner keys = new Scanner(System.in);
	private final int MAXWIN = 1000000;
	private Random ran = new Random();
	private double bet = 0;
	private boolean gameOn = true;
	private int num;
	private String entry;
	private int guess;
	int random = ran.nextInt(100000);

	public void setBet(double bet) {
		this.bet += bet;
	}
	private int getRandom() {
		return random;
	}
	
	public void instructions() { // game instructions
		System.out.println("Want to win a million dollars?");
		System.out.println("if so, guess the winning number (a number between 0 and 1000000)");
		playing();
	}

	public void playing() { //Start Game

		while (gameOn) {
			System.out.print("Enter('1' to play or 'q' to quit): ");
			this.entry = keys.nextLine();
			if (entry.equalsIgnoreCase("q"))
				endGame();// exit game
			if (entry.equals("1")) {
				this.num = getRandom();
				setBet(1);
				System.out.println(num); // delete
				System.out.print("Enter a number: ");
				this.guess = keys.nextInt();
				keys.nextLine();
				if (guess == num) {
					System.out.println("YOU WIN! $" + this.MAXWIN);
					this.gameOn = false; // exit game
				} else {
					continuePlaying();
				}
			}

		}
	}

	public void continuePlaying() {
		System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
		System.out.print("Enter: ");
		entry = keys.nextLine();
		if (entry.equals("y")) {
			setBet(2);
			if (num > guess) {
				System.out.println("Your number is too low!");
			} else {
				System.out.println("Your number is too high!");
			}

		}
		playing();
	}

	public void endGame() {
		System.out.println("You lost $" + this.bet + " Thanks for playing. Come again!");
		this.gameOn = false;

	}

}