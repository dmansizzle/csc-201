package dwrightmod4csc_201;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class TicketDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int tickets[][] = {{30,40,50,50,50,50,50,50,40,40}, {20,30,30,40,50,50,40,30,30,20}, {20,20,30,30,40,40,30,30,20,10}, {10,10,20,20,20,20,20,20,10,10}, {10,10,20,20,20,20,20,20,10,10}, {10,10,10,10,10,10,10,10,10,10}, {10,10,10,10,10,10,10,10,10,10}, {10,10,10,10,10,10,10,10,10,10}};
		NumberFormat mon = DecimalFormat.getCurrencyInstance();

		System.out.println("The total value of all the tickest is " + mon.format(Ticket.getTotal(tickets)));
		System.out.println("The total number of seats in the theatre is " + Ticket.getElementCount(tickets));
		System.out.println("The average cost of a ticket is " + mon.format(Ticket.getAverage(tickets)));
		
		for(int i = 0; i< 8 ;i++) {
			System.out.println("The average cost of a ticket on row " + i + " is " + mon.format(Ticket.getRowAverage(tickets, i)));
		}
		
		Ticket.printArray(tickets);
		
		int totalSold = 0;
		boolean buy = true;
		int row, column;
		
		System.out.println();
		System.out.println("Would you line to buy tickets?(true or false)");
		buy = scan.nextBoolean();
		
		while(buy) {
			
			
			System.out.println("Which row would you like? (0-8 only)");
			row = scan.nextInt();
			System.out.println("Which seat would you like? (0-9 only)");
			column = scan.nextInt();
			if(Ticket.sellTicket(tickets, row, column) == 0)
				System.out.println("This ticket is sold out");
			else {
				System.out.println("You bought this seat for " + mon.format(tickets[row][column]));
				totalSold += Ticket.sellTicket(tickets, row, column);
			}
			Ticket.printArray(tickets);
			
			System.out.println("Would you like to buy more tickets? (true or false)");
			buy = scan.nextBoolean();
			
		}
		
		System.out.println("After the sale of " + mon.format(totalSold) + ", the theatre look like this");
		Ticket.printArray(tickets);
		
	}

}
