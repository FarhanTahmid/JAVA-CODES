package Interface;

public class Interface {

	public static void main(String[] args) {
		Initializer obj1=new Initializer();
		obj1.show();
		System.out.println("The value of int a in the interface class is "+I1.a);
		obj1.normalDefaultMethod();      //concrete methods inside interface class can be accessed like this
										 //objects of another class can call these method without overriding by another class.
		System.out.println(I1.s);
		
	}

}
interface I1{
	void show();
	int a=10;    //every variable or data field inside interface is by default public static final;
	String s="Final field";
	default void normalDefaultMethod() {
		System.out.println("This is normal default method.");
	}
	
}
class Initializer implements I1{
	public void show() {
		System.out.println("This is initializng the public abstract method in interface I1 class.");
	}
	
	public void normalDefaultMethod() {
		System.out.println("This is normal default method inside interface I1");
	}

	
	
}
