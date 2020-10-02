package com.cyberxnuke.Q2;

import java.util.ArrayList;
import java.util.Iterator;

public class StudyMaterial {
    private String name;
    private int id;
    private ArrayList<Trainee> trainees;

    {
        name = "ABCD";
        id = 1;
        trainees = new ArrayList<>();
    }

    public StudyMaterial(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public void addTrainee(Trainee traineeObj){
        trainees.add(traineeObj);
    }

    public void getTrainees(){
        Iterator itr = trainees.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public String toString(){
        return name;
    }
}
