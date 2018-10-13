package dwrightmod2_9_15;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int armstrong;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter in a number between 100 and 999");
		armstrong = scan.nextInt();
		
		int hundred, ten, one, cubedadded;
		
		hundred = armstrong /100;
		ten = (armstrong - (hundred * 100)) / 10;
		one = (armstrong - (hundred * 100)) - (ten * 10);
		
		cubedadded = (hundred * hundred * hundred) + (ten * ten * ten) + (one * one * one);
		
		if (cubedadded == armstrong)
			System.out.println("This is an Armstrong number");
		else
			System.out.println("This is not an Armstrong number");
		
		
	}

}
