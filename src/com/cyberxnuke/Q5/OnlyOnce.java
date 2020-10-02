package com.cyberxnuke.Q5;

public final class OnlyOnce {
  public static int id;
  public String name;

  public static OnlyOnce obj;

  static {
      id = 1;
      obj = new OnlyOnce();
  }

  public OnlyOnce(){
      //
  }

  public void setName(String name){
        this.name = name;
  }

}
