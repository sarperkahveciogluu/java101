package java_17_abstraction;

public class Sofa extends Furniture{
	
	public Sofa(int year) {
		super(year);
	}
	
	void functionality(){
		System.out.println("Sofa allows you to sit.");
	}
}
