package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class LogInPageController {
	@FXML
	private RadioButton studentOption,facultyOption,adminOption;
	@FXML
	private ToggleGroup loginOptions;
	@FXML
	private TextField userIdTextField,passwordTextField;
	@FXML
	private Button loginButton, cancelLoginButton;
	@FXML
	private Label loginConfirmation;
	
	
	public void login(ActionEvent event) {
		String userId=userIdTextField.getText();
		System.out.println(userId);
		//System.out.println(passwordTextField.getText());
	}
	
	
	
	
	public void logIn() {
		
	}
	
	
}
