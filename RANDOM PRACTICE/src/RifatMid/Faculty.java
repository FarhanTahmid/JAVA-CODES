package RifatMid;

public class Faculty {
	String facultyName;
	int age;
	String subject;
	int workExperience;
	String facultyType;
	
	public Faculty() {
	}
	
	public Faculty(String facultyName,int age,String subject,int workexperience) {
		this.facultyName=facultyName;
		this.age=age;
		this.subject=subject;
		this.workExperience=workexperience;
	}
	String facultyType() {
		if(workExperience<=10) {
			facultyType="Junior Faculty";
		}
		else if(workExperience>10) {
			facultyType="Senior Faculty";
		}
		return "Faculty Type is: "+facultyType;
	}
	public String toStringParent() {
		return "Name:"+facultyName+"\n"+"Age:"+age+"\n"+"Subject:"+subject+"\n"+"Work experience:"+workExperience+"\n";
	}
}