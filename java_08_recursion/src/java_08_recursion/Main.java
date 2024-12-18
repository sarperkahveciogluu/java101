package java_08_recursion;

public class Main {

	static int summationFromZeroToNWithRecursion(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + summationFromZeroToNWithRecursion(n - 1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int sum = summationFromZeroToNWithRecursion(num);
		
		System.out.println("The sum from 0 to " + num + " is " + sum);

	}

}
