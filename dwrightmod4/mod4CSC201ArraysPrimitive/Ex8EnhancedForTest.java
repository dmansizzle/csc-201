package mod4CSC201ArraysPrimitive;

// Using enhanced for statement to total integers in an array.

public class Ex8EnhancedForTest 
{
   public static void main( String[] args ) 
   {
      int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      int total = 0;

      // add each element's value to total
      for ( int number : array )
         total += number;

      System.out.println( "Total of array elements: "+ total );
   } // end main
} // end class EnhancedForTest



