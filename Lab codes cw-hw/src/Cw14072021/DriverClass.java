/*
 * FARHAN ISHRAK TAHMID
 * 2031458642
 * CSE214, SECTION: 4
 * LAB INSTRUCTOR: MONAMY ISLAM
 */



package Cw14072021;

import java.util.Scanner;

public class DriverClass{
	public static void main(String[] args) {
		System.out.println("Enter three Account holders detailse here: ");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your First name and how much money you want to deposit in your account: ");
		AccountManagement holder1=new AccountManagement(input.next(), input.nextInt());
		holder1.displayStatusofAccount();
		AccountManagement.accountNumber++;	
		
		System.out.println("Enter your First name and how much money you want to deposit in your account: ");
		AccountManagement holder2=new AccountManagement(input.next(), input.nextInt());
		holder2.displayStatusofAccount();
		AccountManagement.accountNumber++;
		
		System.out.println("Enter your First name and how much money you want to deposit in your account: ");
		AccountManagement holder3=new AccountManagement(input.next(), input.nextInt());
		holder3.displayStatusofAccount();
		
		if(holder1.loanAligibilty(holder1.balance)) {
			System.out.println(holder1.name+" can have the loan program");
		}
		else
			System.out.println(holder1.name+" can not have the loan program as there is not enough balance in the account");
	
		if(holder2.loanAligibilty(holder2.balance)) {
			System.out.println(holder2.name+" can have the loan program");
		}
		else
			System.out.println(holder2.name+" can not have the loan program as there is not enough balance in the account");
		
		if(holder3.loanAligibilty(holder3.balance)) {
			System.out.println(holder3.name+" can have the loan program");
		}
		else
			System.out.println(holder3.name+" can not have the loan program as there is not enough balance in the account");
	}
	
}

