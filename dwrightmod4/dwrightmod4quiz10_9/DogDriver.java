package dwrightmod4quiz10_9;

import java.util.ArrayList;
import java.util.Scanner;

public class DogDriver {

	public static void main(String[] args) {
		boolean test = false;
		String remove;
		Scanner scan = new Scanner(System.in);
		
		Dog fido = new Dog("Fido", "Mutt");
		Dog rover = new Dog("Rover", "Spaniel");
		Dog minnie = new Dog("Minnie", "Pooch");
		Dog sam = new Dog("Sam", "Beagle");
		Dog harvey = new Dog("Harvey", "Poodle");
		ArrayList<Dog> dog = new ArrayList<Dog>();
		dog.add(fido);
		dog.add(rover);
		dog.add(minnie);
		dog.add(sam);
		dog.add(harvey);
		
		DogDriver.print(dog);
		
		System.out.println("Name a dog you wish to remove.");
		remove = scan.nextLine();
		
		for(int i = 0; i < dog.size(); i++) {
			if (remove.equalsIgnoreCase(dog.get(i).getName())) {
				test = true;
				dog.remove(i);
			}
		}
		if(test == false)
			System.out.println(remove + " does not exist");
		
		Dog trixie = new Dog("Trixie", "Boxer");
		dog.add(0, trixie);
		
		
		DogDriver.print(dog);
		
		
		

	}
	public static void print(ArrayList<Dog> doggo) {
		
		System.out.println("Your dogs are:");
		for(int i = 0;i<doggo.size();i++) {
			System.out.println(doggo.get(i).toString());
		}
	}

}