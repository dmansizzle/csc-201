package class10_9;

import java.util.ArrayList;

public class ALTypes {

	public static void main(String[] args) {
		//ArrayList<int> al = new ArrayList<int> ();  // not possible!
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//boxing - converting automatically from an int to an Integer
		al.add(4);
		
		//unboxing - converts automatically from an Integer to an int
		
		int value = al.get(0);
		
		Integer in = new Integer(100);
		//do not do this!!
		Double salary = 45.2;
	}

}
