package com.cyberxnuke.User;

public class User implements UserMethods {
    private static int id;
    private UserType userType;
    private int noOfBooksPurchased;

    public User(){
        id = 0;
        userType = null;
        updateID();
    }

    private void updateID(){
        id++;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public void setUserType(UserType userType){
        this.userType = userType;
    }

    @Override
    public String getUserType(){
        return userType.toString();
    }

    @Override
    public int getNoOfBooksPurchased() {
        return 0;
    }


}
