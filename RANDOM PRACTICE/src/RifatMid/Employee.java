package RifatMid;

public class Employee extends Faculty {
	int employeeID;

	Employee(int empID){
		super("Rajesh Palit",50,"CSE",20);
		this.employeeID=empID;
	}
	public String toString() {
		
		return "Employee id is "+employeeID;
	}
	
}
