package java_16_polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal animal = new Animal();
		animal.sound(); // output: The animal makes a sound
		
		Dog dog = new Dog();
		dog.sound(); // output: Dog says: Bow, Bow
		
		Cat cat = new Cat();
		cat.sound(); // outputs: Cat says: Meow, meoww
		
		
		
		
	}

}
