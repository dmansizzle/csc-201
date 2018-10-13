package mod4CSC201ArrayLists;
import java.util.*;
public class Ex2ALDogs {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// I do not have to know how large it is to start
		// easier to insert and delete where ever
		
		// declare an ArrayList of doggies.  Call empty constructor
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		boolean more = true;
		while (more)
		{
			System.out.println("Name of dog:");
			String who = scan.nextLine();
			// create the dog
			Dog d = new Dog(who);
			// put the dog on the array list
			dogs.add(d);
			System.out.println("More? (true/false)");
			more = scan.nextBoolean();
			scan.nextLine();
		}
		 for (int i=0;i<dogs.size();i++)
			 System.out.println(dogs.get(i).toString());
		

	}

}
