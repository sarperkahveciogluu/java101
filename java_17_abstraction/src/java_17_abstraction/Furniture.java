package java_17_abstraction;

abstract class Furniture {
	
	protected int year;
	
	public Furniture(int year) {
		this.year = year;
	}
	
	abstract void functionality();
	
	void info() {
		System.out.println("Useful thing for living at home");
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
