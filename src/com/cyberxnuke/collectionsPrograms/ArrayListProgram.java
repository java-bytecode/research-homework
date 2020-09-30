package com.cyberxnuke.collectionsPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {

    public static void main(String[] args) {
        ArrayList<Double> arrList = new ArrayList<Double>();
        ArrayList<Double> arrList2 = new ArrayList<Double>();
        ArrayList<Double> arrList3 = new ArrayList<Double>();


        arrList.add(2.1);
        arrList.add(3.1);
        arrList.add(4.1);
        arrList2.add(1.2);
        arrList2.add(7.1);
        arrList.add(2, 9.9);
        arrList.addAll(arrList2);
        arrList.remove(1);

        Iterator itr = arrList.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Shallow Copy: Field by field copy, field for field copy, field copy
        arrList3 = (ArrayList) arrList.clone();

        System.out.println(arrList2.contains(1.2));
        System.out.println(arrList2.contains(1));

//        Iterator itr2 = new Iterator() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Object next() {
//                return null;
//            }
//        };

        Iterator itr3 = arrList3.iterator();

        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

        /*
         *
         * ConcurrentModificationException. Do I need to declare/initialize new iterator every time?
         *
         */
		arrList.clear();

		while(itr.hasNext()) {
		    try {
                System.out.println(itr.next());
            } catch(Exception e){
		        System.out.println("Do modifications after you have run the iterator.");

            } finally {
		        System.out.println("ArrayList takes O(n) time to perform addition operation in middle of the ArrayList.");
                break;
            }
		}


        System.out.println();

    }
}
