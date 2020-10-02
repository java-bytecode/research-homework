package com.cyberxnuke.Q22;

@FunctionalInterface
public interface CompanyI {
     default Double profit(double cp, double sp){
        return cp-sp;
    }

     static String companyName() {
        return "Apple, Inc";
    }

    String getCompDetails(double profit,String name);
}
