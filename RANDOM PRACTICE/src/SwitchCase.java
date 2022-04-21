import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		String month;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 12: ");
		month=input.next();
		switch (month) {
		case "a": {
			
			System.out.println("January");
			break;
		}
		case "b":{
			System.out.println("February");
			break;
		}
		case "c":{
			System.out.println("March");
			break;
		}
		default:{
			System.out.println("Enter value between 1 to 12");
		}
		}
	}

}
