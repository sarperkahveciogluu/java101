package java_05_arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array initialization
		String[] cars = {"Mercedes", "Volvo", "BMW", "Audi"};
		
		// Array access
		System.out.println("The first car in the car array is " + cars[0]);
		
		// Changing an array element
		cars[1] = "Volkswagen";
		
		System.out.println();
		
		// Printing the second element if it is changed
		System.out.println("Now, the second element of the array is " + cars[1]);
		
		System.out.println();
		
		// Printing the cars array one by one
		for(String car: cars) {
			System.out.println("Current car is " + car);
		}
		
		System.out.println();
		
		// Calculating array size
		System.out.println("The length of the array is " + cars.length);
		
		
		System.out.println();
		
		// Multi-dimensional arrays
		String[][] carModels = {{"C200", "S400", "A180"}, {"520i", "M8", "740d"}};
		
		for(String[] carModel: carModels) {
			if (carModel == carModels[0]) {
				System.out.println("Here are the car models of Mercedes:");
				for(String car: carModel) {
					System.out.println(car);
				}
			}
			if (carModel == carModels[1]) {
				System.out.println("Here are the car models of BMW:");
				for(String car: carModel) {
					System.out.println(car);
				}
			}
		}

	}

}
