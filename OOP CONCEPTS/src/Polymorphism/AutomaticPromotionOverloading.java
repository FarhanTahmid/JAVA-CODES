package Polymorphism;

public class AutomaticPromotionOverloading {
	void show(int a) {
		System.out.println("This is int method.");
		System.out.println("Value of A: ");
		System.out.println(a);
	}
	void show(String a) {
		System.out.println("This is the string method");
	}
	void show(int a,double b) {
		System.out.println("Int double method");
	}
	void show(double a,int b) {
		System.out.println("Double int method");
	}
	
	void show(String a,int b) {
		System.out.println("String int method");
	}
	
	//varArgs method
	
	void show(int... a) {
		System.out.println("VarArgs method");
	}
	
	
	public static void main(String[] args) {
		AutomaticPromotionOverloading obj1=new AutomaticPromotionOverloading();
		obj1.show('a');        /*here, a character is passed as parameter but it invokes the integer method because of 
							   automatic promotion as there is no method defined for character */
		obj1.show(4.55, 6);
		obj1.show(6,4.55);
		//obj1.show(6,6);		/*Here, this is ambiguous overloading because there are multiple parameters of same type.
								/*so, the arguments are same and thus, compiler gets confused */
		
		obj1.show("65", 70);
		
		//invoking varArgs method
		obj1.show(1,2,2,3,4,5,6,76);
		obj1.show();
		
		
	}
	
	
}
