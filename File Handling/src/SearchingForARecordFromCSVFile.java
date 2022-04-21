import java.io.File;
import java.util.Scanner;

public class SearchingForARecordFromCSVFile {
	
	private static Scanner x;
	
	
	public static void main(String[] args) {
		String filepath="src\\TestFile.csv";
		String searchItem="2011195642";
		readRecord(searchItem, filepath);

	}
	public static void readRecord(String searchItem,String filePath) {
		
		boolean found=false;
		String ID="";
		String name="";
		String credit="";
		
		try {
			x=new Scanner(new File(filePath));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext()&& !found) {
				ID=x.next();
				name=x.next();
				credit=x.next();
				if(ID.equals(searchItem)) {
					found=true;
				}
			}
			if(found) {
				System.out.println("Name: "+name+"\nID: "+ID+"\nCompleted Credits: "+credit);
			}
			else {
				System.out.println("Sorry Record not found");
			}
		} catch (Exception e) {
			System.out.println("Sorry can't Find the file");
		}
		
	}

}
