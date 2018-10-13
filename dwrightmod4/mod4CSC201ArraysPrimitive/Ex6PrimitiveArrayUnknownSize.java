package mod4CSC201ArraysPrimitive;

import java.util.Scanner;

public class Ex6PrimitiveArrayUnknownSize {
	public static void main(String[] args) {
		// add some numbers
		Scanner scan = new Scanner(System.in);
		// I want to keep track of each of the numbers
		// in this example we will use an array
		// declare the array.  You must declare the data type you are storing
		// I do not know how many numbers so I have to make the array larger than I eve would need
		int[] nums = new int[1000];
		int currentNum=0;
		int numSoFar=0;
		int total=0;
		// let's use a sentinel to end
		while(currentNum!=-999)
		{
			System.out.println("Number: (-999 to end)");
			currentNum = scan.nextInt();
			if(currentNum!=-999)
			{
				nums[numSoFar] = currentNum;
				total = total + currentNum;
				numSoFar++;
			}
			
		}
		// when I get to here, I still know all of the values
		System.out.print("The numbers are: ");
		for (int i=0;i<numSoFar;i++)
		{
			System.out.print(nums[i] + "  ");
						
		}
		System.out.println("\nThe total is " + total);
		
		
		

	}


}
