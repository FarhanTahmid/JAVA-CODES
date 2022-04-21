import java.util.Scanner;

public class StudentInfo {
	private String name= "";
	private long studentID;
	private String fathersName="";
	private String mothersName="";
	private String address="";
	private String mailAddress="";
	private String birthdate="";
	private String bloodGroup="";
	private String gender="";
	private long mobileNumber;
	private String semesterNumber="";
	private double cgpa;
	private String DegreeName="";
	private float passedCredit;
	private String currentStatus="";
	
	
	private String[]courseName;
	
	Scanner input=new Scanner(System.in);
	
	
	void setInfo() {
		System.out.println("Enter the name of the student:");name+=input.nextLine();
		System.out.println("Enter Student ID number: ");studentID=input.nextLong();input.nextLine();
		System.out.println("Enter Fathers name:");fathersName+=input.nextLine();
		System.out.println("Enter Mothers name:");mothersName+=input.nextLine();
		System.out.println("Enter mail Adress: ");mailAddress+=input.nextLine();
		System.out.println("Enter present address of the student: ");address+=input.nextLine();
		System.out.println("Enter Gender of the student: ");gender+=input.nextLine();
		System.out.println("Enter contact number of the student: ");mobileNumber=input.nextLong();input.nextLine();
		System.out.println("Enter the birthdate of the student: ");birthdate+=input.nextLine();
		System.out.println("Enter the bloodgroup of the student: ");bloodGroup+=input.nextLine();
		System.out.println("Enter the semester which the student enrolled in: ");semesterNumber+=input.nextLine();
		System.out.println("Enter current CGPA: ");cgpa=input.nextDouble();input.nextLine();
		System.out.println("Enter degree name: ");DegreeName+=input.nextLine();
		System.out.println("Enter students passed credit: ");passedCredit=input.nextFloat();input.nextLine();
		System.out.println("Enter students current status: (Enrolled / Unenrolled) ");currentStatus+=input.nextLine();
		
	}
	
	void getInfoGeneral() {
		System.out.println("\n\nGeneral Information of the student: ");
		System.out.println("Full Name: "+name);
		System.out.println("Student ID: "+studentID);
		System.out.println("E-mail: "+mailAddress);
		System.out.println("Degree of the studnt: "+DegreeName);
		System.out.println("Passed credit: "+passedCredit);
		System.out.println("Current CGPA: "+cgpa);
		System.out.println("Current staus: "+currentStatus);
		System.out.println("Entry semester: "+semesterNumber);
	}
	void getInfoPersonal() {
		System.out.println("\n\nPersonal Informations: ");
		System.out.println("Fathers name: "+fathersName);
		System.out.println("Mothers name: "+mothersName);
		System.out.println("Home Address: "+address);
		System.out.println("Contact number: "+mobileNumber);
		System.out.println("Birthdate: "+birthdate);
		System.out.println("Blood group: "+bloodGroup);
		System.out.println("Gender: "+gender);
	}
	
	
	
}
