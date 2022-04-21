import java.util.Scanner;

public class Neha {

	public static void main(String[] args) {
		System.out.println("neha magi");
		Scanner input=new Scanner(System.in);
		final double pi=3.1416;
		
		float a=input.nextFloat();
		int b=input.nextInt();
		String str=input.next();
		
		System.out.println("the inputs are: "+a +"\n"+ b +"\n"+ str);
		
		float sum=a+(float)b;
		System.out.println("The sum is "+ sum);

	}

}
