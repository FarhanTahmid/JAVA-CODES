package SORTING;

import java.util.Scanner;

public class EfficientBubbleSort {
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
		int flag=0;
		//making the bubble sort efficient
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {     //using size-i-1 because we don't need to check the last index all the time cause the last index after first iteration will always be the largest number
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {    //using this because in bubble sort some iteration might be redundant...so if there is no swapping in iterations the loops break out and makes the algo more efficient.
				break;
			}
		}
		System.out.println("After sorting the array is: ");
		for(int i=0;i<size;i++) {
			System.out.printf("%d, ",array[i]);
		}
		
	}
}
