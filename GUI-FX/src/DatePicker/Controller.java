package DatePicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {
	@FXML
	private DatePicker myDatePicker;
	@FXML
	private Label myLabel;
	
	public void getDate(ActionEvent event) {
		LocalDate myDate=myDatePicker.getValue();
		//System.out.println(myDate.toString());
		//changing the format of the date
		/// 3M means the month name
		String myFormattedDate=myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy")); //this line is used to format the style of the date
		myLabel.setText(myFormattedDate);
		//myLabel.setText(myDate.toString());
	}
}
