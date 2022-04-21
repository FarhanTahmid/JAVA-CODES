package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ShowInfoController {

    @FXML
    private Label showingInfo;
    public void getValue(String id) {
    	this.showingInfo.setText(id);
    }

}
