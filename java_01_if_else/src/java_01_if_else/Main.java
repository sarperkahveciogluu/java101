package java_01_if_else;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Classic if-else
		int number = 1;
		
		if(number == 1) {
			System.out.println("The number is 1");
		}else if(number == 2) {
			System.out.println("The number is 2");
		}else {
			System.out.println("The number is not 1 nor 2");
		}
		
		// Ternary operator
		int number2 = 2;
		
		String result = (number2 == 2) ? "The number is 2" : "The numbe is not 2";
		System.out.println(result);

	}

}
