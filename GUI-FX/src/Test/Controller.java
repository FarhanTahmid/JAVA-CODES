package Test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Controller {
	
	@FXML
	private CheckBox attendanceCheckBox;
	@FXML
	private Label attendanceLabel;
	
	
	public void attendance(ActionEvent event) {
		int attendance=0;
		if(attendanceCheckBox.isSelected()) {
			attendance++;
			this.attendanceLabel.setText(String.valueOf(attendance));
		}
	}
}
