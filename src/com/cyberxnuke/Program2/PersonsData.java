package com.cyberxnuke.Program2;

import com.cyberxnuke.Program1.Address;
import com.cyberxnuke.Program1.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PersonsData extends Person {

    String[] details = {"Name: ", "Age: ", "Gender: ", "Contact: ", "Address: "};
    ArrayList person = new ArrayList();
    ArrayList personShallowClone = new ArrayList(); // Avoid ConcurrentModificationException
    int startArrIndex;
    int arrIndex;

    HashMap<Integer, List> personDataHMap = new HashMap<>();

    int key;

    PersonsData(String name, int age, String gender, long contact, List address){
        super(name, age, gender, contact, address);
        insertPersonDetails();
    }

    @Override
    public void insertPersonDetails() {
        if(person.isEmpty()) {
            person.add(name);
            person.add(age);
            person.add(gender);
            person.add(contact);
            person.add(addressList);

            updatePersonDataHashMap();
        }
    }

    @Override
    public void insertPersonDetails(String name, int age, String gender, long contact, String address) {
        throw new IllegalCallerException("Program2 uses only List<String> for address");
    }

    @Override
    public void insertPersonDetails(String name, int age, String gender, long contact, List addressList) {
        startArrIndex = person.size();
        arrIndex = person.size();
        person.add(arrIndex, name);
        arrIndex++;
        person.add(arrIndex, age);
        arrIndex++;
        person.add(arrIndex, gender);
        arrIndex++;
        person.add(arrIndex, contact);
        arrIndex++;
        person.add(arrIndex, addressList);

        updatePersonDataHashMap();
    }

    private void updatePersonDataHashMap(){

        // Doing this to avoid ConcurrentModificationException.
        personShallowClone = (ArrayList) person.clone();

        if (key == 0){
            personDataHMap.put(key, personShallowClone.subList(0, person.size()));
        } else {
            personDataHMap.put(key, personShallowClone.subList(startArrIndex, arrIndex+1));
        }

        key++;
    }

    public void getPersonDetailsFromHashMap(int localKey){

        System.out.println("Key: " + localKey);

        Iterator itr = personDataHMap.get(localKey).iterator();
        int count = 1;
        while(itr.hasNext()){
            if(count%5 == 0){
                ArrayList addrArrList = (ArrayList) itr.next();
                Iterator itrArrList = addrArrList.iterator();
                while(itrArrList.hasNext()){
                    Address addrObj = (Address) itrArrList.next();
                    System.out.println(details[count-1] + " "  + addrObj.getAddress());
                }
            } else {
                System.out.println(details[count-1] + " "  + itr.next());
            }

            count++;

            if (count == (details.length+1)){
                count = 1;
                System.out.println();
            }
        }

    }

    @Override
    public void getPersonDetails() {
        // Do Nothing
    }
}
