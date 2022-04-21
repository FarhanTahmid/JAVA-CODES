package ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller implements Initializable {
	@FXML
	private ProgressBar myProgressBar;
	@FXML
	private Button mButton;
	@FXML
	private Label myLabel;
	
	//the BigDecimal class gives us the complete control over rounding behavior
	BigDecimal progress=new BigDecimal(String.format("%.2f", 0.0));
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myProgressBar.setStyle("-fx-accent:red; ");
		
	}
	
	public void increase() {
		if(progress.doubleValue()<1) {
			progress=new BigDecimal(String.format("%.2f", progress.doubleValue()+0.1));
			myProgressBar.setProgress(progress.doubleValue());
			myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue()*100))+"%");
		}
		
		
	}
	
	
	
}
