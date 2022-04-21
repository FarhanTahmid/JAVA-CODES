package CW18082021;

public class Line {
	private Point start = new Point();
	private Point end = new Point();
	
	Line(){
		
	}
	Line(Point start, Point end){
		this.start=start;
		this.end=end;
	}
	Line(int x1, int y1, int x2, int y2){
		
	}
	public Point getStart() {
		return start;
	}
	public Point getEnd() {
		return end;
	}
	public void setStart(Point start) {
		this.start = start;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	public double length() {
		return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2) );
	}
}