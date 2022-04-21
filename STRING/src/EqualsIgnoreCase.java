import java.util.Scanner;

public class EqualsIgnoreCase {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter first string: ");
			String s1=input.next();
			System.out.println("Enter second string: ");
			String s2=input.next();
			if(s1.equalsIgnoreCase(s2)) {
				System.out.printf("Both are same");
			}
			else { 
				System.out.printf("Both are not same");
			}

	}

}
