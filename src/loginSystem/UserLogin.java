/**
 * 
 */
package loginSystem;

/**
 * @author CyberxNuke
 *
 */
public class UserLogin extends User {
	
	private boolean loginStatus;
	
	public UserLogin(){
		loginStatus = false;
	}
	
	public UserLogin(int userType,int userID, String userName, String userPassword) {
		super(userType,userID, userName, userPassword );
	}
	
	public void login(String userName, String userPassword) {
			if ((getUserName().equals(userName)) && (getUserPassword().equals(userPassword))) {
				loginStatus = true;
				System.out.println("Login System: You are successfully logged in " + getUserName() + "!");
			} else {
				System.out.println("Kindly, Enter correct Username and Password!");
			}
	}
	
	public boolean checkLoginStatus() {
		return loginStatus;
	}
	
	void logout() {
		loginStatus = false;
	}

}
