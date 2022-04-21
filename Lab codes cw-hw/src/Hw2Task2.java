import java.util.Scanner;
public class Hw2Task2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the values of a,b,c,d: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		b = (a/b) + (c-d) + (a%d) + (b*c);
		System.out.printf("Values after evaluating the expression \na= %d\nb= %d\nc= %d\nd= %d",a,b,c,d);
	}
}
