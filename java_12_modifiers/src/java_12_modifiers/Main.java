package java_12_modifiers;

public class Main {
	
	final int x = 10;
	final String name = "Joe";
	public int y = 15;
	private 
	
	static void printHelloWorld () {
		System.out.println("Hello World from main class' static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		
		System.out.println(main.x);
		System.out.println(main.name);
		
		System.out.println();
		
		// Trying to change final variable
//		main.x = 15; // Final fields cannot be changed
//		main.name = "John"; // It returns an error
		
		printHelloWorld();
		
		OtherClass obj = new OtherClass();
		
		// Public attribute can be reached in any other classes
		System.out.println(obj.y);
		
		// Private attributes cannot be reached in any other classes
//		System.out.println(obj.x); // Gives an error
		
		obj.printXandY(); // But in class method, if private field is used, we can see it in another class with using that method.
		
	}

}
