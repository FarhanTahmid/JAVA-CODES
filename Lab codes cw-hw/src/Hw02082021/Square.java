

package Hw02082021;

public class Square extends Rectangle {
	public static void main(String[] args) {
		Square obj1=new Square();
		obj1.setName();
		obj1.setValue();
		
		System.out.println("The shape name is "+obj1.getName()+" and It's two sides are "+obj1.getSide1()+" units and "+obj1.getSide2()+" units and its Area is "+obj1.area()+" units. Also the perimeter is "+obj1.perimeter()+" units");
	}
}
