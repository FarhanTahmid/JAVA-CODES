import java.util.Scanner;

public class Zihad {

	static double calculator(int x,int y) {
		
		double degree1=53.0;
		double degree2=45.0;
		double radians1=Math.toRadians(degree1);
		double radians2=Math.toRadians(degree2);
		double result=(Math.pow(53,Math.pow(53,0.5))/Math.cos(radians1)) * ((x)/(Math.pow(Math.sin(radians2),Math.cos(radians2))) *(y));
			
		return result;
	}

	
	public static void main(String[] args) {
		
		int x; 
		int y;
		int[]x1=new int[10];
		int[]y1=new int[10];
		double[]answer1=new double[10];
		
		Scanner input =new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter X:");
			x=input.nextInt();
			System.out.println("Enter Y:");
			y=input.nextInt();
			double answer=calculator(x, y);
			x1[i]=x;
			y1[i]=y;
			answer1[i]=answer;
		}
		System.out.println(" X  | Y  | Value");
		System.out.println("====================");
		for(int i=0;i<3;i++) {
			System.out.printf(" %d  | %d  | %.2e\n",x1[i],y1[i],answer1[i]);
			System.out.println("----------------------");
		}
		
	}

}
