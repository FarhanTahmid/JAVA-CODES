
import java.util.Scanner;

public class StaticVaribale {

	String name;
	int empID;
	static String company="Google";
	StaticVaribale(String name,int id) {
		this.name=name;
		this.empID=id;
	}
	public static String takeName() {
		String name;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of the employee");
		name=input.next();
		return name;
	}
	public static int takeID() {
		int id;
		Scanner input=new Scanner(System.in);
		id=input.nextInt();
		return id;
	}
	void print() {
		System.out.println("The employee name is "+ name+" and ID: "+empID+" and the company name is: "+StaticVaribale.company);
	}
	
	public static void main(String[] args) {
		String name;
		int id;
		name=takeName();
		id=takeID();
		StaticVaribale e1=new StaticVaribale(name,id);
		e1.print();
		name=takeName();
		id=takeID();
		StaticVaribale e2=new StaticVaribale(name, id);
		e2.print();
		
		CounterDemo demo1=new CounterDemo();
		CounterDemo demo2=new CounterDemo();
		CounterDemo demo3=new CounterDemo();
	}

}

class CounterDemo{
	int count1=0;
	static int count2=0;
	CounterDemo(){
		count1++;
		System.out.println("For non static variable the increment of counter variable is: ");
		System.out.println(count1);
		count2++;
		System.out.println("\nFor static variable the increment of counter variable is: ");
		System.out.println(count2);
	}
}
