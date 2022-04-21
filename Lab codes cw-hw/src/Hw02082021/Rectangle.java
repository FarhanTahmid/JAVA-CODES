package Hw02082021;

import java.util.Scanner;

public class Rectangle extends Shape {
	
	Scanner input=new Scanner(System.in);
	double side1;
	double side2;
	void setValue() {
		System.out.println("Enter Side1");
		side1=input.nextDouble();
		System.out.println("Enter Side2");
		side2=input.nextDouble();
	}
	double getSide1() {
		return side1;
	}
	double getSide2() {
		return side2;
	}
	
	double area() {
		
		double area=this.side1*this.side2;
		return area;
	}
	double perimeter() {
		double perimeter=2*(this.side1+this.side2);
		return perimeter;
	}
	
}
