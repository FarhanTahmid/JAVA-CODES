package Hw11082021;

/*
 * Farhan Ishrak Thamid
 * 2031458642
 */


public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length=length;
		this.width=width;
	}
	public double area() {
		double result=length*width;
		return result;
	}
	public double perimeter() {
		double result=2*(length+width);
		return result;
	}
	@Override
	double permeter() {
		return 0;
	}

}
