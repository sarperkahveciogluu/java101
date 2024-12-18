package java_13_encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Sarper", 24);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
//		person.name = "Umut"; // Error
		person.setName("Umut");
		person.setAge(25);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
//		System.out.println(person.name); // These 2 lines cannot be reached directly
//		System.out.println(person.age);
	}

}
