package class10_9;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
		ArrayList<String>  al = new ArrayList<String>();
		al.add("Mike");
		al.add("Suzie");
		al.add("Harvey");
		
		print(al);
		
		al.add(1, "Paul");
		print(al);
		
		
				
	
	}
	
	public static void print(ArrayList<String> names) {
		for (int i=0;i<names.size();i++)
			System.out.println(names.get(i));
	}

	public static void switchIt (ArrayList<String> names, int first, int second) {
		String fName = names.get(first);
		String sName = names.get(second);
		names.set(first, sName);
		names.set(second, fName);
	}
}
