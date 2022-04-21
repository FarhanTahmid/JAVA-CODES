package MultiDimensionalArray;

import java.util.Scanner;

public class InitializationAndDeclaration {

	public static void main(String[] args) {
		int rowsize,colsize;
		System.out.println("Enter the size of the row: ");
		Scanner input=new Scanner(System.in);
		rowsize=input.nextInt();
		System.out.println("Enter the size of the column: ");
		colsize=input.nextInt();
		int[][] array=new int[rowsize][colsize];
		
		int row,column;
		//scanning araay6 elements
		for(row=0;row<rowsize;row++) {
			for(column=0;column<colsize;column++) {
				System.out.printf("Enter [%d][%d]: ",row,column);
				array[row][column]=input.nextInt();
			}
		}
		for(row=0;row<rowsize;row++) {
			for(column=0;column<colsize;column++) {
				System.out.printf("%d ",array[row][column]);
			}
			System.out.println();
		}
		//sum of all elements
		int sumAll=0;
	
		for(row=0;row<rowsize;row++) {
			for(column=0;column<colsize;column++) {
				sumAll+=array[row][column];
			}
		}
		System.out.println("Sum of all elements in the array: "+sumAll);
		
		//sum of columns
		int columnSum=0;
		for(column=0;column<colsize;column++) {
			for(row=0;row<rowsize;row++) {
				columnSum+=array[row][column];
			}
			
		}
		System.out.println("Sum of columns is: "+columnSum);
		
			
	}

}
