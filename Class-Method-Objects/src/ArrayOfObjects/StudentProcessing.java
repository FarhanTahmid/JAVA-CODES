package ArrayOfObjects;

public class StudentProcessing {
	private String name;
	private int age;
	StudentProcessing(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void getStudentInfo() {
		System.out.println("This is "+name+" and his age is "+age);
	}
}
