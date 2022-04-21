package MakingController;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewFactory {
	
	public void showPage1() {
		BaseController controller=new Page1Controller("Page1.fxml");
		initialingScene(controller);
		
	}
	public void showPage2() {
		BaseController controller=new ShowPage2("Page2.fxml");
		initialingScene(controller);
	}
	
	public void initialingScene(BaseController baseController) {
		try {
			FXMLLoader loader=new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
			loader.setController(baseController);
			Parent parent;
			parent=loader.load();
			Scene scene=new Scene(parent);
			Stage stage=new Stage();
			stage.setScene(scene);
			stage.show();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void closeStage(Stage stage) {
		stage.close();
	}
}
