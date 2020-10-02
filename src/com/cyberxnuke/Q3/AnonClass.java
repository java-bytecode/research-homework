package com.cyberxnuke.Q3;

public class AnonClass {
    public static void main(String[] args) {
        AnonI i1 = new AnonI() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        };

        i1.print();


        AnonI i2 = new AnonI() {
            @Override
            public void print() {
                System.out.println("JXJX");
            }

            @Override
            public void printMessage(){
                System.out.println("printMessage");
            }
        };

        i2.print();
        i2.printMessage();

//        PrintClass i3 = new AnonI(){
//
//            @Override
//            public void print() {
//                System.out.println("AXAX");
//            }
//        };

    }
}
