package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class FacultyLoggedInController {
	
	@FXML
	private Label welcomefacultyName,facultyName,facultyDesignation,office,email,departmentName ;
	@FXML
	private Button logoutbutton;
	@FXML
	private ImageView facultyImageView,universityLogo;
	
	private Scene scene;
	private Stage stage;
	private Parent root;
	
	
	
	
	public void showStudentListCse173Section4() throws IOException {
		Stage stage=new Stage();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("studentListCSE173Sec04SFR1.fxml"));
		root=loader.load();
		CSE173Sec04StudentListController controller=loader.getController();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
	
	
	
	
	public void facultyInfoSetter(String ID,String name,String designation,String department,String officehour,String email,String number,String degree,String office,String course1,String section1,String time1,String course2,String section2,String time2,String course3,String section3,String time3,String researchAreas){
			welcomefacultyName.setText(name);
			facultyName.setText(name);
			facultyDesignation.setText(designation);
			this.office.setText(office);
			this.email.setText(email);
			this.departmentName.setText(department);
			
			InputStream stream2;
			try {
				stream2 = new FileInputStream("src\\NSU-LOGO-2021.png");
				Image universityImage=new Image(stream2);
				this.universityLogo.setImage(universityImage);
			} catch (FileNotFoundException e1) {
				System.out.println("File can not be found");
				e1.printStackTrace();
			}
			
			
			
			switch(ID) {
			case "3021":{
				try {
					InputStream stream = new FileInputStream("src\\Faculty Pictures\\3021.jpg");
					Image facultyImage=new Image(stream);
					facultyImageView.setImage(facultyImage);
					break;
				} catch (FileNotFoundException e) {
					System.out.println("File can not be found");
					e.printStackTrace();
				}
			}
			case "5566":{
				InputStream stream;
				try {
					stream = new FileInputStream("src\\Faculty Pictures\\5566.jpg");
					Image facultyImage=new Image(stream);
					facultyImageView.setImage(facultyImage);
					break;
				} catch (FileNotFoundException e) {
					System.out.println("File can not be found");
					e.printStackTrace();
				}
				
			}
			}
			
		}
	
	public void backtoLogin(ActionEvent event) throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("LogInPage.fxml"));
		root=loader.load();
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
}
