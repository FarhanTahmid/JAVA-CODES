package Spinners;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller implements Initializable {
	@FXML
	private Spinner<Integer> mySpinner;
	@FXML
	private Label myLabel;
	
	int currentValue;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//adding spiner values
		SpinnerValueFactory<Integer>valueFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
		valueFactory.setValue(1);
		mySpinner.setValueFactory(valueFactory);
		myLabel.setText(mySpinner.getValue().toString());
		//Updating the value of the spinner
		mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {

			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				myLabel.setText(mySpinner.getValue().toString());
				
			}
		});
		
	}
	
	

}
