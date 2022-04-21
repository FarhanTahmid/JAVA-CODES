package neha;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,6,7,8};
		int length=array.length;
		System.out.println(length);
		int[] array2= new int[3];
		array2[0]=5;
		array2[1]=15;
		array2[2]=100;
		Scanner input=new Scanner(System.in);
		int i;
		int[] array3= new int[10];
		for(i=0;i<10;i++) {
			System.out.printf("Enter [%d]: ",i);
			array3[i]=input.nextInt();
		}
		
		for(i=0;i<10;i++) {
			System.out.printf("%d, ",array3[i]);
		}
		
	}

}
