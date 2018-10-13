package dwrightmod4csc_201;

public class MergeArray {

	public static void main(String[] args) {

		int[] a = { 3, 6, 10, 14, 21 };
		int[] b = { 24, 15, 13, 12, 5, 2, 1 };
		int[] c = mergeArray(a, b);
		printResult(c);
	}

	public static int[] mergeArray(int[] first, int[] second) {

		int count = 0;
		int place = 0;
		
		int[] c = first;
		int[] d = second;
		int ct = c.length;
		int dt = d.length;
		int length = ct+dt;
		int[] temp = new int[length];
		int[]result = new int[length];
		
		
		for(int j = 0; j <ct;j++ ) {
			temp[count++] = c[j];
		}
		for (int i = 0; i < dt;i++) {
			temp[count++] = d[i];
		}
		
		count = 0;
		while (count < length) {
			int lowest = 1000;
			
			for(int i = 0; i < length; i++) {
				if (temp[i] < lowest) {
					lowest = temp[i];
					place = i;
				}
			}
			result[count] = lowest;
			temp[place] = 10000;
			count++;
		}
		
		

		return result;

	}

	public static void printResult(int[] c) {

		int[] print = c;
		
		for(int i = 0; i < print.length; i++) {
			System.out.print(print[i] + " ");
		}
		
	}
}
