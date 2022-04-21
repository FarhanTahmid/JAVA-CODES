/*FARHAN ISHRAK TAHMID
 * 2031458642
 * CSE215-SECTION: 04
 * LAB INSTRUCTOR: MONAMY ISLAM
 */




import java.util.Scanner;

import Cw14072021.AccountManagement;

public class DriverClass14072021 {
	public static void main(String[] args) {
		System.out.println("Enter three Account holders detailse here: ");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your First name and how much money you want to deposit in your account: ");
		AccountManagement14072021 holder1=new AccountManagement14072021(input.next(), input.nextInt());
		holder1.displayStatusofAccount();
		AccountManagement14072021.accountNumber++;	
		
		System.out.println("Enter your First name and how much money you want to deposit in your account: ");
		AccountManagement14072021 holder2=new AccountManagement14072021(input.next(), input.nextInt());
		holder2.displayStatusofAccount();
		AccountManagement14072021.accountNumber++;
		
		System.out.println("Enter your First name and how much money you want to deposit in your account: ");
		AccountManagement14072021 holder3=new AccountManagement14072021(input.next(), input.nextInt());
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
