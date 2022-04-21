import java.util.Scanner;

public class Hw4Q2 {
	
	public static boolean isPalindrome(String arg) {
		
		arg=arg.toUpperCase();
		int length=arg.length();
		int i=0;
		int j=length-1;
		while(i<j) {
			if(arg.charAt(i)!=arg.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string to check whether it is palindrome or not: ");
		String str=input.nextLine();
		input.close();
		if(isPalindrome(str)==true) {
			System.out.println(str.toUpperCase()+" is palindrome.");
		}
		else {
			System.out.println(str.toUpperCase()+" is not palindrome.");
		}
	}

}
