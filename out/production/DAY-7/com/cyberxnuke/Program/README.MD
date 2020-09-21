# Employee Application

##Packet Class
| Members                                                     	| Description                                              	|
|-------------------------------------------------------------	|----------------------------------------------------------	|
| protected static int  id;                                   	| ID of the packet                                         	|
| protected static final long  computerID;                    	| Computer ID (Random ID)                                  	|
| protected  String  message;                                 	| Message in the Packet                                    	|
| ArrayList  cIdMsg  =  new ArrayList<>();                    	| Combining ID of the packet and Message into a ArrayList  	|
| TreeMap <Integer, ArrayList >  pMap  =  new TreeMap<>(); 	| Accepts ID of the packet and cIDMsg which is a ArrayList 	|
| UserLogin  loginObj;                                        	| Need to check if user logged in before doing any operation (ex. Creating a packet)                         	|
| createPacket (String packetMessage)                        	| Creates a packet and stores the message in it            	|
| viewPacket()                                                	| View the packet                                          	|
| viewPacket(int id)                                          	| View the packet according the packet ID given            	|

##Calculator 
### Calculator Class 
Implements the Calculator Interface.

### Calculator Interface
| Members                                              	| Description                 	|
|------------------------------------------------------	|-----------------------------	|
| int  sum ( int  number1,  int number2)               	| Adds two integer numbers    	|
| double  sum ( double  number1,  double number2)      	| Adds two double numbers     	|
| int  division ( int  number1,  int number2)          	| Divides two integer numbers 	|
| double  division ( double  number1,  double number2) 	| Divides two double numbers  	|

##Login System
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

Login Module - loginStatus, login(), logout(). <- User Module - userType, userID, userName, userPassword, viewUsers(). <- Person - pName, pAddress, pPhoneNumber (abstract). 

## Driver Code


