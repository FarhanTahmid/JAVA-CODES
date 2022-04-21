package Hw202082021;

import java.util.Scanner;

public class Faculty extends Employee{
	private String initial="";
	private String rank="";
	Faculty(){
		
	}
	Scanner input=new Scanner(System.in);
	void setValueFaculty() {
		System.out.println("Enter the initial of the faculty: ");
		this.initial=input.nextLine();

		System.out.println("Enter the rank of the faculty: ");
		this.rank=input.nextLine();
	}
	public String toString() {
		return "Initial: "+this.initial+"\nRank: "+this.rank;
	}
}
