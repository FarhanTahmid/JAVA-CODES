package Hw202082021;

import java.util.Scanner;

public class Person {
	private String name="";
	private String gender;
	private int age;
	
	Person(){
	}
	Scanner input=new Scanner(System.in);
	void setValuePerson() {
		System.out.println("Enter first name of the faculty:");
		String name=input.nextLine();
		System.out.println("Enter gender:");
		String gender=input.next();
		System.out.println("Enter age:");
		int age=input.nextInt();
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	String getName() {
		return this.name;
	}
	String getGender() {
		return this.gender;
	}
	int getAge() {
		return this.age;
	}
	
}
