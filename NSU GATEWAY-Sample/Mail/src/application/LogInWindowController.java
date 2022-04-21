package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInWindowController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
    @FXML
    private Button loginButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField emailAddress;

    @FXML
    private Label errorLabel;

    @FXML
    void loginButton(ActionEvent event) {
    	try {
    		FXMLLoader loader=new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			root=loader.load();
			MainWindowController passer=loader.getController();
			//passer.optionsAction();
			stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
    	
    }

}
