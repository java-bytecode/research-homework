package com.cyberxnuke.Q4;
import com.cyberxnuke.Q1.Company;

public class Q4 {

    public static void main(String[] args){
        Company company = new Company();
        Company company1 = new Company();
        System.out.println(company.hashCode());
        System.out.println(company.equals(company));
        System.out.println(company.equals(company1));
        System.out.println(company.toString());

        Integer number = 10;
        System.out.println(number.equals(10));
        System.out.println(Integer.parseInt("1010"));
        System.out.println(number.hashCode());
    }
}
