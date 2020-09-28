package com.cyberxnuke.Main;

import com.cyberxnuke.Book.Book;
import com.cyberxnuke.Book.OrderByRating;
import com.cyberxnuke.User.User;
import com.cyberxnuke.User.UserType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User admin = new User();
        admin.setUserType(UserType.ADMIN);

        User user1 = new User();
        user1.setUserType(UserType.STAFF);

        User user2 = new User();
        user2.setUserType(UserType.CUSTOMER);

        User commonUser = new User();

        System.out.print("Kindly, login into the system using your ID? ");

        while(true) {
            int userID = in.nextInt();
            if (userID == admin.getId()) {
                commonUser = admin;
                break;
            } else if (userID == user1.getId()) {
                commonUser = user1;
                break;
            } else if (userID == user2.getId()) {
                commonUser = user2;
                break;
            } else {
                System.out.println("\nInvalid User ID. Enter User ID again.\n");
            }
        }

        System.out.println("\n***** Welcome, " + commonUser.getUserType() + " *****\n");

        Book book1 = new Book("Soldier Of Wind", "Boring book", 2);
        Book book2 = new Book("Dog Of Next Year", "Nice Books about dogs", 4);
        Book book3 = new Book("Spies Of The Curse", "No Description", 3);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Order By Book Rating
        Collections.sort(books, new OrderByRating());

        Iterator itr = books.iterator();

        System.out.println("ID\t Name Of The Book\t Description\t\t Rating");
        while (itr.hasNext()) {
            Book bookObj = (Book) itr.next();
            bookObj.viewBook();
        }

        while (true) {
            System.out.print("\n***** Menu *****\nWant to buy? Type 1\nWant to return? Type 2\nExit? Type 3\n");
            int menuItem = in.nextInt();
            if (menuItem == 1) {
                System.out.print("\nSelect a book? ");
                int bookID = in.nextInt();

                System.out.print("Are you sure? Type true or false ");
                boolean confirmation = in.nextBoolean();
                if (confirmation) {
                    admin.updateBooksList(bookID);
                    admin.updateNoOfBooksPurchased(1);
                    System.out.println("You have purchased a book!" + " Price: $5");
                } else {
                    System.out.println("Alright!\n");
                }
            } else if (menuItem == 2) {
                if (admin.getSizeOfBooksPurchasedList() > 0) {
                    System.out.println("\n***** Return *****");
                    System.out.println("ID\t Name Of The Book\t Description\t\t Rating");
                    admin.viewBooksPurchasedByUser(books);

                    System.out.println("\nEnter Book ID to return? ");
                    int bookIDToDelete = in.nextInt();
                    if (admin.deleteInBooksList(bookIDToDelete)) {
                        admin.updateNoOfBooksPurchased(-1);
                        System.out.println("\nThank you for returning your book!");
                        System.out.println("You have " + admin.getNoOfBooksPurchased() + " number of books on your account.");
                    }
                } else {
                    System.out.println("\nBuy some books!");
                }
            } else if (menuItem == 3) {
                System.out.println("\nBye!");
                break;
            } else {
                System.out.println("\nIncorrect Menu ID");
            }
        }

        in.close();
    }
}
