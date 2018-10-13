package dwrightmod3_csc201_F18;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		int choice = 0, amount = 0;
		double total = 0;
		
		Coin coin = new Coin();
		
		System.out.println("What coin are you depositing? (1: quarter, 2: dime, 3: nickle, 4: penny, -999 to exit)" );
		choice = scan.nextInt();
		
		while(choice != -999) {
			
			
			if(choice == 1) {
				System.out.println("How many coins are you depositing?");
				amount = scan.nextInt();
				coin.setName("quarter");
				coin.setValue(25);
				total += CashRegister.recievePayment(coin, amount);
			}
			else if(choice == 2) {
				System.out.println("How many coins are you depositing?");
				amount = scan.nextInt();
				coin.setName("dime");
				coin.setValue(10);
				total += CashRegister.recievePayment(coin, amount);
			}
			else if(choice == 3) {
				System.out.println("How many coins are you depositing?");
				amount = scan.nextInt();
				coin.setName("nickle");
				coin.setValue(5);
				total += CashRegister.recievePayment(coin, amount);
			}
			else if(choice == 4) {
				System.out.println("How many coins are you depositing?");
				amount = scan.nextInt();
				coin.setName("penny");
				coin.setValue(1);
				total += CashRegister.recievePayment(coin, amount);
			}
			
			System.out.println("What coin are you depositing? (1: quarter, 2: dime, 3: nickle, 4: penny, -999 to exit)" );
			choice = scan.nextInt();
			
			
		}
		System.out.println("You deposited " + mon.format(total));
		

	}
	
	public static double recievePayment(Coin pay, int num) {
		double value;
		value = (pay.dollarValue() * num);
		
		
		return value;
	}

}
