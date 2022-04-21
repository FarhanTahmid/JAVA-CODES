import java.util.Scanner;


public class Initialization {

	public static void main(String[] args) {
		int[] number1= {5,4,5,3,2,5,6,6};
		System.out.println("The array element in the index 2 is "+number1[2]);	
		int length1=number1.length;
		System.out.println("Element in number 1 are: ");
		for(int i=0;i<length1;i++) {
			System.out.println(number1[i]);
		}
		//sum of array
		int sum=0;
		for(int i=0;i<length1;i++) {
			sum+=number1[i];
		}
		//finding the maximum element
		int max=number1[0];
		for(int i=1;i<length1;i++) {
			if(number1[i]>max) {
				max=number1[i];
			}
		}
		System.out.println("The maximum element in the number 1 array is "+max);
		
		System.out.println("Sum of the array number1 is "+sum);
		//boolean array
		boolean[] testBoolean=new boolean[5];
		System.out.println("Testing the boolean array");
		for(int i=0;i<5;i++) {
			System.out.println(testBoolean[i]);
		}
		//editing boolean element
		System.out.println("Editing boolean array");
		testBoolean[1]=true;
		System.out.println(testBoolean[1]);
		
		//random numbers in arrays
		int[] arrayRand=new int[10];
		for(int i=0;i<10;i++) {
			arrayRand[i]=(int)(Math.random()*10);
		}
		System.out.println("Random values int the arrayRand: ");
		for(int i=0;i<10;i++) {
			System.out.println(arrayRand[i]);
		}
		
		//taking array input
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n=input.nextInt();
		int[] number2=new int[n];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			number2[i]=input.nextInt();
		}
		
		System.out.println("Entered elements in the number 2 array are: ");
		for(int i=0;i<n;i++) {
			System.out.printf("[%d] = %d\n",i,number2[i]);
		}	
	}

}
