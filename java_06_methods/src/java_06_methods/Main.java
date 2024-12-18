package java_06_methods;

public class Main {
	
	static void killMe() {
		System.out.println("I just got executed");
	}
	
	static void addValues(int a, int b) {
		int sum = a + b;
		System.out.println("The result of this addition is " + sum);
	}
	
	static void arrayReplace(int[] array) {
		
		for(int i = 0; i < array.length / 2; i++) {
			int emptyInt;
			emptyInt = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = emptyInt;
			
		}
	}
	
	// Return value method
	static boolean checkAge(int age) {
		if(age >= 18) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		killMe();
		killMe();
		
		addValues(1,2);
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		System.out.println();
		for(int num: array) {
			System.out.print(num + " ");
		}
		
		arrayReplace(array);
		
		System.out.println();
		
		for(int num: array) {
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		System.out.println();
		
		// A check for person if the person can drink alcohol
		boolean canDrink = checkAge(17);
		
		if(canDrink) {
			System.out.println("You can drink alcohol");
		}else {
			System.out.println("You are not old enough to drink alcohol.");
		}
	}

}
