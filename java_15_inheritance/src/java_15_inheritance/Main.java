package java_15_inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(1.5, "Mercedes", 4);
		
		car.displayInfo();
		car.honk();
		
		Motorcycle m = new Motorcycle(1.0, "Yamaha", 2023, "Racing");
		
		m.displayInfo();
		m.honk();

	}

}
