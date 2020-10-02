package com.cyberxnuke.Q19;

public class UserName {
    public void setUserName(String userName) throws InvalidUserName {
        if(userName.length() < 10 || userName.contains("&")){
            throw new InvalidUserName("UserName should be greater than 10 characters and shouldn't contain a \"&\"");
        }
    }
}
