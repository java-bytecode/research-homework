package SportsComplex.DriverCode;

import SportsComplex.Sport.*;
import SportsComplex.User.*;
import java.util.Scanner;

public class Main {

    Badminton bdObj = new Badminton();
    Football ftObj = new Football();
    BoxCricket bxcObj = new BoxCricket();

    public static void main(String[] args){
        String name;
        User userObj = new User();
        Main objMain = new Main();


        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your name? ");
            name = in.next();
            if (name.isBlank() || name.isEmpty()){
                break;
            } else {
                userObj.createUser(name);
                userObj.login();
                System.out.println();
                objMain.selectSport();
            }
        }

    }

    public void selectSport(){
        Scanner in = new Scanner(System.in);
        int sportID;
        int slotID;


        System.out.println("Available Sports: \n" +
                "1. Badminton\n" +
                "2. Football\n" +
                "3. Box Cricket\n");

        sportID = in.nextInt();
        if(sportID == 1){
            System.out.println();
            bdObj.viewSlots();

            System.out.println();

            System.out.print("Which slot you want to select? ");
            slotID = in.nextInt();

            String slotTime = bdObj.bookSlot(slotID);
            System.out.println("Your slot " + slotID + " " + slotTime + " is booked!");

        } else if(sportID == 2){
            System.out.println();
            ftObj.viewSlots();

            System.out.println();

            System.out.print("Which slot you want to select? ");
            slotID = in.nextInt();

            String slotTime = ftObj.bookSlot(slotID);
            System.out.println("Your slot " + slotID + " " + slotTime + " is booked!");

        } else if(sportID == 3){
            System.out.println();
            bxcObj.viewSlots();

            System.out.println();

            System.out.print("Which slot you want to select? ");
            slotID = in.nextInt();

            String slotTime = bxcObj.bookSlot(slotID);
            System.out.println("Your slot " + slotID + " " + slotTime + " is booked!");
        }

        System.out.println();
    }
}
