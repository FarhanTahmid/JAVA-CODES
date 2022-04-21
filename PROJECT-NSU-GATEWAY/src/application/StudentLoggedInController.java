package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class StudentLoggedInController implements Initializable {
	
	@FXML
	private Label loggedInStudentName;
	@FXML
	public Label loggedInStudentName2;
	@FXML
	private Label loggedInStudentID;
	@FXML
	private Label totalCredit; 
	@FXML
	private Label loggedInStudentCurriculumName; 
	@FXML
	private Label loggedInStudentMail; 
	@FXML
	private Label loggedInStudentDeptName;
	@FXML
	private Label loggedInStudentCurrentStat;
	@FXML
	private ImageView studentImageView;
	@FXML
	private ImageView universityLogo;
	@FXML
	private Button backToLoginPageButton;
	//@FXML Menu studenInfo;
	@FXML MenuItem studentAcademicInfo,studenPersonalInfo;
	@FXML 
	private Button button1;
	
	private Scene scene;
	private Stage stage;
	private Parent root;
	
	static String staticID;
	
	
	public void academicInfo(ActionEvent event) throws IOException {
		Stage stage=new Stage();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("ShowAcademicInfo.fxml"));
		root=loader.load();
		ShowAcademicInfoController passer=(ShowAcademicInfoController) loader.getController();
		passer.ShowAcademicInfo(staticID);
		
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	
	
	public void personalInfo(ActionEvent event) throws IOException {
		Stage stage=new Stage();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("ShowPersonalInfo.fxml"));
		root=loader.load();
		ShowPersonalInfoController info2=(ShowPersonalInfoController) loader.getController();
		info2.showPersonalInfo(staticID);
		
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	public void usebankAccount(ActionEvent event) throws IOException {
		Stage stage=new Stage();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("NSUBankAccountWindow.fxml"));
		root=loader.load();		
		
		StudentBankWindow bankInfo=(StudentBankWindow)loader.getController();
		bankInfo.findingInfo(staticID);
		
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
	

	public void loggedInStudentInfo(String name,String Id,String credits,String deptName,String curriculumName,String email,String currentstat){		
		loggedInStudentName.setText("WELCOME "+name.toUpperCase());
		loggedInStudentName2.setText(name);
		loggedInStudentID.setText("ID: "+Id);
		totalCredit.setText("Completed Credit: "+credits);
		loggedInStudentCurriculumName.setText(curriculumName+"-130 Credit Curriculum");;
		loggedInStudentMail.setText("Email : "+email);
		loggedInStudentDeptName.setText(deptName);
		loggedInStudentCurrentStat.setText("Your Current Status: "+currentstat);
		
		
		staticID=Id;
	
		//setting student Picture
		try {
			switch(Id) {
			
			case "1812400642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\1812400642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			
			case "1922214030":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\1922214030.jpeg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			
			case "2011195642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2011195642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			
			case "2011691642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2011691642.jpeg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			
			case "2011703642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2011703642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2012018642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2012018642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2012273642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2012273642.JPG");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2012677642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2012677642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2012335642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2012335642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2012932642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2012932642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2013199645":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2013199645.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2013213630":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2013213630.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2021876643":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2021876643.png");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031033642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031033642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031130642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031130642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031206642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031206642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031326642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031326642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031340042":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031340042.JPG");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031436642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031436642.jpeg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031519642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031519642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2031523642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2031523642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2112183642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2112183642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2112348642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2112348642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			case "2121443642":{
				InputStream stream = new FileInputStream("src\\Student Pictures\\2121443642.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				break;
				}
			default:{
				InputStream stream = new FileInputStream("src\\Student Pictures\\default boys.jpg");
				Image studentImage=new Image(stream);
				studentImageView.setImage(studentImage);
				
			}
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		//University Logo
		InputStream stream;
		try {
			stream = new FileInputStream("src\\NSU-LOGO-2021.png");
			Image uniLogo=new Image(stream);
			universityLogo.setImage(uniLogo);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	

	
	public void backToLogin(ActionEvent event) throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("LogInPage.fxml"));
		root=loader.load();
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}

