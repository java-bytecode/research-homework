/**
 * 
 */
package q4;

import java.util.Scanner;

/**
 * @author CyberxNuke
 *
 */
public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int base;
		int exponent;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input base number? ");
		base = in.nextInt();
		System.out.println("Input exponent number? ");
		exponent = in.nextInt();
		
		System.out.println("Output: " + Math.pow(base, exponent));

	}

}
