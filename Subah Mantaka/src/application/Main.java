package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	private Parent root;
	private Scene scene;
	private Stage stage;
	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("tableview.fxml"));
		root=loader.load();
		TableViewLoader controller=loader.getController();
		controller.writeInCsv();
		scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
