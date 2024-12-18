package java_11_constructors;

public class Car {
	
	String modelName;
	int modelYear;
	
	public Car(String modelName, int modelYear) {
		this.modelName = modelName;
		this.modelYear = modelYear;
	}
	
	void carInformation() {
		System.out.println("This car's model name is " + this.modelName + " and model year is " + this.modelYear);
	}

}
