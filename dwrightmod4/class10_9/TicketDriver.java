package class10_9;

public class TicketDriver {

	public static void main(String[] args) {
		int[][] tickets = {{30,40,50,50,50,50,50,50,40,40}, 
				{20,30,30,40,50,50,40,30,30,20},
				{20,20,30,30,40,40,30,30,20,10}, 
				{10,10,20,20,20,20,20,20,10,10}, 
				{10,10,20,20,20,20,20,20,10,10},
				{10,10,10,10,10,10,10,10,10,10}, 
				{10,10,10,10,10,10,10,10,10,10},
				{10,10,10,10,10,10,10,10,10,10}};
		
		Ticket.printArray(tickets);

	}

}