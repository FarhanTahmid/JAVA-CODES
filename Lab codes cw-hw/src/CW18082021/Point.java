package CW18082021;

public class Point {
	private int x;
	private int y;
	
	Point(){
		
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return x+ ","+y;
	}
	public double distance(Point point) {
		double d = Math.sqrt(Math.pow(x-point.x, 2) + Math.pow(y-point.y, 2) ); 
		return d;
	}
}