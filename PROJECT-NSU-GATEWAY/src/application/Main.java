package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;



public class Main extends Application {
	
	static String s;
	@Override
	public void start(Stage loginStage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
			Scene scene=new Scene(root);
			Image icon =new Image("NSU-LOGO-2021.png");
			loginStage.setScene(scene);
			loginStage.setTitle("NSU GATEWAY");
			loginStage.getIcons().add(icon);
			loginStage.setResizable(false);
			loginStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
