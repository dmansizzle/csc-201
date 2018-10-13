
package mod4CSC201ArrayLists;
import java.util.ArrayList;

public class PetPlay
{
   //-----------------------------------------------------------------
   //  Stores and modifies a list of pets
   //-----------------------------------------------------------------
   
	public static void main (String[] args)
   {
		// always make your array lists generic
      ArrayList<Pet> pets = new ArrayList<Pet>();

      pets.add(new Pet("dog", "Bella"));
      pets.add(new Pet("cat","Blackie"));
      pets.add(new Pet("bird", "Babs"));
      pets.add(new Pet("dog", "Lassie"));
      pets.add(new Pet("horse", "Sam"));
      pets.add(new Pet("dog", "Blackie"));
      pets.add(new Pet("turtle", "Joe"));
      pets.add(new Pet("bird","Annie"));
      pets.add(new Pet("bird", "Alex"));
      pets.add(new Pet("bird", "Babs"));   //I know she is there twice - we need her later
      pets.add(new Pet("cat","Louie"));
      pets.add(new Pet("snake","Jake"));


      // You could use the following to print out all of the pets
      //System.out.println (pets);
      // since Java will call the toString() on each individual item if you do not
      // but these puts the entire collection in [ ] and we do not want that
      // It is better to do it explicitly yourself!!
      
      System.out.println("The pets names are: ");
      for (int i=0;i<pets.size();i++)
    	  System.out.print(pets.get(i).getName()  + " ");
      System.out.println();
      
      //Let's add Quack the Duck at the second location (remember to start
      //counting at zero)
      
      pets.add(1,new Pet("duck","Quack"));
      System.out.println("With Quack added:");
      for (int i=0;i<pets.size();i++)
    	  System.out.print(pets.get(i).getName()  + " ");
      System.out.println();
      
      //Remove Louie the cat.  You might try this
      Pet p = new Pet("cat", "Louis");
      int location = pets.indexOf (p);
      System.out.println("\nThe location of Louie is " + location);
      System.out.println("This did not work!!  See notes in code");
      
      // It is looking for the object - not an object with the same values
      //for the fields.  Since they are not the same object, it is not
      //found.  Java returns a -1 for the location of unsuccessful searches.
      System.out.println("Try again...");
      for (int i=0;i<pets.size();i++) {
    	  p = pets.get(i);
    	  if (p.getName().equals("Louie") && p.getType().equals("cat"))
    		  pets.remove(i);
      }
      	
      System.out.println("\n Without Louie:");
      for (int i=0;i<pets.size();i++)
    	  System.out.print(pets.get(i).getName()  + " ");
      System.out.println();
      
      
      ///////NOW YOU FINISH THESE!!!!  FIND METHODS FOR THESE!!
      
      //Find out the name of the third pet on the list (remember that we start counting at zero).  Print it out
      

      // Add in the sugar glider named Pete as the fourth 
      //print out the pets names again
     
     
      //print out how many pets there are now in the collection

            
      // find out the index for the location of Blackie the dog  (see notes on line 88)
      //find out the index for Babs the bird
      //find out the index for Joe the turtle
      
      // find the indexes for an instance.  As we saw, there is no single method to compare the name and type. 
      // Loop through the array list.  Use the method .equals to compare the entries like I did on line 62
      // print out the index number if it is equal.
      // NOTE: For Strings you cannot use == (this can only be used for primitive data types)
      // for objects == checks to see if it is the same object ---not that the contents are the same
      
      
      //  find all of the pets whose first names start with the letter A.  
      // Print these.  HINT!!!  There is 
      // no single method for this.  You will need to loop through the ArrayList getting
      // each entry's name and checking to see if the string starts with an A. 
      
      
         // print out the list of all of the pet name but all of the letters  need to be capitalized.      
      
      // clear out all the members of the ArrayList
      
      // print out the ArrayList now and the size now.*/
      
      
   }
}
