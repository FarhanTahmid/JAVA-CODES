package Hw11082021;

/*
 * Farhan Ishrak Thamid
 * 2031458642
 */


abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name=name;
	}
	
	abstract double area();
	abstract double permeter();
}
