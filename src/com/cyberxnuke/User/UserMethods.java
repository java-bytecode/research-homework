package com.cyberxnuke.User;

import com.cyberxnuke.Book.Book;

import java.util.ArrayList;

public interface UserMethods {
//    public void updateID();
    public int getId();
    public void setUserType(UserType userType);
    public String getUserType();
    public int getNoOfBooksPurchased();
    public int getSizeOfBooksPurchasedList();
    public void updateBooksList(int bookID);
    public boolean deleteInBooksList(int bookID);
    public void viewBooksPurchasedByUser(ArrayList<Book> books);

}
