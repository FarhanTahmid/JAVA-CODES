import java.io.File;
import java.io.FileWriter;

public class WritingIntoAFile {

	public static void main(String[] args) {
		
		try {
			FileWriter file=new FileWriter("G:\\CODES\\JAVA\\File Handling\\WritingFile.txt");
			try {
				file.write("Farhan is the boss");
				file.write("\nNowshin");
			}
			finally {
				file.close();
			}
			System.out.println("File written successfully");
		} catch (Exception e) {
			System.out.println("Sorry file can't be created");
		}

	}

}
