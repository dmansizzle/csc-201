package mod4CSC201ArraysPrimitive;

import java.util.Scanner;

//write a program that takes in 5 numbers 
// and prints them in the reverse order of how they were entered

//NOTE: now we need to store them for later use!!

public class Ex2NeedsArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// now I create an array so I can keep all of the numbers
		int[] nums = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Give me a number:");
			// put each number in consecutive element locations in the array
			nums[i] = scan.nextInt();
			System.out.println("Your number was " + nums[i]);
		}
		
		printBackwards(nums);
	}
	
	public static void printBackwards(int[] values){
		System.out.println("Here are the numbers backwards!");
		for (int i=4;i>=0;i--)
			System.out.println(values[i]);
	}

}
