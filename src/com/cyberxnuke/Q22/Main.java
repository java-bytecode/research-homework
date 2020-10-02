package com.cyberxnuke.Q22;

public class Main {
    public static void main(String[] args){
        Company company = new Company();
        System.out.println(company.profit(100.1, 20.2));

        System.out.println(CompanyI.companyName());

        CompanyI company1 = (profit, companyName) -> "\nProfit: " + profit + "\nCompany Name: " + companyName;

        System.out.println(company1.getCompDetails(100.1, "SpaceX"));

    }
}
