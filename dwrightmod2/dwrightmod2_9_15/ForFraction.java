package dwrightmod2_9_15;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ForFraction {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##");
		double denominator, temp;
		double total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the largest denominator");
		denominator = scan.nextInt();
		temp = denominator;
		
		for (int i = 1; i <= denominator; i++) {
			total += (i/temp);
			
			temp--;
		}
		System.out.println("The total sum of all the fractions is " + df.format(total));
	}

}
