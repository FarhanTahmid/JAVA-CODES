package CSSstyling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		Scene scene = new Scene(root);
		//adding css to scene
		scene.getStylesheets().add(getClass().getResource("cssfile.css").toExternalForm());
		
		//if you have multiple scenes:
		/*
		String css=this.getClass().getResource("cssfile.css").toExternalForm();
		scene.getStylesheets().add(css);
		scene1.getStylesheets().add(css);
		*/
		
		
		
		stage.setScene(scene);
		stage.show();
	}

}
