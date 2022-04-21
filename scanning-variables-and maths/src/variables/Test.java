package variables;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Object circle1=new Circle();
		Object circle2=new Circle();
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		System.out.println(circle1.equals(circle2));
		String filepath="src//nowshin.txt";
		File file =new File(filepath);
		PrintWriter writer=new PrintWriter(file);
		writer.append("Nowshin");
	}
	

}
