import java.util.Scanner;

public class CompareToMethod {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1=input.next();
		System.out.println("Enter second string: ");
		String s2=input.next();
		if(s1.compareTo(s2)>0) {
			System.out.printf("%s is greater than %s",s1,s2);
		}
		else if(s1.compareTo(s2)<0){
			System.out.printf("%s is smaller than %s",s1,s2);
		}
		else if(s1.compareTo(s2)==0){
			System.out.println("Both string are equal");
		}
	}

}