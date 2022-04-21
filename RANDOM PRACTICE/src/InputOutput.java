import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer number here: ");
		int number1=input.nextInt();
		System.out.println("Enter a double number here: ");
		double number2= input.nextDouble();
		input.nextLine();
		System.out.println("Enter a word here: ");
		String word= input.nextLine();
		System.out.println("Enter a sentence here: ");
		String sentence=input.next();
		
		System.out.println("The entered number is "+number1);
		System.out.println("The entered doubole number is "+number2);
		System.out.println("The entered word is "+word);
		System.out.println("The entered sentence is "+sentence);
	}

}
