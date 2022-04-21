import java.util.Scanner;

public class StudentInfo {

		public static void main(String[] args) {
			
			
			
			String name;
			int studentID;
			double cg;
			int n;
			System.out.println("Enter how many numbers of students information you want to enter: ");
			Scanner input=new Scanner(System.in);
			n=input.nextInt();
			Student[] students=new Student[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter student"+i+"'s name: ");
				name=input.next();
				System.out.println("Enter stduent ID: ");
				studentID=input.nextInt();
				System.out.println("Enter cgpa");
				cg=input.nextDouble();
				students[i]=new Student(name,studentID,cg);
				
			}
			for(int i=0;i<n;i++) {
				System.out.println("Highest cgpa is "+Student.Highestmark(Student students[i],n));
			}
					
		}

}