import java.util.Scanner;

public class CopyingArrayElements {

	public static void main(String[] args) {
		int size;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the source array: ");
		size=input.nextInt();
		int[] sourceArray=new int[size];
		int[] targetArray=new int[sourceArray.length];
		
		System.out.println("Enter the elements of source array: ");
		for(int i=0;i<sourceArray.length;i++) {
			sourceArray[i]=input.nextInt();
		}
		//copying the elements
		for(int i=0;i<sourceArray.length;i++) {
			targetArray[i]=sourceArray[i];
		}
		System.out.println("Elements in the target array are: ");
		for(int i=0;i<targetArray.length;i++) {
			System.out.printf("%d, ",targetArray[i]);
		}
		
		//copying arrays using function
		int[] anotherTargetArray=new int[sourceArray.length];
		System.arraycopy(sourceArray, 0, anotherTargetArray, 0, sourceArray.length);
		System.out.println("\nElements copied in anotherTargetArray: ");
		for(int i=0;i<anotherTargetArray.length;i++) {
			System.out.printf("%d, ",targetArray[i]);
		}

	}

}
