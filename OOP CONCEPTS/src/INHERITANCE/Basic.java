package INHERITANCE;

class Animal {
	public static void main(String[] args) {
		Basic b1=new Basic();
		b1.eat();
	}
	
}
public class Basic extends Animal{
	void eat() {
		System.out.println("I am eating");
		
	}
}

