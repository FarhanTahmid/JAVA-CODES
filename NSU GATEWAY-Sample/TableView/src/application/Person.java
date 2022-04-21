package application;




public class Person {
	private String firstName,lastName;
	//private String completedCredit;
	
	public Person(String firstName,String LastName) {
		//this.completedCredit=new String(completedCredit);
		this.firstName=new String(firstName);
		this.lastName=new String(LastName);
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
