package com.cyberxnuke.Program1;

public class DriverCode {

    public static void main(String[] args) {
        PersonsData pData = new PersonsData("CyberxNuke", 20, "Male", 12345678901L, "Earth");
        pData.insertPersonDetails("John", 100, "Male", 1010101010L, "California");
        pData.insertPersonDetails("Jane", 200, "Female", 1020304050L, "Washington");
        pData.insertPersonDetails("Doe", 50, "Female", 2020202020L, "New York");

        System.out.println("** Retrieving People Details From Array List **\n");
        pData.getPersonDetails();

        // Hash map
        System.out.println("** Retrieving People Details From Hash Map **\n");
        pData.getPersonDetailsFromHashMap(0);
        pData.getPersonDetailsFromHashMap(1);
        pData.getPersonDetailsFromHashMap(2);
        pData.getPersonDetailsFromHashMap(3);



    }
}
