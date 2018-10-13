package dwrightmod4csc_201;



public class Ticket {

	public static int getTotal(int[][] seats) {
		int total = 0;
		for(int i = 0; i<seats.length;i++) {
			for(int j = 0; j <seats[i].length;j++) {
				total += seats[i][j];
			}
		}
		return total;
		
		
	}
	public static int getElementCount(int[][] seats) {
		int total = 0;
		for(int i = 0; i<seats.length;i++) {
			for(int j = 0; j <seats[i].length;j++) {
				total ++;
			}
		}
		return total;
	}
	public static double getAverage(int[][] seats) {
		double average;
		int total = 0;
		int num = 0;
		for(int i = 0; i<seats.length;i++) {
			for(int j = 0; j < seats[i].length;j++) {
				total += seats[i][j];
				num++;
			}
		}
		average = total/num;
		return average;
	}
	public static double getRowAverage(int[][] seats, int row) {
		double average;
		int total = 0;
		int num = 0;
			for(int j = 0; j < seats[row].length;j++) {
				total += seats[row][j];
				num++;
			
		}
		average = total/num;
		return average;
		
	}
	public static void printArray(int[][] seats) {
		
		System.out.println("The theatre: (any seat with a zero is sold)");
		for(int i = 0; i<seats.length;i++) {
			for(int j = 0; j <seats[i].length;j++) {
				System.out.print(" " + seats[i][j]);
			}
			System.out.println();
		}
		
	}
	public static int sellTicket(int[][] seats,int row, int column) {
		int sold;
		if(seats[row][column] == 0)
			sold = 0;
		else {
			sold = seats[row][column];
			seats[row][column] = 0;
			}
		
		return sold;
		
	}
	
	
	
}
