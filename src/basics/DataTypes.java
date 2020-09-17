package basics;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = 10;
		double decimal = num; // implicit conversion. Lower type converts to higher type implicitly
		int num2 = (int) decimal;
		
		System.out.println(num + " " + decimal + " " + num2);
		
		char ch;
		ch = in.next().charAt(0); // next() returns the string
		System.out.println("Character: " + ch);
		
		byte bt;
		
		// Byte:  8-bit signed two's complement integer
		bt = (byte) 010010;
		
		System.out.println("Byte: " + bt);
		
		long bigNumber = 10L;
		
		System.out.println("Long Value: " + bigNumber);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		
		short shortVal = 10;
		
		System.out.println(shortVal);
		
		boolean bool = in.nextBoolean();
		
		System.out.println(bool);
	}
}
