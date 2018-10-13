package dwrightmod3_csc201_F18;

public class CarDriver {

	public static void main(String[] args) {
		Car car = new Car(2002,"Chevy s10", 45);
		
		System.out.println(car.toString());
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.brake();
		car.brake();
		car.brake();
		car.brake();
		car.brake();
		
		System.out.println(car.toString());

	}

}
