package loops;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		// Exit Controlled Loop
		// Runs atleast once
		
		int j = 10;
		
		do {
			System.out.println(j);
			j++;
		} while(j < 5);
		
		System.out.println("Value of j: " + j);
	}

}
;