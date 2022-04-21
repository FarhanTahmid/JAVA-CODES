package ChoiceBoxes;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller implements Initializable{  //initializes the checkBox
	
	@FXML
	
	private Label myLabel;
	@FXML
	private ChoiceBox<String> myChoiceBox;  //using generics for the checkbox
	
	private String[] food= {"pizza","Burger","kacchi"};

	//initializing the checkBox cause we cant initialize a checkBox in the FXML
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox.getItems().addAll(food);
		myChoiceBox.setOnAction(this::getFood);  //referencing our method
		
	}
	public void getFood(ActionEvent event) {
		String myFood=myChoiceBox.getValue();
		myLabel.setText(myFood);
	}
	
}
