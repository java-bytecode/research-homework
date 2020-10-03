package com.cyberxnuke.Q21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double number1;
        double number2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers? ");
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();

        Operations operations = new Operations();
        System.out.println(operations.calculate(number1, number2, operations.plus));
        System.out.println(operations.calculate(number1, number2, operations.minus));
        System.out.println(operations.calculate(number1, number2, operations.multiply));
        System.out.println(operations.calculate(number1, number2, operations.divide));
        System.out.println(operations.calculate(number1, number2, operations.dummy)); // Intentionally
    }
}
