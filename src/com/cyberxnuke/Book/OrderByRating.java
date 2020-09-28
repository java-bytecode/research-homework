package com.cyberxnuke.Book;

import java.util.Comparator;

public class OrderByRating implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.rating > o2.rating){
            return -1;
        } else if(o1.rating < o2.rating){
            return 1;
        } else {
            return 0;
        }
    }
}