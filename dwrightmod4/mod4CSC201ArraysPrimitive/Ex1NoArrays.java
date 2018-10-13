package mod4CSC201ArraysPrimitive;

//write a program that takes in 5 numbers and prints them

import java.util.Scanner;

public class Ex1NoArrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// we declare one variable for the data
		int num;
		// we loop through and get each value.  But the second value wipes out the first
		//and the third wipes out the second
		for (int i = 0;i<5;i++) {
			System.out.println("Give me a number:");
			num = scan.nextInt();
			System.out.println("Your number was " + num);
		}
		// when I get to here, I only have the last number still in memory
	}

}
