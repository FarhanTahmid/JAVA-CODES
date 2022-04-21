import java.util.Scanner;
public class Nowshin02 {
	

	public int [] Mini() {
			
		int arr[]=new int[3];
		Scanner input = new Scanner(System.in);
			
		for(int count=0;count<arr.length;count++) {
			System.out.printf("Enter [%d]",count);
			arr[count]= input.nextInt();
			}
			
			
		int mini=arr[0];
		for(int count=0;count<arr.length;count++) {
			if(mini>arr[count]){
				mini=arr[count];
			}
		    
		}
		System.out.println("The minimum number is: "+mini);
		return arr;		
	}	
			
}
