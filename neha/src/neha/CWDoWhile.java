package neha;
import java.util.Scanner;
public class CWDoWhile {

public static void main(String[] args) {
		
		int accountBalance=1000000;
		int withdraw_limit=300000;
		int withdrawAmount, c;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the withdrawal amount: ");
		withdrawAmount=input.nextInt();
		
		System.out.println("Enter the withdrawal number:");
		c=input.nextInt();
		int i;
		
		do {
			i=0;
			
			if(accountBalance>=withdrawAmount && withdrawAmount<=withdraw_limit) 
			{
				accountBalance=accountBalance-withdrawAmount;
				System.out.printf("Total withdraw amount is %d.",withdrawAmount).println();
				System.out.printf("The remaining balance is %d taka.\n",accountBalance).println();
				i++;
			}
			
						
			else 
			{
				
				System.out.println("There is not enough balance in the account");
			}
			
		}
		while(i<c);
		

	}


}



