package dwrightmod4csc_201;

import java.text.DecimalFormat;


public class RainfallDriver {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		double[] thisYear = {1.6, 2.1, 1.7, 3.5, 2.6, 3.7,  3.9, 2.6, 2.9, 4.3, 2.4, 3.7 };
		String[] months = {"January", "February", "March", "April", "May", "June",
	    		  "July", "August", "September", "October", "November", "December"};
		
		
		
		
		
		Rainfall year = new Rainfall(thisYear);
		
		System.out.println("The total rainfall for this year is " + year.getTotalRainfall() + " inches.");
		System.out.println("The average rainfall for this year is " + df.format(year.getAverageRainFall()) + " inches.");
		System.out.println("The month with the highest amount of rainfall is " + months[year.getHighestMonth()] 
				+ " with " + thisYear[year.getHighestMonth()] + " inches.");
		System.out.println("The month with the lowest amount of rainfall is " + months[year.getLowestMonth()] 
				+ " with " + thisYear[year.getLowestMonth()] + " inches.");
		
		

	}

}
