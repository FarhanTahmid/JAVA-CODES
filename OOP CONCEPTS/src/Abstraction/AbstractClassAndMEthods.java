package Abstraction;

public class AbstractClassAndMEthods {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.start("Car");
		Scooter s1=new Scooter();
		s1.start("Scooter");
		System.out.println("Car starts in "+c1.time(5)+" seconds time.");
		System.out.println("Scooter starts in "+s1.time(10)+" seconds time.");
	}

}
abstract class Vehicle{
	abstract void start(String a);
	abstract int time(int b);
}
class Car extends Vehicle{
	void start(String a) {
		System.out.printf("%s Starts with key\n",a);
	}
	int time(int t) {								//every method in abstract classes must be overridden in child classes
		return t;
	}
}
class Scooter extends Vehicle{
	void start(String b) {
		System.out.printf("%s Starts with kick.\n",b);
	}
	int time(int t) {
		return t;
	}
}
