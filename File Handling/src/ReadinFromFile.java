import java.io.FileReader;

public class ReadinFromFile {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("G:\\CODES\\JAVA\\File Handling\\WritingFile.txt");
			try {
				int i;
				while((i=reader.read())!=-1) {
					System.out.print((char)i);
				}
			}
			finally {
				reader.close();
				System.out.println("\nFile closed");
			}
		} catch (Exception e) {
			System.out.println("Sorry the file cant be readen!");
		}

	}

}
