package dwrightmod2_9_15;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String again = "yes";
		
		while(again.equals("yes")) {
			int rando, guess = -999;
			int numGuess = 0;
			rando = (int) (Math.random() * 20) + 1;
			System.out.println("Guess a number between 1 and 20");
			guess = scan.nextInt();
			numGuess++;
			while (rando != guess) {
				if (guess < rando) {
					System.out.println("Too Low. Guess Again");
					guess = scan.nextInt();
					numGuess++;
				}
				else
				{
					System.out.println("Too High. Guess Again");
					guess = scan.nextInt();
					numGuess++;
				}
				
			}
			System.out.println("You guessed " + numGuess + " times before getting the right answer.");
			scan.nextLine();
			System.out.println("Would you like to play again?");
			again = scan.nextLine();
			
		}
	}

}
