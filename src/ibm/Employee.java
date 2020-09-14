/**
 * 
 */
package ibm;

/**
 * @author CyberxNuke
 *
 */
public class Employee {
	
	static String companyName;
	int employeeID; // Use default access modifier
    String typeOfWork;
    double salary;
	
	static {
		companyName = "IBM";
	}
	
	{
		employeeID = 0;
		typeOfWork = "None";
		salary = 0.0;
	}
	
	public Employee(int employeeID, double salary, String typeOfWork) {
		this.employeeID = employeeID;
		this.typeOfWork = typeOfWork;
		this.salary = salary;
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the typeOfWork
	 */
	public String getTypeOfWork() {
		return typeOfWork;
	}

	/**
	 * @param typeOfWork the typeOfWork to set
	 */
	public void setTypeOfWork(String typeOfWork) {
		this.typeOfWork = typeOfWork;
	}
	
	/**
	 *  A computer is assigned according to the employee ID
	 */
	
	public void computerAssigned() {
		System.out.println("Computer Assigned: " + employeeID);
	}

}
