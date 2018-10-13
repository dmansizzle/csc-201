package dwrightmod3_csc201_F18;

public class Coin {

	private String name;
	private double value;
	
	
	public Coin() {
		
	}
	
	public Coin (String coinName, double worth) {
		name = coinName;
		value = worth;
	}
	public String toString() {
		return "";
	}
	public double dollarValue() {
		double dollar = (value/100);
		return dollar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
