package mod4CSC201ArraysPrimitive;

import java.util.Scanner;

public class Ex5SPrimitiveArrayWithStrings {
	
	public static void main(String[] args) {
		// add some numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Strings do you want to add?");
		int howMany = scan.nextInt();
		scan.nextLine();
		
		// I want to keep track of each of the numbers
		// in this example we will use an array
		// declare the array.  You must declare the data type you are storing
		// You must know how many there will be
		// DECLARATION
		String[] words = new String[howMany];
		String word;
		for (int i=0;i<howMany;i++)
		{
			System.out.println("Give me a word:");
			word = scan.nextLine();
			words[i] = word;
					
		}
		
		// when I get to here, I still know all of the values
		for (int i=0;i<howMany;i++)
			System.out.println(words[i]);
		

	}


}
