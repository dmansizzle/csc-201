package dwrightmod3_csc201_F18;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {

		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		int sales = 0, store = 0, games = 0;
		String nameGame;
		double price, total = 0;
		int numSold = 0;

		
		
		
		
		System.out.println("How many games are you selling?");
		games = scan.nextInt();

		for (int j = 1; j <= games; j++) {

			scan.nextLine();
			System.out.println("What is the name of game #" + j + "?");
			nameGame = scan.nextLine();
			
			System.out.println("What is the price of the game?");
			price = scan.nextDouble();
			
			Game dan = new Game(nameGame, price);
			
			System.out.println("How many stores are you selling your game in?");
			store = scan.nextInt();

			for (int i = 1; i <= store; i++) {
				System.out.println("How many copies are you selling in store #" + i + "?");
				sales = scan.nextInt();

				dan.updateSales(sales);
			}
			total += dan.totalValue();
			numSold += dan.getNumSold();

			System.out.println(dan.toString());

		}
		System.out.println("You sold " + numSold + " games for " + mon.format(total));

	}

}