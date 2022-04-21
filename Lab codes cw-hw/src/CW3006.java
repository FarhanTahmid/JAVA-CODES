import java.util.Scanner;

public class CW3006 {
	static int checkMinimumBalanceMethod(int WithdrawBalance){
		int minbalance=5000;
		if(WithdrawBalance>minbalance) {
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	static int withdrawAmount(int amount,int accountBalance) {
		int newbalance;
		
		if(checkMinimumBalanceMethod(amount)==1) {
				newbalance=accountBalance-amount;
				System.out.println("Entered amount for withdrawal is "+amount);
				return newbalance;
			}
			else {
				
				return 0;
			}
	}
	
	public static void main(String[] args) {
		
		int withdrawalAmount;
		int balance=34000000;
		int newBalance;
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the amount you want to withdraw: ");
		withdrawalAmount=input.nextInt();
			
		newBalance=withdrawAmount(withdrawalAmount, balance);
		balance=newBalance;
		System.out.println("The amount "+withdrawalAmount + " taka has been withdrawed from your account.");
		System.out.println("New balance is "+newBalance+" taka.\n");
	
		
	}
}
