package com.cyberxnuke.Q26;

public class Employee {
    private int empId;
    private String name;
    private Double salary;
    private String department;

    public Employee(int empId, String name, Double salary, String department){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary(){
        return salary;
    }
}
