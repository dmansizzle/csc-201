package dwrightmod2_9_15;

import java.util.Scanner;

public class FunWithNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, highest = 0, even = 0, odd = 0, lowest = 0, total = 0, numEntered = 0, alist = 0, temp = -999;
		int[] dup = new int[9999]; 
		
		System.out.println("Enter a number (-999 to quit)");
		num = scan.nextInt();
		highest = num;
		lowest = num;
		

		while (num != -999)
		{
			
			if (num > highest)
				highest = num;
			else if (num < lowest)
				lowest = num;
			
			if ((num % 2) == 0)
				even++;
			else
				odd++;
			if (num == temp)
			{
				dup[alist] = num;
				alist++;
			}
			total+=num;
			numEntered++;
			temp = num;
			
			System.out.println("Enter a number (-999 to quit)");
			num = scan.nextInt();
			
		}
		if(numEntered == 0) 
			System.out.println("You did not enter any numbers");
		else
		{
			System.out.println("You entered " + numEntered + " number(s).");
			System.out.println("Lowest number: " + lowest);
			System.out.println("Highest number: " + highest);
			System.out.println("Number of odds: " + odd);
			System.out.println("Number of evens: " + even);
			System.out.print("The direct adjacent numbers are: ");
			
			for (int i = 0; i < alist; i++)
				System.out.print(dup[i] + " ");
		}
		
		
	}

}