package com.cyberxnuke.Q1;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private String description;
    private int noOfEmployees;
    private ArrayList<Employee> employeesList;

    {
        companyName = "Apple, Inc";
        description = "Develops software and hardware";
        noOfEmployees = 100;
        employeesList = new ArrayList<>();
    }

    public Company(){
        //
    }

    public Company(String companyName, String description, int noOfEmployees){
        this.companyName = companyName;
        this.description = description;
        this.noOfEmployees = noOfEmployees;
    }

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public ArrayList<Employee> getEmployee(){
        return employeesList;
    }

    public String toString(){
        return companyName;
    }

}
