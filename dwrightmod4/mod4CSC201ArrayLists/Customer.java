
package mod4CSC201ArrayLists;

public class Customer {
	
	private int custID;
	private String last;
	private String  first;
	private static int nextNum = 100;  // this is static.  That means
										// that the field is shared by all objects
										// in the class.  It is not really a field	
	
	public Customer()
	{
		custID=nextNum;		// even empty objects must be assigned a customer number
		nextNum++; 			// increment nextNum  so that the next time we create a Customer object
							// this field will be a unique value
	}
	
	public Customer(String last, String first)
	{
		this.last=last;		// here is a way to use "this".  Java has two copies
							// of the last variable, the field and the parameter
							// this.last means "this object's last" or the field
							// therefore - this assigns the parameter to the field as we require
		this.first=first;
		custID=nextNum;		// assign the custID the next avaiable number that is stored in nextNum
		nextNum++; 			// increment nextNum so that the next Customer will have a unique customer number
	}
	
	public String toString()
	{
		return first + " " + last + " with a customer id of " + custID;
	}
		
	// DO NOT generate getters and setters for nextNum!!! Only for fields!!!
	public int getCustID() {
		return custID;
	}

		public String getFirst() {
		return first;
	}

	
	public String getLast() {
		return last;
	}

	
	public void setCustID(int i) {
		custID = i;
	}

	
	public void setFirst(String string) {
		first = string;
	}

	
	public void setLast(String string) {
		last = string;
	}

}
