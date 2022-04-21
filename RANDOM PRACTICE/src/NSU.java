import java.util.Scanner;

public class NSU {

	public static void ECE(String[]gender,String[]names,int[] marks) {
		int i=0;
		int sum=0;
		double average=0;
		int count=0;
		for(i=0;i<4;i++) {
			if(gender[i].matches("female")&& marks[i]%2==0) {
					sum+=marks[i];
					count++;
			}
			if(gender[i].matches("male")&& marks[i]%2!=0) {
				System.out.printf("Name of the student is %s and marks is odd and gender is %s\n",names[i],gender[i]);
			}
		}
		System.out.printf("Sum of the female students' mark is %d and average is %f",sum,((double)sum/(double)count));
	}
	public static void main(String[] args) {
		String[] name=new String[4];
		String[] gender=new String[4];
		int[] marks=new int[4];
		Scanner input=new Scanner(System.in);
		int i=0;
		for(i=0;i<4;i++) {
			System.out.println("Enter student"+i+" name");
			name[i]=input.next();
			name[i].toLowerCase();
			
			System.out.println("Enter student"+i+" gender");
			gender[i]=input.next();
			
			System.out.println("Enter student"+i+" marks");
			marks[i]=input.nextInt();
		}
		ECE(gender,name,marks);	
		
	}

}
