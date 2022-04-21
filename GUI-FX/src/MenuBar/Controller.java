package MenuBar;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	private Stage stage;
	private Scene scene;
	
	
	
	public void newMethod() throws IOException {
		System.out.println("Selected the new menu item");
		Stage stage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		Scene2Controller passer=new Scene2Controller();
		passer.show();
		Scene scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
