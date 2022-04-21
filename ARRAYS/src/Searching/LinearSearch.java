package Searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size;
		System.out.println("Please enter the size of the array: ");
		size=input.nextInt();
		int[]array =new int [size];
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<size;i++) {
			System.out.printf("Enter [%d]: ",i);
			array[i]=input.nextInt();
		}
		
		System.out.println("Elements in the array are: ");
		for(int i=0;i<size;i++) {
			System.out.printf("%d, ",array[i]);
		}
		
		//linear search
		
		int number;
		int flag=0;
		int index=0;
		System.out.println("\nEnter the number you want to search in the array: ");
		number=input.nextInt();
		for(int i=0;i<size;i++) {
			if(number==array[i]) {
				flag=1;
				index=i;
				break;
			}
		}
		if(flag==1) {
			System.out.println(number+ " is present in the array at index "+index);
		}
		else {
			System.out.println("The number "+number+" is not present inside the array.");
		}
	}

}
