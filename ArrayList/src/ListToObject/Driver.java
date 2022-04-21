package ListToObject;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;



public class Driver{
	
	public static void main(String[] args) {
		final ArrayList<Student> people= new ArrayList<Student>();
		
		Student a = new Student("Farhan", "Tahmid", LocalDate.of(1915, Month.MARCH, 12));
		Student b = new Student("Nijhum", "Tanha", LocalDate.of(1915, Month.MARCH, 12));
		
		people.add(a);
		people.add(b);
		
		for(int i=0; i<people.size(); i++) {
			System.out.println(people.get(i).toString());
		}
		System.out.println(people.get(0));
		
	}
}
