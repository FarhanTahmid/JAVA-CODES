package FileToListToObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;


public class Driver {
	private static Scanner reader;
	public static void main(String[] args) throws FileNotFoundException {
		
		List<Student>studentDataBase=new ArrayList<Student>();
		
		String filepath="Listreaddemofromtext.csv";
		reader =new Scanner(new File(filepath));
		reader.useDelimiter("[,\n]");
		while(reader.hasNext()) {
			String[] studentData=reader.useDelimiter("[,\n]");
		}
		
		}

}
