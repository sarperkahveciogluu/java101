package java_07_method_overloading;

public class Main {

	static int addValues(int a, int b) {
		return a + b;
	}
	
	// Overloading
	static double addValues(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("addValues method for integer: " + addValues(20, 10));
		System.out.println("addValues method for doubles: " + addValues(10.5, 21.3));
	}

}
