package dwrightmod2_9_15;


import java.text.NumberFormat;
import java.util.Scanner;

public class WidgetSales {

	public static void main(String[] args) {
		double total=0, currentSale=0, discount, amountSold = 0;
		int purchase = 0;
		
		NumberFormat df = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("How many widgets would you like to purchase? ($52 each) (-999 to leave)");
		purchase = scan.nextInt();
		while(purchase != -999) {
			
			currentSale = purchase * 52;
			amountSold += purchase;
			
			if (purchase >= 10 && purchase <= 19)
			{
				System.out.println("The original price of this purchase was " + df.format(currentSale));
				discount = currentSale * .2;
				currentSale = currentSale - discount;
				total += currentSale;
				System.out.println("You got a 20% discount on this purchase bringing your total to " + df.format(currentSale));
				System.out.println("You saved " + df.format(discount));
			}
			else if (purchase >= 20 && purchase <= 49)
			{
				System.out.println("The original price of this purchase was " + df.format(currentSale));
				discount = currentSale * .3;
				currentSale = currentSale - discount;
				total += currentSale;
				System.out.println("You got a 30% discount on this purchase bringing your total to " + df.format(currentSale));
				System.out.println("You saved " + df.format(discount));
			}
			else if (purchase >= 50 && purchase <= 99)
			{
				System.out.println("The original price of this purchase was " + df.format(currentSale));
				discount = currentSale * .4;
				currentSale = currentSale - discount;
				total += currentSale;
				System.out.println("You got a 40% discount on this purchase bringing your total to " + df.format(currentSale));
				System.out.println("You saved " + df.format(discount));
			}
			else if (purchase >= 100)
			{
				System.out.println("The original price of this purchase was " + df.format(currentSale));
				discount = currentSale * .5;
				currentSale = currentSale - discount;
				total += currentSale;
				System.out.println("You got a 50% discount on this purchase bringing your total to " + df.format(currentSale));
				System.out.println("You saved " + df.format(discount));
			}
			else
			{
				System.out.println("The original price of this purchase was " + df.format(currentSale));
				discount = 0;
				total += currentSale;
				System.out.println("You got a 0% discount on this purchase bringing your total to " + df.format(currentSale));
				System.out.println("You saved " + df.format(discount));
			}
			System.out.println("How many widgets would you like to purchase? ($52 each) (-999 to leave)");
			purchase = scan.nextInt();
			
			
		}
		
			System.out.println("You bought a total of " + amountSold + " widgets.");
			System.out.println("You spent a total of " + df.format(total));
	}

}
