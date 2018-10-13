
package mod4CSC201ArrayLists;


public class Book {
	
	// give the book fields of name, id, and cost
	private String name;
	private String id;
	private double cost;
	
	// write the empty and full constructor
	public Book() {
		super();
	}


	public Book(String name, String id, double cost) {
		super();
		this.name = name;
		this.id = id;
		this.cost = cost;
	}
	

	// write a to String method
	public String toString()
	{
		return id + ": " + name + " costs " + cost;
	}
	
	// generate the getters and setters


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

	
	
	

}
