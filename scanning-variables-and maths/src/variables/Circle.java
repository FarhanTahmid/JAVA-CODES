package variables;

public class Circle {
	
	double radius;
	public boolean equals(Circle circle) {
		return this.radius==((Circle)circle).radius;
	}
	@Override
	public String toString() {
		return ""+radius;
	}

}
