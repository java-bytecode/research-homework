package loops;

public class ContinueLoop {
	public static void main(String[] args) {
		// Skip an iteration
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			} 
			
			System.out.println(i);
			
			}
		System.out.print("\n-----------------------\n\n");
		
		loop:for(int j = 0; j <= 2; j++) {
			for(int k = 0; k < 5; k++) {
				
				if(j == 1) {
					continue loop;
				}
				
				System.out.println(k);
			}
			
			System.out.println();
		}
		
		System.out.print("\n-----------------------\n\n");
		
		for(int a = 0; a < 2; a++) {
		secondLoop:for(int j = 0; j <= 2; j++) {
			for(int k = 0; k < 5; k++) {
				
				if(j == 1) {
					continue secondLoop;
				}
				
				System.out.println(k);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
	}
	}
}
