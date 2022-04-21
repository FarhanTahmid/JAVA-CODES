package variables;

import java.util.Scanner;

public class VariableTry {
	static String s;
	public static void main(String[] args) {
		int score;
		int highestScore=0;
		int studentNumber;
		String name;
		String highestName="";
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number of students: ");
		studentNumber=input.nextInt();
		int i;
		for(i=0;i<studentNumber;i++) {
			System.out.printf("Enter the student %d's name "
					+ "and score:",i++);
			name=input.nextLine();
			input.nextLine();
			score=input.nextInt();
			if(score>highestScore) {
				highestName=name;
				highestScore=score;
				
			}
		}
		String f="FArhan";
		s=f;
		System.out.println(s);
		System.out.printf("The student with the highest score is %s and the score is %d",highestName,highestScore);
	}

}
