package emailApplication;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ViewFactory {
	
	private EmailManager emailManager;
	private boolean mainViewInitialized=false;

	public ViewFactory(EmailManager emailManager) {
		this.emailManager = emailManager;
	}
	public boolean isMainViewInitialized() {
		
		return mainViewInitialized;
	}
	public void showLoginWindow() {
		System.out.println("Showing login window");
		BaseController controller=new LogInWindowController(emailManager, this, "LogInWindow.fxml");
		initializeStage(controller);
	}
	public void showMainWindow() {
		BaseController controller=new MainWindowController(emailManager, this, "MainWindow.fxml");
		initializeStage(controller);
		mainViewInitialized=true;
	}
	public void showOptionSWindow() {
		BaseController controller=new MainWindowController(emailManager, this, "OptionsWindow.fxml");
		initializeStage(controller);
	}
	
	
	private void initializeStage(BaseController baseController) {
		FXMLLoader loader=new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
		loader.setController(baseController); 
		Parent parent;
		try { 
			parent=loader.load();
			
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		Scene scene =new Scene(parent);
		Stage stage=new Stage();
		stage.setScene(scene);
		stage.show();
		
	}
	public void closeStage(Stage stagetoClose) {
		stagetoClose.close();
	}
}
