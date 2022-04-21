package MakingController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Page1Controller extends BaseController {
	
	
	public Page1Controller(String fxmlName) {
		super(fxmlName);
		// TODO Auto-generated constructor stub
	}
	
	@FXML
	private Button showPAge2;

    @FXML
    void showPage2(ActionEvent event) {
    	
    	ViewFactory viewFactory=new ViewFactory();
    	viewFactory.showPage2();
    	Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    	viewFactory.closeStage(stage);

    }
}
