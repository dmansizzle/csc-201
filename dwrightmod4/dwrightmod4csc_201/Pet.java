package dwrightmod4csc_201;

public class Pet {
	
	private String type;
	private String name;
	
	public Pet() {
		
	}

	public Pet(String t, String n) {
		type = t;
		name = n;
	}
	
	public String toString() {
		return name + " is a " + type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
