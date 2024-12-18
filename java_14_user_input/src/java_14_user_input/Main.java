package java_14_user_input;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in); // Takes input from the user
		
		System.out.println("Enter your name: ");
		String name = myScanner.nextLine(); // Takes user input until next line symbol (\n)
		
		System.out.println("Your name is " + name);

	}

}
