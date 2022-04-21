import java.util.Scanner;

public class Hw4Q1 {

	public static int countVowel(String args) {
		args=args.toLowerCase();
		int vowelCount=0;
		int length=args.length();
		int i;
		for(i=0;i<length;i++) {
			if(args.charAt(i)=='a'|| args.charAt(i)=='e'|| args.charAt(i)=='i'|| args.charAt(i)=='o'|| args.charAt(i)=='u') {
				vowelCount++;
			}
		}
		return vowelCount;
}
	public static void main(String[] args) {
		String str;
		System.out.println("Please enter a String here: ");
		Scanner input=new Scanner(System.in);
		str=input.next();
		input.next();
		int answer=countVowel(str);
		System.out.println("Total number of vowels in the string is "+answer);
	}

}
