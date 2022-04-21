/*
 * FARHAN ISHRAK TAHMID
 * 2031458642
 * CSE214, SECTION: 4
 * LAB INSTRUCTOR: MONAMY ISLAM
 */


package Cw14072021;

public class AccountManagement {
	String name;
	int balance;
	static int accountNumber=2010;
	public AccountManagement() {
	}
	AccountManagement(String name,int balance) {
		this.name=name;
		this.balance=balance;
	}
	public boolean loanAligibilty(int balance) {
		if(balance>1000000)
			return true;
		else
			return false;
	}
	public void displayStatusofAccount() {
		System.out.println("The name of the account holder is: "+name+"\nAccount number: "+accountNumber+"\nBalance in the account: "+balance);
	}
}
