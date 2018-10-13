package dwrightquiz_9_4;

import java.text.NumberFormat;
import java.util.Scanner;

public class dwrightquiz9_4 {

	public static void main(String[] args) {
		String ticket;
		int numPurchased;
		boolean radio;
		double price;

		Scanner scan = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println("How many tickets did you purchase?");
		numPurchased = scan.nextInt();

		scan.nextLine();

		System.out.println("Are they general admission or reserved seating(GA or RES(capitalized))?");
		ticket = scan.nextLine();

		System.out.println("Do you have a radio voucher (true or false)?");
		radio = scan.nextBoolean();

		if (ticket.equals("GA")) {
			price = numPurchased * 35;
			if (radio == true) {
				price = price - (price * .2);
				if (price > 400) {
					price = price - (price * .15);
				} else if (price > 200) {
					price = price - (price * .1);
				}
				System.out
						.print("You ordered " + numPurchased + " tickets, in general admissions with a radio voucher.\n"
								+ "After discounts your total is " + nf.format(price));
			} else {
				if (price > 400) {
					price = price - (price * .15);
				} else if (price > 200) {
					price = price - (price * .1);
				}
				System.out.print(
						"You ordered " + numPurchased + " tickets, in general admissions without a radio voucher.\n"
								+ "After discounts your total is " + nf.format(price));
			}
		}
		else {
			price = numPurchased * 55;
			if (radio == true) {
				price = price - (price * .2);
				if (price > 400) {
					price = price - (price * .15);
				} else if (price > 200) {
					price = price - (price * .1);
				}
				System.out.print("You ordered " + numPurchased + " tickets, in reserved seating with a radio voucher.\n"
								+ "After discounts your total is " + nf.format(price));
			} else {
				if (price > 400) {
					price = price - (price * .15);
				} else if (price > 200) {
					price = price - (price * .1);
				}
				System.out.print(
						"You ordered " + numPurchased + " tickets, in reserved seating without a radio voucher.\n"
								+ "After discounts your total is " + nf.format(price));
			}
		}

	}

}
