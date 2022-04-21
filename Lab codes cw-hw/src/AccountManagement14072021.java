/*FARHAN ISHRAK TAHMID
 * 2031458642
 * CSE215-SECTION: 04
 * LAB INSTRUCTOR: MONAMY ISLAM
 */



public class AccountManagement14072021 {
	String name;
	int balance;
	static int accountNumber=2010;
	AccountManagement14072021(String name,int balance) {
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
