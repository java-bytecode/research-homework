/**
 * 
 */
package driverClass;

import java.util.InputMismatchException;
import java.util.Scanner;

import loginSystem.UserLogin;
import mathPrograms.Calculator;
import packets.Packet;

/**
 * @author CyberxNuke
 *
 */
public class DriverCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String userName;
		String userPassword;

		int number1;
		int number2;
		int number3;
		int number4;

		Scanner in = new Scanner(System.in);

		// Admin
		System.out.println("Enter Username for admin? ");
		userName = in.next();
		System.out.println("Enter Password for admin? ");
		userPassword = in.next();
		UserLogin adminUser = new UserLogin(1, 1, userName, userPassword);
		adminUser.setPersonDetails("Alex", "Texas", 1012013011);

		// Employee
		System.out.println("Enter Username for Employee? ");
		userName = in.next();
		System.out.println("Enter Password for Employee? ");
		userPassword = in.next();
		UserLogin employeeUser = new UserLogin(2, 2, userName, userPassword);
		employeeUser.setPersonDetails("John", "California", 1012013012);

		System.out.println();

		// Let's access the calculator before login
		Calculator calc = new Calculator(adminUser);

		System.out.println(adminUser.getUserName() + " is logged in: " + adminUser.checkLoginStatus());
		System.out.println(employeeUser.getUserName() + " is logged in: " + employeeUser.checkLoginStatus());
		if ((calc.sum(1, 2) == -1)) {
			System.out.println("Kindly, login to use the calculator.");
		}
	
		
		// Let's access the Packet Class before login
		Packet packet0 = new Packet(adminUser);
		packet0.createPacket(0, "Hello");
		packet0.viewPacket();
		
		System.out.println();

		// Login Admin User
		adminUser.login("admin", "password");

		System.out.println();
		

		// Using the calculator after login
		if (adminUser.checkLoginStatus()) {
			sum(in, calc);
			System.out.println();
			division(in, calc);
			
			System.out.println();
			
			// Handle Packets
			Packet packet1 = new Packet(adminUser);
			packet1.createPacket(1, "Hello");
			Packet packet2 = new Packet(adminUser);
			packet2.createPacket(2, "World");
			Packet packet3 = new Packet(adminUser);
			packet3.createPacket(3, "!");
			
			Packet[] packets = {packet1, packet2, packet3};
			
			for(Packet packet: packets) {
				System.out.println(packet.viewPacket());
			}

		}

	}

	static void sum(Scanner in, Calculator calc) {
		int number1;
		int number2;

		// Addition

		System.out.println("Enter Two Numbers for Addition? ");

		try {
			number1 = in.nextInt();
			number2 = in.nextInt();

		} catch (InputMismatchException e) {
			System.out.println(e.fillInStackTrace());
			System.out.println("\nBoth need to be int or double\n");
			number1 = -1;
			number2 = 0;
		}

		int sumResult = calc.sum(number1, number2);

		if (sumResult == -1) {
			//
		} else {
			System.out.println("Sum Result: " + sumResult);
		}
	}

	static void division(Scanner in, Calculator calc) {
		int number1;
		int number2;

		System.out.println("Enter Two Numbers for Division? ");

		try {
			number1 = in.nextInt();
			number2 = in.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("\nBoth need to be int or double\n");
			number1 = -1;
			number2 = 1;
		}

		// Division
		int divisionResult = calc.division(number1, number2);
		if (divisionResult == -1) {
			//
		} else {
			System.out.println("Division Result: " + divisionResult);
		}

	}

}