package MidTermExam;

import java.util.Scanner;

public class AccountHolder extends Account{
	public AccountHolder(String name,int age) {
		super(name,age);
	}
	
	Scanner input=new Scanner(System.in);
	public void deposit() {
		System.out.println("Enter how much money you want to deposit");
		double deposit=input.nextDouble();
		super.balance+=deposit;
	}
	public void withdraw() {
		System.out.println("Enter how much money you want to withdraw");
		double withdraw=input.nextDouble();
		if(withdraw<super.balance) {
			super.balance-=withdraw;
		}
		else {
			System.out.println("Not enough money");
		}
	}
	public static void main(String[] args) {
		AccountHolder account1=new AccountHolder("Farhan", 20);
		account1.deposit();
		account1.withdraw();
		account1.printAll();
	
	}
	

}
