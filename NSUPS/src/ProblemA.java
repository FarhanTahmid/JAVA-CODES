import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner numberScan=new Scanner(System.in);
		int x=input.nextInt();
		int[]arr=new int[x];
		if(x>=3 && x<=1000) {
			String[] str=numberScan.nextLine().split(" ");
			
			for(int i=0;i<str.length;i++) {
				arr[i]=Integer.parseInt(str[i]);
			}
			int index1 = 0;
			int index2 = 0;
			int flagOdd=0;
			int flagEven=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					flagOdd++;
					index1=i;
				}
				
				else {
					flagEven++;
					index2=i;
				}
				
			}
			if(flagEven<flagOdd) {
				System.out.println(index2+1);
			}
			else if (flagOdd<flagEven) {
				System.out.println(index1+1);
			}
		}
				
	}

}
