package com.cyberxnuke.Q2;

public class Main {

    public static void main(String[] args){
        Trainee trainee1 = new Trainee("CyberxNuke", 1);
        Trainee trainee2 = new Trainee("JaneDoe", 2);

        StudyMaterial studyMaterial1 = new StudyMaterial("SAT Maths", 1);
        StudyMaterial studyMaterial2 = new StudyMaterial("SAT English", 2);

        trainee1.addStudyMaterial(studyMaterial1);
        trainee1.addStudyMaterial(studyMaterial2);

        studyMaterial1.addTrainee(trainee1);
        studyMaterial1.addTrainee(trainee2);

        studyMaterial2.addTrainee(trainee1);
        studyMaterial2.addTrainee(trainee2);

        System.out.println(trainee1.getName() + "\n----------");
        trainee1.getStudyMaterials();

        System.out.println();

        System.out.println(studyMaterial1.getName() + "\n---------");
        studyMaterial1.getTrainees();
    }
}
