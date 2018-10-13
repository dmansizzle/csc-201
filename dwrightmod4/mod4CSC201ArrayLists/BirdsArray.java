package mod4CSC201ArrayLists;
import java.util.*;

public class BirdsArray {

	
	public static void main(String[] args) {
		
		/* Let's say I don't know how many I want in the array
		 // so I will make it bigger than I need and keep track
		 */
		
		// Java does initialize array items for you
		Scanner scan = new Scanner(System.in);
		 Bird[] birds = new Bird[30];
		 int i=0;   // I have to keep track of how many are filled in 
		boolean more = true;
		while(more)
		{
			
			System.out.println("What is the bird's name?");
			String name = scan.nextLine();
			System.out.println("What is the bird's breed?");
			String breed = scan.nextLine();
			Bird b = new Bird(breed,name);
			birds[i]=b;
			i++;
			
			System.out.println("More birds?(true/false)");
			more=scan.nextBoolean();
			scan.nextLine();
		}
		//System.out.println(b);   b is out of scope BUT the array is and it has the Bird objects on it!!
		print(birds,i);
		
	}
	
	public static void print(Bird[] values, int num)
	{
		System.out.println("\nThe birds are: ");
		for (int j=0;j<num;j++)		
		{
			System.out.println(values[j].toString());
		}
	}
	

}
