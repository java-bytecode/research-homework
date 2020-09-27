package com.cyberxnuke.Book;

import java.util.*;

public class Book {
//    int id;
//    String name;
//    String description;
//    int rating;

    ArrayList bookDetails1;
    ArrayList bookDetails2;
    ArrayList bookDetails3;
    HashMap<Integer, ArrayList> books;

    {
        bookDetails1 = new ArrayList();
        bookDetails2 = new ArrayList();
        bookDetails3 = new ArrayList();
        books = new HashMap<>();
    }

    public Book() {
        // Book 1
     //   bookDetails.add(1);
        bookDetails1.add("Soldier Of Wind");
        bookDetails1.add("Boring book"); // Book Description :)
        bookDetails1.add(2);
        books.put(1, bookDetails1);

        // Book 2
       // bookDetails.add(2);
        bookDetails2.add("Dog Of Next Year");
        bookDetails2.add("Nice Books about dogs");
        bookDetails2.add(4);
        books.put(2, bookDetails2);

        // Book 3
        //bookDetails.add(3);
        bookDetails3.add("Spies Of The Curse");
        bookDetails3.add("No Description");
        bookDetails3.add(3);
        books.put(3, bookDetails3);
    }

    public void viewBooks(){
        System.out.println("ID\tBook Details");
        /*
        ConcurrentModificationException
         */

        for(Map.Entry<Integer, ArrayList> entry: books.entrySet()){
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
    }
}
