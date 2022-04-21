package Hw202082021;

import java.util.Scanner;

public class Employee extends Person {
	private String ID;
	private String department="";
	private double salary;
	Employee() {
		
	}
	Scanner input=new Scanner(System.in);
	void setValueEmployee() {
		System.out.println("Enter the ID of the employee: ");
		this.ID=input.next();input.nextLine();
		System.out.println("Enter the Department of the employee: ");
		this.department=input.nextLine();
		System.out.println("Enter the Salary of the employee: ");
		this.salary=input.nextDouble();
		
	}
	String getId() {
		return this.ID;
	}
	String getDepartment() {
		return this.department;
	}
	double getSalary() {
		return this.salary;
	}
	
}
