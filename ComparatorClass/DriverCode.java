package com.cyberxnuke.ComparatorClass;

import com.cyberxnuke.Program1.Address;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DriverCode {
    public static void main(String[] args){

        List<Address> address1 = new ArrayList<>();
        List<Address> address2 = new ArrayList<>();
        List<Address> address3 = new ArrayList<>();


        // Addresses
        Address addr1 = new Address();
        addr1.setAddress("311  Freedom Lane, Lodi, CA 95240");
        Address addr2 = new Address();
        addr2.setAddress("431  Catherine Drive, Bismarck, ND 58501");
        Address addr3 = new Address();
        addr3.setAddress("1580  Nash Street, Dearborn, MI 48126");
        Address addr4 = new Address();
        addr4.setAddress("4304  Broadway Street, Florence, SC 29501");
        Address addr5 = new Address();
        addr5.setAddress("1775  Glendale Avenue, Woodland Hills, CA 10101");
        Address addr6 = new Address();
        addr6.setAddress("2034  Pritchard Court, Hanska, MN 56041");

        address1.add(addr1);
        address1.add(addr2);
        address1.add(addr3);

        address2.add(addr4);
        address2.add(addr5);
        address2.add(addr6);

        address3.add(addr1);
        address3.add(addr4);
        address3.add(addr6);

        // Person 1
        PersonsData pData = new PersonsData("CyberxNuke", 20, "Male", 12345678901L, address1);

        // Person2
        PersonsData p2Data = new PersonsData("John", 100, "Male", 1010101010L, address2);

        // Person3
        PersonsData p3Data = new PersonsData("Doe", 200, "Female", 1020304050L, address3);

        // Person4
        PersonsData p4Data = new PersonsData("Alex", 50, "Male", 1020304050L, address3);

        ArrayList<PersonsData> pDataList = new ArrayList<>();
        pDataList.add(pData);
        pDataList.add(p2Data);
        pDataList.add(p3Data);
        pDataList.add(p4Data);


        // comparator
        Collections.sort(pDataList, new SortByAge());

        System.out.println("Sorted by AGE \n");
        Iterator itr = pDataList.iterator();

        while(itr.hasNext()){
            PersonsData pDataSortedObj = (PersonsData) itr.next();
            pDataSortedObj.getPersonDetailsFromHashMap(0);
        }

    }
}
