package dwrightmod4csc_201;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Game {

	private String gameName;
	private int numSold;
	private double priceEach;
	
	
	public Game() {
		
	}
	
	public Game(String game, double price) {
		gameName = game;
		priceEach = price;
	}
	
	public String toString() {
		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		
		
		return "The game " + gameName + " sold " + numSold + " copies at " + mon.format(priceEach) 
		+ " for a total value of " + mon.format(totalValue());
	}
	
	public void updateSales(int sales) {
		numSold += sales;
	}
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getNumSold() {
		return numSold;
	}

	public void setNumSold(int numSold) {
		this.numSold = numSold;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public double totalValue() {
		return (priceEach * numSold);
	}
	
}
