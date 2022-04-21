package MenuBar;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
	@FXML
	private Label label;
	
	static String name="farhan";
	
	public void show() {
		label.setText(name);
	}
}
