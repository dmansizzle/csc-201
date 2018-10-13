package dwrightmod3_csc201_F18;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Paint {

	

	public static void main(String[] args) {
		int numRooms;
		double sqFeet, totalFeet = 0, paintCost;
		
		DecimalFormat df = new DecimalFormat("#.##");
		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rooms are you painting?");
		numRooms = scan.nextInt();
		
		for(int i = 1; i <= numRooms; i++)
		{
			System.out.println("What is the square footage of room #" + i);
			sqFeet = scan.nextDouble();
			totalFeet += sqFeet;
		}
		
		System.out.println("What is the cost of paint per gallon?");
		paintCost = scan.nextDouble();
		
		double hours, gallons, paCost, laborCost, totalCost;
		
		gallons = Paint.getGallons(totalFeet);
		hours = Paint.getHours(totalFeet);
		paCost = Paint.getPaintCost(gallons, paintCost);
		laborCost = Paint.getLaborCost(hours);
		totalCost = Paint.totalCost(paCost, laborCost);
		
		System.out.print("The paint job has a total square footage of " + totalFeet + " which takes " + df.format(gallons)
				+ " gallons of paint and will take " + df.format(hours) + " hours to paint.\nThe total cost of the job is " + mon.format(totalCost));
	}

	public static double getPaintCost(double gallon, double cost) {

		double paintGal = gallon;
		double galCost = cost;
		double pCost = paintGal * galCost;
		
		return pCost;
		
		
		
	}

	public static double getGallons(double feet) {
		double feetUsed = feet;
		double gal;
		gal = feet/115;
		return gal;

	}

	public static double getHours(double feet) {

		double feetUsed = feet;
		double hour;
		hour = (feet/115) * 8;
		return hour;
	}

	public static double getLaborCost(double time) {
		
		double hour = time;
		double hourCost;
		hourCost = (hour * 18);
		return hourCost;

	}

	public static double totalCost(double paintCost, double hoursCost) {
		double pCost = paintCost;
		double hCost = hoursCost;
		double tCost = pCost + hCost;
		
		if (tCost > 300)
			tCost = tCost - (tCost * .1);
		
		

		return tCost;
	}
}
