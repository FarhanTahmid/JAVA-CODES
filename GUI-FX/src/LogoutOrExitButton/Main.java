package LogoutOrExitButton;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws IOException {
		
		Parent root=FXMLLoader.load(getClass().getResource("Scene.fxml"));
		Scene scene=new Scene(root);
		stage.setScene(scene);
		
		stage.show();
		//this is going to call the logout method if you click the cross button in the corner
		
		stage.setOnCloseRequest(event ->{
				event.consume(); //this line is to avoid closing the program on cancel button
				logout(stage);
			});
		
	}
	
	//this whole thing is created here again to use the cross button as the logout option
	
	public void logout(Stage stage) {
		
		//creating an alertbox
		Alert alert =new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You are about to logout! Are you sure?");
		alert.setContentText("Do you want to save before exiting?");
		if (alert.showAndWait().get()==ButtonType.OK) {
			System.out.println("You Successfully Logged out");
			stage.close();
		}
		
	}

	
}