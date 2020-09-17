package javaOops;

public abstract class Laptop {
	 String laptopUserName;
	 String laptopPassword;
	 static boolean validBit; // If login successful, validBit is set to true. If login is not successful, validBit is set to false.
	 
	 
	 Laptop(String laptopUserName, String laptopPassword){
		 this.laptopUserName = laptopUserName;
		 this.laptopPassword = laptopPassword;
	 }
	 
	 static {
		 validBit = false;
	 }
	 
	 abstract void login();
	 abstract void logout();
	
	 boolean checkValidLogin() {
		 return validBit;
	 }
}
