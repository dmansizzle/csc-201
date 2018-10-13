package dwrightmod3_csc201_F18;

public class Car {

	private int year;
	private String make;
	private int speed;
	
	public Car() {
		
	}
	public Car(int year, String make, int speed) {
		this.year = year;
		this.make = make;
		this.speed = speed;
	}
	public Car(int year, String make) {
		this.year = year;
		this.make = make;
		speed = 0;	
	}
	public String toString() {
		return "The car is a " + year + " " + make + " with a speed of " + speed + "mph.";
	}
	public void accelerate() {
		speed += 5;
		System.out.println("After accelerating, the car is now going " + speed + "mph");
	}
	public void brake() {
		speed -= 5;
		System.out.println("After braking, the car is now going " + speed + "mph");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
