package mod4CSC201ArraysPrimitive;

import java.util.Scanner;

public class LinearSearch {
  /** The method for finding a key in the list */
  public static int linearSearch(int[] list) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("What number are you looking for?");
	  int key = scan.nextInt();
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i;
    }
    return -1;
  }
}
