package com.cyberxnuke.Programs1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String sentence = "111.12345";
	    Double number = Double.valueOf(sentence); // String to Double
	    System.out.println("Double Number: " + number);

	    int number2 = 102030;
	    String strNumber2 = String.valueOf(number2);
		System.out.println("String Value: " + strNumber2);

		LocalDate date = LocalDate.now();
		System.out.println(date.toString());

		String date2 = "09 25, 2020";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, yyyy", Locale.ENGLISH); // why locale?
		LocalDate dt2 = LocalDate.parse(date2, formatter);

		System.out.println("String to Date: " + dt2);

		/*
		Autoboxing and unboxing
		 */

		int num3 = 1000;
		Integer num32 = num3; // Autoboxing
		System.out.println(num32);

		// Unboxing
		Integer num4 = 1234;
		int num42 = num4;
		System.out.println(num42);

		// CamelCaseToSnakeCase
		CamelCaseToSnakeCase obj1 = new CamelCaseToSnakeCase();

		System.out.println(obj1.convertToSnakeCase("HELLO!JavaIsAwesome"));

		// Append 10 different strings
		System.out.print("Enter 10 Strings? ");
		StringBuilder strAppend = new StringBuilder();
		Scanner in = new Scanner(System.in);
		int count1 = 0;
		while(count1!=10){
			System.out.print(count1 + "\t");
			strAppend.append(in.next());
			count1++;
		}

		System.out.println("Appended String: " + strAppend);


		// Print characters at even place in given word
		String str2 = "TrainIsOnTheTrack";
		System.out.print("\nPrint characters at even place in given word: ");
		int count2 = 0;
		for(; count2 < str2.length(); count2++){
			if(count2 % 2 != 0){
				System.out.print(str2.charAt(count2));
			}
		}

		// Print characters at odd place in given word
		System.out.print("\nPrint characters at odd place in given word: ");
		int count3 = 0;
		for(; count3 < str2.length(); count3++){
			if(count3 % 2 == 0){
				System.out.print(str2.charAt(count3));
			}
		}

		System.out.println();
		System.out.println();

		// 0 1 2 3 to 3 2 0 1
		// Change the Sequence of a string "MyEmployerIsApple" to "AppleIsMyEmployer"
		SwapWords swpString = new SwapWords();
		swpString.swapWords("MyEmployerIsApple");

    }


}
