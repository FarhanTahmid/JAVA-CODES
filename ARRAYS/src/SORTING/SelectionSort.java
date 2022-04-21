package SORTING;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.println("PLease enter the size of the array: ");
		size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Please enter the array elements: ");
		for(int i=0;i<size;i++) {
			System.out.printf("[%d]: ",i);
			array[i]=input.nextInt();
		}
		System.out.println("Before sorting the array is: ");
		for(int i=0;i<size;i++) {
			System.out.printf("%d, ",array[i]);
		}
		
		for(int i=0;i<size-1;i++) {
			int iMin=i;   //initializing the position of the minimum value
			for(int j=i+1;j<size;j++) {
				if(array[j]<array[iMin]) {  //comparing minimum value
					iMin=j;                 //if min value is found, changing the index
				}
			}
			int temp=array[i];
			array[i]=array[iMin];
			array[iMin]=temp;
		}
		System.out.println("\nAfter sorting the array is: ");
		for(int i=0;i<size;i++) {
			System.out.printf("%d, ",array[i]);
		}
		
	}

}
