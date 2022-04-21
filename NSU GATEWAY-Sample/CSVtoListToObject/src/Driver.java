import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class Driver {

	public static void main(String[] args) {
		
		String line="";
		List<StudentInfo> studentDatas = new ArrayList<StudentInfo>();
		StudentInfo[] data=new StudentInfo[31];
		
		File studentMainFile=new File("src\\Listreaddemofromtext.csv");
		String deleimeter="[,\n]";
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(studentMainFile));
			try {
				int i=0;
				while((line=reader.readLine())!=null) {
					String[]studentData=line.split(deleimeter);
					//StudentInfo[] data=new StudentInfo[30];
					data[i]=new StudentInfo(studentData[0], studentData[1], studentData[2]);
					studentDatas.add(data[i]);
					i++;
					
				}
				for (i=0;i<data.length;i++) {
					System.out.println(data[i]);
				}
					
					
					
					
					/*
					//students.add(new StudentInfo(studentData[0]));
					StudentInfo[] studentObject=new StudentInfo[studentData[0].length()];
					for(int i=0;i<studentData[0].length();i++) {
						studentObject[i]=new StudentInfo(studentData[0]);
						studentObject[i].showInfo();
					}
					*/
				}
			finally {
				//System.out.println("FX amar baal");
			}
				
			} catch (IOException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
			
		} 
}

