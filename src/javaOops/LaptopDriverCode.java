/**
 * 
 */
package javaOops;

/**
 * @author CyberxNuke
 *
 */
public class LaptopDriverCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HPLaptop myLaptop = new HPLaptop("admin", "password"); // Username, Password
		
		myLaptop.login();
		System.out.println("CheckValidLogin: " + myLaptop.checkValidLogin());
		myLaptop.logout();
	}

}
