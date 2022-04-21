import java.util.Scanner;

public class Cw0507Q1 {

	public static void main(String[] args) {
		int n;
		int a=0;
		int b=0;
		int c=1;
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many fibonacci numbers you want to generate: ");
		n=input.nextInt();
		System.out.println("The fibonacci series is: ");
		for(i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.printf(" %d",a);
		}

	}

}
