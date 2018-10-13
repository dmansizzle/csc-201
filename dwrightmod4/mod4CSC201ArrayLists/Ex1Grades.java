package mod4CSC201ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1Grades {
		public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			ArrayList<Integer> grades = new ArrayList<Integer>();
					int grade = 0;
			while (grade >= 0) {
				System.out.println("Give me a grade: (a negative to end)");
				grade = scan.nextInt();
				if(grade>=0)
					// now add it to the array list if it is a valid one
					grades.add(grade);
			}
			print(grades);
			average(grades);
			high(grades);
		} // end main
		
		public static void print(ArrayList<Integer> al){
			for (int i=0;i<al.size();i++)
				System.out.println(al.get(i));
		}
		
		public static void average(ArrayList<Integer> al){
			int total = 0;
			for (int i=0;i<al.size();i++)
				total = total +al.get(i);
			int average = total / al.size();
			System.out.println("The average is " + average);
		}
		
		public static void high(ArrayList<Integer> al){
			int total = 0;
			int high = -999;
			for (int i=0;i<al.size();i++)
				if (high<al.get(i))
					high = al.get(i);
			
			System.out.println("The high value is " + high);
		}

	}



