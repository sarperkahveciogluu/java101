package java_17_abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sofa sofa = new Sofa(2019);
		
		sofa.functionality();
		
		System.out.println(sofa.getYear());
		
		sofa.setYear(2020);
		
		System.out.println(sofa.getYear());
		
		sofa.info(); // Coming from abstract parent class
		
	}

}
