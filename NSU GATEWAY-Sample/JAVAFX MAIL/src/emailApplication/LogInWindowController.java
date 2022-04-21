package emailApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LogInWindowController extends BaseController implements Initializable{
	public LogInWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
		super(emailManager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}
	@FXML
    private Button loginButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField emailAddress;

    @FXML
    private Label errorLabel;
    Scene scene;
    Stage stage;
    Parent root;
    public void loginButton() throws IOException {
    	System.out.println("login Button Pressed");
    	if(fieldsAreValid()) {
    		EmailAccount emailAccount=new EmailAccount(emailAddress.getText(),password.getText());
    		LoginService loginService=new LoginService(emailAccount, emailManager);
    		loginService.start();
    		loginService.setOnSucceeded(event ->{
    			EmailLoginResult emailLoginResult=loginService.getValue();
        		
        		switch (emailLoginResult) {
    			case SUCCESS: {
    				System.out.println("Login Successful"+emailAccount);
    				if(!viewFactory.isMainViewInitialized()) {
    					viewFactory.showMainWindow();
    				}
    				
    		    	Stage stage=(Stage)errorLabel.getScene().getWindow();
    		    	viewFactory.closeStage(stage);
    		    	return;
    			}
    			case FAILED_BY_CREDENTIALS:{
    				errorLabel.setText("Wrong Password or Email Entered");
    				return;
    			}
    			case FAILED_BY_UNEXPECTED_ERROR:
    				errorLabel.setText("Sorry an unexpected error occured");
    			default:
    				return;
    			}
    		});
    		
    	}
    	/*
    	
    	*/
    }
	private boolean fieldsAreValid() {
		if (this.emailAddress.getText().isEmpty()) {
			this.errorLabel.setText("Please fill the username field");
			return false;
		}
		if (this.password.getText().isEmpty()) {
			this.errorLabel.setText("Please fill the password field");
			return false;
		}
		
		return true;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.emailAddress.setText("northaccess15725@gmail.com");
		this.password.setText("allahsaveme!");
		
	}
    
}
