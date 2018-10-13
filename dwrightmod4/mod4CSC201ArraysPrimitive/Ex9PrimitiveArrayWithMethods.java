package mod4CSC201ArraysPrimitive;

public class Ex9PrimitiveArrayWithMethods {

	
	public static void main(String[] args) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		//Note - in the next line.  When passing an array to a method, you do not need
		//to indicate that it is an array nor the size.  Just pass the variable
		 System.out.println( "Total of array elements: " + findTotal(array));
		
		
	}
	
	//NOTE: when using an array as a parameter, include the [ ] but not the size
	public static double findTotal(int[] values){
	      int total = 0;

	      // add each element's value to total
	      for ( int counter = 0; counter < values.length; counter++ )
	         total=total + values[ counter ];
	      return total;

	}

}
