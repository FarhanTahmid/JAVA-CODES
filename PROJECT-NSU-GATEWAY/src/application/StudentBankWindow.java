package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class StudentBankWindow {

	@FXML
    private Label studentName;

    @FXML
    private Label studentID;

    @FXML
    private Button button1;

    @FXML
    private Label bankbalance;

    @FXML
    void button(ActionEvent event) {
    	System.out.println("pressed");
    }
    
    
    
    
    
    
    
    private static Scanner reader;
    String filePath="src\\StudentBankInfo.csv";
    
    private static String staticid;
    private static int staticbankBalance;
    
    public void getInfo(String idnumber) {
    	this.staticid=idnumber;
    }
    
    public static void intializingBalance(int studentBalance) {
    		staticbankBalance=studentBalance;
    }
    
    
    
    
    
    
    
    
    
    
    public void findingInfo(String idNumber) {
    	boolean found=false;
    	String fileID="";
    	String fileName="";
    	String fileBankBalance="";
    	
    	try {
			reader=new Scanner(new File(filePath));
			reader.useDelimiter("[,\n]");
			
			while(reader.hasNext()&&!found) {
				fileID=reader.next();
				fileBankBalance=reader.next();
				fileName=reader.next();
				
				
				if(fileID.equals(idNumber)){
					found=true;
				}
			}
			if(found) {
				studentName.setText(fileName);
				studentID.setText(fileID);
				
				
				try {
					StudentBankWindow.intializingBalance(Integer.parseInt(fileBankBalance));
					this.bankbalance.setText(""+staticbankBalance);
					
					
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
    	
    	} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
    	
    	
    }
    

}
