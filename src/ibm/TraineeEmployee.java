/**
 * 
 */
package ibm;

/**
 * @author CyberxNuke
 *
 */
public class TraineeEmployee extends Employee {
	
	private int tableNumber;
	
	{
		tableNumber = 0;
	}

	public TraineeEmployee(int employeeID, String typeOfWork, double salary, int tableNumber) {
		super(employeeID, salary, typeOfWork);
		this.tableNumber = tableNumber;
	}
	
	/**
	 *  A computer is assigned according to the trainee employee ID and tableNumber in employeeID.tableNumber format.
	 */
	
	public void computerAssigned() {
		System.out.println("Computer Assigned: " + employeeID + "." + tableNumber);
	}
	
	public int getTableNumber() {
		return tableNumber;
	}

}
