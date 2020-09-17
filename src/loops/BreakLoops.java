package loops;

import java.util.Scanner;

public class BreakLoops {
	
	public static void main(String[] args) {
		
		// This program prints roll numbers of all the students until the rollNumber mentioned in the input. 
		// This school is weird, it assigns rollNumbers in double type. 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Roll Number Of The Student? ");
		double rollNumber = in.nextDouble();
		
		System.out.println();
		
		for(int i = 100; ; i++) {
			if (i == (int) rollNumber) {
				break;
			} else {
				System.out.println("Roll Number: " + i);
			}
		}
	}

}
