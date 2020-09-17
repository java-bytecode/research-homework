/**
 * 
 */
package javaOops;

/**
 * @author CyberxNuke
 *
 */

// Can extend only one class
public class HPLaptop extends Laptop {
	
	{
		laptopUserName = "";
		laptopPassword = "";
		System.out.println("INIT BLOCK");
	}
	
	HPLaptop(String laptopUserName, String laptopPassword){
		super(laptopUserName, laptopPassword);
		this.laptopUserName = laptopUserName;
		this.laptopPassword = laptopPassword;
		System.out.println(this.laptopUserName);
		System.out.println("CONS BLOCK");
	 }

	@Override
	void login() {
		
		System.out.println("Username: " + laptopUserName);
		
		switch(laptopUserName) {
		case "admin":
			if (laptopPassword.equals("password")) {
				System.out.println("Successfully Logged In!");
				validBit = true;
			}
			
		}
	}

	@Override
	void logout() {
		
		validBit = false;
		System.out.println("Successfully Logged Out!");
	}
	

}
