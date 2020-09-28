package com.cyberxnuke.User;

import com.cyberxnuke.Book.Book;

import java.util.ArrayList;
import java.util.Iterator;

public class User implements UserMethods {
    private static int id;
    private int userID;
    private UserType userType;
    private int noOfBooksPurchased;
    ArrayList<Integer> booksPurchased;

    static {
        id = 0;
    }

    {
        booksPurchased = new ArrayList<>();
    }

    public User(){
        userID = id;
        userType = null;
        updateID();
    }

    private void updateID(){
        id++;
    }

    @Override
    public int getId(){
        return userID;
    }

    @Override
    public void setUserType(UserType userType){
        this.userType = userType;
    }

    @Override
    public String getUserType(){
        return userType.toString();
    }

    @Override
    public int getNoOfBooksPurchased() {
        return noOfBooksPurchased;
    }

    @Override
    public int getSizeOfBooksPurchasedList() {
        return booksPurchased.size();
    }

    public void updateNoOfBooksPurchased(int operation){
        if(operation == 1){
            noOfBooksPurchased++;
        } else {
            if(!(noOfBooksPurchased == 0)){
                noOfBooksPurchased--;
            }

        }
    }

    @Override
    public void updateBooksList(int bookID) {
        booksPurchased.add(bookID);
    }

    @Override
    public boolean deleteInBooksList(int bookID) {
        try {
            booksPurchased.remove(booksPurchased.indexOf(bookID));
            return true;
        } catch (Exception e){
            System.out.println("\nBook not found in your purchase list!");
            return false;
        }
    }




    public void viewBooksPurchasedByUser(ArrayList<Book> books){
        Iterator itr = booksPurchased.iterator();
        while(itr.hasNext()){
            Iterator itr2 = books.iterator();
            int bookID = (Integer) itr.next();
            // System.out.println("Books ID: " + bookID);
            while(itr2.hasNext()) {
                Book bookObj = (Book) itr2.next();
                if (bookID == bookObj.getBookID()) {
                    System.out.println(bookObj.getBookID() + "\t " + bookObj.getBookName() + "\t " + bookObj.getBookDescription() + "\t\t   " + bookObj.getBookRating());
                }
            }

        }
    }


}
