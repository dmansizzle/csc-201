package dwrightmod4quiz10_9;

public class Dog {

	private String name;
	private String breed;
	
	public Dog(String nam, String type) {
		name = nam;
		breed = type;
		
	}
	public String toString() {
		
		return name + " is a " + breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
	
}
