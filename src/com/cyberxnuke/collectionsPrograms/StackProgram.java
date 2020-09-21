package com.cyberxnuke.collectionsPrograms;

import java.util.Stack;

public class StackProgram {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>(); // LIFO

        stack.push(1);
        stack.add(2); // Difference?
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.push(5);

        for(int element: stack) {
            System.out.println(element);
        }

        System.out.println();
    }
}
