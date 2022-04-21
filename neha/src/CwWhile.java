import java.util.Scanner;

public class CwWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountBalance=1000000;
		int withdraw_limit=30000;
		int withdrawAmount, c;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the withdrawal amount: ");
		withdrawAmount=input.nextInt();
		
		System.out.println("Enter the withdrawal number:");
		c=input.nextInt();
		int i=0;
		while(i<c) {
			if(accountBalance>=withdrawAmount && withdrawAmount<=withdraw_limit) 
			{
				accountBalance=accountBalance-withdrawAmount;
				
				System.out.printf("Total withdrawn amount is %d\n",withdrawAmount);
				System.out.printf("The remaining balance is %d taka\n",accountBalance);
				i++;
			}		
			else 
			{
				
				System.out.println("There is not enough balance in the account");
			}
		}

	}

}
