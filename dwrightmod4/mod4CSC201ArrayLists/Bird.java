package mod4CSC201ArrayLists;

public class Bird {
	private String breed;
	private String name;
	
	public Bird()
	{
		
	}
//this is a method definition
	public Bird(String b, String n)
	{
		breed=b;
		name=n;		
	}
	
	public String toString()
	{
		return name+ ": " + breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
