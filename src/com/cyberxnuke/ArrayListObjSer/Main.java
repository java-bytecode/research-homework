package com.cyberxnuke.ArrayListObjSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Car obj1 = new Car(1, "Volkswagen");
        Car obj2 = new Car(2, "RoadRacer");
        CarDetails obj3 = new CarDetails(3, "Subaru", 1000);

        ArrayList arrayList = new ArrayList();
        arrayList.add(obj1);
        arrayList.add(obj2);
        arrayList.add(obj3);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("CarDetails.txt"));
            objectOutputStream.writeObject(arrayList);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
