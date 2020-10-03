package com.cyberxnuke.Q26;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsPrac {
    public static void main(String[] args){
        Employee apple = new Employee(1, "Apple", 200.99, "IT");
        Employee john = new Employee(2, "John", 500.12, "IT");
        Employee jake = new Employee(3, "Jake", 600.34, "IT");
        Employee sarah = new Employee(4, "Sarah", 700.56, "IT");

        List<Employee>  employeesList = Arrays.asList(apple, john, jake, sarah);

        Double averageSalary = employeesList.stream().collect(averagingDouble(Employee::getSalary));

        System.out.println(averageSalary);

        Double maxSalary = employeesList.stream().collect(summingDouble(Employee::getSalary));

        System.out.println(maxSalary);

        Set<Double> salarySet = employeesList.stream().map(n -> n.getSalary()).collect(Collectors.toSet());

        System.out.println(salarySet);

        long noOfEmployees = employeesList.stream().collect(Collectors.counting());
        System.out.println(noOfEmployees);

        DoubleSummaryStatistics doubleSummaryStatistics = employeesList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(doubleSummaryStatistics);


    }
}
