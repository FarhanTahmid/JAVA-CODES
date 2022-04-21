package RifatMid;

public class Driver {

	public static void main(String[] args) {
		Employee obj1=new Employee(203422133);
		Salary obj2=new Salary(210000);
		System.out.println(obj1.toStringParent()+obj1.toString()+obj2.toString());
		System.out.println(obj1.facultyType());

	}

}
