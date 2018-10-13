package dwrightmod2_9_15;
import java.util.Scanner;
public class PairsGame {

	public static void main(String[] args) {
		int one, two, three, four, fourKind = 0, threeKind = 0, twoPair = 0, onePair = 0;
		boolean again = true;
		Scanner scan = new Scanner(System.in);
		while (again != false) {

			one = (int) (Math.random() * 6);
			two = (int) (Math.random() * 6);
			three = (int) (Math.random() * 6);
			four = (int) (Math.random() * 6);

			System.out.println(one + " " + two + " " + three + " " + four);

			if (one == two && one == three && one == four) {
				System.out.println("Four of a kind");
				fourKind++;
			}
			else if ((one == two && one == three) || (one == three && one == four) || (two == three && two == four)) {
				System.out.println("Three of a kind");
				threeKind++;
			} else if ((one == two && three == four) || (one == three && two == four)
					|| (one == four && two == three)) {
				System.out.println("Two Pairs");
				twoPair++;
			} else if (one == two || one == three || one == four || two == three || two == four || three == four) {
				System.out.println("One pair");
				onePair++;
			}
			
			System.out.println("Do you want another hand? (true for yes/ false for no)");
			again = scan.nextBoolean();
		
			

		}
		System.out.println("You have " + fourKind + " four of a kinds");
		System.out.println("You have " + threeKind + " three of a kinds");
		System.out.println("You have " + twoPair + " two pairs");
		System.out.println("You have " + onePair + " single pair");

	}

}
