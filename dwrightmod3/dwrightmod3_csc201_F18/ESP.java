package dwrightmod3_csc201_F18;

import java.util.Scanner;

public class ESP {
	

	public static void main(String[] args) {
		String guess, computer;
		boolean check;
		int comp, total = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Enter in a color (red, green, blue, orange, or yellow)");
			guess = scan.nextLine();
			
			comp = (int) (Math.random() * 5) + 1;
			computer = ESP.convertColor(comp);
			check = ESP.checkCorrect(computer, guess);
			if (check)
				total++;
			System.out.println("The computer's color is " + computer);
			ESP.printResults(check);
			
		}
		System.out.println("Out of ten guesses you got " + total + " correct.");

	}

	public static String convertColor(int choice) {
		int decide = choice;
		String color = "";
		if ( choice == 1)
			color = "red";
		else if (choice == 2)
			color = "green";	
		else if (choice == 3)
			color = "blue";
		else if (choice == 4)
			color = "orange";
		else if (choice == 5)
			color = "yellow";	
		
		return color;
	}
	public static boolean checkCorrect(String robot, String user) {
		String player = user;
		String comp = robot;
		boolean match = false;
		
		if (player.equalsIgnoreCase(comp))
			match = true;
		return match;
		
	}
	public static void printResults(boolean check) {
		boolean match = check;
		
		
		
		if(match) {
			System.out.println("You got it right!");
		}
		else {
			System.out.println("You got the answer wrong.\nTry again");
		}
			
		
		
		
	}
	
	
}
