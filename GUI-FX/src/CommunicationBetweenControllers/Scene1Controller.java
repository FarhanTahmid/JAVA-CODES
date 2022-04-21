package CommunicationBetweenControllers;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {
	@FXML
	TextField nameTextField;
	@FXML
	Button loginButton;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event)throws IOException{
		if(event.getSource()==loginButton) {
			//getting the text from the text field
			String userName=nameTextField.getText();
			//System.out.println(userName);
			
			//creating a FXML loader instance
			FXMLLoader loader=new FXMLLoader(getClass().getResource("Scene2.fxml"));
			root=loader.load();
			
			//creating instance of Scene2 controller
			
			Scene2Controller scene2Controller=loader.getController();
			scene2Controller.displayName(userName);
			
			//root=FXMLLoader.load(getClass().getResource("Scene2.fxml"));
			stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
	}
}
