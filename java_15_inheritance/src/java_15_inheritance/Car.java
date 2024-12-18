package java_15_inheritance;

public class Car extends Vehicle{
	
	private int numberOfDoors;
	
	public Car(double engineVolume, String brand, int numberOfDoors) {
		this.engineVolume = engineVolume;
		this.brand = brand;
		this.numberOfDoors = numberOfDoors;
	}
	
	void displayInfo() {
		System.out.println("Car Brand: " + brand + "\n" +
							"Car engine volume: " + engineVolume + "\n" + 
							"Number of doors: " + numberOfDoors + "\n");
	}
}
