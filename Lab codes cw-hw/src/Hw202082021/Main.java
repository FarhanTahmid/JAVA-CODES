package Hw202082021;

public class Main {

	public static void main(String[] args) {
		Faculty faculty1=new Faculty();
		faculty1.setValuePerson();
		faculty1.setValueEmployee();
		faculty1.setValueFaculty();
		System.out.println("\n\nName: "+faculty1.getName());
		System.out.println("Age : "+faculty1.getAge());
		System.out.println("Gender: "+faculty1.getGender());
		System.out.println("ID: "+faculty1.getId());
		System.out.println("Department: "+faculty1.getDepartment());
		System.out.println("Salary: "+faculty1.getSalary());
		System.out.println(faculty1.toString());
		
	}
}
