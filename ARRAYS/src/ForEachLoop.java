import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] array= new int[10];
		Scanner input=new Scanner(System.in);
		//taking input using for loop
		System.out.println("Enter 10 array elements");
		
		for(int i=0;i<10;i++) {
			array[i]=input.nextInt();
		}
		
		//printing array elements using for each loop
		
		for(int value:array) {
			System.out.printf("%d, ",value);
		}

	}

}
