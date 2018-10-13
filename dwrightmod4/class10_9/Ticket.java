package class10_9;

public class Ticket {
	
	public static void printArray(int[][] arr) {
		for (int row=0;row < arr.length; row++) {
			for (int col = 0; col < arr[row].length;col++)
				System.out.print(arr[row][col] + " "); 
			System.out.println();
		}
		
	}

}
