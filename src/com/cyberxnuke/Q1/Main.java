package com.cyberxnuke.Q1;

public class Main {

    public static void main(String[] args) {
            // One to many association: Company can have many employees. But an employee cannot be part of many companies.
            Company apple = new Company();
            Employee emp1 = new Employee("Jane", 5, 2020);
            Employee emp2 = new Employee("Doe", 4, 2019);
            Employee emp3 = new Employee("Nick", 5, 2020);

            apple.addEmployee(emp1);
            apple.addEmployee(emp2);
            apple.addEmployee(emp3);

            System.out.println(apple.getEmployee());
    }
}
