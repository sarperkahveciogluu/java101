package java_10_class_methods;

public class Dog {

	int age;
	String breed;
	
	
	void dogInfo() {
		System.out.println("The breed of the dog is " + this.breed + " and he/she is " + this.age + " years old.");
	}
	
	static void generalInfo() {
		System.out.println("The dogs are one of the cutest animals, they normally have 4 legs and a tail. They are generally very friendly. If they are educated, they can become very intelligent.");
	}
}
