package mod4CSC201ArrayLists;

import java.util.ArrayList;

public class Ex9XMoreALToDoAnswers {

	
	public static void main(String[] args) {
		ArrayList<Inventory> inv = new ArrayList<Inventory>();
		inv.add(new Inventory("trees",400));
		inv.add(new Inventory("flowers",30));
		inv.add(new Inventory("shrubs",50));
		inv.add (new Inventory("trees",90));
		// add 80 vines to the end of the array list
		inv.add(new Inventory("vines",80));
		
		// get the description of the item at the third location (index #2)
		String desc = inv.get(2).getDesc();
		// 	OR YOU CAN DO IT IN STEPS THAT HELPS WITH DEBUGGING
		Inventory inven = inv.get(2);
		String desc2 = inven.getDesc();
		
		// add 20 trees in the second location (index #1)
		// BEWARE WHEN USING ARRAY LISTS!  THIS NOW CHANGES THE INDICES OF ALL ITEMS BELOW IT!
		inv.add(1, new Inventory("trees",20));
		
		
		//write a method (then call it) to print out the array list
		print(inv);
		
		// write a method (then call it) to add up the total number of trees
		total(inv);
		// write a method (then call it) to switch around the item in the first location (index #0)
		// with the one in the third location (index #2) and have the method print the new list
		switchIt(inv);
		

	}
	
	public static void print(ArrayList<Inventory> in)
	{
		System.out.println("\n The inventory is:");
		for (int i=0;i<in.size();i++)
			System.out.println("  " + in.get(i).toString());			
	}
	
	public static void total (ArrayList<Inventory> in)
	{
		int total = 0;
		for (int i=0;i<in.size();i++)
		{
			if (in.get(i).getDesc().equals("trees"))
				total = total + in.get(i).getNum();
		}
		System.out.println("\nThe total number of trees is  "+ total + "\n");
	}
	
	public static void switchIt(ArrayList<Inventory> in)
	{
		Inventory first = in.get(0);
		Inventory second = in.get(2);
		in.set(0, second);
		in.set(2,first);
		System.out.println("Switching the first and third items:");
		print(in);
	}
}
