package ArrayOfObjects;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//declaring array of objects
		StudentProcessing[] students=new StudentProcessing[5];
		int i;
		//initializing the objects
		for(i=0;i<5;i++) {
			System.out.println("Please enter Student"+(i+1)+"'s first name and age:");
			students[i]=new StudentProcessing(input.next(), input.nextInt());
			
		}
		for(i=0;i<5;i++) {
			students[i].getStudentInfo();
		}
	}
}
