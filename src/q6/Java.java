/**
 * 
 */
package q6;

/**
 * @author CyberxNuke
 *
 */
public class Java {

	/**
	 * @param args
	 */
	
	public String getOopsDescription(String str) {
		if(str.equals("Inheritance")) {
			return "Inheritance is a concept of OOPs. "
					+ "One class can inherit properties from another class.\n" 
					+ "Example: Fruit would be the parent class and Apple would inherit the properties of the Fruit Class\n\n";
		} else if(str.equals("Polymorphism")){
			return "Poly means 'many forms. '" 
					+ "So, we can create multiple functions with the same name but different args.\n"
					+ "Each function would be different in functionality.\n\n";
		} else if(str.equals("Abstraction")) {
			return "Abstraction means abstracting away all the important details of the inner workings "
					+ "and exposing methods/classes which are needed by the user.\n"
					+ "\nExample: 'changeGear(int gearNumber)'.\n\nThe user can provide the gear number he wants to change to. "
					+ "\nThe user need not know what is actually going on when he changes the gear.\n\n";
		} else if (str.equals("Encapsulation")) {
			return "Encapsulation is a concept of OOPs. "
					+ "Encapsulation means encapsulating all the properties/methods into one unit." 
					+ "\nsExample: Class. It encapsulates all the properties/methods in a class. We declare all the variables and methods pertiaining to that class.\n\n";
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Java obj = new Java(); 
		System.out.println(obj.getOopsDescription("Abstraction"));
		System.out.println(obj.getOopsDescription("Inheritance"));
		System.out.println(obj.getOopsDescription("Polymorphism"));
		System.out.println(obj.getOopsDescription("Encapsulation"));
	}

}
