package com.cyberxnuke.Q19;

public class Main {
    public static void main(String[] args){
        UserName userName = new UserName();

        try {
            userName.setUserName("ABCD");
        } catch (InvalidUserName invalidUserName) {
            invalidUserName.printStackTrace();
        }

        try {
            userName.setUserName("CyberxNuke&ABCD");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
