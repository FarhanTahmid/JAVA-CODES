package CW18082021;

public class Driver {

	public static void main(String[] args) {
		Point start=new Point(1,2);
		Point end=new Point(3,2);
		Line line=new Line(start,end);
		System.out.println("The length is: "+line.length());
	}

}
