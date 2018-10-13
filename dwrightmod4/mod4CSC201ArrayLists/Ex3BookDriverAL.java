package mod4CSC201ArrayLists;

import java.util.*;

public class Ex3BookDriverAL {

	public static void main(String[] args) {
		
		
		ArrayList<Book> books = new ArrayList<Book>();      // creates the ArrayList
		Scanner scan = new Scanner(System.in);
			boolean more = true;
		while(more) {
			// ask for the name
			// Note:  I am using the Keyboard class---an alternative to the Scanner class
			System.out.println("Enter the name of the book:");
			String bookName = scan.nextLine();
						
			// ask for the book id 
			System.out.println("Enter the ID for the book:");
			String bookId= scan.nextLine();
			
			//ask for the age
			System.out.println("Enter the cost of the book:");
			double bookCost = scan.nextDouble();
			
			// create a Book instance calling the full constructor
			Book thisBook = new Book(bookName, bookId, bookCost);
			
			//add the Dog instance to the array
			books.add(thisBook);                   
			scan.nextLine();
			System.out.println("More books?(true/false)");
			more = scan.nextBoolean();
		}// end of for loop
		
		printBooks(books);
	}
	
	public static void printBooks(ArrayList<Book> b)
	{	
		for (int j=0;j<b.size();j++) {			// this is the ArrayList one
			System.out.println("Book # " + j + ": " + b.get(j).toString());
		}		
	}
	
}
