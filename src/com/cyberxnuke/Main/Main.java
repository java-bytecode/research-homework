package com.cyberxnuke.Main;

import com.cyberxnuke.Book.Book;
import com.cyberxnuke.User.User;
import com.cyberxnuke.User.UserType;

public class Main {
    public static void main(String[] args){
        User admin = new User();
        admin.setUserType(UserType.ADMIN);

        Book bookObj = new Book();
        bookObj.viewBooks();
    }
}
