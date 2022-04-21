package Hw02082021;

import java.util.Scanner;

public class Shape {
	private String name;
	Scanner  input=new Scanner(System.in);
	void setName() {
		System.out.println("Enter the name of the shape");
		String name=input.next();
		this.name=name;
	}
	String getName() {
		
		return this.name;
	}
	
	Shape(){	
	}
	

}
