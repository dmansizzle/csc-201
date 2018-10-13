package dwrightmod4csc_201;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class GameDriverArrayList {
	public static void main(String[] args) {

		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		int sales = 0, store = 0, games = 0;
		String nameGame;
		double price;

		System.out.println("How many games are you selling?");
		games = scan.nextInt();

		ArrayList<Game> dan = new ArrayList<Game>();

		for (int j = 0; j < games; j++) {

			scan.nextLine();
			System.out.println("What is the name of game #" + (j + 1) + "?");
			nameGame = scan.nextLine();

			System.out.println("What is the price of the game?");
			price = scan.nextDouble();

			Game gam = new Game(nameGame, price);
			dan.add(gam);

			System.out.println("How many stores are you selling your game in?");
			store = scan.nextInt();

			for (int i = 0; i < store; i++) {
				System.out.println("How many copies are you selling in store #" + (i+1) + "?");
				sales = scan.nextInt();

				dan.get(j).updateSales(sales);
			}

		}
		printGames(dan);
		System.out.println("You sold " + totalNumber(dan) + " games for " + mon.format(totalValue(dan)));

	}

	public static void printGames(ArrayList<Game> games) {
		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		for (int j = 0; j < games.size(); j++) {
			System.out.println("There were " + games.get(j).getNumSold() + " copies of the game " + games.get(j).getGameName()
					+ ". Each costs " + mon.format(games.get(j).getPriceEach()) + "for a total value of "
					+ mon.format(games.get(j).totalValue()));
		}
	}

	public static double totalValue(ArrayList<Game> games) {
		double total = 0;
		for (int i = 0; i < games.size(); i++) {
			total += games.get(i).totalValue();
		}
		return total;

	}

	public static int totalNumber(ArrayList<Game> games) {
		
		int numGames = 0;

		for (int i = 0; i < games.size(); i++) {
			numGames += games.get(i).getNumSold();
		}
		return numGames;

	}

}
