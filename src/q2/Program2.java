package q2;

/**
 * @author CyberxNuke
 *
 */

public class Program2 {

	public static void main(String[] args) {
		for(int i = 5; i>0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= 5; i++) {
			for(int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
