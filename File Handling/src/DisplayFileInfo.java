import java.io.File;

public class DisplayFileInfo {

	public static void main(String[] args) {
		File f=new File("G:\\CODES\\JAVA\\File Handling\\FileCreating.txt");
		if(f.exists()) {
			System.out.println("File name: "+f.getName()+" and the path is "+f.getPath());
			System.out.println("File size: "+f.length());
		}
		else {
			System.out.println("There is no such file in the directory");
			
		}

	}

}
