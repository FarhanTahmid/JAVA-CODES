import java.util.Scanner;

public class Cw0507Q2 {

	public static void main(String[] args) {
		int array[][]=new int[3][4];
		Scanner input=new Scanner(System.in);
		int i;
		int j;
		int sum=0;
		System.out.println("Enter the array elements: ");
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				System.out.printf("INPUT: [%d][%d]: ",i,j);
				array[i][j]=input.nextInt();
				sum+=array[i][j];
			}
		}
		System.out.println("The sum of the 2D matrix is "+sum);

	}

}
