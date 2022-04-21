import java.util.Scanner;

public class Hw2Task1 {
	public static void main(String[] args) {
		Scanner tahmid=new Scanner(System.in);
		System.out.println("Enter three integer numbers: ");
		int num1=tahmid.nextInt();
		int num2=tahmid.nextInt();
		int num3=tahmid.nextInt();
		int sum=num1+num2+num3;
		System.out.println("Summation of "+num1+", "+num2+", "+num3+" is: "+sum );
		
		System.out.println("Enter three floating point numbers: ");
		float a=tahmid.nextFloat();
		float b=tahmid.nextFloat();
		float c=tahmid.nextFloat();
		float sum2=a+b+c;
		System.out.printf("Summation of %.7f, %.7f, %.7f is : %.7f",a,b,c,sum2);
	}
}


