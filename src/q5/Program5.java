/**
 * 
 */
package q5;

import java.util.Scanner;

/**
 * @author CyberxNuke
 *
 */
public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Reverse of a number
		int number;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to reverse? ");
		number = in.nextInt();
		
		System.out.println("Reverse Number: ");
		
		while(true) {
			int remainder = number % 10;
			System.out.print(remainder);
			
			number = number/10;
			
			if (number == 0) {
				break;
			}
		}
		
		

	}

}
