package java_11_constructors;

public class Main {
	
	int x;
	String random;
	static int staticnum; // Not the best way to initialize static variables, just to see what happens
	
	public Main(String random) {
		x = 5;
		this.random = random;
		staticnum = 14;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(staticnum); // It gives 0, because constructor hasn't invoked yet, and static int variables are set 0 as default
		
		String randomString = "random string";
		Main main = new Main(randomString);
		
		System.out.println(main.x);
		System.out.println(main.random);
		System.out.println(staticnum); // It gives 14, because constructor had invoked and staticnum has assigned to 14
		
		System.out.println();
		
		Car car = new Car("Mercedes", 2024);
		car.carInformation();
		
		
	}

}
