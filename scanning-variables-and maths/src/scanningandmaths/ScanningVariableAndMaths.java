import java.util.*;

public class ScanningVariableAndMaths {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("Enter name");
			String student_name = input.nextLine();
			System.out.println("Enter id:");
			long ID = input.nextLong();
			System.out.println("Enter course code");
			int course_code = input.nextInt();
			System.out.println("Enter CGPA");
			double cgpa = input.nextDouble();
			System.out.println(student_name +   ID +  course_code + cgpa);
	}
}