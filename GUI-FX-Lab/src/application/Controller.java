package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Label button1Label;

    @FXML
    private Label button2Label;

    @FXML
    private Label isSameLabel;
    
    int i=0;
    int j=0;
    
    @FXML
    void pressbutton1(ActionEvent event) {
    	i++;
    	button1Label.setText(String.valueOf(i)+" times");
    	System.out.println("button1 pressed");

    }

    @FXML
    void pressbutton2(ActionEvent event) {
    	j++;
    	button2Label.setText(String.valueOf(j)+" times");
    	System.out.println("button2 pressed");
    	
    	if(i==j) {
    		isSameLabel.setText("Button 1 and 2 are pressed the same time");
    	}
    	else {
    		isSameLabel.setText("Button 1 and 2 are not pressed the same time");
    	}
    	
    	
    }
  

}
