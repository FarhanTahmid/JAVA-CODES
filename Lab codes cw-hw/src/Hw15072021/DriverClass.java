package Hw15072021;


import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args)throws Exception{
		System.out.println("How many students data you want to entry: ");
		int n;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int i;
		String kind;
		
		StudentClass[] students=new StudentClass[n];
		for(i=0;i<n;i++) {
			System.out.printf("Enter Student[%d]'s student id: \n",i);
			int studentId=input.nextInt();
			
			System.out.println("Enter name:");
			String name=input.next();
			
			System.out.println("Enter class: ");
			int clasS=input.nextInt();
			
			System.out.println("Enter section: ");
			String section=input.next();
			
			System.out.println("Enter birthdate of the student: ");
			String birthdate=input.next();
			
			System.out.println("Under what kind of programe this student is enrolled in? \nIf 'Board' program enter board, if 'undergraduate' programe enter undergraduate and if student is 'postgraduated' then enter postgraduate");
			kind=input.next();
			
			System.out.println("Is this student the captain of the class? Enter 'yes' or 'no'");
			String captainAnswer=input.next();
			
			System.out.println("Is this student a public speaker? Enter 'yes' or 'no'");
			String publicSpeakerAnswer=input.next();
			
			System.out.println("Does this player play football? Enter'yes' or 'no'");
			String footballPlayerAnswer=input.next();
			
			students[i]=new StudentClass(studentId, name, birthdate,clasS,section,kind,captainAnswer, publicSpeakerAnswer, footballPlayerAnswer);
			
		}
		
		for(i=0;i<n;i++) {
			students[i].displayInfo();
			students[i].studentInWhichLevel();
			if(students[i].isCaptainOftheClass()) {
				System.out.println("Captain of the class!");
			}
			else
				System.out.println("Not the captain of the class.");
			if(students[i].publicSpeaker()) {
				System.out.println("This student is a public speaker.");
			}
			else
				System.out.println("No, this student is not a public speaker.");
			if(students[i].playsFootball()) {
				System.out.println("This student plays football:");
			}
			else {
				System.out.println("This student does not play football.");
			}
			students[i].studientEligibleForVaccine();
			
		}
	}
}


