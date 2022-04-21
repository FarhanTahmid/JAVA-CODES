package MakingController;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ViewFactory showWindow=new ViewFactory();
		showWindow.showPage1();
	}

}
