package loops;

public class ForLoop {

	public static void main(String[] args) {
		// Entry Controlled Loop
		// A regular for loop
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.print("\n-----------------------\n\n");
		
		int j = 0;
		for(; j < 10; j++) {
			System.out.println(j);
		}
		
		System.out.println("\nValue of j: " + j + "\n");
		
		System.out.print("\n-----------------------\n\n");
		
		for(; j < 20; ) {
			System.out.println(j);
			j = j + 2;
		}
		
		System.out.print("\n-----------------------\n\n");
		
		String[] food = {"Chicken Soup", "Chicken 65", "Chicken Biryani"};
		
		for(String foodItem: food) {
			System.out.println(foodItem);
		}

	}

}
