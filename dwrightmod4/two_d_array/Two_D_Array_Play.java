package two_d_array;

public class Two_D_Array_Play
{
   // main method begins program execution
   public static void main(String[] args)
   {
      // two-dimensional array 
      int[][] values = {{87, 96, 70},
                             {68, 87, 90},
                             {94, 100, 90},
                             {100, 81, 82},
                             {83, 65, 85},
                             {78, 87, 65},
                             {85, 75, 83}, 
                             {91, 94, 100},
                             {76, 72, 84},
                             {87, 93, 73}};
      printByRow(values);
      printByCol(values);
      
      
      
   } 
   
   public static void printByRow(int[][] nums){
	   System.out.println("The printout by rows is:");
	   for (int row=0;row<nums.length;row++){
		   for (int col=0;col< nums[0].length;col++)
			   System.out.print(nums[row][col] + "  ");
			System.out.println(); 
	   }
	   
	   
   }
   
   
   public static void printByCol(int[][] nums){
	   System.out.println("The printout by columns is:");
	   for (int col=0;col<nums[0].length;col++){
		   for (int row=0;row< nums.length;row++)
			   System.out.print(nums[row][col] + "  ");
			System.out.println(); 
	   } 
	   
   }
} // end class GradeBookTest


