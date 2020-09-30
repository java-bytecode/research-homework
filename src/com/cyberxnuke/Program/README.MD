# Employee Application

Employee Application is used for employees to authenticate into the application, access the calculator and create packets with messages.

The user first needs to register an account with the UserLogin class. The user can be an administrator or an employee. Each user can set his own personal details like name, address, phone number.

The user then logs in using the username and password provided earlier. The userLogin class has the implementations for the login(), logout(), checkLoginStatus() methods. The UserLogin calss extends the User class.

The user can then access the "calculator" class which has sum(), division() methods.

The user can also create a packet with a message. Each packet is stored in a **tree map** because the ID of the packet should always be unique and each packet should be sorted in ascending order according to the packet ID before sending it to another user.

A packet has three fields: ID (int), ComputerID (long), Message (String). 

Description for each class/interface/member is given below:

# packets
## Packet Class
| Members                                                     	| Description                                              	|
|-------------------------------------------------------------	|----------------------------------------------------------	|
| protected static int  id;                                   	| ID of the packet                                         	|
| protected static final long  computerID;                    	| Computer ID (Random ID)                                  	|
| protected  String  message;                                 	| Message in the Packet                                    	|
| ArrayList  cIdMsg  =  new ArrayList<>();                    	| Combining ID of the packet and Message into a ArrayList  	|
| TreeMap <Integer, ArrayList>  pMap  =  new TreeMap<>(); 	| Accepts ID of the packet and cIDMsg which is a ArrayList 	|
| UserLogin  loginObj;                                        	| Need to check if user logged in before doing any operation (ex. Creating a packet)                         	|
| createPacket(String packetMessage)                        	| Creates a packet and stores the message in it            	|
| viewPacket()                                                	| View the packet                                          	|
| viewPacket(int id)                                          	| View the packet according the packet ID given            	|

# mathPrograms
## Calculator 
### Calculator Class 
Implements the Calculator Interface.

### Calculator Interface
| Members                                              	| Description                 	|
|------------------------------------------------------	|-----------------------------	|
| int  sum(int  number1,  int number2)               	| Adds two integer numbers    	|
| double  sum(double  number1,  double number2)      	| Adds two double numbers     	|
| int  division(int  number1,  int number2)          	| Divides two integer numbers 	|
| double  division(double  number1,  double number2) 	| Divides two double numbers  	|

# loginSystem
### Person Class (Abstract)
| Members                                                	| Description                	|
|--------------------------------------------------------	|----------------------------	|
| protected  String  pName;                              	| Name of the person         	|
| protected String pAddress;                             	| Address of the person      	|
| protected long pPhoneNumber;                           	| Phone Number of the person 	|
| abstract void setPersonName(String pName);             	|                            	|
| abstract void setPersonAddress(String pAddress);       	|                            	|
| abstract void setPersonPhoneNumber(long pPhoneNumber); 	|                            	|
| abstract String getPersonName();                       	|                            	|
| abstract String getPersonAddress();                    	|                            	|
| abstract long getPersonPhoneNumber();                  	|                            	|

### User Class
User class extends Person abstract class.

### UserLogin Class
UserLogin class extends User class.

| Members                            	| Description             	|
|------------------------------------	|-------------------------	|
| private boolean  loginStatus       	| Stores the login status 	|
| public void  login()               	| Logins the user         	|
| public boolean  checkLoginStatus() 	| Checks login status     	|
| void  logout()                     	| Logouts the user        	| 

## driverClass
### DriverCode CLass
Driver code class has the main() method. An example program has been provided in this class.

**CyberxNuke**