package MidTermExam;

public class Account {
	String name;
	int balance;
	int age;
	public Account(String name,int age){
		this.name=name;
		this.age=age;
		balance=0;
	}
	
	void printAll() {
		System.out.println("The name of the account holder is "+name+" and age is "+age+" and account balance is "+balance);
	}
}
