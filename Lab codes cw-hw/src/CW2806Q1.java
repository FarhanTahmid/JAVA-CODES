import java.util.Scanner;

public class CW2806Q1 {

	public static void main(String[] args) {
		int accountBalance=1000000;
		int withdraw_limit=30000;
		int withdrawAmount,counter;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to withdraw: ");
		withdrawAmount=input.nextInt();
		
		System.out.println("Enter how many times you want to withdraw: ");
		counter=input.nextInt();
		int i=0;
		do {
			if(accountBalance>=withdrawAmount && withdrawAmount<=withdraw_limit) {
				accountBalance-=withdrawAmount;
				System.out.printf("Total %d taka has been withdrawn from this account.",withdrawAmount).println();
				System.out.printf("Remaining balance in the account is %d taka.\n",accountBalance).println();
				i++;
			}
			else if(withdrawAmount>withdraw_limit) {
				System.out.println("The ammount is larger than the withdraw limit.");
			}
			else {
				System.out.println("There is not enough balance in the account");
			}
		}while(i<counter);
		

	}

}
