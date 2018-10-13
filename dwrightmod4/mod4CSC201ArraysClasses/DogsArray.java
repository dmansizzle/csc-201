package mod4CSC201ArraysClasses;
import java.util.Arrays;
import java.util.Scanner;
public class DogsArray {

	
	public static void main(String[] args) {
			// add some numbers
			Scanner scan = new Scanner(System.in);
			System.out.println("How many doggies do you want to add?");
			int howMany = scan.nextInt();
			scan.nextLine();
			// I want to keep track of each of the numbers
			// in this example we will use an array
			// declare the array.  You must declare the data type you are storing
			// You must know how many there will be
			// DECLARATION
			//int[] nums = new int[howMany];
			Dog[] dogs = new Dog[howMany]; // this only makes the array --not the dogs
			String who;
			for (int i=0;i<howMany;i++)
			{
				System.out.println("Dog's name:");
				who = scan.nextLine();
				// create the dog before putting him on the array 
				Dog d = new Dog(who);
				dogs[i] = d;
				//total = total + num;
				
			}
			
			//System.out.println("The total is" + total);
			// when I get to here, I still know all of the values
			for (int i=0;i<howMany;i++)
				System.out.println(dogs[i].toString());
			

		}
}
