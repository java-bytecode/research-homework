/**
 * 
 */
package loginSystem;

/**
 * @author CyberxNuke
 *
 */
public abstract class Person {
	
	protected String pName;
	protected String pAddress;
	protected long pPhoneNumber;
	
	abstract void setPersonName(String pName);
	abstract void setPersonAddress(String pAddress);
	abstract void setPersonPhoneNumber(long pPhoneNumber);
	
	abstract String getPersonName();
	abstract String getPersonAddress();
	abstract long getPersonPhoneNumber();

}
