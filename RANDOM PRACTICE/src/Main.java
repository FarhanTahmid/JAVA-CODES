
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
   	 Scanner sc=new Scanner(System.in);
   	 
   	 Rectangle shape1=new Rectangle(sc.next(), sc.nextDouble(),sc.nextDouble());
   	 String name=shape1.getter();
   	 System.out.println("Shape: "+name);
   	 double area=shape1.area();
   	 double perimeter=shape1.perimeter();
   	 System.out.println("Area: "+area);
   	 System.out.println("Perimeter: "+perimeter);
   	 
    }
}

abstract class Shape { 
	
	private String name;
	public Shape(String name) {
		this.name = name;
	}
	public void setter(String name) {
		this.name = name;
	}
	public String getter() {
		return name;
	}
	
   abstract double area();
   abstract double perimeter();

}

class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(String name, double length, double width) {
		
		super(name);
		this.length = length;
		this.width = width;
	}
	public double area() {
		double area=width*length;
		return area;
    }

    public double perimeter() {
    	double perimeter=2*(length+width);
    	return perimeter;
    }

}
