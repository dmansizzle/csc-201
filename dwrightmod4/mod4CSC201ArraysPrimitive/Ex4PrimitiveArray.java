package mod4CSC201ArraysPrimitive;

import java.util.Scanner;

public class Ex4PrimitiveArray {
	public static void main(String[] args) {
		// add some numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to add?");
		int howMany = scan.nextInt();
		
		// I want to keep track of each of the numbers
		// in this example we will use an array
		// declare the array.  You must declare the data type you are storing
		// You must know how many there will be
		// DECLARATION
		int[] nums = new int[howMany];
		int num=0;
		int total=0;
		for (int i=0;i<howMany;i++)
		{
			System.out.println("Number:");
			num = scan.nextInt();
			nums[i] = num;
			total = total + num;
			
		}
		System.out.println("The total is " + total);
		// when I get to here, I still know all of the values
		for (int i=0;i<howMany;i++)
			System.out.println(nums[i]);
		

	}

}
