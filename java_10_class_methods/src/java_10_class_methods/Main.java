package java_10_class_methods;

public class Main {
	
	// Non-static method for main
	void mainClassPrint() {
		System.out.println("This is the print method for main class");
	}
	
	// Static method for main
	static void staticMethod() {
		System.out.println("This is static method for main class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generate an object to call non-static method
		Main main = new Main();
		main.mainClassPrint();
		
		// Using the class name to call static method
		staticMethod(); // or Main.staticMethod()
		
		// Creating dog object
		Dog dog = new Dog();
		dog.age = 6;
		dog.breed = "Poodle";
		
		dog.dogInfo();
		
		// Invoking static method without creating object
		Dog.generalInfo();

	}

}
