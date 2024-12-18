package java_02_switch_case;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Jonses";
		
		switch(name) {
		case "Jones": 
			System.out.println("Name is " + name);
			break;
		case "Dean":
			System.out.println("Name is " + name);
			break;
		default:
			System.out.println("This is the default case. This case works if the rest of the cases doesn't satisfy. ");
		}

	}

}
