package com.cyberxnuke.Q141518;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        ArrayList employee1 = new ArrayList();
        ArrayList employee2 = new ArrayList();
        ArrayList employee3 = new ArrayList();
        ArrayList employee4 = new ArrayList();

        employee1.add("\"CyberxNuke\"");
        employee1.add(4);
        employee1.add(2020);

        employee2.add("\"Corentin\"");
        employee2.add(4);
        employee2.add(2019);

        employee3.add("\"JaneDoe\"");
        employee3.add(5);
        employee3.add(2020);

        employee4.add("\"Sarah\"");
        employee4.add(3);
        employee4.add(2020);

        Manager manager = new Manager("/Users/x/IdeaProjects/CoreJavaPrograms/src/com/cyberxnuke/Q141518/Employees.txt");
        manager.create();

        // Employee 1
        manager.write(employee1.get(0).toString());
        manager.write(", ");
        manager.write(employee1.get(1).toString());
        manager.write(", ");
        manager.write(employee1.get(2).toString());
        manager.write("\n");

        // Employee 2
        manager.write(employee2.get(0).toString());
        manager.write(", ");
        manager.write(employee2.get(1).toString());
        manager.write(", ");
        manager.write(employee2.get(2).toString());
        manager.write("\n");

        // Employee 3
        manager.write(employee3.get(0).toString());
        manager.write(", ");
        manager.write(employee3.get(1).toString());
        manager.write(", ");
        manager.write(employee3.get(2).toString());
        manager.write("\n");

        // Employee 4
        manager.write(employee4.get(0).toString());
        manager.write(", ");
        manager.write(employee4.get(1).toString());
        manager.write(", ");
        manager.write(employee4.get(2).toString());

        manager.makeFileReadable();


        Employee employeeObj1 = new Manager(employee1.get(0).toString(), Integer.parseInt(employee1.get(1).toString()), Integer.parseInt(employee1.get(2).toString()));
        Employee employeeObj2 = new Manager(employee2.get(0).toString(), Integer.parseInt(employee2.get(1).toString()), Integer.parseInt(employee2.get(2).toString()));
        Employee employeeObj3 = new Manager(employee3.get(0).toString(), Integer.parseInt(employee3.get(1).toString()), Integer.parseInt(employee3.get(2).toString()));
        Employee employeeObj4 = new Manager(employee4.get(0).toString(), Integer.parseInt(employee4.get(1).toString()), Integer.parseInt(employee4.get(2).toString()));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employeeObj1);
        employees.add(employeeObj2);
        employees.add(employeeObj3);
        employees.add(employeeObj4);

        Collections.sort(employees, new sortEmployeesRating());
        Collections.sort(employees, new sortEmployeesYear());

        Iterator itr = employees.iterator();

        System.out.println("\nEmployee details on decreasing order of their rating and decreasing order of their StartYear\n");

        while(itr.hasNext()){
            Employee employeeObj = (Employee) itr.next();
            System.out.println(employeeObj.name + " " + employeeObj.rating + " " + employeeObj.year);
        }

    }
}
