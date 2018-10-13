package mod4CSC201ArraysPrimitive;

public class Exx11SearchSort {

	
	public static void main(String[] args) {
		int[ ] numbers = {12,43,23,67,43,56,87,90,45,32,76,87}; 
		print(numbers);
		System.out.println("I am going to sort these");
		InsertionSort.insertionSort(numbers);
		print(numbers);
		
		int loc = LinearSearch.linearSearch(numbers);
		System.out.println("That number occurs at location " + loc);

	}
	
	public static void print(int[] num){
		for (int i=0;i<num.length;i++)
			System.out.print (num[i] + "  ");
		System.out.println();
	}

}
