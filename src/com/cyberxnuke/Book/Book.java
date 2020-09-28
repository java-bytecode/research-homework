package com.cyberxnuke.Book;

import java.util.*;

public class Book {
      static int id;
      int bookID;
      String name;
      String description;
      int rating;

    static {
        id = 0;
    }

    public Book(String name, String description, int rating) {
        id++;
        bookID = id;
        this.name = name;
        this.description = description; // Book Description :)
        this.rating = rating;
    }

    public void viewBook(){
       // System.out.println("ID\tBook Details (Name Of The Book, Description, Rating)");
        System.out.println(bookID + "\t " + name + "\t " + description + "\t\t   " + rating);
    }

    public int getBookID(){
        return bookID;
    }

    public String getBookName(){
        return name;
    }

    public String getBookDescription(){
        return description;
    }

    public int getBookRating(){
        return rating;
    }
}
