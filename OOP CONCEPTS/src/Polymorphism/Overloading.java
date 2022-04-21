package Polymorphism;

public class Overloading {
	void show() {
		System.out.println("1");
	}
	void show(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Overloading obj1=new Overloading();
		obj1.show();
		obj1.show(5);

	}

}
