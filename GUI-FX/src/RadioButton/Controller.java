package RadioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
	@FXML
	private Label myLabel;
	@FXML
	private RadioButton pizzaButton,burgerButton,kacchiButton;
	
	
	public void getfood(ActionEvent event) {
		if(pizzaButton.isSelected()) {
			myLabel.setText(pizzaButton.getText());
		}
		else if(burgerButton.isSelected()) {
			myLabel.setText(burgerButton.getText());
		}
		else if(kacchiButton.isSelected()) {
			myLabel.setText(kacchiButton.getText());
		}
	}
}
