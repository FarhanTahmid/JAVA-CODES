import java.util.Scanner;

public class ProblemD {
	
	public static void main(String[] args) {
		
		int[] numbersOfElements=new int[8];
		int n=0,k=0,l=0,c=0,d=0,p=0,nl=0,np=0;
		Scanner input=new Scanner(System.in);
		String elements[]=input.nextLine().split(" ");
		for(int i=0;i<numbersOfElements.length;i++) {
			numbersOfElements[i]=Integer.parseInt(elements[i]);
		}
		n=numbersOfElements[0];
		k=numbersOfElements[1];
		l=numbersOfElements[2];
		c=numbersOfElements[3];
		d=numbersOfElements[4];
		p=numbersOfElements[5];
		nl=numbersOfElements[6];
		np=numbersOfElements[7];
		
		while(n<=1000 && n>=1 && k<=1000 && k>=1 && l<=1000 && l>=1 && c<=1000 && c>=1 && d<=1000 && d>=1 && p<=1000 && p>=1 && nl<=1000 && nl>=1 && np<=1000 && np>=1) {
			int findingMinimumElement[]= { (k*l)/n,(c*d),(p/1)};
			int min=findingMinimumElement[0];
			for(int i=0;i<findingMinimumElement.length;i++) {
				
				if(findingMinimumElement[i]<min) {
					min=findingMinimumElement[i];
				}
			}
			
			int numberOfToasts=(min/n);
			System.out.println(numberOfToasts);
		}
		
	}
}
 