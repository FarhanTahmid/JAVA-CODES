import java.util.Scanner;

public class ShufflingAnArray {

	public static void main(String[] args) {
		int size;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size=input.nextInt();

		int i;
		
		int[] array1=new int[10];
		
		System.out.println("Enter the array elements: ");
		for(i=0;i<size;i++) {
			System.out.printf("[%d]= ",i);
			array1[i]=input.nextInt();
		}
		System.out.println("Entered array elements in the ARRAY are: ");
		for(i=0;i<size;i++) {
			System.out.printf("[%d]= %d\n", i,array1[i]);
		}
		
		//shuffling array elements
		
		for(i=0;i<size;i++) {
			int index=(int)(Math.random()*size);
			int temp=array1[i];
			array1[i]=array1[index];
			array1[index]=temp;
		}
		System.out.println("After shuffling the array elements are: ");
		for(i=0;i<size;i++) {
			System.out.printf("[%d]= %d\n", i,array1[i]);
		}
		
	}

}
