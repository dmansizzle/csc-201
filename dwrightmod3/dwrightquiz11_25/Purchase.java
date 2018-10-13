package dwrightquiz11_25;

import java.text.NumberFormat;

public class Purchase {

	private String item;
	private double priceEach;
	private int number;
	private double taxRate;

	public Purchase() {

	}

	public Purchase(String item, double priceEach, int number, double taxRate) {
		this.item = item;
		this.priceEach = priceEach;
		this.number = number;
		this.taxRate = taxRate;

	}

	public String toString() {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		return "You bought " + number + " " + item + " costing " + priceEach + " for a cost of " + money.format(totalCost()) + ".\n"
	+ "The discount is " + money.format(calcDiscount()) + " and the tax is " + money.format(calcTax()) + "\n"
	+ "The final cost is " + money.format(calcFinalCost());
	}

	public double totalCost() {
		double totCost = priceEach * number;
		return totCost;
	}

	public double calcDiscount() {
		double discount = 0;
		if (number > 20) {
			discount = (totalCost() * .15);
		} else if (number >= 10) {
			discount = (totalCost() * .10);
		}

		return discount;
	}

	public double netBeforeTax() {
		double netBefore = 0;
		netBefore = (totalCost()) - (calcDiscount());
		return netBefore;

	}
	public double calcTax() {
		double taxPaid = 0;
		taxPaid = netBeforeTax() * (taxRate/100);
		return taxPaid;
	}
	public double calcFinalCost() {
		double finalCost = 0;
		finalCost = netBeforeTax() + calcTax();
		
		return finalCost;
		
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

}
