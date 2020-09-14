package ibm;

/**
 * @author CyberxNuke
 *
 */

public class DriverCode {
	
	public static void main(String[] args) {
		
		// TraineeEmployees
		
		TraineeEmployee emp1 = new TraineeEmployee(1, "Self Driving Car Trainee", 68000.6, 1);
		TraineeEmployee emp2 = new TraineeEmployee(2, "Dell Trainee", 70000.1, 2);
		TraineeEmployee emp3 = new TraineeEmployee(3, "HPE Trainee", 100000.8, 3);
		
		TraineeEmployee[] emp = {emp1, emp2, emp3};
		
		
		
		for(TraineeEmployee empReader: emp) {
			
			System.out.println("Employee ID: " + empReader.employeeID);
			System.out.println(empReader.getTypeOfWork());
			System.out.println("Table Number: " + empReader.getTableNumber());
			System.out.println("Employee Salary: " + empReader.salary);
			System.out.println("Employee Salary in Integer: " + (int)empReader.salary);
			empReader.computerAssigned();
			
			System.out.println();
			
		}
		
		// Employee
		
		Employee nonTraineeEmp = new Employee(4, 1000000.8, "CEO");
		
		System.out.println("Employee ID: " + nonTraineeEmp.getEmployeeID());
		System.out.println(nonTraineeEmp.getTypeOfWork());
		System.out.println("Employee Salary: " + nonTraineeEmp.salary);
		System.out.println("Employee Salary in Integer: " + (int)nonTraineeEmp.salary);
		nonTraineeEmp.computerAssigned();
		
		System.out.println();
		
		// UpCasting
		
		Employee emp5 = new TraineeEmployee(5, "Cisco Trainee", 200000.7, 5);
		
		System.out.println("Employee ID: " + emp5.employeeID);
		System.out.println(emp5.getTypeOfWork());
		System.out.println("Employee Salary: " + emp5.salary);
		System.out.println("Employee Salary in Integer: " + (int)emp5.salary);
		emp5.computerAssigned();
		
	}

}
