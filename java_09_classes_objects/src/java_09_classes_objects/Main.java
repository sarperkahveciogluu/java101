package java_09_classes_objects;


public class Main {
	int num = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		System.out.println("The num coming from the main class obj is " + main.num);
	
		// Class attributes
		Car car1 = new Car();
		car1.year = 2016;
		
		Car car2 = new Car();
//		car2.wheels = 6; // wheels is final field, so we cannot change it. This code gives an error
		car2.year = 2021;
		
		System.out.println("The car1 year is: " + car1.year);
		System.out.println("The car2 year is: " + car2.year);
		
		// Changing the attribute
		car2.year = 2024;
		System.out.println("The car2 year is now: " + car2.year);
		
		// Static vs Public methods
		Car.washTheCar(); // Because washTheCar is static method, it doesn't need to be invoked with object. It is class scope function
		car2.startTheEngine(); // Because startTheEngine is non-static method, it is obligation to call that function with objects.
		
		// Bicycle
		
		Motorcycle motor1 = new Motorcycle();
		
		// Generating number between 1-100
		motor1.chassisNo = (int) ((Math.random() * 100) + 1);
		motor1.model = "Yamaha";
		
		System.out.println("The model of motor1 is " + motor1.model + ", the chassis no is: " + motor1.chassisNo);
		
	}

}
