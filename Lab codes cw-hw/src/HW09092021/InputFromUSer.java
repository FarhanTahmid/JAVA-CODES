package HW09092021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputFromUSer {
	public static void main(String[] args) throws FileNotFoundException {
		int end=0;
		String inputFromUSer="";
		Scanner input=new Scanner(System.in);
		File file =new File("src//createdfile.txt");
		PrintWriter writer=new PrintWriter(file);
		if(file.exists()) {
			System.out.println("Created the file");
			while(end==0) {
					System.out.println("Enter what you Want to write in the file");
					inputFromUSer=input.nextLine();
					System.out.println("Enter 1 to stop writing in the file or 0 to continue");
					end=input.nextInt();input.nextLine();
					if(end==1) {
						System.out.println("Exited!");
						break;
					}
					else {
						writer.append(inputFromUSer);
						writer.append("\n");
					}
			}
			
			writer.flush();
			writer.close();
		}
		else {
			System.out.println("Sorry can not create the file!");
		}
		System.out.println("File written");
	}
}
