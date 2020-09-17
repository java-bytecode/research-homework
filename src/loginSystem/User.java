package loginSystem;

public class User extends Person {
	
	protected int userType; // 1 = Admin, 2 = Employee
	protected int userID; 
	protected String userName;
	protected String userPassword;
	
	public User() {
		//
	}
	
	public User(int userType,int userID,String userName, String userPassword) {
		this.userType = userType;
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public void setPersonDetails(String pName, String pAddress, long pPhoneNumber) {
		this.pName = pName;
		this.pAddress = pAddress;
		this.pPhoneNumber = pPhoneNumber;
	}
	
	public int getUserType() {
		return userType;
	}
	
	public int getUserID() {
		return userType;
	}
	
	public String getUserName() {
		return userName;
	}
	
	protected String getUserPassword() {
		return userPassword;
	}
	
	void getUserType(int userType) {
		this.userType = userType;
	}
	
	void getUserID(int userID) {
		this.userID = userID;
	}
	
	void getUserName(String userName) {
		this.userName = userName;
	}
	
	void getUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

	@Override
	void setPersonName(String pName) {
		this.pName = pName;
		
	}

	@Override
	void setPersonAddress(String pAddress) {
		this.pAddress = pAddress;
		
	}

	@Override
	void setPersonPhoneNumber(long pPhoneNumber) {
		this.pPhoneNumber = pPhoneNumber;
		
	}

	@Override
	String getPersonName() {
		return pName;
	}

	@Override
	String getPersonAddress() {
		return pAddress;
	}

	@Override
	long getPersonPhoneNumber() {
		return pPhoneNumber;
	}

}
