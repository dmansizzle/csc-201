package mod4CSC201ArraysPrimitive;
import java.util.*;


public class Ex7IncreaseSize {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// I will make the array large enough for two items
		int[] myArray = new int[2];
		int counter = 0;
		int size = 2;
		int value = 0;
		while(value !=-999) {
			System.out.println("Give me an integer: ");
			value = scan.nextInt();
			if (value!=-999) {
				myArray[counter] = value;
				counter++;
				if (counter == size) {
					myArray=increaseArray(myArray, size);
					size = myArray.length;
				}
			}
		}
		print(myArray, counter);
	}
		
		public static int[] increaseArray(int[] arr, int size) {
			int newSize = size * 2;
			int[] temp = new int[newSize];

		      for (int loc = 0; loc < arr.length; loc++)
		         temp[loc] = arr[loc];

		      arr = temp;
		      return arr;
		}
		
		public static void print(int[] a, int numValues) {
			for (int i=0;i<numValues;i++)
				System.out.print (a[i] + " ");
			System.out.println();
		}
			
			
}