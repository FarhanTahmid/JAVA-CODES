package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;

public class OptionSWindowController extends BaseController {

    public OptionSWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
		super(emailManager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}

	@FXML
    private Slider slider;

    @FXML
    private ChoiceBox<?> themeChooser;

    @FXML
    private Button ApplyButton;

    @FXML
    private Button cancelButton;

    @FXML
    void applySetting() {

    }

    @FXML
    void cancelOperation() {

    }

}