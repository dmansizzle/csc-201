package dwrightmod3_csc201_F18;

import java.util.Scanner;

public class PayrollDriver {

	public static void main(String[] args) {
		String name;
		int id;
		double pay;
		double hours;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Please enter your name");
		name = scan.nextLine();
		
		System.out.println("Please enter your employee id");
		id = scan.nextInt();
		
		System.out.println("Please enter your hourly pay rate");
		pay = scan.nextDouble();

		System.out.println("Please enter your hours worked");
		hours = scan.nextDouble();
		
		Payroll dan = new Payroll(name, id, pay, hours);
		
		System.out.println(dan.toString());
	}

}
