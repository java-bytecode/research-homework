package com.cyberxnuke.Q2;

import java.util.ArrayList;
import java.util.Iterator;

public class Trainee {
    private String name;
    private int id;
    private ArrayList<StudyMaterial> studyMaterials;

    {
        name = "Student";
        id = 1;
        studyMaterials = new ArrayList<>();
    }

    public Trainee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public void addStudyMaterial(StudyMaterial studyMaterialObj){
        studyMaterials.add(studyMaterialObj);
    }

    public void getStudyMaterials(){
        Iterator itr = studyMaterials.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public String toString(){
        return name;
    }
}
