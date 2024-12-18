package java_09_classes_objects;

public class Car {
	int year;
	final int wheels = 4;
	
	static void washTheCar() {
		System.out.println("The car has cleaned");
	}
	
	public void startTheEngine() {
		System.out.println("The engine is running");
	}
}
