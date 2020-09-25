package SportsComplex.User;

public class User {
    private String name;
    private int id;
    private boolean loginStatus;

    // Init Block
    {
        name = null;
        id = 0;
        loginStatus = false;
    }

    public User(){
        //
    }

    public void createUser(String userName){
        name = userName;
        id++;
    }

    public void login(){
        loginStatus = true;
    }

    public String getUserName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public boolean getLoginStatus(){
        return loginStatus;
    }

}
