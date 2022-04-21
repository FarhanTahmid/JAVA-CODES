package ListToObject;

import java.time.LocalDate;


public class Student {
	private String firstName,lastName;
	private LocalDate birthday;
	
	public Student(String firstName,String LastName,LocalDate birthday) {
		this.birthday=birthday;
		this.firstName=new String(firstName);
		this.lastName=new String(LastName);
	}
	
	
	public void setBirthDay(LocalDate birthDay) {
		this.birthday = birthDay;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return firstName +" "+ lastName +" "+ birthday;
	}
	/*public void setFirstName(String firstName) {
		this.firstName.set(firstName); 
		}
	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	public LocalDate getBirthDay() {
		return birthday;
	}
	public String getFirstName() {
		return firstName.get();
	}
	public String getLastName() {
		return lastName.get();
	}*/
	
}
