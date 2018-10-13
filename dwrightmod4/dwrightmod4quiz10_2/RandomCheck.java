package dwrightmod4quiz10_2;

import java.text.DecimalFormat;


public class RandomCheck {

	public static void main(String[] args) {
		int[] random = new int[100];
		double average;
		
		DecimalFormat df = new DecimalFormat("#.#");
		
		RandomCheck.loadValues(random);
		RandomCheck.print(random);
		average = RandomCheck.average(random);
		
		System.out.println("\nThe average of the set of numbers is " + df.format(average));
	}
	
	public static void loadValues(int[] arr) {
		for(int i = 0; i<100;i++) {
			arr[i] = ((int) (Math.random() * 6) + 1);
		}
		
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i<100; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static double average(int[] arr) {
		double avg = 0;
		for (int i = 0; i<100; i++) {
			avg += arr[i];
		}
		avg = (avg/100);
		
		return avg;
	}
	

}
