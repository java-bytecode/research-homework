package com.cyberxnuke.Programs2;

public class DriverCode {
    public static void main(String[] args){
        // Perform Autoboxing and Unboxing using available primitive types.
        int num1 = 10;
        Integer num12 = num1;
        int num10 = num12;

        double num2 = 10.12345;
        Double num22 = num2;
        double num20 = num22;

        char ch1 = 'a';
        Character ch12 = ch1;
        char ch30 = ch12;

        float num3 = 1.2345f;
        Float num32 = num3;
        float num40 = num3;

        long num4 = 1212345L;
        Long num42 = num4;
        long num50 = num42;

        boolean logic1 = true;
        Boolean logic12 = logic1;
        boolean logic60 = logic12;

        short num5 = 32767;
        Short num52 = num5;
        short num60 = num52;

        byte num6 = (byte) 129;
        Byte num62 = num6;
        byte num70 = num62;

        System.out.println(num12);
        System.out.println(num22);
        System.out.println(num32);
        System.out.println(num42);
        System.out.println(num52);
        System.out.println(num62);
        System.out.println(logic12);

        System.out.println();

        System.out.println(num10);
        System.out.println(num20);
        System.out.println(ch30);
        System.out.println(num40);
        System.out.println(num50);
        System.out.println(num60);
        System.out.println(num70);

    }
}
