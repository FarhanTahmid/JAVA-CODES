package INHERITANCE;

public class SuperKeyword {

	
	public static void main(String[] args) {
		B obj=new B();
		obj.display(30);
	}

}
class A{
	int a=10;
	void show() {
		System.out.println("Method of A class is called");
	}
	void display1() {
		System.out.println("Called by super keyword");
	}
}
class B extends A{
	void show() {
		System.out.println("Method of B class is called");
	}
	void display1() {
		System.out.println("Called by this keyword");
	}
	int a=20;
	void display(int a) {
		System.out.println("The value initialized from object is: "+a);
		System.out.println("The value initialized from parent class A is "+super.a); //accessing superclass element
		System.out.println("The value initialized in B class is: "+this.a);  //accessing current class element
		//invoking with this keyword
		this.display1();
		//invoking methods with super keyword
		super.display1();
	}
}