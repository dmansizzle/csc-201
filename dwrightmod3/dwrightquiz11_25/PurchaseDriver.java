package dwrightquiz11_25;

public class PurchaseDriver {

	public static void main(String[] args) {
		Purchase p1 = new Purchase("Blue Widgets", 200, 4, 6.2);		
		System.out.println(p1.toString());
		
		Purchase p2 = new Purchase("Green Widgets", 40, 15, 5.5);
		System.out.println(p2.toString());
		
		Purchase p3 = new Purchase("Red Widgets", 65, 25, 4.3);
		System.out.println(p3.toString());

	}
}
