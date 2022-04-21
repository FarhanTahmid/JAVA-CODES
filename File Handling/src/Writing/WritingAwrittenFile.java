package Writing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingAwrittenFile {
	public static void main(String[] args) {
		File writtenFile=new File("src//WriitenFile");
		try {
			PrintWriter writter=new PrintWriter(writtenFile);
			if(writtenFile.exists()) {
				writter.write("\n");
				writter.write ("");
				writter.flush();
				writter.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
