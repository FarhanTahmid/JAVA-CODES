import java.util.Scanner;

public class Nowshin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student no.1's details:");
		System.out.println("Enter name:");
		String name1=input.nextLine();
		System.out.println("Enter student id:");
		long id1=input.nextLong();
		System.out.println("Enter section number:");
		int section1=input.nextInt();
		System.out.println("Enter students cgpa:");
		double cgpa1=input.nextDouble();
		System.out.println("Enter course code:");
		int courseCode=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter student no.2's details:");
		System.out.println("Enter name:");
		String name2=input.nextLine();
		System.out.println("Enter student id:");
		long id2=input.nextLong();
		System.out.println("Enter section number:");
		int section2=input.nextInt();
		System.out.println("Enter students cgpa:");
		double cgpa2=input.nextDouble();
		System.out.println("Student Name: "+name2);
		System.out.println("ID: "+id2);
		System.out.println("Section: "+section2);
		System.out.println("CGPA: "+cgpa2);
		System.out.println("Course code: "+courseCode);
		input.nextLine();
		
		System.out.println("Enter student no.3's details:");
		System.out.println("Enter name:");
		String name3=input.nextLine();
		System.out.println("Enter student id:");
		long id3=input.nextLong();
		System.out.println("Enter section number:");
		int section3=input.nextInt();
		System.out.println("Enter students cgpa:");
		double cgpa3=input.nextDouble();
		input.nextLine();
		
		System.out.println("Student Name: "+name1);
		System.out.println("ID: "+id1);
		System.out.println("Section: "+section1);
		System.out.println("CGPA: "+cgpa1);
		System.out.println("Course code: "+courseCode);
		
		System.out.println("Student Name: "+name2);
		System.out.println("ID: "+id2);
		System.out.println("Section: "+section2);
		System.out.println("CGPA: "+cgpa2);
		System.out.println("Course code: "+courseCode);
		
		System.out.println("Student Name: "+name3);
		System.out.println("ID: "+id3);
		System.out.println("Section: "+section3);
		System.out.println("CGPA: "+cgpa3);
		System.out.println("Course code: "+courseCode);
		
		
		System.out.printf("Sum of the CGPA's is %f",cgpa1+cgpa2+cgpa3);
		System.out.printf("Average of the CGPA's is %f",(cgpa1+cgpa2+cgpa3)/3);
		
		
	}		

}
