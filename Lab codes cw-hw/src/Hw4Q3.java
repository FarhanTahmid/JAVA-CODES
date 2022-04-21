import java.util.Scanner;

public class Hw4Q3 {
	private static double balance=0;
	
	public static double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	public static double withdraw(double amount) {
		balance-=amount;
		return balance;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to your bank\n ");
		int options;
		Scanner input=new Scanner(System.in);
		double depositAmount,withdrawAmount;
		double d,w,b;
		int anothertransaction=1;
		
		
		while(anothertransaction==1) {
			System.out.println("\nMENU:\n1.Deposit\n2.Withdraw\n3.Balance\n4.Exit");
			System.out.println("\nEnter option you want to select: ");
			options=input.nextInt();
			switch(options) {
			case 1:
				System.out.println("\nEnter how much money you want to deposit in your account: ");
				depositAmount=input.nextDouble();
				
				deposit(depositAmount);	
				System.out.println(depositAmount+" has been depositted in your account");
				System.out.println("Your new balance is "+ Hw4Q3.balance);
				break;
			
			case 2:
				System.out.println("\nEnter how much money you want to withdraw from your account: ");
				withdrawAmount=input.nextDouble();
				if(withdrawAmount<=balance) {
					withdraw(withdrawAmount);
					System.out.println(withdrawAmount+" has been withdrawn from your account.");
					System.out.println("Your new balance is "+Hw4Q3.balance);
				}
				else {
					System.out.println("Withdrawal amount is bigger than your current balance.");
					System.out.println("Your current balance is "+Hw4Q3.balance);
				}
				
				break;
			case 3:
				System.out.println("\nYour current balance is "+Hw4Q3.balance);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input. Try again.");
			}
			System.out.println("Do you want to do another transaction? If yes press 1.");
			anothertransaction=input.nextInt();
		}
		
	}

}
