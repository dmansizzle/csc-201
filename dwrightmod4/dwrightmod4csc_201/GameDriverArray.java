package dwrightmod4csc_201;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class GameDriverArray {
	public static void main(String[] args) {

		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		int sales = 0, store = 0, games = 0;
		String nameGame;
		double price;

		System.out.println("How many games are you selling?");
		games = scan.nextInt();

		Game[] dan = new Game[games];

		for (int j = 0; j < games; j++) {

			scan.nextLine();
			System.out.println("What is the name of game #" + (j + 1) + "?");
			nameGame = scan.nextLine();

			System.out.println("What is the price of the game?");
			price = scan.nextDouble();

			dan[j] = new Game(nameGame, price);

			System.out.println("How many stores are you selling your game in?");
			store = scan.nextInt();

			for (int i = 1; i <= store; i++) {
				System.out.println("How many copies are you selling in store #" + i + "?");
				sales = scan.nextInt();

				dan[j].updateSales(sales);
			}

		}
		printGames(dan);
		System.out.println("You sold " + totalNumber(dan) + " games for " + mon.format(totalValue(dan)));

	}

	public static void printGames(Game[] games) {
		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		for (int j = 0; j < games.length; j++) {
			System.out.println("There were " + games[j].getNumSold() + " copies of the game " + games[j].getGameName()
					+ ". Each costs " + mon.format(games[j].getPriceEach()) + "for a total value of "
					+ mon.format(games[j].totalValue()));
		}
	}

	public static double totalValue(Game[] games) {
		Game[] babies = games;
		double total = 0;
		for (int i = 0; i < babies.length; i++) {
			total += babies[i].totalValue();
		}
		return total;

	}

	public static int totalNumber(Game[] games) {
		Game[] babies = games;
		int numGames = 0;

		for (int i = 0; i < babies.length; i++) {
			numGames += babies[i].getNumSold();
		}
		return numGames;

	}

}
