package SORTING;

import java.util.Scanner;

public class BubbleSort {

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
		
		//bubble sort algorithm
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter sorting the array is: ");
		for(int i=0;i<size;i++) {
			System.out.printf("%d, ",array[i]);
		}
	
	}

}
