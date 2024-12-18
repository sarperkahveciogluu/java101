package java_15_inheritance;

public class Motorcycle extends Vehicle{

	private int year;
	private String type;
	
	public Motorcycle(double engineVolume, String brand, int year, String type) {
		this.engineVolume = engineVolume;
		this.brand = brand;
		this.year = year;
		this.type = type;
	}
	
	void displayInfo() {
		System.out.println("Motorcycle Brand: " + brand + "\n" +
				"Motorcycle engine volume: " + engineVolume + "\n" + 
				"Model Year: " + year + "\n" +
				"Motorcycle type: " + type + "\n");
	}
	
}
