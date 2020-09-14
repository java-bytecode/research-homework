package practice;

public class ChildClass extends Program1 {
	static {
		System.out.println("Static from Child!");
	}
	// Init Block
	{
		System.out.println("Init from Child!");
	}
	public ChildClass(){
		super(1);
		System.out.println("Child Constructor, Printing Random Numbers: 2");
		
	}
	
	public void childFunc() {
		System.out.println("Hello from child function!");
	}
	
	public void generateMessage() {
		System.out.println("Hello world from Child!");
	}

}

class ExecuteChildClass {
	public static void main(String[] args) {
		ChildClass chld = new ChildClass();
		
		System.out.println("\n\n\n");
		
		Program1 obj = new ChildClass();
		
		System.out.println("\n\n\n");
		
		
		// Flow of Execution
		System.out.println("##### Flow Of Execution #####\n");
		System.out.println("Static From Parent -> Static From Child -> Init from Parent -> Constructor of Parent -> Init from Child -> Constructor of Child");
		System.out.println("\n* Static Block executes only once!\n");
		System.out.println("#############################");
		
		System.out.println("\n\n\n");
		
		obj.generateMessage();
		
		System.out.println("\n\n\n");
		
		chld.generateMessage();
		
		System.out.println("\n\n\n");
		
		chld.childFunc();
		
		System.out.println("\n\n\n");
	
		System.out.println("obj.childFunc() is not available in Parent Class");
	}
}
