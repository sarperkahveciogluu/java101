package java_03_while_loop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Classic while loop
		
		int counter = 0;
		
		while(counter < 10) {
			System.out.println("This is the counter " + counter);
			counter++;
		}
		
		// This line of code is to have empty line between 2 iterations
		System.out.println();
		
		
		// do-while loop
		int counter2 = 1;
		
		do {
			System.out.println("This is the do part, repetition " + counter2);
			counter2++;
		}while(counter2 < 5);

	}

}
