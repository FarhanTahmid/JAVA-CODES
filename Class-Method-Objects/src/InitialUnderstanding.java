import java.awt.Color;
import java.util.Scanner;

public class InitialUnderstanding {
	
	//declaring a global value to initialize an object;
	String color;
	int age;
	
	//initializing an object using method
	public void initializingObj(String c, int a) {
		color=c;
		age=a;
	}
	public void eat() {
		System.out.println("I am eating!");
	}
	public void run() {
		System.out.println("Lets run faster!");
	}
	public static void main(String[] args) {
		
		InitialUnderstanding farhan=new InitialUnderstanding(); //creating an object
		farhan.eat();  //calling method using object
		farhan.run();
		
		InitialUnderstanding nandini=new InitialUnderstanding(); //creating another object for same class
		nandini.run();
		
		Birds nijhum=new Birds();
		nijhum.travel();  //can't create same variable object for different classes..so instead of farhan taking nijhum
		
		//initializing an object with the global variables declared:
		farhan.age=20;
		farhan.color="black";
		System.out.println("Farhan's age is "+farhan.age+" and his body color is "+farhan.color);
		
		InitialUnderstanding neha=new InitialUnderstanding();
		neha.initializingObj("White", 22);
		System.out.println("Neha's age is "+neha.age+" and her body color is "+neha.color);
		
		//initializing an object by using constructor
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first employees name and id: ");
		Employee e1=new Employee(input.next(), input.nextInt());
		System.out.println("Enter second employees name and id: ");
		Employee e2=new Employee(input.next(), input.nextInt());
		System.out.println("Employee number 1 is: "+e1.name+" and his ID is "+e1.empID);
		System.out.println("Employee number 1 is: "+e2.name+" and his ID is "+e2.empID);
	}
	

}
class Birds{
	public void travel() {
		System.out.println("I am travelling to Canada.");
	}
}

class Employee{
	String name;
	int empID;
	Employee(String s,int id) {
		this.name=s;
		this.empID=id;
	}
}