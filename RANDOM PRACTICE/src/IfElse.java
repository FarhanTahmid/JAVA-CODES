import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		number=input.nextInt();
		if(number%2==0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
