package java_04_for_loop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Classic for loop
		for(int i = 0; i < 10; i++) {
			System.out.println("This is the iteration number " + i);
		}
		
		// This line of code is for seperating for loops with empty space
		System.out.println();
		
		// Nested loops
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("i is " + i + ", j is " + j);
			}
		}
		
		System.out.println();
		
		
		// For-each loop
		String[] carBrands = {"Mercedes", "Volvo", "BMW", "Renault"};
		
		for (String carBrand: carBrands) {
			switch(carBrand) {
			case "Mercedes":
				System.out.println("I want to work in Mercedes");
				break;
			case "Volvo":
				System.out.println("Never mind");
				break;
			case "BMW":
				System.out.println("Never mind");
				break;
			case "Renault":
				System.out.println("Never mind");
				break;
			default: 
				break;
				
			}
		}
		
	}

}
