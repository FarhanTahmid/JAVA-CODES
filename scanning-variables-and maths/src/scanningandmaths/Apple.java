package scanningandmaths;

public class Apple extends Fruit{
	public Apple(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Apple a=new Apple("Apple");
	}
	
}
class Fruit{
	public Fruit(String name) {
		System.out.println("Fruits constructor is invoked");
	}
}
