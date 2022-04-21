package Hw15072021;

import java.util.Date;
import java.text.SimpleDateFormat;
public class StudentClass {
	int studentID;
	String name;
	String birthday;
	static String collegeName;
	int clasS;	
	String section;
	String captainAnswer;
	String publicSpeakerAnswer;
	String footballPlayerAnswer;
	String kind;
	
	StudentClass(int studentID,String name,String birthday,int clasS,String section,String kind,String captainAnswer,String publicSpeakerAnswer,String footballPlayerAnswer){
		this.studentID=studentID;
		this.name=name;
		this.birthday=birthday;
		this.clasS=clasS;
		this.section=section;
		this.captainAnswer=captainAnswer;
		this.publicSpeakerAnswer=publicSpeakerAnswer;
		this.footballPlayerAnswer=footballPlayerAnswer;
		this.kind=kind;
	}
	
	public void studientEligibleForVaccine()throws Exception{
		Date bdate=new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
		long bdatemillis=bdate.getTime();
		
		Date currentDate=new Date();
		long currentDateMillis=currentDate.getTime();
		
		if((currentDateMillis-bdatemillis)>18) {
			System.out.println("Student is eligible for vaccine.");
		}
		else {
			System.out.println("Student is not eligible for vaccine.");
		}
		
	}
	public void studentInWhichLevel(){
		if(kind.matches("Board")||kind.matches("board")) {
			for(int i=1;i<=8;i++) {
				if(clasS==i) {
					System.out.println("Student is in Primary level");
				}
			}
			if(clasS==9 ||clasS==10) {
				System.out.println("Student is in secondary level");
			}
			if(clasS==11 ||clasS==12) {
				System.out.println("Student is in Higher Secondary level.");
			}
		}
		else if(kind.matches("Undergraduate")||kind.matches("undergraduate")) {
			System.out.println("Student is enrolled in under graduation program.");
		}
		else {
			System.out.println("Post graduated student.");
		}
		
		
	}
	public boolean playsFootball() {
		if(footballPlayerAnswer.matches("Yes")||footballPlayerAnswer.matches("yes")) {
			return true;
		}
		else if(footballPlayerAnswer.matches("No")||footballPlayerAnswer.matches("no")) {
			return false;
		}
		return false;
		
	}
	public boolean publicSpeaker() {
		if(publicSpeakerAnswer.matches("Yes")||publicSpeakerAnswer.matches("yes")) {
			return true;
		}
		else if(publicSpeakerAnswer.matches("No")||publicSpeakerAnswer.matches("no")) {
			return false;
		}
		return false;
	}
	public boolean isCaptainOftheClass() {
		if(captainAnswer.matches("Yes")||captainAnswer.matches("yes")) {
			return true;
		}
		else if(captainAnswer.matches("No")||captainAnswer.matches("no")) {
			return false;
		}
		return false;
	}
	
	public void displayInfo() {
		System.out.printf("\nWhole info about the student: \nNAME: %s\nID: %d\nCLASS: %d\nSECTION: %s\nBIRTHDATE: %s\n",name,studentID,clasS,section,birthday);
	}
	
}
