package class10_9;

import java.util.ArrayList;

import java.util.Scanner;

public class DogArrayList {

	public static void main(String[] args) {
		// add some numbers
		Scanner scan = new Scanner(System.in);
		// let's assume that we do not know how many dogs so we will assume
		// there will
		// not be more than ten
		//ArrayList - you do not need to worry about size at all!
		//Dog[] dogs = new Dog[10]; // this only makes the array --not the dogs
		ArrayList<Dog> dogs = new ArrayList<Dog> ();
		
		String more = "yes";
		//int counter = 0;  Java keeps track of size so you do not need to do so
		while (more.equalsIgnoreCase("yes")) {
			String who;
			System.out.println("Dog's name:");
			who = scan.nextLine();
			// create the dog before putting him on the array
			Dog d = new Dog(who);
			
			
			//dogs[counter] = d;
			//counter++;
			dogs.add(d);
			
			
			System.out.println("More dogs? (yes or no)");
			more = scan.nextLine();
		}
		//printDogs(dogs, counter);
		printDogs(dogs);

	}

	/*public static void printDogs(Dog[] dogs, int howMany) {
		for (int i = 0; i < howMany; i++)
			System.out.println(dogs[i].toString());
	}*/
	
	public static void printDogs(ArrayList<Dog> d) {
		for (int i=0;i<d.size();i++)
			System.out.println(d.get(i).toString());
	}

}
