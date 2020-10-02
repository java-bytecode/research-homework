package com.cyberxnuke.Q21;

public class Main {
    public static void main(String[] args){
        Operations operations = new Operations();
        System.out.println(operations.calculate(10.1, 20.10, operations.plus));
        System.out.println(operations.calculate(100.1, 20.10, operations.minus));
        System.out.println(operations.calculate(10.1, 20.10, operations.multiply));
        System.out.println(operations.calculate(10000.1, 20.10, operations.divide));
        System.out.println(operations.calculate(5000,1000, operations.dummy)); // Intentionally
    }
}
