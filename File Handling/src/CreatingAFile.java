import java.io.File;
import java.io.IOException;

public class CreatingAFile {

	public static void main(String[] args) {
		File f=new File("G:\\CODES\\JAVA\\File Handling in Java\\FileCreating.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File successfully created.");
			}
			else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Sorry an error occured");
		}
	}

}
