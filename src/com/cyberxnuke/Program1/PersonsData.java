package com.cyberxnuke.Program1;

import java.util.*;

public class PersonsData extends Person {

    String[] details = {"Name: ", "Age: ", "Gender: ", "Contact: ", "Address: "};
    ArrayList person = new ArrayList();
    ArrayList personShallowClone = new ArrayList(); // Avoid ConcurrentModificationException
    int startArrIndex;
    int arrIndex;


    HashMap<Integer, List> personDataHMap = new HashMap<>();

    int key;

    PersonsData(String name, int age, String gender, long contact, String address){
        super(name, age, gender, contact, address);
        insertPersonDetails();
    }
    @Override
    public void insertPersonDetails(){
        if(person.isEmpty()) {
            person.add(name);
            person.add(age);
            person.add(gender);
            person.add(contact);
            person.add(address);

            updatePersonDataHashMap();
        }
    }

    public void insertPersonDetails(String name, int age, String gender, long contact, String address){
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
        person.add(arrIndex, address);

        updatePersonDataHashMap();
    }

    @Override
    public void insertPersonDetails(String name, int age, String gender, long contact, List address) throws IllegalCallerException {
        throw new IllegalCallerException("Program1 uses only String for address");
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
        System.out.println(localKey + " " + personDataHMap.get(localKey));
    }

    @Override
    public void getPersonDetails() {
        Iterator itr = person.iterator();
        int count = 0;
        while(itr.hasNext()){
            System.out.println(details[count] + " "  + itr.next());
            count++;

            if (count == details.length){
                count = 0;
                System.out.println();
            }
        }
    }
}
