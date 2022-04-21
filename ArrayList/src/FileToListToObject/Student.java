package FileToListToObject;

public class Student {
	public String objectID;
	public String objectName;
	public String objectCredits;
	
	public Student(String ID,String name,String credits) {
		this.objectID=ID;
		this.objectName=name;
		this.objectCredits=credits;
	}
	
	
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}
	public void setObjectCredits(String objectCredits) {
		this.objectCredits = objectCredits;
	}
	public String getObjectCredits() {
		return objectCredits;
	}
	public String getObjectID() {
		return objectID;
	}
	public String getObjectName() {
		return objectName;
	}
}
