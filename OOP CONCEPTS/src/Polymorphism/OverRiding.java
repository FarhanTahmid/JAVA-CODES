package Polymorphism;

class OverRiding {
	void show() {
		System.out.println("This is in overriding class");
	}
	public static void main(String[] args) {
		AnotherClass obj1=new AnotherClass();
		obj1.show();
		
	}
	
}
class AnotherClass extends OverRiding{
	
	
	public void show() {           //Access modifiers must be in higher state in child classes than parent classes
		
		super.show();              //using super keyword to invoke method of an overridden class
		OverRiding obj2=new OverRiding();
		obj2.show(); 
		System.out.println("This is in another class");
	}
	
}
