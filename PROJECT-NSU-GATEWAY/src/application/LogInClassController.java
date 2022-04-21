package application;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInClassController {
	
	@FXML
	private TextField userIdField;
	@FXML
	private TextField passwordField;
	@FXML
	private Button loginButton,facultyLoginButton,adminLoginButton,button;
	@FXML
	private Button cancelLoginButton;
	@FXML 
	public Label statusLabel;
	@FXML
	private Label changeLabel;
	@FXML
	private RadioButton studentLogInSelector,facultyLogInSelector,adminLogInSelector;
	
	
	
	private Scene scene;	
	private Stage stage;
	private Parent root;
	
	
	private String defaultPass="1234";
	
	private static Scanner reader;
	Scanner input =new Scanner(System.in);
	String filepath="src\\StudentInformation1.csv";
	String facultyfilepath="src\\FacultyInfo.csv";
	
	public void getloginMethod(ActionEvent event) throws IOException {
		if(studentLogInSelector.isSelected()) {
			this.facultyLoginButton.setDisable(true);
			this.adminLoginButton.setDisable(true);
			this.loginButton.setDisable(false);
			this.changeLabel.setText("You are logging in as a Student!");
			if(event.getSource()==this.loginButton) {
				logIn(event);
			}	
		}
		else if(facultyLogInSelector.isSelected()) {
			this.adminLoginButton.setDisable(true);
			this.loginButton.setDisable(true);
			this.facultyLoginButton.setDisable(false);
			this.changeLabel.setText("You are logging in as a Faculty Member!");
			if(event.getSource()==this.facultyLoginButton) {
				facultyLogin(event);
			}
		}
		else if(adminLogInSelector.isSelected()) {
			this.facultyLoginButton.setDisable(true);
			this.loginButton.setDisable(true);
			this.adminLoginButton.setDisable(false);
			this.changeLabel.setText("You are logging in as a Faculty Member!");
		}
		else {
			this.loginButton.setDisable(true);
			this.facultyLoginButton.setDisable(true);
			this.adminLoginButton.setDisable(true);
		}
	}
	
	
	public void adminLogin(ActionEvent event) throws IOException {
		String userID=userIdField.getText();
		String password=passwordField.getText();
		if(userID.equals("203145842")&& password.equals(defaultPass)) {
			
			FXMLLoader loader=new FXMLLoader(getClass().getResource("AdminLoggedInPage.fxml"));
			root=loader.load();
			if(event.getSource()==this.button) {
				System.out.println("");
			}
			stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	
	
	
	
	public void facultyLogin(ActionEvent event) throws IOException {
		
		String userID=userIdField.getText();
		String password= passwordField.getText();
		
		boolean found=false;
		String ID="";
		String name="";
		String designation="";
		String department="";
		String officeHours="";
		String email="";
		String number="";
		String degree="";
		String office="";
		String course1="";
		String section1="";
		String time1="";
		String course2="";
		String section2="";
		String time2="";
		String course3="";
		String section3="";
		String time3="";
		String researchareas="";
		
		try {
			reader=new Scanner(new File(facultyfilepath));
			reader.useDelimiter("[,\n]");
			
			while(reader.hasNext()&& !found) {
				ID=reader.next();
				name=reader.next();
				designation=reader.next();
				department=reader.next();
				officeHours=reader.next();
				email=reader.next();
				number=reader.next();
				degree=reader.next();
				office=reader.next();
				course1=reader.next();
				section1=reader.next();
				time1=reader.next();
				course2=reader.next();
				section2=reader.next();
				time2=reader.next();
				course3=reader.next();
				section3=reader.next();
				time3=reader.next();
				researchareas=reader.next();
				
				if(ID.equals(userID)&&password.equals(defaultPass)) {
					found=true;
					statusLabel.setText("Login Successful");
					
				}
				else {
					statusLabel.setText("Wrong Username or Password");
				}
				
			}
			if(found) {
				
				FXMLLoader loader=new FXMLLoader(getClass().getResource("FacultyLoginPage.fxml"));
				root=loader.load();
			
				try {
					FacultyLoggedInController passer=loader.getController();
					passer.facultyInfoSetter(ID, name, designation, department, officeHours, email, number, degree, office, course1, section1, time1, course2, section2, time2, course3, section3, time3, researchareas);
				}
				catch (Exception e) {
					System.out.println(e);
				}
				
				
				
				stage=(Stage)((Node)event.getSource()).getScene().getWindow();
				scene=new Scene(root);
				stage.setScene(scene);
				stage.show();
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Faculty File not found");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void logIn(ActionEvent event) {
	
		String userID=userIdField.getText();
		String password= passwordField.getText();
		
		
		boolean found=false;
		String ID="";
		String name="";
		String completedCredit="";
		String departmentName="";
		String curriculumName="";
		String email="";
		String currentStatus="";
		String degreeName="";
		String gender="";
		String birthdate="";
		String enrollmentSemester="";
		
		try {
			reader=new Scanner(new File(filepath));
			reader.useDelimiter("[,\n]");
			
			while(reader.hasNext() && !found) {
				ID=reader.next();
				name=reader.next();
				completedCredit=reader.next();
				departmentName=reader.next();
				curriculumName=reader.next();
				email=reader.next();
				currentStatus=reader.next();
				degreeName=reader.next();
				gender=reader.next();
				birthdate=reader.next();
				enrollmentSemester=reader.next();
				
				
				if(ID.equals(userID) && password.equals(defaultPass)) {
					found=true;
					statusLabel.setText("Log in Successful");
				}
			}
			if(found) {
				
				FXMLLoader loader=new FXMLLoader(getClass().getResource("StudentLoggedInPage2.fxml"));
				root=loader.load();
				StudentLoggedInController passer=loader.getController();
				passer.loggedInStudentInfo(name, ID, completedCredit,departmentName,curriculumName,email,currentStatus);	
				
				ShowAcademicInfoController info =new ShowAcademicInfoController();
				info.staticInitializer(ID);
				
				/*
				ShowPersonalInfoController info2=new ShowPersonalInfoController();
				info2.staticInitializer(ID);
				*/
				
				StudentBankWindow bankinfo=new StudentBankWindow();
				bankinfo.getInfo(ID);
				
				stage=(Stage)((Node)event.getSource()).getScene().getWindow();
				scene=new Scene(root);
				stage.setScene(scene);
				stage.show();
				
			
			}
			
			else {
				if(!ID.equals(userID) && password.equals(defaultPass)) {
					statusLabel.setText("Sorry there is no such ID registered in the system");
				}
				else if(!password.equals(defaultPass) && ID.equals(userID)) {
					statusLabel.setText("The password You entered is Wrong");
				}
				else if (!password.equals(defaultPass) && !ID.equals(userID)) {
					statusLabel.setText("The username or the password you entered does not match with the system record");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			//System.out.println("File Error!");
		}
		
	}
	public void cancelLogin(ActionEvent event) {
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		stage.close();
	}
}
